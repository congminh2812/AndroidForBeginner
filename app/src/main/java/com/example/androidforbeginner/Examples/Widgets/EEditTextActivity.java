package com.example.androidforbeginner.Examples.Widgets;

import android.content.Intent;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import com.example.androidforbeginner.R;
import com.example.androidforbeginner.SectionsPageAdapter;

public class EEditTextActivity extends AppCompatActivity {

    private ViewPager pager;
    private TabLayout tablayout;
    private SectionsPageAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eedit_text);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        addControl();
    }
    private void addControl() {
        pager = findViewById(R.id.container);
        tablayout = findViewById(R.id.tab_layout);
        adapter = new SectionsPageAdapter(getSupportFragmentManager());

        adapter.addFragment(new FragmentMain(),"MainActivity.java");
        adapter.addFragment(new FragmentXML(),"activity_main.xml");
        pager.setAdapter(adapter);

        tablayout.setupWithViewPager(pager);


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_play,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()) {
            case android.R.id.home:
                finish();
                overridePendingTransition(R.anim.anim_enter_right,R.anim.anim_exit_right);
                break;
            case R.id.menu_play:
                Intent intent = new Intent(this,EEditTextRunActivity.class);
                startActivity(intent);
                overridePendingTransition(R.anim.anim_exit_left,R.anim.anim_enter_left);
                break;
        }

        return super.onOptionsItemSelected(item);
    }

    public String getColumnOneJava() {
        String columnOne = "1\n2\n3\n4\n5\n6\n7\n8\n9\n10\n11\n12\n13\n14\n15\n16\n17\n18\n19\n20\n21\n";
        return columnOne;
    }

    public String getColumnTwoJava() {
        String columnTwo = "import android.support.v7.app.AppCompatActivity;\n" +
                "import android.os.Bundle;\n" +
                "import android.support.v7.widget.Toolbar;\n" +
                "import android.text.Editable;\n" +
                "import android.text.TextWatcher;\n" +
                "import android.view.MenuItem;\n" +
                "import android.widget.EditText;\n" +
                "import android.widget.Toast;\n" +
                "\n" +
                "import com.example.androidforbeginner.R;\n" +
                "\n" +
                "public class EEditTextRunActivity extends AppCompatActivity {\n" +
                "    EditText editText;\n" +
                "    @Override\n" +
                "    protected void onCreate(Bundle savedInstanceState) {\n" +
                "        super.onCreate(savedInstanceState);\n" +
                "        setContentView(R.layout.activity_main);\n" +
                "\n" +
                "        editText = findViewById(R.id.edit_text);\n" +
                "        editText.addTextChangedListener(new TextWatcher() {\n" +
                "            @Override\n" +
                "            public void beforeTextChanged(CharSequence s, int start, int count, int after) {\n" +
                "\n" +
                "            }\n" +
                "\n" +
                "            @Override\n" +
                "            public void onTextChanged(CharSequence s, int start, int before, int count) {\n" +
                "                String chuoi = editText.getText().toString();\n" +
                "                Toast.makeText(EEditTextRunActivity.this, chuoi, Toast.LENGTH_SHORT).show();\n" +
                "            }\n" +
                "\n" +
                "            @Override\n" +
                "            public void afterTextChanged(Editable s) {\n" +
                "\n" +
                "            }\n" +
                "        });\n" +
                "\n" +
                "    }}";
        return columnTwo;
    }

    public String getColumnOneXML() {
        String columnOne = "1\n2\n3\n4\n5\n6\n7\n8\n9\n10\n11\n12\n13\n14\n15\n16\n17\n18\n19\n20\n21\n";
        return columnOne;
    }

    public String getColumnTwoXML() {
        String columnTwo = "<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
                "<LinearLayout xmlns:android=\"http://schemas.android.com/apk/res/android\"\n" +
                "    xmlns:app=\"http://schemas.android.com/apk/res-auto\"\n" +
                "    xmlns:tools=\"http://schemas.android.com/tools\"\n" +
                "    android:layout_width=\"match_parent\"\n" +
                "    android:orientation=\"vertical\"\n" +
                "    android:layout_height=\"match_parent\"\n" +
                "    tools:context=\".Examples.Item.ETextViewRunActivity\">\n" +
                "\n" +
                "    <EditText\n" +
                "        android:layout_width=\"match_parent\"\n" +
                "        android:layout_height=\"wrap_content\"\n" +
                "        android:id=\"@+id/edit_text\"\n" +
                "        />\n" +
                "</LinearLayout>";
        return columnTwo;
    }
}
