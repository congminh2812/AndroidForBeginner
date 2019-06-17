package com.example.androidforbeginner.Tutorials.Item.FragAndAct_Child;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.widget.TextView;

import com.example.androidforbeginner.R;

public class FragXmlActivity extends AppCompatActivity {
    TextView rowOneTextView,rowTwoTextView,rowThreeTextView;
    TextView codeOne,codeTwo,codeThree;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frag_xml);
        setTitle(getString(R.string.frag_xml));

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        rowOneTextView = findViewById(R.id.row_one_text_view);
        rowTwoTextView = findViewById(R.id.row_two_text_view);
        rowThreeTextView = findViewById(R.id.row_three_text_view);

        codeOne = findViewById(R.id.code);
        codeTwo = findViewById(R.id.code2);
        codeThree = findViewById(R.id.code3);

        String rowOne = "1. Create a separate layout file or java objects that contain the appearance ";
        String rowTwo = "2. Use the onCreateView method to link its appearance. ";
        String rowThree = "3. Attach the fragment inside the Activity through XML ";

        String code1 = "<FrameLayout xmlns:android=”http://schemas.android.com/apk/res/android“\n" +
                "xmlns:tools=\"http://schemas.android.com/tools\" android:layout_width=\"match_parent\" \n" +
                "android:layout_height=\"match_parent\" \n" +
                "tools:context=\"demo.arjun.com.fragmentapp.MyFragment\" android:id=\"@+id/cdcd12121\"> \n" +
                "<!-- TODO: Update blank fragment layout --> \n" +
                "<TextView android:layout width=\"match_parent\" android:layout_height=\"match_parent\" android:text=\"@string/hello_blank_fragment\" /> \n" +
                "</FrameLayout>\n";
        String code2 = "public class MyFragment extends Fragment {\n" +
                " public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {\n" +
                " // Inflate the layout for this fragment return inflater.inflate(R.layout.fragment_my, container, false); \n" +
                "\t}\n" +
                "}\n";
        String code3 = "<fragment android:layout_width=\"match_parent\" \n" +
                "android:layout_height=\"wrap_content\" \n" +
                "android:name=\"demo.arjun.com.fragmentapp.MyFragment\" \n" +
                "android:id=\"@+id/myfragment\"/>\n";

        rowOneTextView.setText(android.text.Html.fromHtml(rowOne));
        rowTwoTextView.setText(android.text.Html.fromHtml(rowTwo));
        rowThreeTextView.setText(android.text.Html.fromHtml(rowThree));

        codeOne.setText(code1);
        codeTwo.setText(code2);
        codeThree.setText(code3);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            finish();
            overridePendingTransition(R.anim.anim_enter_right, R.anim.anim_exit_right);
        }
        return super.onOptionsItemSelected(item);
    }
}
