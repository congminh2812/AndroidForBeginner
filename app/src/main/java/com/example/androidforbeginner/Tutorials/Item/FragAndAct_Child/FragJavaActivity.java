package com.example.androidforbeginner.Tutorials.Item.FragAndAct_Child;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.widget.TextView;

import com.example.androidforbeginner.R;
import com.example.androidforbeginner.StatusBar;

public class FragJavaActivity extends AppCompatActivity {
    TextView rowOneTextView,rowTwoTextView,rowThreeTextView,rowFourTextView;
    TextView codeOne,codeTwo,codeThree,codeFour;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frag_java);
        setTitle(getString(R.string.frag_java));
        StatusBar.changingStatusBar(this);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        rowOneTextView = findViewById(R.id.row_one_text_view);
        rowTwoTextView = findViewById(R.id.row_two_text_view);
        rowThreeTextView = findViewById(R.id.row_three_text_view);
        rowFourTextView = findViewById(R.id.row_four_text_view);

        codeOne = findViewById(R.id.code);
        codeTwo = findViewById(R.id.code2);
        codeThree = findViewById(R.id.code3);
        codeFour = findViewById(R.id.code4);

        String rowOne = "<p><b><u>Steps for managing fragment transaction: </u></b><br>\n" +
                "1. Begin a Transaction <br>\n" +
                "2. Add, remove and replace the desired fragments<br>\n" +
                "3. Commit the transaction <br>\n" +
                "<b>Steps for creating Fragments in JAVA:</b><br>\n" +
                "</p>"+
                "1. Create a class that extends fragment.\n";
        String rowTwo = "2.\tCreate a separate layout file or java objects that contain the appearance ";
        String rowThree = "3. Use the onCreateView method to link its appearance. ";
        String rowFour = "4. Attach the fragment inside the Activity through Java ";

        String code1 = "public class MyFragment extends Fragment";
        String code2 = "<FrameLayout xmlns:android=\"http://schemas.android.com/apk/res/android\"           " +
                " \nxmlns:tools=\"http://schemas.android.com/tools\" android:layout_width=\"match_parent\"\n" +
                " android:layout_height=\"match_parent\" tools:context=\"demo.arjun.com.fragmentapp.MyFragment\" \n" +
                "android:id=\"@+id/cdcd12121\"> \n" +
                "<!-- TODO: Update blank fragment layout --> <TextView android:layout_width=\"match_parent\"\n " +
                "android:layout_height=\"match_parent\" android:text=\"@string/hello_blank_fragment\" I> \n" +
                "</FrameLayout>\n";
        String code3 = "public class MyFragment extends Fragment{\n" +
                "public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {    \n" +
                "// Inflate the layout for this fragment return inflater.inflate(R.layout.fragment_my, container, false); \n" +
                "}\n" +
                "}\n";
        String code4 = "//Create an object of your fragment here it is frag MyFragment frag = new MyFragment(); \n" +
                "FragmentManager manager=getFragmentManager();\n" +
                " FragmentTransaction transaction=manager.beginTransaction(); \n" +
                "transaction.add(R.id.my_fragmentlayout_name,frag,\"frag_tag\"); transaction. commit();\n";

        rowOneTextView.setText(android.text.Html.fromHtml(rowOne));
        rowTwoTextView.setText(android.text.Html.fromHtml(rowTwo));
        rowThreeTextView.setText(android.text.Html.fromHtml(rowThree));
        rowFourTextView.setText(android.text.Html.fromHtml(rowFour));

        codeOne.setText(code1);
        codeTwo.setText(code2);
        codeThree.setText(code3);
        codeFour.setText(code4);



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
