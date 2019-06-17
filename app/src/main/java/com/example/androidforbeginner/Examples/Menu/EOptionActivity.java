package com.example.androidforbeginner.Examples.Menu;

import android.content.Intent;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import com.example.androidforbeginner.Examples.FragmentMain2;
import com.example.androidforbeginner.Examples.FragmentXML2;
import com.example.androidforbeginner.Examples.Widgets.FragmentItem;
import com.example.androidforbeginner.Examples.Widgets.FragmentMain;
import com.example.androidforbeginner.Examples.Widgets.FragmentXML;
import com.example.androidforbeginner.R;
import com.example.androidforbeginner.SectionsPageAdapter;

public class EOptionActivity extends AppCompatActivity {
        private ViewPager pager;
        private TabLayout tablayout;
        private SectionsPageAdapter adapter;
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_eoption);

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
            adapter.addFragment(new FragmentXML2(),"menu_option.xml");
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
                    Intent intent = new Intent(this, EOptionRunActivity.class);
                    startActivity(intent);
                    overridePendingTransition(R.anim.anim_exit_left,R.anim.anim_enter_left);
                    break;
            }

            return super.onOptionsItemSelected(item);
        }

        public String getColumnOneJava() {
            String columnOne = "1\n2\n3\n4\n5\n6\n7\n8\n9\n10\n11\n12\n13\n14\n15\n16\n17\n18\n19\n20\n21\n22\n23\n24\n25\n26\n27\n28\n29\n30\n31\n32";
            return columnOne;
        }

        public String getColumnTwoJava() {
            String columnTwo =
                            "import android.support.v7.app.AppCompatActivity;\n" +
                            "import android.os.Bundle;\n" +
                            "import android.support.v7.widget.Toolbar;\n" +
                            "import android.view.Menu;\n" +
                            "import android.view.MenuItem;\n" +
                            "import android.widget.Toast;\n" +
                            "\n" +
                            "public class EOptionRunActivity extends AppCompatActivity {\n" +
                            "    \n" +
                            "    @Override\n" +
                            "    protected void onCreate(Bundle savedInstanceState) {\n" +
                            "        super.onCreate(savedInstanceState);\n" +
                            "        setContentView(R.layout.activity_eoption_run);\n" +
                            "\n" +
                            "    }\n" +
                            "\n" +
                            "    @Override\n" +
                            "    public boolean onCreateOptionsMenu(Menu menu) {\n" +
                            "        getMenuInflater().inflate(R.menu.menu_option,menu);\n" +
                            "        return super.onCreateOptionsMenu(menu);\n" +
                            "    }\n" +
                            "\n" +
                            "    @Override\n" +
                            "    public boolean onOptionsItemSelected(MenuItem item) {\n" +
                            "        switch (item.getItemId()) {\n" +
                            "            case R.id.item1:\n" +
                            "                Toast.makeText(this, \"Item1 was clicked\", Toast.LENGTH_SHORT).show();\n" +
                            "                break;\n" +
                            "            case R.id.item2:\n" +
                            "                Toast.makeText(this, \"Item2 was clicked\", Toast.LENGTH_SHORT).show();\n" +
                            "                break;\n" +
                            "            case R.id.item3:\n" +
                            "                Toast.makeText(this, \"Item3 was clicked\", Toast.LENGTH_SHORT).show();\n" +
                            "                break;\n" +
                            "        }\n" +
                            "        return super.onOptionsItemSelected(item);\n" +
                            "    }\n" +
                            "\n" +
                            "}\n";
            return columnTwo;
        }

        public String getColumnOneXML() {
            String columnOne = "1\n2\n3\n4\n5\n6\n7\n8\n9\n10\n11\n12\n13\n14\n15\n16\n17\n18\n19\n20\n21\n22\n23\n24\n25\n26\n27\n28\n29\n30\n31\n32";
            return columnOne;
        }

        public String getColumnTwoXML() {
            String columnTwo = "<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
                    "<LinearLayout\n" +
                    "    android:orientation=\"vertical\"\n" +
                    "    xmlns:android=\"http://schemas.android.com/apk/res/android\" android:layout_width=\"match_parent\"\n" +
                    "    android:layout_height=\"match_parent\">\n" +
                    "    <ImageView\n" +
                    "        android:layout_width=\"wrap_content\"\n" +
                    "        android:layout_height=\"wrap_content\" \n" +
                    "        android:id=\"@+id/image_view\"\n" +
                    "        android:src=\"@drawable/activity1\"\n" +
                    "        android:layout_gravity=\"center_horizontal\"\n" +
                    "        />\n" +
                    "<TextView\n" +
                    "        android:id=\"@+id/text_view\"\n" +
                    "        android:layout_marginTop=\"4dp\"\n" +
                    "        android:gravity=\"center_horizontal\"\n" +
                    "        android:textSize=\"25sp\"\n" +
                    "        android:text=\"Click the three dots appearing above in ActionBar\"\n" +
                    "        android:layout_width=\"match_parent\"\n" +
                    "        android:layout_height=\"wrap_content\" />" +
                    "    \n" +
                    "</LinearLayout>";
            return columnTwo;
        }
    public String getColumnTwoXML2() {
        String columnTwo = "<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
                "<menu xmlns:android=\"http://schemas.android.com/apk/res/android\">\n" +
                "    <item android:id=\"@+id/item1\" android:title=\"Item1\"/>\n" +
                "    <item android:id=\"@+id/item2\" android:title=\"Item2\"/>\n" +
                "    <item android:id=\"@+id/item3\" android:title=\"Item3\"/>\n" +
                "</menu>";
        return columnTwo;
    }
    }
