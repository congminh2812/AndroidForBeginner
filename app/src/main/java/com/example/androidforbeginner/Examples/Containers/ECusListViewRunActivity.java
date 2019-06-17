package com.example.androidforbeginner.Examples.Containers;

import android.content.Context;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.example.androidforbeginner.R;

import java.util.List;

public class ECusListViewRunActivity extends AppCompatActivity {
    String[] title = {"Title1","Title2","Title3","Title4"};
    String[] description = {"Description1","Description2","Description3","Description4"};
    int[] image = {R.drawable.activity1,R.drawable.activity2,R.drawable.activity3,R.drawable.activity4};
    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ecus_list_view_run);
        setTitle("Custom ListView");

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        listView = findViewById(R.id.list_view);
        MyAdapter adapter = new MyAdapter(this,R.layout.cuslistview_row,image,title,description);
        listView.setAdapter(adapter);


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
    class MyAdapter extends ArrayAdapter {
        int[] imageArray;
        String[] titleArray;
        String[] desArray;

        public MyAdapter(Context context, int resource, int[] imageArray, String[] titleArray, String[] desArray) {
            super(context, R.layout.cuslistview_row,R.id.title,titleArray);
            this.imageArray = imageArray;
            this.titleArray = titleArray;
            this.desArray = desArray;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            LayoutInflater inflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View view = inflater.inflate(R.layout.cuslistview_row,parent,false);

            ImageView imageView = view.findViewById(R.id.image_view);
            TextView title = view.findViewById(R.id.title);
            TextView description = view.findViewById(R.id.description);

            imageView.setImageResource(imageArray[position]);
            title.setText(titleArray[position]);
            description.setText(desArray[position]);

            return view;
        }
    }
}
