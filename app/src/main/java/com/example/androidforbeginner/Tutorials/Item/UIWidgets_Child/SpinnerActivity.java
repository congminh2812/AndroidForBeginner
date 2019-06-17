package com.example.androidforbeginner.Tutorials.Item.UIWidgets_Child;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.widget.TextView;

import com.example.androidforbeginner.R;
import com.example.androidforbeginner.StatusBar;

public class SpinnerActivity extends AppCompatActivity {

    TextView rowOneTextView, rowTwoTextView, codeTextView, code2TextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spinner);
        setTitle(getString(R.string.spinner));
        StatusBar.changingStatusBar(this);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        rowOneTextView = findViewById(R.id.row_one_text_view);
        rowTwoTextView = findViewById(R.id.row_two_text_view);
        codeTextView = findViewById(R.id.code);
        code2TextView = findViewById(R.id.code2);

        String rowOne = "<p><b>Spinner</b> allows you to select an item from a drop down menu. <br>" +
                "For example. When you are using Gmail application you would get drop down menu as shown below, " +
                "you need to select an item from a drop down menu.</p>";
        String rowTwo = "<h3><b>Example</b></h3>" +
                "This example demonstrates the category of computers, you need to select a category from the category." +
                "<br>" +
                "To experiment with this example, you need to run this on an actual device on after " +
                "developing the application according to the steps below.";

        String code = "class AndroidSpinnerExampleActivity extends Activity implements OnItemSelectedListener{\n" +
                "   @Override\n" +
                "   public void onCreate(Bundle savedInstanceState) {\n" +
                "      super.onCreate(savedInstanceState);\n" +
                "      setContentView(R.layout.main);\n" +
                "      \n" +
                "      // Spinner element\n" +
                "      Spinner spinner = (Spinner) findViewById(R.id.spinner);\n" +
                "      \n" +
                "      // Spinner click listener\n" +
                "      spinner.setOnItemSelectedListener(this);\n" +
                "      \n" +
                "      // Spinner Drop down elements\n" +
                "      List<String> categories = new ArrayList<String>();\n" +
                "      categories.add(\"Automobile\");\n" +
                "      categories.add(\"Business Services\");\n" +
                "      categories.add(\"Computers\");\n" +
                "      categories.add(\"Education\");\n" +
                "      categories.add(\"Personal\");\n" +
                "      categories.add(\"Travel\");\n" +
                "      \n" +
                "      // Creating adapter for spinner\n" +
                "      ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, categories);\n" +
                "      \n" +
                "      // Drop down layout style - list view with radio button\n" +
                "      dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);\n" +
                "      \n" +
                "      // attaching data adapter to spinner\n" +
                "      spinner.setAdapter(dataAdapter);\n" +
                "   }\n" +
                "   \n" +
                "   @Override\n" +
                "   public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {\n" +
                "      // On selecting a spinner item\n" +
                "      String item = parent.getItemAtPosition(position).toString();\n" +
                "      \n" +
                "      // Showing selected spinner item\n" +
                "      Toast.makeText(parent.getContext(), \"Selected: \" + item, Toast.LENGTH_LONG).show();\n" +
                "   }\n" +
                "   public void onNothingSelected(AdapterView<?> arg0) {\n" +
                "      // TODO Auto-generated method stub\n" +
                "   }\n" +
                "}";
        String code2 = "<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
                "<LinearLayout xmlns:android=\"http://schemas.android.com/apk/res/android\"\n" +
                "   android:orientation=\"vertical\"\n" +
                "   android:padding=\"10dip\"\n" +
                "   android:layout_width=\"fill_parent\"\n" +
                "   android:layout_height=\"wrap_content\">\n" +
                "   \n" +
                "   <TextView\n" +
                "      android:layout_width=\"fill_parent\"\n" +
                "      android:layout_height=\"wrap_content\"\n" +
                "      android:layout_marginTop=\"10dip\"\n" +
                "      android:text=\"Category:\"\n" +
                "      android:layout_marginBottom=\"5dp\"/>\n" +
                "      \n" +
                "   <Spinner\n" +
                "      android:id=\"@+id/spinner\"\n" +
                "      android:layout_width=\"fill_parent\"\n" +
                "      android:layout_height=\"wrap_content\"\n" +
                "      android:prompt=\"@string/spinner_title\"/>\n" +
                "      \n" +
                "</LinearLayout>";

        rowOneTextView.setText(android.text.Html.fromHtml(rowOne));
        rowTwoTextView.setText(android.text.Html.fromHtml(rowTwo));
        codeTextView.setText(code);
        code2TextView.setText(code2);

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
