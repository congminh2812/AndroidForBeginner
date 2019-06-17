package com.example.androidforbeginner.Examples.DataStorage;

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

public class EExternalActivity extends AppCompatActivity {

        private ViewPager pager;
        private TabLayout tablayout;
        private SectionsPageAdapter adapter;
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_eexternal);

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
                    Intent intent = new Intent(this, EExternalRunActivity.class);
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
                            "import android.content.Context;\n" +
                            "import android.content.pm.PackageManager;\n" +
                            "import android.os.Environment;\n" +
                            "import android.support.annotation.NonNull;\n" +
                            "import android.support.v4.app.ActivityCompat;\n" +
                            "import android.support.v4.content.ContextCompat;\n" +
                            "import android.support.v7.app.AppCompatActivity;\n" +
                            "import android.os.Bundle;\n" +
                            "import android.support.v7.widget.Toolbar;\n" +
                            "import android.view.MenuItem;\n" +
                            "import android.view.View;\n" +
                            "import android.widget.Button;\n" +
                            "import android.widget.EditText;\n" +
                            "import android.widget.TextView;\n" +
                            "import android.widget.Toast;\n" +
                            "\n" +
                            "import java.io.BufferedReader;\n" +
                            "import java.io.File;\n" +
                            "import java.io.FileInputStream;\n" +
                            "import java.io.FileNotFoundException;\n" +
                            "import java.io.FileOutputStream;\n" +
                            "import java.io.IOException;\n" +
                            "import java.io.InputStreamReader;\n" +
                            "\n" +
                            "public class EExternalRunActivity extends AppCompatActivity {\n" +
                            "        private static final int PERMISION_WRITE_EXTERNAL_STORAGE = 123;\n" +
                            "        Button btnSave,btnRead;\n" +
                            "        TextView txtRead;\n" +
                            "        EditText edtName;\n" +
                            "        String FileName = \"myFile\";\n" +
                            "        @Override\n" +
                            "        protected void onCreate(Bundle savedInstanceState) {\n" +
                            "            super.onCreate(savedInstanceState);\n" +
                            "            setContentView(R.layout.activity_eexternal_run);\n" +
                            "            \n" +
                            "            // Add to Manifest\n" +
                            "            //     <uses-permission android:name=\"android.permission.WRITE_EXTERNAL_STORAGE\"/>\n" +
                            "            //    <uses-permission android:name=\"android.permission.READ_EXTERNAL_STORAGE\"/>\n" +
                            "\n" +
                            "            btnRead = findViewById(R.id.btn_read);\n" +
                            "            btnSave = findViewById(R.id.btn_save);\n" +
                            "            txtRead = findViewById(R.id.txt_read);\n" +
                            "            edtName = findViewById(R.id.edt_name);\n" +
                            "            btnSave.setOnClickListener(new View.OnClickListener() {\n" +
                            "                @Override\n" +
                            "                public void onClick(View v) {\n" +
                            "                    int permissionCheck = ContextCompat.checkSelfPermission(getApplicationContext(), Manifest.permission.WRITE_EXTERNAL_STORAGE);\n" +
                            "                    if (permissionCheck == PackageManager.PERMISSION_GRANTED) {\n" +
                            "                        saveFile();\n" +
                            "                    } else {\n" +
                            "                        ActivityCompat.requestPermissions(EExternalRunActivity.this,new String[]{Manifest.permission.WRITE_EXTERNAL_STORAGE},PERMISION_WRITE_EXTERNAL_STORAGE);\n" +
                            "                    } \n" +
                            "                }\n" +
                            "            });\n" +
                            "\n" +
                            "            btnRead.setOnClickListener(new View.OnClickListener() {\n" +
                            "                @Override\n" +
                            "                public void onClick(View v) {\n" +
                            "                    readFile();\n" +
                            "                }\n" +
                            "            });\n" +
                            "        }\n" +
                            "        private void saveFile(){\n" +
                            "            try {\n" +
                            "                File file = new File(Environment.getExternalStorageDirectory(),FileName);\n" +
                            "                FileOutputStream fileOutputStream = new FileOutputStream(file);\n" +
                            "                String name = edtName.getText().toString();\n" +
                            "                fileOutputStream.write(name.getBytes());\n" +
                            "                fileOutputStream.close();\n" +
                            "                Toast.makeText(this, \"Data Saved Successfully\", Toast.LENGTH_SHORT).show();\n" +
                            "\n" +
                            "            } catch (FileNotFoundException e) {\n" +
                            "                e.printStackTrace();\n" +
                            "            } catch (IOException e) {\n" +
                            "                e.printStackTrace();\n" +
                            "            }\n" +
                            "\n" +
                            "        }\n" +
                            "\n" +
                            "        private void readFile() {\n" +
                            "            try {\n" +
                            "                File file = new File(Environment.getExternalStorageDirectory(),FileName);\n" +
                            "                FileInputStream fileInputStream = new FileInputStream(file);\n" +
                            "                InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);\n" +
                            "                BufferedReader bufferedReader = new BufferedReader(inputStreamReader);\n" +
                            "                StringBuilder stringBuilder = new StringBuilder();\n" +
                            "                String line = null;\n" +
                            "                while ((line = bufferedReader.readLine()) != null) {\n" +
                            "                    stringBuilder.append(line);\n" +
                            "                }\n" +
                            "                fileInputStream.close();\n" +
                            "                inputStreamReader.close();\n" +
                            "                txtRead.setText(\"Name: \"+stringBuilder.toString());\n" +
                            "                Toast.makeText(this, \"Data: \"+stringBuilder.toString(), Toast.LENGTH_SHORT).show();\n" +
                            "\n" +
                            "            } catch (FileNotFoundException e) {\n" +
                            "                e.printStackTrace();\n" +
                            "            } catch (IOException e) {\n" +
                            "                e.printStackTrace();\n" +
                            "            }\n" +
                            "\n" +
                            "        }\n" +
                            "\n" +
                            "    @Override\n" +
                            "    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {\n" +
                            "        switch (requestCode) {\n" +
                            "            case PERMISION_WRITE_EXTERNAL_STORAGE:\n" +
                            "                if (grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {\n" +
                            "                    saveFile();\n" +
                            "                } else {\n" +
                            "                    Toast.makeText(this, \"Please grant Permission to Save File\", Toast.LENGTH_SHORT).show();\n" +
                            "                } \n" +
                            "                return;\n" +
                            "        }\n" +
                            "    }\n" +
                            "\n" +
                            "    }\n";
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
                    "  >\n" +
                    "    <EditText\n" +
                    "        android:id=\"@+id/edt_name\"\n" +
                    "        android:ems=\"10\"\n" +
                    "        android:hint=\"Name:\"\n" +
                    "        android:layout_width=\"match_parent\"\n" +
                    "        android:layout_height=\"wrap_content\" />\n" +
                    "    <LinearLayout\n" +
                    "        android:orientation=\"horizontal\"\n" +
                    "        android:layout_width=\"match_parent\"\n" +
                    "        android:layout_height=\"wrap_content\">\n" +
                    "        <Button\n" +
                    "            android:id=\"@+id/btn_save\"\n" +
                    "            android:layout_margin=\"5dp\"\n" +
                    "            android:layout_weight=\"1\"\n" +
                    "            android:text=\"Save To File\"\n" +
                    "            android:layout_width=\"match_parent\"\n" +
                    "            android:layout_height=\"wrap_content\" />\n" +
                    "        <Button\n" +
                    "            android:id=\"@+id/btn_read\"\n" +
                    "            android:layout_margin=\"5dp\"\n" +
                    "            android:layout_weight=\"1\"\n" +
                    "            android:text=\"Read File\"\n" +
                    "            android:layout_width=\"match_parent\"\n" +
                    "            android:layout_height=\"wrap_content\" />\n" +
                    "    </LinearLayout>\n" +
                    "    <TextView\n" +
                    "        android:id=\"@+id/txt_read\"\n" +
                    "        android:textColor=\"#00000\"\n" +
                    "        android:textSize=\"25sp\"\n" +
                    "        android:layout_width=\"match_parent\"\n" +
                    "        android:layout_height=\"wrap_content\" />\n" +
                    "</LinearLayout>";
            return columnTwo;
        }
    }

