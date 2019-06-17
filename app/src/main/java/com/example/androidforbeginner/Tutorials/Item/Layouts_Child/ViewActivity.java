package com.example.androidforbeginner.Tutorials.Item.Layouts_Child;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.widget.TextView;

import com.example.androidforbeginner.R;
import com.example.androidforbeginner.StatusBar;

public class ViewActivity extends AppCompatActivity {
    TextView rowOneTextView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view);
        setTitle("Views & ViewGroup");
        StatusBar.changingStatusBar(this);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        rowOneTextView = findViewById(R.id.row_one_text_view);

        String rowOne = "<h3><b><u>Views</u></b></h3>" +
                "    <p>A View is an object that draws something on the screen that the user can interact with and aViewGroup is an" +
                "object that holds other View (and ViewGroup) objects in order to define the layout of the user interface.</p>" +
                "<h5>UI Controls</h5>" +
                "    <ul>" +
                "    <li>TextView</li>" +
                "    <li>EditText</li>" +
                "    <li> AutoCompleteTextView</li>" +
                "    <li>Button</li>" +
                "    <li>ImageButton</li>" +
                "    <li>CheckBox</li>" +
                "    <li>ToggleButton</li>" +
                "    <li>RadioButton</li>" +
                "    <li>RadioGroup</li>" +
                "    </ul>" +
                "    <h3><b><u>View Group</u></b></h3>" +
                "    <p>ViewGroup is a subclass of View and provides invisible container that hold other Views or other ViewGroups" +
                "and define their layout properties.</p>" +
                "<ul>" +
                "    <li>LinearLayout</li>" +
                "    <li>RelativeLayout</li>" +
                "    <li>ListView</li>" +
                "    <li>GridView</li>" +
                "    " +
                "    </ul>";

        rowOneTextView.setText(android.text.Html.fromHtml(rowOne));
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            finish();
            overridePendingTransition(R.anim.anim_enter_right,R.anim.anim_exit_right);
        }
        return super.onOptionsItemSelected(item);
    }
}
