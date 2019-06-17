package com.example.androidforbeginner.Examples.Containers;

import android.content.Intent;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import com.example.androidforbeginner.Examples.Widgets.FragmentItem;
import com.example.androidforbeginner.Examples.Widgets.FragmentMain;
import com.example.androidforbeginner.Examples.Widgets.FragmentXML;
import com.example.androidforbeginner.R;
import com.example.androidforbeginner.SectionsPageAdapter;

public class ECusListViewActivity extends AppCompatActivity {

        private ViewPager pager;
        private TabLayout tablayout;
        private SectionsPageAdapter adapter;
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_ecus_list_view);

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
            adapter.addFragment(new FragmentItem(),"cuslistview_row.xml");
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
                    Intent intent = new Intent(this, ECusListViewRunActivity.class);
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
                            "import android.content.Context;\n" +
                            "import android.media.Image;\n" +
                            "import android.support.v7.app.AppCompatActivity;\n" +
                            "import android.os.Bundle;\n" +
                            "import android.support.v7.widget.Toolbar;\n" +
                            "import android.view.LayoutInflater;\n" +
                            "import android.view.MenuItem;\n" +
                            "import android.view.View;\n" +
                            "import android.view.ViewGroup;\n" +
                            "import android.widget.ArrayAdapter;\n" +
                            "import android.widget.BaseAdapter;\n" +
                            "import android.widget.ImageView;\n" +
                            "import android.widget.ListView;\n" +
                            "import android.widget.TextView;\n" +
                            "\n" +
                            "import java.util.List;\n" +
                            "\n" +
                            "public class ECusListViewRunActivity extends AppCompatActivity {\n" +
                            "    String[] title = {\"Title1\",\"Title2\",\"Title3\",\"Title4\"};\n" +
                            "    String[] description = {\"Description1\",\"Description2\",\"Description3\",\"Description4\"};\n" +
                            "    int[] image = {R.drawable.activity1,R.drawable.activity2,R.drawable.activity3,R.drawable.activity4};\n" +
                            "    ListView listView;\n" +
                            "    @Override\n" +
                            "    protected void onCreate(Bundle savedInstanceState) {\n" +
                            "        super.onCreate(savedInstanceState);\n" +
                            "        setContentView(R.layout.activity_ecus_list_view_run);\n" +
                            "        \n" +
                            "        listView = findViewById(R.id.list_view);\n" +
                            "        MyAdapter adapter = new MyAdapter(this,R.layout.cuslistview_row,image,title,description);\n" +
                            "        listView.setAdapter(adapter);\n" +
                            "        \n" +
                            "        \n" +
                            "    }\n" +
                            "    class MyAdapter extends ArrayAdapter {\n" +
                            "        int[] imageArray;\n" +
                            "        String[] titleArray;\n" +
                            "        String[] desArray;\n" +
                            "\n" +
                            "        public MyAdapter(Context context, int resource, int[] imageArray, String[] titleArray, String[] desArray) {\n" +
                            "            super(context, R.layout.cuslistview_row,R.id.title,titleArray);\n" +
                            "            this.imageArray = imageArray;\n" +
                            "            this.titleArray = titleArray;\n" +
                            "            this.desArray = desArray;\n" +
                            "        }\n" +
                            "      \n" +
                            "        @Override\n" +
                            "        public View getView(int position, View convertView, ViewGroup parent) {\n" +
                            "            LayoutInflater inflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);\n" +
                            "            View view = inflater.inflate(R.layout.cuslistview_row,parent,false);\n" +
                            "\n" +
                            "            ImageView imageView = view.findViewById(R.id.image_view);\n" +
                            "            TextView title = view.findViewById(R.id.title);\n" +
                            "            TextView description = view.findViewById(R.id.description);\n" +
                            "            \n" +
                            "            imageView.setImageResource(imageArray[position]);\n" +
                            "            title.setText(titleArray[position]);\n" +
                            "            description.setText(desArray[position]);\n" +
                            "            \n" +
                            "            return view;\n" +
                            "        }\n" +
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

    public String getColumnTwoXML2() {
        String columnTwo = "<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
                "<RelativeLayout\n" +
                "    xmlns:android=\"http://schemas.android.com/apk/res/android\" android:layout_width=\"match_parent\"\n" +
                "    android:layout_height=\"match_parent\">\n" +
                "    <ImageView\n" +
                "        android:id=\"@+id/image_view\"\n" +
                "        android:layout_width=\"wrap_content\"\n" +
                "        android:layout_height=\"wrap_content\"\n" +
                "        android:src=\"@drawable/activity1\"\n" +
                "        />\n" +
                "    <TextView\n" +
                "        android:id=\"@+id/title\"\n" +
                "        android:textSize=\"20sp\"\n" +
                "        android:layout_toRightOf=\"@id/image_view\"\n" +
                "        android:layout_width=\"match_parent\"\n" +
                "        android:layout_height=\"wrap_content\" />\n" +
                "    <TextView\n" +
                "        android:id=\"@+id/description\"\n" +
                "        android:textSize=\"16sp\"\n" +
                "        android:layout_toRightOf=\"@id/image_view\"\n" +
                "        android:layout_below=\"@id/title\"\n" +
                "        android:layout_width=\"match_parent\"\n" +
                "        android:layout_height=\"wrap_content\" />\n" +
                "</RelativeLayout>";
        return columnTwo;
    }


}
