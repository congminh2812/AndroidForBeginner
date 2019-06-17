package com.example.androidforbeginner.Examples.Widgets;

import android.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageSwitcher;
import android.widget.ImageView;
import android.widget.Toast;
import android.widget.ViewSwitcher;

import com.example.androidforbeginner.R;

public class EImageSwitcherRunActivity extends AppCompatActivity {
    Button previous,next;
    ImageSwitcher imageSwitcher;
    static final int[] IMAGES = {R.drawable.activity1,R.drawable.activity2,R.drawable.activity3,R.drawable.activity4};
    int mPosition = -1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eimage_switcher_run);
        setTitle("ImageSwitcher");

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        previous = findViewById(R.id.button_previous);
        next = findViewById(R.id.button_next);
        imageSwitcher = findViewById(R.id.image_switcher);
        imageSwitcher.setFactory(new ViewSwitcher.ViewFactory() {
            @Override
            public View makeView() {
                ImageView imageView = new ImageView(getApplicationContext());
                imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
                imageView.setLayoutParams(new ImageSwitcher.LayoutParams(ActionBar.LayoutParams.MATCH_PARENT,ActionBar.LayoutParams.WRAP_CONTENT));
                return imageView;
            }
        });

        previous.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mPosition >0 ) {
                    mPosition -= 1;
                    imageSwitcher.setImageResource(IMAGES[mPosition]);
                    Toast.makeText(EImageSwitcherRunActivity.this, "Position: "+mPosition, Toast.LENGTH_SHORT).show();
                }
            }
        });

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mPosition < IMAGES.length - 1) {
                    mPosition += 1;
                    imageSwitcher.setImageResource(IMAGES[mPosition]);
                    Toast.makeText(EImageSwitcherRunActivity.this, "Position: "+mPosition, Toast.LENGTH_SHORT).show();
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
