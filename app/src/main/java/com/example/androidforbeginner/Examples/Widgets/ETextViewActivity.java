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

public class ETextViewActivity extends AppCompatActivity{
    private ViewPager pager;
    private TabLayout tablayout;
    private SectionsPageAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_etext_view);

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
                Intent intent = new Intent(this,ETextViewRunActivity.class);
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
                "import android.widget.TextView;\n" +
                "\n" +
                "import com.example.androidforbeginner.R;\n" +
                "\n" +
                "public class ETextViewRunActivity extends AppCompatActivity {\n" +
                "    TextView textView;\n" +
                "    @Override\n" +
                "    protected void onCreate(Bundle savedInstanceState) {\n" +
                "        super.onCreate(savedInstanceState);\n" +
                "        setContentView(R.layout.activity_main);\n" +
                "        \n" +
                "        textView = findViewById(R.id.text);\n" +
                "        textView.setText(\"Hello World !\");\n" +
                "    }\n" +
                "}";
        return columnTwo;
    }

    public String getColumnOneXML() {
        String columnOne = "1\n2\n3\n4\n5\n6\n7\n8\n9\n10\n11\n12\n13\n14\n15\n16\n17\n18\n19\n20\n21\n";
        return columnOne;
    }

    public String getColumnTwoXML() {
        String columnTwo = "<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
                "<RelativeLayout xmlns:android=\"http://schemas.android.com/apk/res/android\"\n" +
                "    xmlns:app=\"http://schemas.android.com/apk/res-auto\"\n" +
                "    xmlns:tools=\"http://schemas.android.com/tools\"\n" +
                "    android:layout_width=\"match_parent\"\n" +
                "    android:layout_height=\"match_parent\"\n" +
                "    tools:context=\".Examples.Item.ETextViewRunActivity\">\n" +
                "\n" +
                "    <TextView\n" +
                "        android:id=\"@+id/text\"\n" +
                "        android:layout_width=\"wrap_content\"\n" +
                "        android:layout_height=\"wrap_content\"\n" +
                "        android:layout_centerInParent=\"true\"\n" +
                "        android:text=\"Text View\"\n" +
                "       />\n" +
                "</RelativeLayout>";
        return columnTwo;
    }


}
