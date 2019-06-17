package com.example.androidforbeginner.Examples.Animation;

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

public class EZoomActivity extends AppCompatActivity {

        private ViewPager pager;
        private TabLayout tablayout;
        private SectionsPageAdapter adapter;
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_ezoom);

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
            adapter.addFragment(new FragmentMain2(),"anim/zoom_in.xml");
            adapter.addFragment(new FragmentXML2(),"anim/zoom_out.xml");
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
                    Intent intent = new Intent(this, EZoomRunActivity.class);
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
                            "import android.view.animation.Animation;\n" +
                            "import android.view.animation.AnimationUtils;\n" +
                            "import android.widget.Button;\n" +
                            "import android.widget.ImageView;\n" +
                            "\n" +
                            "public class EZoomRunActivity extends AppCompatActivity {\n" +
                            "    Button buttonZoomIn,buttonZoomOut;\n" +
                            "    ImageView imageView;\n" +
                            "    @Override\n" +
                            "    protected void onCreate(Bundle savedInstanceState) {\n" +
                            "        super.onCreate(savedInstanceState);\n" +
                            "        setContentView(R.layout.activity_ezoom_run);\n" +
                            "\n" +
                            "        buttonZoomIn = findViewById(R.id.button_zoomin);\n" +
                            "        buttonZoomOut = findViewById(R.id.button_zoomout);\n" +
                            "        imageView = findViewById(R.id.image_view);\n" +
                            "\n" +
                            "        buttonZoomIn.setOnClickListener(new View.OnClickListener() {\n" +
                            "            @Override\n" +
                            "            public void onClick(View v) {\n" +
                            "                Animation animation = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.zoom_in);\n" +
                            "                imageView.startAnimation(animation);\n" +
                            "            }\n" +
                            "        });\n" +
                            "        buttonZoomOut.setOnClickListener(new View.OnClickListener() {\n" +
                            "            @Override\n" +
                            "            public void onClick(View v) {\n" +
                            "                Animation animation = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.zoom_out);\n" +
                            "                imageView.startAnimation(animation);\n" +
                            "            }\n" +
                            "        });\n" +
                            "    }\n" +
                            "}\n";
            return columnTwo;
        }
        public String getColumnTwoJava2() {
            String columnTwo = "<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
                    "<set xmlns:android=\"http://schemas.android.com/apk/res/android\">\n" +
                    "    <scale\n" +
                    "        android:duration=\"1000\"\n" +
                    "        android:fromXScale=\"1\"\n" +
                    "        android:fromYScale=\"1\"\n" +
                    "        android:pivotX=\"50%\"\n" +
                    "        android:pivotY=\"50%\"\n" +
                    "        android:toXScale=\"2\"\n" +
                    "        android:toYScale=\"2\"/>\n" +
                    "</set>";
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
                    "   >\n" +

                    " <ImageView\n" +
                    "        android:id=\"@+id/image_view\"\n" +
                    "        android:src=\"@mipmap/ic_launcher_round\"\n" +
                    "        android:layout_weight=\"4\"\n" +
                    "        android:layout_width=\"match_parent\"\n" +
                    "        android:layout_height=\"match_parent\" />\n" +
                    "    <Button\n" +
                    "        android:id=\"@+id/button_zoomin\"\n" +
                    "        android:text=\"ZoomIn\"\n" +
                    "        android:layout_width=\"match_parent\"\n" +
                    "        android:layout_height=\"wrap_content\" />\n" +
                    "    <Button\n" +
                    "        android:id=\"@+id/button_zoomout\"\n" +
                    "        android:text=\"ZoomOut\"\n" +
                    "        android:layout_width=\"match_parent\"\n" +
                    "        android:layout_height=\"wrap_content\" />" +
                    "</LinearLayout>";
            return columnTwo;
        }
        public String getColumnTwoXML2() {
            String columnTwo = "<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
                    "<set xmlns:android=\"http://schemas.android.com/apk/res/android\">\n" +
                    "    <scale\n" +
                    "        android:duration=\"1000\"\n" +
                    "        android:fromYScale=\"1\"\n" +
                    "        android:fromXScale=\"1\"\n" +
                    "        android:pivotY=\"50%\"\n" +
                    "        android:pivotX=\"50%\"\n" +
                    "        android:toYScale=\"0.5\"\n" +
                    "        android:toXScale=\"0.5\"/>\n" +
                    "</set>";
            return columnTwo;
        }
    }
