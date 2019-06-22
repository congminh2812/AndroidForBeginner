package com.example.androidforbeginner.Tutorials;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


import com.example.androidforbeginner.R;
import java.util.ArrayList;

public class TutorialFragment extends Fragment {
    public static final String TAG = "TutorialFragment";


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.tutorial_fragment,container,false);

        RecyclerView recyclerView = view.findViewById(R.id.recycle_view);
        recyclerView.setHasFixedSize(true);
        GridLayoutManager layoutManager = new GridLayoutManager(getContext(),2);
        recyclerView.setLayoutManager(layoutManager);

        ArrayList<Lesson> lessonArrayList = new ArrayList<>();
        lessonArrayList.add(new Lesson(R.drawable.image_introduction,getString(R.string.introduction)));
        lessonArrayList.add(new Lesson(R.drawable.image_stucture,getString(R.string.structure)));
        lessonArrayList.add(new Lesson(R.drawable.image_layouts,getString(R.string.layouts)));
        lessonArrayList.add(new Lesson(R.drawable.image_ui,getString(R.string.ui)));
        lessonArrayList.add(new Lesson(R.drawable.image_activities_fragments,getString(R.string.activities_fragments)));
        lessonArrayList.add(new Lesson(R.drawable.image_menu,getString(R.string.menu)));
        lessonArrayList.add(new Lesson(R.drawable.image_containers,getString(R.string.containers)));
        lessonArrayList.add(new Lesson(R.drawable.image_datastorage,getString(R.string.datastorage)));
        lessonArrayList.add(new Lesson(R.drawable.image_sqlite,getString(R.string.sqlite)));
        //lessonArrayList.add(new Lesson(R.drawable.image_mysql_php,getString(R.string.mysql_php)));

        LessonAdapter adapter = new LessonAdapter(lessonArrayList,getContext());
        recyclerView.setAdapter(adapter);

        return view;
    }




}
