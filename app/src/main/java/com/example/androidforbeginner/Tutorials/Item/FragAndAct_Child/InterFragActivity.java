package com.example.androidforbeginner.Tutorials.Item.FragAndAct_Child;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.widget.TextView;

import com.example.androidforbeginner.R;
import com.example.androidforbeginner.StatusBar;

public class InterFragActivity extends AppCompatActivity {
    TextView rowOneTextView,rowTwoTextView,rowThreeTextView,rowFourTextView,rowFiveTextView;
    TextView codeOne,codeTwo,codeThree,codeFour,codeFive;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inter_frag);
        setTitle(getString(R.string.inter_fragment));
        StatusBar.changingStatusBar(this);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        rowOneTextView = findViewById(R.id.row_one_text_view);
        rowTwoTextView = findViewById(R.id.row_two_text_view);
        rowThreeTextView = findViewById(R.id.row_three_text_view);
        rowFourTextView = findViewById(R.id.row_four_text_view);
        rowFiveTextView = findViewById(R.id.row_five_text_view);

        codeOne = findViewById(R.id.code);
        codeTwo = findViewById(R.id.code2);
        codeThree = findViewById(R.id.code3);
        codeFour = findViewById(R.id.code4);
        codeFive = findViewById(R.id.code5);

        String rowOne = "Steps of Inter-fragment Communication: \n" +
                "1. Create an Interface Make a method which acts as an event carrier between the two fragments. \n";
        String rowTwo = "2. Make the Activity implement the Interface. (Java property : A class implementing the interface should override its method) Implement the methods of an interface in the Activity.";
        String rowThree = "3.\tCreate a Fragment(say FragmentA) \n" +
                "Create a reference of an interface in the fragment. (Java property :Since Interface reference variable can refer to the sub class object) Make the interface reference variable refer to the Activty class. Call the Activity method using interface reference variable which is pointing to the Activity(sub class object) \n";
        String rowFour = "4.\tCreate another fragment (say FragmentB)";
        String rowFive = "5. Get the reference of second fragment in implemented method of an Interface in the Activity. ";

        String code1 = "Interface MyInterface{\n" +
                " public void myresponse(String data );\n" +
                "}\n";
        String code2 = "class MainActivity extends AppCompactActivity implements Mylnterface{ \n" +
                "@Override\n" +
                " protected void onCreate(Bundle savedlnstanceState) {\n" +
                " super. onCreate(savedlnstanceState);\n" +
                " setContentView(R.layout.activity_main); \n" +
                "} \n" +
                "public void myresponse(String data){\n" +
                "}\n" +
                "}\n";
        String code3 = "public class FragmentA extends Fragment { \n" +
                "public FragmentA() {\n" +
                " // Required empty public constructor \n" +
                "}\n" +
                "\t\t@Override\n" +
                "public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedlnstanceState) {\n" +
                "// Inflate the layout for this fragment View view = inflater.inflate(R.layout.fragment_a, container, false); \n" +
                "//Reference of an Interface Mylnterface my_interface; //Interface reference variable pointing to the Activty my_interface= (Mylnterface) a; my_interface.myresponse(\"My Name is Arjun\"); return view; \n" +
                "}\n" +
                "}\n";
        String code4 = "public FragmentB() { // Required empty public constructor } \n" +
                "@Override public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {\n" +
                " // Inflate the layout for this fragment return inflater.inflate(R.layout.fragment_b, container, false); \n" +
                "}\n" +
                "public void changeData(String data){ Toast.makeText(getActivity(),\"Data is\"+data,Toast.LENGTH_SHORT).show(); \n" +
                "}\n" +
                "}\n";
        String code5 = "class MainActivity extends AppCompactActivity implements Mylnterface{\n" +
                " @Override \n" +
                "protected void onCreate(Bundle savedlnstanceState) {\n" +
                " super. onCreate(savedlnstanceState);\n" +
                " setContentView(R.layout.activity_main); \n" +
                "}\n" +
                "public void myresponse(String data){\n" +
                "FragmentManager manager = getSupportFragmentManager(); manager.findFragmentById(R.id.fragmentb); fragmentb.changeData(data);\n" +
                "              }\n" +
                "}\n";

        rowOneTextView.setText(rowOne);
        rowTwoTextView.setText(rowTwo);
        rowThreeTextView.setText(rowThree);
        rowFourTextView.setText(rowFour);
        rowFiveTextView.setText(rowFive);

        codeOne.setText(code1);
        codeTwo.setText(code2);
        codeThree.setText(code3);
        codeFour.setText(code4);
        codeFive.setText(code5);

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
