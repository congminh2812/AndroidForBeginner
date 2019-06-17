package com.example.androidforbeginner.Examples.ImplicitIntent;

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

public class ECallActivity extends AppCompatActivity {

        private ViewPager pager;
        private TabLayout tablayout;
        private SectionsPageAdapter adapter;
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_ecall);

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
                    Intent intent = new Intent(this, ECallRunActivity.class);
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
                            "import android.Manifest;\n" +
                            "import android.app.Activity;\n" +
                            "import android.content.Intent;\n" +
                            "import android.content.pm.PackageManager;\n" +
                            "import android.net.Uri;\n" +
                            "import android.support.v4.app.ActivityCompat;\n" +
                            "import android.support.v7.app.AppCompatActivity;\n" +
                            "import android.os.Bundle;\n" +
                            "import android.support.v7.widget.Toolbar;\n" +
                            "import android.view.MenuItem;\n" +
                            "import android.view.View;\n" +
                            "import android.widget.EditText;\n" +
                            "import android.widget.Toast;\n" +
                            "\n" +
                            "public class ECallRunActivity extends AppCompatActivity {\n" +
                            "    EditText editText;\n" +
                            "    String sNum;\n" +
                            "    @Override\n" +
                            "    protected void onCreate(Bundle savedInstanceState) {\n" +
                            "        super.onCreate(savedInstanceState);\n" +
                            "        setContentView(R.layout.activity_ecall_run);\n" +
                            "        editText = findViewById(R.id.edit_text_number);\n" +
                            "\n" +
                            "    }\n" +
                            "\n" +
                            "    public void ClickMe(View view) {\n" +
                            "        Intent intent = new Intent(Intent.ACTION_CALL);\n" +
                            "        sNum = editText.getText().toString();\n" +
                            "        if (sNum.trim().isEmpty()) {\n" +
                            "            intent.setData(Uri.parse(\"tel:7788994455\"));\n" +
                            "        }else\n" +
                            "            intent.setData(Uri.parse(\"tel:\"+sNum));\n" +
                            "\n" +
                            "        if (ActivityCompat.checkSelfPermission(this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {\n" +
                            "            Toast.makeText(this, \"Please grant the permission to call\", Toast.LENGTH_SHORT).show();\n" +
                            "            requestPermission();\n" +
                            "        }else\n" +
                            "            startActivity(intent);\n" +
                            "    }\n" +
                            "\n" +
                            "    private void requestPermission() {\n" +
                            "        ActivityCompat.requestPermissions(this,new String[]{Manifest.permission.CALL_PHONE},1);\n" +
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
                    "<LinearLayout xmlns:android=\"http://schemas.android.com/apk/res/android\"\n" +
                    "    xmlns:app=\"http://schemas.android.com/apk/res-auto\"\n" +
                    "    xmlns:tools=\"http://schemas.android.com/tools\"\n" +
                    "    android:layout_width=\"match_parent\"\n" +
                    "    android:orientation=\"vertical\"\n" +
                    "    android:layout_height=\"match_parent\"\n" +
                    "    >\n" +
                    "\n" +
                    "     <EditText\n" +
                    "        android:id=\"@+id/edit_text_number\"\n" +
                    "        android:inputType=\"number\""+
                    "        android:textSize=\"25sp\"\n" +
                    "        android:layout_gravity=\"center_horizontal\"\n" +
                    "        android:hint=\"Enter Tel Number\"\n" +
                    "        android:layout_width=\"match_parent\"\n" +
                    "        android:layout_height=\"wrap_content\" />\n" +
                    "    <Button\n" +
                    "        android:layout_width=\"match_parent\"\n" +
                    "        android:layout_height=\"wrap_content\"\n" +
                    "        android:id=\"@+id/button\"\n" +
                    "        android:onClick=\"ClickMe\"\n" +
                    "        android:text=\"Call\"\n" +
                    "        android:layout_gravity=\"center_horizontal\"/>" +
                    "</LinearLayout>";
            return columnTwo;
        }




}
