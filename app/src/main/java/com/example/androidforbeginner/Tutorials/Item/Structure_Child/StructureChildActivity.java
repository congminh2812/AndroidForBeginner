package com.example.androidforbeginner.Tutorials.Item.Structure_Child;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.widget.TextView;

import com.example.androidforbeginner.R;
import com.example.androidforbeginner.StatusBar;

public class StructureChildActivity extends AppCompatActivity {
    TextView rowOneTextView1,rowOneTextView2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_structure_child);
        setTitle(getString(R.string.structure).replace("\n",""));
        StatusBar.changingStatusBar(this);
        Toolbar toolbar = findViewById(R.id.toolbar_structure);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        rowOneTextView1 = findViewById(R.id.row_one_text_view);
        rowOneTextView2 = findViewById(R.id.row_one_text_view2);

        String rowOne1 = "<b><h1>Android Project Structure:</h1></b>" +
                "When you start a new project, Android Studio creates the necessary structure for all your files and makes them visible in the Project" +
                " window on the left side of the IDE.<br>" +
                "<i>Click View > Tool Windows > Project.</i><br>" +
                "You can even change the views of the project structure by selecting one of the item below:";
        String rowOne2 = "By default, Android Studio displays your project files in the <b>Android view.</b>";

        rowOneTextView1.setText(android.text.Html.fromHtml(rowOne1));
        rowOneTextView2.setText(android.text.Html.fromHtml(rowOne2));
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
