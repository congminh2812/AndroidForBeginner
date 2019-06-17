package com.example.androidforbeginner.Examples.Widgets;

import android.content.Intent;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import com.example.androidforbeginner.R;
import com.example.androidforbeginner.SectionsPageAdapter;

public class EImageSwitcherActivity extends AppCompatActivity {

    private ViewPager pager;
    private TabLayout tablayout;
    private SectionsPageAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eimage_switcher);

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
                Intent intent = new Intent(this,EImageSwitcherRunActivity.class);
                startActivity(intent);
                overridePendingTransition(R.anim.anim_exit_left,R.anim.anim_enter_left);
                break;
        }

        return super.onOptionsItemSelected(item);
    }

    public String getColumnOneJava() {
        String columnOne = "1\n2\n3\n4\n5\n6\n7\n8\n9\n10\n11\n12\n13\n14\n15\n16\n17\n18\n19\n20\n21\n23\n24\n25\n26\n27\n28\n29\n30\n";
        return columnOne;
    }

    public String getColumnTwoJava() {
        String columnTwo =
                        "import android.app.ActionBar;\n" +
                        "import android.support.v7.app.AppCompatActivity;\n" +
                        "import android.os.Bundle;\n" +
                        "import android.support.v7.widget.Toolbar;\n" +
                        "import android.view.MenuItem;\n" +
                        "import android.view.View;\n" +
                        "import android.widget.Button;\n" +
                        "import android.widget.ImageSwitcher;\n" +
                        "import android.widget.ImageView;\n" +
                        "import android.widget.Toast;\n" +
                        "import android.widget.ViewSwitcher;\n" +
                        "\n" +
                        "public class EImageSwitcherRunActivity extends AppCompatActivity {\n" +
                        "    Button previous,next;\n" +
                        "    ImageSwitcher imageSwitcher;\n" +
                        "    static final int[] IMAGES = {R.drawable.activity1,R.drawable.activity2,R.drawable.activity3,R.drawable.activity4};\n" +
                        "    int mPosition = -1;\n" +
                        "    @Override\n" +
                        "    protected void onCreate(Bundle savedInstanceState) {\n" +
                        "        super.onCreate(savedInstanceState);\n" +
                        "        setContentView(R.layout.activity_main);\n" +
                        "        previous = findViewById(R.id.button_previous);\n" +
                        "        next = findViewById(R.id.button_next);\n" +
                        "        imageSwitcher = findViewById(R.id.image_switcher);\n" +
                        "        imageSwitcher.setFactory(new ViewSwitcher.ViewFactory() {\n" +
                        "            @Override\n" +
                        "            public View makeView() {\n" +
                        "                ImageView imageView = new ImageView(getApplicationContext());\n" +
                        "                imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);\n" +
                        "                imageView.setLayoutParams(new Toolbar.LayoutParams(ActionBar.LayoutParams.WRAP_CONTENT,ActionBar.LayoutParams.WRAP_CONTENT));\n" +
                        "                return imageView;\n" +
                        "            }\n" +
                        "        });\n" +
                        "        \n" +
                        "        previous.setOnClickListener(new View.OnClickListener() {\n" +
                        "            @Override\n" +
                        "            public void onClick(View v) {\n" +
                        "                if (mPosition < IMAGES.length - 1) {\n" +
                        "                    mPosition += 1;\n" +
                        "                    imageSwitcher.setImageResource(IMAGES[mPosition]);\n" +
                        "                    Toast.makeText(EImageSwitcherRunActivity.this, \"Position: \"+mPosition, Toast.LENGTH_SHORT).show();\n" +
                        "                }\n" +
                        "            }\n" +
                        "        });\n" +
                        "        \n" +
                        "        next.setOnClickListener(new View.OnClickListener() {\n" +
                        "            @Override\n" +
                        "            public void onClick(View v) {\n" +
                        "                if (mPosition > 0) {\n" +
                        "                    mPosition -= 1;\n" +
                        "                    imageSwitcher.setImageResource(IMAGES[mPosition]);\n" +
                        "                    Toast.makeText(EImageSwitcherRunActivity.this, \"Position: \"+mPosition, Toast.LENGTH_SHORT).show();\n" +
                        "                }\n" +
                        "            }\n" +
                        "        });\n" +
                        "        \n" +
                        "    }\n" +
                        "}\n";
        return columnTwo;
    }

    public String getColumnOneXML() {
        String columnOne = "1\n2\n3\n4\n5\n6\n7\n8\n9\n10\n11\n12\n13\n14\n15\n16\n17\n18\n19\n20\n21\n22\n23\n24\n25\n26\n27\n28\n29\n30";
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
                "    <TextView\n" +
                "        android:layout_width=\"wrap_content\"\n" +
                "        android:layout_height=\"wrap_content\"\n" +
                "        android:text=\"ImageSwitcher Example\"\n" +
                "        android:id=\"@+id/text_view\"\n" +
                "        android:layout_gravity=\"center_horizontal\"\n" +
                "        android:textColor=\"#0000ff\"\n" +
                "        android:textSize=\"35sp\"\n" +
                "        />\n" +
                "    <ImageSwitcher\n" +
                "        android:layout_width=\"match_parent\"\n" +
                "        android:layout_height=\"wrap_content\"\n" +
                "        android:layout_marginTop=\"16dp\"\n" +
                "        android:layout_gravity=\"center_horizontal\"\n" +
                "        android:id=\"@+id/image_switcher\"\n" +
                "        ></ImageSwitcher>\n" +
                "    <LinearLayout\n" +
                "        android:layout_width=\"match_parent\"\n" +
                "        android:layout_height=\"wrap_content\"\n" +
                "        android:orientation=\"horizontal\"\n" +
                "        >\n" +
                "        <Button\n" +
                "            android:layout_weight=\"1\"\n" +
                "            android:layout_width=\"0dp\"\n" +
                "            android:layout_height=\"wrap_content\"\n" +
                "            android:text=\"Previous\"\n" +
                "            android:id=\"@+id/button_previous\"\n" +
                "            />\n" +
                "        <Button\n" +
                "            android:id=\"@+id/button_next\"\n" +
                "            android:layout_weight=\"1\"\n" +
                "            android:layout_width=\"0dp\"\n" +
                "            android:layout_height=\"wrap_content\"\n" +
                "            android:text=\"Next\"\n" +
                "            />\n" +
                "    </LinearLayout>\n" +
                "</LinearLayout>";
        return columnTwo;
    }
}
