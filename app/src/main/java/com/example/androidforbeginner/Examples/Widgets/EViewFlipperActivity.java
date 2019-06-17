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

public class EViewFlipperActivity extends AppCompatActivity {

    private ViewPager pager;
    private TabLayout tablayout;
    private SectionsPageAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eview_flipper);

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
        adapter.addFragment(new FragmentItem(),"flipper_items.xml");
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
                Intent intent = new Intent(this,EViewFlipperRunActivity.class);
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
                        "import android.content.Context;\n" +
                        "import android.support.v7.app.AppCompatActivity;\n" +
                        "import android.os.Bundle;\n" +
                        "import android.support.v7.widget.Toolbar;\n" +
                        "import android.view.LayoutInflater;\n" +
                        "import android.view.MenuItem;\n" +
                        "import android.view.View;\n" +
                        "import android.view.ViewGroup;\n" +
                        "import android.widget.AdapterViewFlipper;\n" +
                        "import android.widget.BaseAdapter;\n" +
                        "import android.widget.Button;\n" +
                        "import android.widget.ImageView;\n" +
                        "import android.widget.TextView;\n" +
                        "\n" +
                        "public class EViewFlipperRunActivity extends AppCompatActivity {\n" +
                        "    AdapterViewFlipper adapterViewFlipper;\n" +
                        "    static final String[] TEXt = {\"Icon 1\",\"Icon 2\",\"Icon 3\",\"Icon 4\"};\n" +
                        "    static final int[] IMAGE = {R.drawable.activity1,R.drawable.activity2,R.drawable.activity3,R.drawable.activity4};\n" +
                        "    @Override\n" +
                        "    protected void onCreate(Bundle savedInstanceState) {\n" +
                        "        super.onCreate(savedInstanceState);\n" +
                        "        setContentView(R.layout.activity_eview_flipper_run);\n" +
                        "        adapterViewFlipper = findViewById(R.id.view_flipper);\n" +
                        "        \n" +
                        "        FlipperAdapter adapter = new FlipperAdapter(this,IMAGE,TEXt);\n" +
                        "        adapterViewFlipper.setAdapter(adapter);\n" +
                        "        adapterViewFlipper.setAutoStart(true);\n" +
                        "    }\n" +
                        "    }\n" +
                        "    class FlipperAdapter extends BaseAdapter {\n" +
                        "        Context context;\n" +
                        "        int[] image;\n" +
                        "        String[] text;\n" +
                        "        LayoutInflater inflater;\n" +
                        "\n" +
                        "        public FlipperAdapter(Context context, int[] image, String[] text) {\n" +
                        "            this.context = context;\n" +
                        "            this.image = image;\n" +
                        "            this.text = text;\n" +
                        "            inflater = LayoutInflater.from(context);\n" +
                        "        }\n" +
                        "\n" +
                        "        @Override\n" +
                        "        public int getCount() {\n" +
                        "            return text.length;\n" +
                        "        }\n" +
                        "\n" +
                        "        @Override\n" +
                        "        public Object getItem(int position) {\n" +
                        "            return null;\n" +
                        "        }\n" +
                        "\n" +
                        "        @Override\n" +
                        "        public long getItemId(int position) {\n" +
                        "            return 0;\n" +
                        "        }\n" +
                        "\n" +
                        "        @Override\n" +
                        "        public View getView(int position, View convertView, ViewGroup parent) {\n" +
                        "            convertView = inflater.inflate(R.layout.flipper_items,null);\n" +
                        "            TextView textView = convertView.findViewById(R.id.text_view);\n" +
                        "            ImageView imageView = convertView.findViewById(R.id.image_flipper);\n" +
                        "            textView.setText(text[position]);\n" +
                        "            imageView.setImageResource(image[position]);\n" +
                        "            return convertView;\n" +
                        "        }\n" +
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
                "        android:text=\"AdapterViewFlipper Example\"\n" +
                "        android:id=\"@+id/text_view\"\n" +
                "        android:gravity=\"center_horizontal\"\n" +
                "        android:textColor=\"#0000ff\"\n" +
                "        android:textSize=\"35sp\"/>\n" +
                "    <AdapterViewFlipper\n" +
                "        android:layout_width=\"wrap_content\"\n" +
                "        android:layout_height=\"wrap_content\"\n" +
                "        android:id=\"@+id/view_flipper\"\n" +
                "        android:flipInterval=\"2000\"\n" +
                "        android:layout_gravity=\"center_horizontal\"\n" +
                "        android:layout_marginTop=\"16dp\"\n" +
                "        ></AdapterViewFlipper>\n" +
                "</LinearLayout>";
        return columnTwo;
    }
    public String getColumnOneItem() {
        String columnOne = "1\n2\n3\n4\n5\n6\n7\n8\n9\n10\n11\n12\n13\n14\n15\n16\n17\n18\n19\n20\n21\n22\n23\n24\n25\n26\n27\n28\n29\n30";
        return columnOne;
    }

    public String getColumnTwoItem() {
        String columnTwo = "<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
                "<LinearLayout android:orientation=\"vertical\"\n" +
                "    android:layout_width=\"match_parent\"\n" +
                "    android:layout_height=\"match_parent\"\n" +
                "    xmlns:android=\"http://schemas.android.com/apk/res/android\" >\n" +
                "    <ImageView\n" +
                "        android:layout_width=\"match_parent\"\n" +
                "        android:layout_height=\"wrap_content\"\n" +
                "        android:id=\"@+id/image_flipper\"\n" +
                "        android:src=\"@drawable/activity1\"\n" +
                "        />\n" +
                "    <TextView\n" +
                "        android:layout_width=\"match_parent\"\n" +
                "        android:layout_height=\"wrap_content\"\n" +
                "        android:text=\"Illusions\"\n" +
                "        android:id=\"@+id/text_view\"\n" +
                "        android:textAppearance=\"@style/Base.TextAppearance.AppCompat.Large\"/>\n" +
                "</LinearLayout>";
        return columnTwo;
    }
}
