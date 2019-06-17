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

public class ESeekBarActivity extends AppCompatActivity {

    private ViewPager pager;
    private TabLayout tablayout;
    private SectionsPageAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eseek_bar);

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
                Intent intent = new Intent(this,ESeekBarRunActivity.class);
                startActivity(intent);
                overridePendingTransition(R.anim.anim_exit_left,R.anim.anim_enter_left);
                break;
        }

        return super.onOptionsItemSelected(item);
    }

    public String getColumnOneJava() {
        String columnOne = "1\n2\n3\n4\n5\n6\n7\n8\n9\n10\n11\n12\n13\n14\n15\n16\n17\n18\n19\n20\n21\n23\n24\n25\n26\n27\n28\n29\n30\n";
        return columnOne;
    }

    public String getColumnTwoJava() {
        String columnTwo =
                        "import android.support.v7.app.AppCompatActivity;\n" +
                        "import android.os.Bundle;\n" +
                        "import android.support.v7.widget.Toolbar;\n" +
                        "import android.view.MenuItem;\n" +
                        "import android.widget.SeekBar;\n" +
                        "import android.widget.Toast;\n" +
                        "\n" +
                        "public class ESeekBarRunActivity extends AppCompatActivity {\n" +
                        "    SeekBar seekBar;\n" +
                        "    @Override\n" +
                        "    protected void onCreate(Bundle savedInstanceState) {\n" +
                        "        super.onCreate(savedInstanceState);\n" +
                        "        setContentView(R.layout.activity_eseek_bar_run);\n" +
                        "        seekBar = findViewById(R.id.seek_bar);\n" +
                        "        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {\n" +
                        "            @Override\n" +
                        "            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {\n" +
                        "                Toast.makeText(ESeekBarRunActivity.this, \"SeekBar Progress: \"+progress, Toast.LENGTH_SHORT).show();\n" +
                        "            }\n" +
                        "\n" +
                        "            @Override\n" +
                        "            public void onStartTrackingTouch(SeekBar seekBar) {\n" +
                        "                Toast.makeText(ESeekBarRunActivity.this, \"SeekBar Started\", Toast.LENGTH_SHORT).show();\n" +
                        "\n" +
                        "            }\n" +
                        "            @Override\n" +
                        "            public void onStopTrackingTouch(SeekBar seekBar) {\n" +
                        "                Toast.makeText(ESeekBarRunActivity.this, \"SeekBar Touch Stopped\", Toast.LENGTH_SHORT).show();\n" +
                        "            }\n" +
                        "        });\n" +
                        "\n" +
                        "    }\n" +
                        "}\n";
        return columnTwo;
    }

    public String getColumnOneXML() {
        String columnOne = "1\n2\n3\n4\n5\n6\n7\n8\n9\n10\n11\n12\n13\n14\n15\n16\n17\n18\n19\n20\n21\n22\n23\n24\n25\n26\n27\n28\n29\n30";
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
                "    >\n" +
                "    <ProgressBar\n" +
                "        android:layout_width=\"match_parent\"\n" +
                "        android:layout_height=\"wrap_content\" \n" +
                "        android:id=\"@+id/progress_bar\"\n" +
                "        android:layout_gravity=\"center_horizontal\"\n" +
                "        style=\"@style/Widget.AppCompat.ProgressBar.Horizontal\"\n" +
                "        />\n" +
                "    <Button\n" +
                "        android:layout_width=\"wrap_content\"\n" +
                "        android:layout_height=\"wrap_content\"\n" +
                "        android:text=\"Click Progress\"\n" +
                "        android:onClick=\"onBtnClick\"\n" +
                "        android:id=\"@+id/button\"\n" +
                "        android:layout_gravity=\"center_horizontal\"/>\n" +
                "</LinearLayout>";
        return columnTwo;
    }
}
