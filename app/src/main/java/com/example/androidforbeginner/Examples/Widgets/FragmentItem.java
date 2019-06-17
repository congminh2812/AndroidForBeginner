package com.example.androidforbeginner.Examples.Widgets;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.androidforbeginner.Examples.Containers.ECusListViewActivity;
import com.example.androidforbeginner.Examples.Toast.ECustomActivity;
import com.example.androidforbeginner.R;

public class FragmentItem extends Fragment {
    TextView columnOne,columnTwo;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.example_view_pager,container,false);
        columnOne = view.findViewById(R.id.txt_column_1);
        columnTwo = view.findViewById(R.id.txt_column_2);

        SetData();

        return view;
    }

    private void SetData(){
        if (getActivity() instanceof EViewFlipperActivity) {
            EViewFlipperActivity activity = (EViewFlipperActivity) getActivity();
            columnOne.setText(activity.getColumnOneItem());
            columnTwo.setText(activity.getColumnTwoItem());
        }
        if (getActivity() instanceof ECustomActivity) {
            ECustomActivity activity = (ECustomActivity) getActivity();
            columnOne.setText(activity.getColumnOneXML());
            columnTwo.setText(activity.getColumnTwoXML2());
        }
        if (getActivity() instanceof ECusListViewActivity) {
            ECusListViewActivity activity = (ECusListViewActivity) getActivity();
            columnOne.setText(activity.getColumnOneXML());
            columnTwo.setText(activity.getColumnTwoXML2());
        }
    }
}
