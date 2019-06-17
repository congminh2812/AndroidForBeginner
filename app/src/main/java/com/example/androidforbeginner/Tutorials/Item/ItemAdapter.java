package com.example.androidforbeginner.Tutorials.Item;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.androidforbeginner.R;

import java.util.List;

public class ItemAdapter extends BaseAdapter {
    private Context context;
    private int layout;
    private List<Item> itemList;

    public ItemAdapter(Context context, int layout, List<Item> itemList) {
        this.context = context;
        this.layout = layout;
        this.itemList = itemList;
    }
    @Override
    public int getCount() {
        return itemList.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }
    class ItemViewHolder {
        ImageView imageView;
        TextView titleTextView;
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ItemViewHolder holder;
        if (convertView == null) {
            holder = new ItemViewHolder();

            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(layout,null);

            holder.imageView = convertView.findViewById(R.id.image_view);
            holder.titleTextView = convertView.findViewById(R.id.text_view);

            convertView.setTag(holder);
        }else
            holder = (ItemViewHolder) convertView.getTag();

        holder.imageView.setImageResource(itemList.get(position).getImage());
        holder.titleTextView.setText(itemList.get(position).getTitle());

        return convertView;
    }
}
