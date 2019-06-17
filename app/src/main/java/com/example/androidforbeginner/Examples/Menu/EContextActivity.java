package com.example.androidforbeginner.Examples.Menu;

import android.content.Intent;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import com.example.androidforbeginner.Examples.Containers.ESearchViewRunActivity;
import com.example.androidforbeginner.Examples.Widgets.FragmentMain;
import com.example.androidforbeginner.Examples.Widgets.FragmentXML;
import com.example.androidforbeginner.R;
import com.example.androidforbeginner.SectionsPageAdapter;

public class EContextActivity extends AppCompatActivity {
        private ViewPager pager;
        private TabLayout tablayout;
        private SectionsPageAdapter adapter;
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_econtext);

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
                    Intent intent = new Intent(this, EContextRunActivity.class);
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
                            "import android.view.ContextMenu;\n" +
                            "import android.view.Menu;\n" +
                            "import android.view.MenuItem;\n" +
                            "import android.view.View;\n" +
                            "import android.widget.ArrayAdapter;\n" +
                            "import android.widget.ListView;\n" +
                            "import android.widget.Toast;\n" +
                            "\n" +
                            "public class EContextRunActivity extends AppCompatActivity {\n" +
                            "    ListView listView;\n" +
                            "    @Override\n" +
                            "    protected void onCreate(Bundle savedInstanceState) {\n" +
                            "        super.onCreate(savedInstanceState);\n" +
                            "        setContentView(R.layout.activity_econtext_run);\n" +
                            "        \n" +
                            "        listView = findViewById(R.id.list_view);\n" +
                            "        String[] planets = {\"Mercury\",\"Venus\",\"Mars\",\"Earth\",\"Jupitor\"};\n" +
                            "        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,planets);\n" +
                            "        listView.setAdapter(adapter);\n" +
                            "        registerForContextMenu(listView);\n" +
                            "    }\n" +
                            "\n" +
                            "\n" +
                            "    @Override\n" +
                            "    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {\n" +
                            "        super.onCreateContextMenu(menu, v, menuInfo);\n" +
                            "        menu.setHeaderTitle(\"Select the Action\");\n" +
                            "        menu.add(0,v.getId(),0,\"Delete\");\n" +
                            "        menu.add(0,v.getId(),0,\"UpperCase\");\n" +
                            "        menu.add(0,v.getId(),0,\"LowerCase\");\n" +
                            "    }\n" +
                            "\n" +
                            "    @Override\n" +
                            "    public boolean onContextItemSelected(MenuItem item) {\n" +
                            "        if (item.getTitle() == \"Delete\") {\n" +
                            "            Toast.makeText(this, \"Delete was pressed\", Toast.LENGTH_SHORT).show();\n" +
                            "        } else if (item.getTitle() == \"UpperCase\") {\n" +
                            "            Toast.makeText(this, \"UpperCase was pressed\", Toast.LENGTH_SHORT).show();\n" +
                            "        } else if (item.getTitle() == \"LowerCase\") {\n" +
                            "            Toast.makeText(this, \"LowerCase was pressed\", Toast.LENGTH_SHORT).show();\n" +
                            "        }\n" +
                            "        return true;\n" +
                            "    }\n" +
                            "\n" +
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
                    "<ListView\n" +
                    "        android:layout_margin=\"2dp\"\n" +
                    "        android:id=\"@+id/list_view\"\n" +
                    "        android:layout_width=\"match_parent\"\n" +
                    "        android:layout_height=\"match_parent\"></ListView>\n" +
                    "    \n" +
                    "    <TextView\n" +
                    "        android:id=\"@+id/text_view\"\n" +
                    "        android:layout_marginTop=\"4dp\"\n" +
                    "        android:gravity=\"center_horizontal\"\n" +
                    "        android:textSize=\"25sp\"\n" +
                    "        android:text=\"Long Press on any List Item\"\n" +
                    "        android:layout_width=\"match_parent\"\n" +
                    "        android:layout_height=\"wrap_content\" />" +
                    "    \n" +
                    "</LinearLayout>";
            return columnTwo;
        }

    }
