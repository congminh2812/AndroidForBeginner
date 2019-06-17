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

public class EDeleteActivity extends AppCompatActivity {

        private ViewPager pager;
        private TabLayout tablayout;
        private SectionsPageAdapter adapter;
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_edelete);

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
                    Intent intent = new Intent(this, EDeleteRunActivity.class);
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
                            "import android.widget.Button;\n" +
                            "import android.widget.EditText;\n" +
                            "import android.widget.Toast;\n" +
                            "\n" +
                            "public class EDeleteRunActivity extends AppCompatActivity {\n" +
                            "\n" +
                            "        DataBaseHelper dataBaseHelper;\n" +
                            "        EditText edtId;\n" +
                            "        Button button;\n" +
                            "        @Override\n" +
                            "        protected void onCreate(Bundle savedInstanceState) {\n" +
                            "            super.onCreate(savedInstanceState);\n" +
                            "            setContentView(R.layout.activity_edelete_ru);\n" +
                            "\n" +
                            "            edtId = findViewById(R.id.edt_id);\n" +
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
                            "            String id = edtId.getText().toString();\n" +
                            "           int result = dataBaseHelper.deleteData(id);\n" +
                            "            Toast.makeText(this, result+\" :Rows Affected\", Toast.LENGTH_SHORT).show();\n" +
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
                            " public Integer deleteData(String id) {\n" +
                            "        SQLiteDatabase database = this.getWritableDatabase();\n" +
                            "        int i = database.delete(TABLE_NAME,\"ID=?\",new String[]{id});\n" +
                            "        return i;\n" +
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
                    "<EditText\n" +
                    "        android:id=\"@+id/edt_id\"\n" +
                    "        android:hint=\"ID:\"\n" +
                    "        android:layout_width=\"match_parent\"\n" +
                    "        android:layout_height=\"wrap_content\" />\n" +
                    "    <Button\n" +
                    "        android:id=\"@+id/button\"\n" +
                    "        android:text=\"DELETE\"\n" +
                    "        android:background=\"#FFCC65\"\n" +
                    "        android:layout_width=\"match_parent\"\n" +
                    "        android:layout_height=\"wrap_content\" />";
            return columnTwo;
        }
    }
