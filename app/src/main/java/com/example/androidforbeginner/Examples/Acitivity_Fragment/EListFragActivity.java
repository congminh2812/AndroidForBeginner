package com.example.androidforbeginner.Examples.Acitivity_Fragment;

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

public class EListFragActivity extends AppCompatActivity {

        private ViewPager pager;
        private TabLayout tablayout;
        private SectionsPageAdapter adapter;
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_elist_frag);

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
            adapter.addFragment(new FragmentMain2(),"FragmentA.java");
            adapter.addFragment(new FragmentXML2(),"fragment_a.xml");
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
                    Intent intent = new Intent(this, EListFragRunActivity.class);
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
                            "\n" +
                            "public class EListFragRunActivity extends AppCompatActivity {\n" +
                            "\n" +
                            "    @Override\n" +
                            "    protected void onCreate(Bundle savedInstanceState) {\n" +
                            "        super.onCreate(savedInstanceState);\n" +
                            "        setContentView(R.layout.activity_elist_frag_run);\n" +
                            "    }\n" +
                            "}\n";
            return columnTwo;
        }
        public String getColumnTwoJava2() {
            String columnTwo =
                            "import android.arch.lifecycle.Lifecycle;\n" +
                            "import android.content.Context;\n" +
                            "import android.os.Bundle;\n" +
                            "import android.support.annotation.NonNull;\n" +
                            "import android.support.annotation.Nullable;\n" +
                            "import android.support.v4.app.Fragment;\n" +
                            "import android.view.LayoutInflater;\n" +
                            "import android.view.View;\n" +
                            "import android.view.ViewGroup;\n" +
                            "import android.widget.ArrayAdapter;\n" +
                            "import android.widget.ListView;\n" +
                            "import android.widget.Toast;\n" +
                            "\n" +
                            "public class FragmentA extends Fragment {\n" +
                            "    ListView listView;\n" +
                            "    ArrayAdapter<String> adapter;\n" +
                            "    String[] data = {\"A\",\"AA\",\"B\",\"BB\",\"C\",\"CC\",\"D\",\"DD\"};\n" +
                            "    public FragmentA() {\n" +
                            "\n" +
                            "    }\n" +
                            "\n" +
                            "    @Nullable\n" +
                            "    @Override\n" +
                            "    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {\n" +
                            "        View view = inflater.inflate(R.layout.fragment_a,container,false);\n" +
                            "        listView = view.findViewById(R.id.list_view);\n" +
                            "        adapter = new ArrayAdapter<>(getActivity(),android.R.layout.simple_list_item_1,data);\n" +
                            "        listView.setAdapter(adapter);\n" +
                            "        return view;\n" +
                            "    }\n" +
                            "\n" +
                            "    @Override\n" +
                            "    public void onAttach(Context context) {\n" +
                            "        super.onAttach(context);\n" +
                            "        Toast.makeText(getActivity(), \"onAttach was called\", Toast.LENGTH_SHORT).show();\n" +
                            "    }\n" +
                            "\n" +
                            "\n" +
                            "    @Override\n" +
                            "    public void onStart() {\n" +
                            "        super.onStart();\n" +
                            "        Toast.makeText(getActivity(), \"onStart was called\", Toast.LENGTH_SHORT).show();\n" +
                            "\n" +
                            "    }\n" +
                            "\n" +
                            "    @Override\n" +
                            "    public void onResume() {\n" +
                            "        super.onResume();\n" +
                            "        Toast.makeText(getActivity(), \"onResume was called\", Toast.LENGTH_SHORT).show();\n" +
                            "    }\n" +
                            "\n" +
                            "    @Override\n" +
                            "    public void onPause() {\n" +
                            "        super.onPause();\n" +
                            "        Toast.makeText(getActivity(), \"onPause was called\", Toast.LENGTH_SHORT).show();\n" +
                            "    }\n" +
                            "\n" +
                            "    @Override\n" +
                            "    public void onStop() {\n" +
                            "        super.onStop();\n" +
                            "        Toast.makeText(getActivity(), \"onStop was called\", Toast.LENGTH_SHORT).show();\n" +
                            "    }\n" +
                            "\n" +
                            "    @Override\n" +
                            "    public void onDestroy() {\n" +
                            "        super.onDestroy();\n" +
                            "        Toast.makeText(getActivity(), \"onDestroy was called\", Toast.LENGTH_SHORT).show();\n" +
                            "    }\n" +
                            "\n" +
                            "    @Override\n" +
                            "    public void onDetach() {\n" +
                            "        super.onDetach();\n" +
                            "        Toast.makeText(getActivity(), \"onDetach was called\", Toast.LENGTH_SHORT).show();\n" +
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
                    "   >\n" +

                    " <fragment\n" +
                    "        android:id=\"@+id/fragment\"\n" +
                    "        android:name=\"com.example.androidforbeginner.Examples.Acitivity_Fragment.FragmentA\"\n" +
                    "        android:layout_width=\"match_parent\"\n" +
                    "        android:layout_height=\"wrap_content\"/>" +
                    "</LinearLayout>";
            return columnTwo;
        }
        public String getColumnTwoXML2() {
            String columnTwo = "<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
                    "<FrameLayout android:layout_width=\"match_parent\"\n" +
                    "android:layout_height=\"match_parent\"\n" +
                    "xmlns:android=\"http://schemas.android.com/apk/res/android\" >\n" +
                    "<TextView\n" +
                    "    android:text=\"Hello , This is Fragment\"\n" +
                    "    android:textSize=\"30sp\"\n" +
                    "    android:layout_width=\"match_parent\"\n" +
                    "    android:layout_height=\"match_parent\" />\n" +
                    "<ListView\n" +
                    "    android:id=\"@+id/list_view\"\n" +
                    "    android:layout_width=\"match_parent\"\n" +
                    "    android:layout_height=\"wrap_content\"></ListView>\n" +
                    "</FrameLayout>";
            return columnTwo;
        }
    }
