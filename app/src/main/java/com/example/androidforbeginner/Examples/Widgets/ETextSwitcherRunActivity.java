package com.example.androidforbeginner.Examples.Widgets;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextSwitcher;
import android.widget.TextView;
import android.widget.ViewSwitcher;

import com.example.androidforbeginner.R;

public class ETextSwitcherRunActivity extends AppCompatActivity {
    TextSwitcher textSwitcher;
    Button previous,next;
    private static final String[] text = {"When in Rome,do as The Romans","The next was ran","Run again"};
    private int mPosition = -1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_etext_switcher_run);
        setTitle("TextSwitcher");

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        previous = findViewById(R.id.button_previous);
        next = findViewById(R.id.button_next);

        textSwitcher = findViewById(R.id.textswitcher);
        textSwitcher.setFactory(new ViewSwitcher.ViewFactory() {
            @Override
            public View makeView() {
                TextView textView = new TextView(getApplicationContext());
                textView.setTextSize(18);
                return textView;
            }
        });

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mPosition < text.length - 1) {
                    mPosition = mPosition+1;
                    textSwitcher.setText(text[mPosition]);
                }
            }
        });

        previous.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mPosition > 0) {
                    mPosition = mPosition-1;
                    textSwitcher.setText(text[mPosition]);
                }
            }
        });
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()) {
            case android.R.id.home:
                finish();
                overridePendingTransition(R.anim.anim_enter_right,R.anim.anim_exit_right);
                break;
        }

        return super.onOptionsItemSelected(item);
    }
}
