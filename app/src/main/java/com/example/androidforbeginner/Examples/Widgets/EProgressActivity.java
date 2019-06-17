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

public class EProgressActivity extends AppCompatActivity {

    private ViewPager pager;
    private TabLayout tablayout;
    private SectionsPageAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eprogress);

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
                Intent intent = new Intent(this,EProgressRunActivity.class);
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
                        "import android.view.View;\n" +
                        "import android.widget.ProgressBar;\n" +
                        "\n" +
                        "public class EProgressRunActivity extends AppCompatActivity {\n" +
                        "    ProgressBar progressBar;\n" +
                        "    @Override\n" +
                        "    protected void onCreate(Bundle savedInstanceState) {\n" +
                        "        super.onCreate(savedInstanceState);\n" +
                        "        setContentView(R.layout.activity_main);\n" +
                        "        progressBar = findViewById(R.id.progress_bar);\n" +
                        "    }\n" +

                        "\n" +
                        "    public void onBtnClick(View view) {\n" +
                        "        Thread thread = new Thread(){\n" +
                        "            @Override\n" +
                        "            public void run() {\n" +
                        "                super.run();\n" +
                        "                for (int i = 0; i <= 100; i=i+10) {\n" +
                        "                    try {\n" +
                        "                        sleep(1000);\n" +
                        "                    } catch (InterruptedException e) {\n" +
                        "                        e.printStackTrace();\n" +
                        "                    }\n" +
                        "                    progressBar.setProgress(i);\n" +
                        "                    \n" +
                        "                }\n" +
                        "            }\n" +
                        "        };\n" +
                        "        //thread.start();\n" +
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

                "   <SeekBar\n" +
                "       android:layout_width=\"match_parent\"\n" +
                "       android:layout_height=\"wrap_content\"\n" +
                "       android:id=\"@+id/seek_bar\"\n" +
                "       android:max=\"20\"\n" +
                "       android:layout_gravity=\"center_horizontal\"/>\n" +
                "</LinearLayout>";
        return columnTwo;
    }
}
