package com.example.androidforbeginner.Examples.ExplicitIntent;

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
import com.example.androidforbeginner.Examples.Widgets.FragmentMain;
import com.example.androidforbeginner.Examples.Widgets.FragmentXML;
import com.example.androidforbeginner.R;
import com.example.androidforbeginner.SectionsPageAdapter;

public class EPassingActivity extends AppCompatActivity {

        private ViewPager pager;
        private TabLayout tablayout;
        private SectionsPageAdapter adapter;
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_epassing);

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
            adapter.addFragment(new FragmentMain2(),"MainActivity2.java");
            adapter.addFragment(new FragmentXML2(),"activity_main2.xml");
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
                    Intent intent = new Intent(this, EPassingRunActivity.class);
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
                            "import android.content.Intent;\n" +
                            "import android.support.v7.app.AppCompatActivity;\n" +
                            "import android.os.Bundle;\n" +
                            "import android.support.v7.widget.Toolbar;\n" +
                            "import android.view.MenuItem;\n" +
                            "import android.view.View;\n" +
                            "import android.widget.EditText;\n" +
                            "\n" +
                            "public class EPassingRunActivity extends AppCompatActivity {\n" +
                            "    EditText editText;\n" +
                            "    @Override\n" +
                            "    protected void onCreate(Bundle savedInstanceState) {\n" +
                            "        super.onCreate(savedInstanceState);\n" +
                            "        setContentView(R.layout.activity_epassing_run);\n" +
                            "        editText = findViewById(R.id.edit_text);\n" +
                            "    }\n" +
                            "\n" +
                            "    public void btnClickAct1(View view) {\n" +
                            "        Intent intent = new Intent(this,EPassingRun2Activity.class);\n" +
                            "        String text = editText.getText().toString();\n" +
                            "        intent.putExtra(\"text\",text);\n" +
                            "        startActivity(intent);\n" +
                            "        finish();\n" +
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
                    "<LinearLayout xmlns:android=\"http://schemas.android.com/apk/res/android\"\n" +
                    "    xmlns:app=\"http://schemas.android.com/apk/res-auto\"\n" +
                    "    xmlns:tools=\"http://schemas.android.com/tools\"\n" +
                    "    android:layout_width=\"match_parent\"\n" +
                    "    android:orientation=\"vertical\"\n" +
                    "    android:layout_height=\"match_parent\"\n" +
                    "    tools:context=\".Examples.ExplicitIntent.EPassingRunActivity\">\n" +
                    "    <android.support.v7.widget.Toolbar\n" +
                    "        android:id=\"@+id/toolbar\"\n" +
                    "        android:background=\"@color/colorGreenLight\"\n" +
                    "        android:layout_width=\"match_parent\"\n" +
                    "        android:theme=\"@style/AppTheme.AppBarOverLay\"\n" +
                    "        android:layout_height=\"?attr/actionBarSize\">\n" +
                    "\n" +
                    "    </android.support.v7.widget.Toolbar>\n" +
                    "    <EditText\n" +
                    "        android:id=\"@+id/edit_text\"\n" +
                    "        android:textSize=\"48sp\"\n" +
                    "        android:gravity=\"center_horizontal\"\n" +
                    "        android:layout_width=\"match_parent\"\n" +
                    "        android:layout_height=\"wrap_content\" />\n" +
                    "    <Button\n" +
                    "        android:layout_width=\"match_parent\"\n" +
                    "        android:layout_height=\"wrap_content\"\n" +
                    "        android:id=\"@+id/button\"\n" +
                    "        android:onClick=\"btnClickAct1\"\n" +
                    "        android:text=\"Go to Activity 2\"\n" +
                    "        android:layout_gravity=\"center_horizontal\"/>\n" +
                    "</LinearLayout>";
            return columnTwo;
        }
        public String getColumnTwoJava2() {
            String columnTwo =
                            "import android.content.Intent;\n" +
                            "import android.support.v7.app.AppCompatActivity;\n" +
                            "import android.os.Bundle;\n" +
                            "import android.support.v7.widget.Toolbar;\n" +
                            "import android.view.MenuItem;\n" +
                            "import android.view.View;\n" +
                            "import android.widget.EditText;\n" +
                            "import android.widget.TextView;\n" +
                            "\n" +
                            "public class EPassingRun2Activity extends AppCompatActivity {\n" +
                            "    TextView textView;\n" +
                            "    @Override\n" +
                            "    protected void onCreate(Bundle savedInstanceState) {\n" +
                            "        super.onCreate(savedInstanceState);\n" +
                            "        setContentView(R.layout.activity_epassing_run2);\n" +
                            "        textView = findViewById(R.id.text_view);\n" +
                            "        textView.setText(getIntent().getExtras().getString(\"text\"));\n" +
                            "\n" +
                            "    }\n" +
                            "\n" +
                            "    public void btnClickAct2(View view) {\n" +
                            "        Intent intent = new Intent(this,EPassingRunActivity.class);\n" +
                            "        startActivity(intent);\n" +
                            "        finish();\n" +
                            "    }\n" +
                            "}\n";
            return columnTwo;
        }
        public String getColumnTwoXML2() {
            String columnTwo = "<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
                    "<LinearLayout xmlns:android=\"http://schemas.android.com/apk/res/android\"\n" +
                    "    xmlns:app=\"http://schemas.android.com/apk/res-auto\"\n" +
                    "    xmlns:tools=\"http://schemas.android.com/tools\"\n" +
                    "    android:layout_width=\"match_parent\"\n" +
                    "    android:orientation=\"vertical\"\n" +
                    "    android:layout_height=\"match_parent\"\n" +
                    "    tools:context=\".Examples.ExplicitIntent.EPassingRunActivity\">\n" +
                    "    <android.support.v7.widget.Toolbar\n" +
                    "        android:id=\"@+id/toolbar\"\n" +
                    "        android:background=\"@color/colorGreenLight\"\n" +
                    "        android:layout_width=\"match_parent\"\n" +
                    "        android:theme=\"@style/AppTheme.AppBarOverLay\"\n" +
                    "        android:layout_height=\"?attr/actionBarSize\">\n" +
                    "\n" +
                    "    </android.support.v7.widget.Toolbar>\n" +
                    "    <TextView\n" +
                    "        android:id=\"@+id/text_view\"\n" +
                    "        android:textSize=\"48sp\"\n" +
                    "        android:gravity=\"center_horizontal\"\n" +
                    "        android:layout_width=\"match_parent\"\n" +
                    "        android:layout_height=\"wrap_content\" />\n" +
                    "    <Button\n" +
                    "        android:layout_width=\"match_parent\"\n" +
                    "        android:layout_height=\"wrap_content\"\n" +
                    "        android:id=\"@+id/button\"\n" +
                    "        android:onClick=\"btnClickAct2\"\n" +
                    "        android:text=\"Go to Activity 1\"\n" +
                    "        android:layout_gravity=\"center_horizontal\"/>\n" +
                    "</LinearLayout>";
            return columnTwo;
        }


}
