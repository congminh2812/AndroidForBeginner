package com.example.androidforbeginner.Examples.Toast;

import android.content.Intent;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import com.example.androidforbeginner.Examples.Widgets.FragmentMain;
import com.example.androidforbeginner.Examples.Widgets.FragmentXML;
import com.example.androidforbeginner.R;
import com.example.androidforbeginner.SectionsPageAdapter;

public class EMessageActivity extends AppCompatActivity {

        private ViewPager pager;
        private TabLayout tablayout;
        private SectionsPageAdapter adapter;
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_emessage);

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
                    Intent intent = new Intent(this, EMessageRunActivity.class);
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
                            "import android.view.Gravity;\n" +
                            "import android.view.MenuItem;\n" +
                            "import android.view.View;\n" +
                            "import android.widget.Toast;\n" +
                            "\n" +
                            "public class EMessageRunActivity extends AppCompatActivity {\n" +
                            "\n" +
                            "    @Override\n" +
                            "    protected void onCreate(Bundle savedInstanceState) {\n" +
                            "        super.onCreate(savedInstanceState);\n" +
                            "        setContentView(R.layout.activity_emessage_run);\n" +
                            "    }\n" +
                            "\n" +
                            "    public void ClickMe(View view) {\n" +
                            "        Toast toast1 = Toast.makeText(this,\"Toast:Gravity.TOP\",Toast.LENGTH_SHORT);\n" +
                            "        toast1.setGravity(Gravity.TOP,0,0);\n" +
                            "        toast1.show();\n" +
                            "\n" +
                            "        Toast toast2 = Toast.makeText(this,\"Toast:Gravity.CENTER\",Toast.LENGTH_SHORT);\n" +
                            "        toast2.setGravity(Gravity.CENTER,0,0);\n" +
                            "        toast2.show();\n" +
                            "\n" +
                            "        Toast toast3 = Toast.makeText(this,\"Toast:Gravity.BOTTOM\",Toast.LENGTH_SHORT);\n" +
                            "        toast3.setGravity(Gravity.BOTTOM,0,0);\n" +
                            "        toast3.show();\n" +
                            "\n" +
                            "        Toast toast4 = Toast.makeText(this,\"Toast:Gravity.LEFT\",Toast.LENGTH_SHORT);\n" +
                            "        toast4.setGravity(Gravity.LEFT,0,0);\n" +
                            "        toast4.show();\n" +
                            "\n" +
                            "        Toast toast5 = Toast.makeText(this,\"Toast:Gravity.RIGHT\",Toast.LENGTH_SHORT);\n" +
                            "        toast5.setGravity(Gravity.RIGHT,0,0);\n" +
                            "        toast5.show();\n" +
                            "\n" +
                            "        Toast toast6 = Toast.makeText(this,\"Toast:TOP LEFT\",Toast.LENGTH_SHORT);\n" +
                            "        toast6.setGravity(Gravity.LEFT | Gravity.TOP,0,0);\n" +
                            "        toast6.show();\n" +
                            "\n" +
                            "        Toast toast7 = Toast.makeText(this,\"Toast:BOTTOM RIGHT\",Toast.LENGTH_SHORT);\n" +
                            "        toast7.setGravity(Gravity.RIGHT | Gravity.BOTTOM,0,0);\n" +
                            "        toast7.show();\n" +
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
                    "    >\n" +
                    "\n" +
                    "  <Button\n" +
                    "        android:layout_width=\"match_parent\"\n" +
                    "        android:layout_height=\"wrap_content\"\n" +
                    "        android:id=\"@+id/button\"\n" +
                    "        android:text=\"ClickMe\"\n" +
                    "        android:onClick=\"ClickMe\"\n" +
                    "        android:layout_gravity=\"center_horizontal\"/>" +
                    "</LinearLayout>";
            return columnTwo;
        }

}
