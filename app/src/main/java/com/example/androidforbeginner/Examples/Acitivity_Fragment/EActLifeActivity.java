package com.example.androidforbeginner.Examples.Acitivity_Fragment;

import android.content.Intent;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import com.example.androidforbeginner.Examples.FragmentXML2;
import com.example.androidforbeginner.Examples.Menu.EPopUpRunActivity;
import com.example.androidforbeginner.Examples.Widgets.FragmentMain;
import com.example.androidforbeginner.Examples.Widgets.FragmentXML;
import com.example.androidforbeginner.R;
import com.example.androidforbeginner.SectionsPageAdapter;

public class EActLifeActivity extends AppCompatActivity {

        private ViewPager pager;
        private TabLayout tablayout;
        private SectionsPageAdapter adapter;
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_efrag_life);

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
                    Intent intent = new Intent(this, EActLifeRunActivity.class);
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
                            "import android.view.MenuItem;\n" +
                            "import android.widget.Toast;\n" +
                            "\n" +
                            "public class EActLifeRunActivity extends AppCompatActivity {\n" +
                            "\n" +
                            "    @Override\n" +
                            "    protected void onCreate(Bundle savedInstanceState) {\n" +
                            "        super.onCreate(savedInstanceState);\n" +
                            "        setContentView(R.layout.activity_eact_life_run);\n" +
                            "\n" +
                            "        Toast.makeText(this, \"onCreate was called\", Toast.LENGTH_SHORT).show();\n" +
                            "    }\n" +
                            "\n" +
                            "    @Override\n" +
                            "    protected void onStart() {\n" +
                            "        super.onStart();\n" +
                            "        Toast.makeText(this, \"onStart was called\", Toast.LENGTH_SHORT).show();\n" +
                            "    }\n" +
                            "\n" +
                            "    @Override\n" +
                            "    protected void onPause() {\n" +
                            "        super.onPause();\n" +
                            "        Toast.makeText(this, \"onPause was called\", Toast.LENGTH_SHORT).show();\n" +
                            "    }\n" +
                            "\n" +
                            "    @Override\n" +
                            "    protected void onStop() {\n" +
                            "        super.onStop();\n" +
                            "        Toast.makeText(this, \"onStop was called\", Toast.LENGTH_SHORT).show();\n" +
                            "    }\n" +
                            "\n" +
                            "    @Override\n" +
                            "    protected void onDestroy() {\n" +
                            "        super.onDestroy();\n" +
                            "        Toast.makeText(this, \"onDestroy was called\", Toast.LENGTH_SHORT).show();\n" +
                            "    }\n" +
                            "\n" +
                            "    @Override\n" +
                            "    protected void onRestart() {\n" +
                            "        super.onRestart();\n" +
                            "        Toast.makeText(this, \"onRestart was called\", Toast.LENGTH_SHORT).show();\n" +
                            "    }\n" +
                            "\n" +
                            "    @Override\n" +
                            "    protected void onResume() {\n" +
                            "        super.onResume();\n" +
                            "        Toast.makeText(this, \"onResume was called\", Toast.LENGTH_SHORT).show();\n" +
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
                    " <TextView\n" +
                    "        android:layout_margin=\"4dp\"\n" +
                    "        android:textSize=\"25sp\"\n" +
                    "        android:text=\"This is Activity\"\n" +
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
