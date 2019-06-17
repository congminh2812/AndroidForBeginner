package com.example.androidforbeginner.Examples.Widgets;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterViewFlipper;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.androidforbeginner.R;

public class EViewFlipperRunActivity extends AppCompatActivity {
    AdapterViewFlipper adapterViewFlipper;
    static final String[] TEXt = {"Icon 1","Icon 2","Icon 3","Icon 4"};
    static final int[] IMAGE = {R.drawable.activity1,R.drawable.activity2,R.drawable.activity3,R.drawable.activity4};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eview_flipper_run);
        setTitle("AdapterViewFlipper");

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        adapterViewFlipper = findViewById(R.id.view_flipper);

        FlipperAdapter adapter = new FlipperAdapter(this,IMAGE,TEXt);
        adapterViewFlipper.setAdapter(adapter);
        adapterViewFlipper.setAutoStart(true);
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
    class FlipperAdapter extends BaseAdapter {
        Context context;
        int[] image;
        String[] text;
        LayoutInflater inflater;

        public FlipperAdapter(Context context, int[] image, String[] text) {
            this.context = context;
            this.image = image;
            this.text = text;
            inflater = LayoutInflater.from(context);
        }

        @Override
        public int getCount() {
            return text.length;
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            convertView = inflater.inflate(R.layout.flipper_items,null);
            TextView textView = convertView.findViewById(R.id.text_view);
            ImageView imageView = convertView.findViewById(R.id.image_flipper);
            textView.setText(text[position]);
            imageView.setImageResource(image[position]);
            return convertView;
        }
    }
}
