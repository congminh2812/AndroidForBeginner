package com.example.androidforbeginner.Tutorials.Item.Introduction_Child;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.widget.TextView;

import com.example.androidforbeginner.R;
import com.example.androidforbeginner.StatusBar;

public class BuildActivity extends AppCompatActivity {
    TextView rowOneTextView1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_build);
        setTitle(getString(R.string.build_app).replace("\n",""));
        StatusBar.changingStatusBar(this);
        Toolbar toolbar = findViewById(R.id.toolbar_build);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        rowOneTextView1 = findViewById(R.id.row_one_text_view);


        String rowOne1 = "" +
                "1. Open Android Studio.\n" +
                "2. Under the \"Quick Start\" menu, select \"Start a new Android Studio project.\"\n" +
                "3. On the \"Create New Project\" window that opens, name your project \"HelloWorld\".\n" +
                "4. If you choose to, set the company name as desired*.\n" +
                "5. Note where the project file location is and change it if desired.\n" +
                "6. Click \"Next.\"\n" +
                "7. Make sure on that \"Phone and Tablet\" is the only box that is checked.\n" +
                "8. If you are planning to test the app on your phone, make sure the minimum SDK is below your phone's operating system level.\n" +
                "9. Click \"Next.\"\n" +
                "10. Select \"Blank Activity.\"\n" +
                "11. Click \"Next.\"\n" +
                "12. Leave all of the Activity name fields as they are.\n" +
                "13. Click \"Finish.\"";

        rowOneTextView1.setText(rowOne1);
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
