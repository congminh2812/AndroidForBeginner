package com.example.androidforbeginner.Examples.Containers;

import android.content.Intent;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import com.example.androidforbeginner.Examples.Toast.ECustomRunActivity;
import com.example.androidforbeginner.Examples.Widgets.FragmentItem;
import com.example.androidforbeginner.Examples.Widgets.FragmentMain;
import com.example.androidforbeginner.Examples.Widgets.FragmentXML;
import com.example.androidforbeginner.R;
import com.example.androidforbeginner.SectionsPageAdapter;

public class EListViewActivity extends AppCompatActivity {

        private ViewPager pager;
        private TabLayout tablayout;
        private SectionsPageAdapter adapter;
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_elist_view);

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
                    Intent intent = new Intent(this, EListViewRunActivity.class);
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
                            "import android.view.View;\n" +
                            "import android.widget.AdapterView;\n" +
                            "import android.widget.ArrayAdapter;\n" +
                            "import android.widget.ListView;\n" +
                            "import android.widget.Toast;\n" +
                            "\n" +
                            "import java.util.ArrayList;\n" +
                            "\n" +
                            "public class EListViewRunActivity extends AppCompatActivity {\n" +
                            "    ListView listView;\n" +
                            "    ArrayList<String> arrayList;\n" +
                            "    @Override\n" +
                            "    protected void onCreate(Bundle savedInstanceState) {\n" +
                            "        super.onCreate(savedInstanceState);\n" +
                            "        setContentView(R.layout.activity_elist_view_run);\n" +
                            "        \n" +
                            "        listView = findViewById(R.id.list_view);\n" +
                            "        arrayList = new ArrayList<>();\n" +
                            "        arrayList.add(\"Item 1\");\n" +
                            "        arrayList.add(\"Item 2\");\n" +
                            "        arrayList.add(\"Item 3\");\n" +
                            "        arrayList.add(\"Item 4\");\n" +
                            "        \n" +
                            "        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,arrayList);\n" +
                            "        listView.setAdapter(adapter);\n" +
                            "        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {\n" +
                            "            @Override\n" +
                            "            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {\n" +
                            "                Toast.makeText(EListViewRunActivity.this, arrayList.get(position), Toast.LENGTH_SHORT).show();\n" +
                            "            }\n" +
                            "        });\n" +
                            "    }\n" +
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
                    "<ListView\n" +
                    "        android:id=\"@+id/list_view\"\n" +
                    "        android:layout_width=\"match_parent\"\n" +
                    "        android:layout_height=\"match_parent\"></ListView>" +
                    "    \n" +
                    "</LinearLayout>";
            return columnTwo;
        }


}
