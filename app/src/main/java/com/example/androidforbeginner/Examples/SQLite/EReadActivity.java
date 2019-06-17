package com.example.androidforbeginner.Examples.SQLite;

import android.content.Intent;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import com.example.androidforbeginner.Examples.FragmentMain2;
import com.example.androidforbeginner.Examples.Widgets.FragmentMain;
import com.example.androidforbeginner.Examples.Widgets.FragmentXML;
import com.example.androidforbeginner.R;
import com.example.androidforbeginner.SectionsPageAdapter;

public class EReadActivity extends AppCompatActivity {
        private ViewPager pager;
        private TabLayout tablayout;
        private SectionsPageAdapter adapter;
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_eread);

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
            adapter.addFragment(new FragmentMain2(),"DataBaseHelper.java");
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
                    Intent intent = new Intent(this, EReadRunActivity.class);
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
                            "import android.database.Cursor;\n" +
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
                            "public class EReadRunActivity extends AppCompatActivity {\n" +
                            "\n" +
                            "        DataBaseHelper dataBaseHelper;\n" +
                            "        TextView textView;\n" +
                            "        Button button;\n" +
                            "        @Override\n" +
                            "        protected void onCreate(Bundle savedInstanceState) {\n" +
                            "            super.onCreate(savedInstanceState);\n" +
                            "            setContentView(R.layout.activity_eread_run);\n" +
                            "\n" +
                            "           textView = findViewById(R.id.txt_result);\n" +
                            "            button = findViewById(R.id.button);\n" +
                            "\n" +
                            "            dataBaseHelper = new DataBaseHelper(this);\n" +
                            "\n" +
                            "            button.setOnClickListener(new View.OnClickListener() {\n" +
                            "                @Override\n" +
                            "                public void onClick(View v) {\n" +
                            "                    ClickMe();\n" +
                            "                }\n" +
                            "            });\n" +
                            "\n" +
                            "        }\n" +
                            "\n" +
                            "        private void ClickMe() {\n" +
                            "            Cursor res = dataBaseHelper.getAllData();\n" +
                            "            StringBuffer stringBuffer = new StringBuffer();\n" +
                            "            if (res != null && res.getCount() > 0) {\n" +
                            "                while (res.moveToNext()) {\n" +
                            "                    stringBuffer.append(\"Id: \" + res.getString(0) + \"\\n\");\n" +
                            "                    stringBuffer.append(\"Name: \" + res.getString(1) + \"\\n\");\n" +
                            "                    stringBuffer.append(\"SurName: \" + res.getString(2) + \"\\n\");\n" +
                            "                    stringBuffer.append(\"Marks: \" + res.getString(3) + \"\\n\");\n" +
                            "                }\n" +
                            "                textView.setText(stringBuffer.toString());\n" +
                            "                Toast.makeText(this, \"Data Retrieved Succesfully\", Toast.LENGTH_SHORT).show();\n" +
                            "            } else {\n" +
                            "                Toast.makeText(this, \"No Data to Retrieve\", Toast.LENGTH_SHORT).show();\n" +
                            "            }\n" +
                            "          \n" +
                            "        }\n" +
                            "    }\n" ;
            return columnTwo;
        }
        public String getColumnTwoJava2() {
            String columnTwo =
                    "import android.content.ContentValues;\n" +
                            "import android.content.Context;\n" +
                            "import android.database.sqlite.SQLiteDatabase;\n" +
                            "import android.database.sqlite.SQLiteOpenHelper;\n" +
                            "\n" +
                            "public class DataBaseHelper extends SQLiteOpenHelper {\n" +
                            "    public static final String DATABASE_NAME = \"Student.db\";\n" +
                            "    public static final String TABLE_NAME = \"Student_table\";\n" +
                            "    \n" +
                            "    public static final String COL_1 = \"ID\";\n" +
                            "    public static final String COL_2 = \"NAME\";\n" +
                            "    public static final String COL_3 = \"SURNAME\";\n" +
                            "    public static final String COL_4 = \"MARKS\";\n" +
                            "    \n" +
                            "    public DataBaseHelper(Context context) {\n" +
                            "        super(context,DATABASE_NAME,null,1);\n" +
                            "    }\n" +
                            "\n" +
                            "    @Override\n" +
                            "    public void onCreate(SQLiteDatabase db) {\n" +
                            "        db.execSQL(\"CREATE TABLE \"+TABLE_NAME + \"(ID INTEGER PRIMARY KEY AUTOINCREMENT,NAME TEXT,SURNAME TEXT,MARKS INTEGER)\");\n" +
                            "    }\n" +
                            "\n" +
                            "    @Override\n" +
                            "    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {\n" +
                            "        db.execSQL(\"DROP TABLE IF EXISTS \"+TABLE_NAME);\n" +
                            "    }\n" +
                            "\n" +
                            "  public Cursor getAllData() {\n" +
                            "        SQLiteDatabase database = getWritableDatabase();\n" +
                            "        Cursor res = database.rawQuery(\"Select * from \"+TABLE_NAME,null);\n" +
                            "        return res;\n" +
                            "    }" +
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
                    "  >\n" +
                    "  <Button\n" +
                    "        android:id=\"@+id/button\"\n" +
                    "        android:text=\"READ\"\n" +
                    "        android:layout_width=\"match_parent\"\n" +
                    "        android:layout_height=\"wrap_content\" />\n" +
                    "    <TextView\n" +
                    "        android:id=\"@+id/txt_result\"\n" +
                    "        android:layout_width=\"match_parent\"\n" +
                    "        android:layout_height=\"wrap_content\" />" +
                    "</LinearLayout>";
            return columnTwo;
        }
    }
