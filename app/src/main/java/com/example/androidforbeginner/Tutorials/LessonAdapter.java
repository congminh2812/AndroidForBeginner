package com.example.androidforbeginner.Tutorials;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.androidforbeginner.ItemClickListener;
import com.example.androidforbeginner.MainActivity;
import com.example.androidforbeginner.R;

import java.util.ArrayList;

public class LessonAdapter extends RecyclerView.Adapter<LessonAdapter.ViewHolder> {

    ArrayList<Lesson> lessonArrayList;
    Context context;

    public LessonAdapter(ArrayList<Lesson> lessonArrayList, Context context) {
        this.lessonArrayList = lessonArrayList;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LayoutInflater inflater = LayoutInflater.from(viewGroup.getContext());
        View itemView = inflater.inflate(R.layout.cell_tutorials,viewGroup,false);

        return new ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {
        final MainActivity activity = (MainActivity) context;
        viewHolder.imageView.setImageResource(lessonArrayList.get(i).getImage());
        viewHolder.titleTextView.setText(lessonArrayList.get(i).getTitle());
        viewHolder.setItemClickListener(new ItemClickListener() {
            @Override
            public void onClick(View view, int position, boolean isLongClick) {
                activity.TransformActivity(TutorialFragment.TAG,lessonArrayList.get(position).getImage());
            }
        });

    }

    @Override
    public int getItemCount() {
        return lessonArrayList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        ImageView imageView;
        TextView titleTextView;

        ItemClickListener clickListener;

        public ViewHolder(View itemView){
            super(itemView);
            imageView = itemView.findViewById(R.id.image_view);
            titleTextView = itemView.findViewById(R.id.title_text_view);

            itemView.setOnClickListener(this);
        }

        private void setItemClickListener(ItemClickListener clickListener) {
            this.clickListener = clickListener;
        }
        @Override
        public void onClick(View v) {
            clickListener.onClick(v,getAdapterPosition(),false);
        }
    }
}
