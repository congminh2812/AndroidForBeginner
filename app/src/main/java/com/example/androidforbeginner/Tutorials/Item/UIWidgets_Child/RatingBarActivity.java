package com.example.androidforbeginner.Tutorials.Item.UIWidgets_Child;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.widget.TextView;

import com.example.androidforbeginner.R;
import com.example.androidforbeginner.StatusBar;

public class RatingBarActivity extends AppCompatActivity {

    TextView rowOneTextView, rowTwoTextView, codeTextView, code2TextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rating_bar);
        setTitle(getString(R.string.rating));
        StatusBar.changingStatusBar(this);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        rowOneTextView = findViewById(R.id.row_one_text_view);
        rowTwoTextView = findViewById(R.id.row_two_text_view);
        codeTextView = findViewById(R.id.code);
        code2TextView = findViewById(R.id.code2);

        String rowOne = "<p><b>Android RatingBar</b> can be used to get the rating from the user. The Rating returns a floating-point number. It may be 2.0, 3.5, 4.0 etc.</p>";
        String rowTwo = "<h3><b>Example</b></h3>" +
                "Let's see the simple example of rating bar in android.";

        String code = "public class MainActivity extends AppCompatActivity {  \n" +
                "    RatingBar ratingbar;  \n" +
                "    Button button;  \n" +
                "    @Override  \n" +
                "    protected void onCreate(Bundle savedInstanceState) {  \n" +
                "        super.onCreate(savedInstanceState);  \n" +
                "        setContentView(R.layout.activity_main);  \n" +
                "        addListenerOnButtonClick();  \n" +
                "    }  \n" +
                "    public void addListenerOnButtonClick(){  \n" +
                "        ratingbar=(RatingBar)findViewById(R.id.ratingBar);  \n" +
                "        button=(Button)findViewById(R.id.button);  \n" +
                "        //Performing action on Button Click  \n" +
                "        button.setOnClickListener(new View.OnClickListener(){  \n" +
                "  \n" +
                "            @Override  \n" +
                "            public void onClick(View arg0) {  \n" +
                "                //Getting the rating and displaying it on the toast  \n" +
                "                String rating=String.valueOf(ratingbar.getRating());  \n" +
                "                Toast.makeText(getApplicationContext(), rating, Toast.LENGTH_LONG).show();  \n" +
                "            }  \n" +
                "  \n" +
                "        });  \n" +
                "    }  \n" +
                "}  ";
        String code2 = "<?xml version=\"1.0\" encoding=\"utf-8\"?>  \n" +
                "<android.support.constraint.ConstraintLayout xmlns:android=\"http://schemas.android.com/apk/res/android\"  \n" +
                "    xmlns:app=\"http://schemas.android.com/apk/res-auto\"  \n" +
                "    xmlns:tools=\"http://schemas.android.com/tools\"  \n" +
                "    android:layout_width=\"match_parent\"  \n" +
                "    android:layout_height=\"match_parent\"  \n" +
                "    tools:context=\"example.javatpoint.com.ratingbar.MainActivity\">  \n" +
                "  \n" +
                "    <Button  \n" +
                "        android:layout_width=\"wrap_content\"  \n" +
                "        android:layout_height=\"wrap_content\"  \n" +
                "        android:text=\"submit\"  \n" +
                "        android:id=\"@+id/button\"  \n" +
                "        app:layout_constraintBottom_toBottomOf=\"parent\"  \n" +
                "        app:layout_constraintLeft_toLeftOf=\"parent\"  \n" +
                "        app:layout_constraintRight_toRightOf=\"parent\"  \n" +
                "        app:layout_constraintTop_toTopOf=\"parent\"  \n" +
                "        app:layout_constraintVertical_bias=\"0.615\" />  \n" +
                "  \n" +
                "    <RatingBar  \n" +
                "        android:id=\"@+id/ratingBar\"  \n" +
                "        android:layout_width=\"wrap_content\"  \n" +
                "        android:layout_height=\"wrap_content\"  \n" +
                "        android:layout_marginLeft=\"72dp\"  \n" +
                "        android:layout_marginTop=\"60dp\"  \n" +
                "        app:layout_constraintStart_toStartOf=\"parent\"  \n" +
                "        app:layout_constraintTop_toTopOf=\"parent\" />  \n" +
                "  \n" +
                "</android.support.constraint.ConstraintLayout>  ";

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
