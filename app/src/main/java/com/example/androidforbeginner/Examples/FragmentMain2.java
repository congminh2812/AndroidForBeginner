package com.example.androidforbeginner.Examples;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.androidforbeginner.Examples.Acitivity_Fragment.EFragLifeActivity;
import com.example.androidforbeginner.Examples.Acitivity_Fragment.EListFragActivity;
import com.example.androidforbeginner.Examples.Animation.EFadeActivity;
import com.example.androidforbeginner.Examples.Animation.ERotateActivity;
import com.example.androidforbeginner.Examples.Animation.EZoomActivity;
import com.example.androidforbeginner.Examples.DateTime.EChronometerActivity;
import com.example.androidforbeginner.Examples.DateTime.EDatePickerActivity;
import com.example.androidforbeginner.Examples.DateTime.ETextClockActivity;
import com.example.androidforbeginner.Examples.DateTime.ETimePickerActivity;
import com.example.androidforbeginner.Examples.ExplicitIntent.EForResultActivity;
import com.example.androidforbeginner.Examples.ExplicitIntent.EPassingActivity;
import com.example.androidforbeginner.Examples.ExplicitIntent.ETransitionActivity;
import com.example.androidforbeginner.Examples.ImageAndMedia.EImageButtonActivity;
import com.example.androidforbeginner.Examples.ImageAndMedia.EImageViewActivity;
import com.example.androidforbeginner.Examples.ImageAndMedia.EVideoViewActivity;
import com.example.androidforbeginner.Examples.ImplicitIntent.ECallActivity;
import com.example.androidforbeginner.Examples.ImplicitIntent.ECameraActivity;
import com.example.androidforbeginner.Examples.ImplicitIntent.EDialActivity;
import com.example.androidforbeginner.Examples.ImplicitIntent.EEmailActivity;
import com.example.androidforbeginner.Examples.ImplicitIntent.EMapActivity;
import com.example.androidforbeginner.Examples.Menu.EOptionActivity;
import com.example.androidforbeginner.Examples.SQLite.EDeleteActivity;
import com.example.androidforbeginner.Examples.SQLite.EInsertActivity;
import com.example.androidforbeginner.Examples.SQLite.EReadActivity;
import com.example.androidforbeginner.Examples.SQLite.EUpdateActivity;
import com.example.androidforbeginner.Examples.Widgets.EAutoCompleteActivity;
import com.example.androidforbeginner.Examples.Widgets.EButtonActivity;
import com.example.androidforbeginner.Examples.Widgets.ECheckBoxActivity;
import com.example.androidforbeginner.Examples.Widgets.ECheckedActivity;
import com.example.androidforbeginner.Examples.Widgets.EEditTextActivity;
import com.example.androidforbeginner.Examples.Widgets.EImageSwitcherActivity;
import com.example.androidforbeginner.Examples.Widgets.EMutilAutoActivity;
import com.example.androidforbeginner.Examples.Widgets.EProgressActivity;
import com.example.androidforbeginner.Examples.Widgets.ERadioActivity;
import com.example.androidforbeginner.Examples.Widgets.ERatingBarActivity;
import com.example.androidforbeginner.Examples.Widgets.ESeekBarActivity;
import com.example.androidforbeginner.Examples.Widgets.ESpinnerActivity;
import com.example.androidforbeginner.Examples.Widgets.ESwitchActivity;
import com.example.androidforbeginner.Examples.Widgets.ETextSwitcherActivity;
import com.example.androidforbeginner.Examples.Widgets.ETextViewActivity;
import com.example.androidforbeginner.Examples.Widgets.EToggleActivity;
import com.example.androidforbeginner.Examples.Widgets.EViewFlipperActivity;
import com.example.androidforbeginner.R;

public class FragmentMain2 extends Fragment {
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
        if (getActivity() instanceof ETransitionActivity) {
            ETransitionActivity activity = (ETransitionActivity) getActivity();
            columnOne.setText(activity.getColumnOneJava());
            columnTwo.setText(activity.getColumnTwoJava2());
        }
        if (getActivity() instanceof EPassingActivity) {
            EPassingActivity activity = (EPassingActivity) getActivity();
            columnOne.setText(activity.getColumnOneJava());
            columnTwo.setText(activity.getColumnTwoJava2());
        }
        if (getActivity() instanceof EForResultActivity) {
            EForResultActivity activity = (EForResultActivity) getActivity();
            columnOne.setText(activity.getColumnOneJava());
            columnTwo.setText(activity.getColumnTwoJava2());
        }
        if (getActivity() instanceof EFragLifeActivity) {
            EFragLifeActivity activity = (EFragLifeActivity) getActivity();
            columnOne.setText(activity.getColumnOneJava());
            columnTwo.setText(activity.getColumnTwoJava2());
        }
        if (getActivity() instanceof EListFragActivity) {
            EListFragActivity activity = (EListFragActivity) getActivity();
            columnOne.setText(activity.getColumnOneJava());
            columnTwo.setText(activity.getColumnTwoJava2());
        }
        if (getActivity() instanceof EFadeActivity) {
            EFadeActivity activity = (EFadeActivity) getActivity();
            columnOne.setText(activity.getColumnOneJava());
            columnTwo.setText(activity.getColumnTwoJava2());
        }
        if (getActivity() instanceof EZoomActivity) {
            EZoomActivity activity = (EZoomActivity) getActivity();
            columnOne.setText(activity.getColumnOneJava());
            columnTwo.setText(activity.getColumnTwoJava2());
        }
        if (getActivity() instanceof ERotateActivity) {
            ERotateActivity activity = (ERotateActivity) getActivity();
            columnOne.setText(activity.getColumnOneJava());
            columnTwo.setText(activity.getColumnTwoJava2());
        }
        if (getActivity() instanceof EInsertActivity) {
            EInsertActivity activity = (EInsertActivity) getActivity();
            columnOne.setText(activity.getColumnOneJava());
            columnTwo.setText(activity.getColumnTwoJava2());
        }
        if (getActivity() instanceof EReadActivity) {
            EReadActivity activity = (EReadActivity) getActivity();
            columnOne.setText(activity.getColumnOneJava());
            columnTwo.setText(activity.getColumnTwoJava2());
        }
        if (getActivity() instanceof EUpdateActivity) {
            EUpdateActivity activity = (EUpdateActivity) getActivity();
            columnOne.setText(activity.getColumnOneJava());
            columnTwo.setText(activity.getColumnTwoJava2());
        }
        if (getActivity() instanceof EDeleteActivity) {
            EDeleteActivity activity = (EDeleteActivity) getActivity();
            columnOne.setText(activity.getColumnOneJava());
            columnTwo.setText(activity.getColumnTwoJava2());
        }
    }
}
