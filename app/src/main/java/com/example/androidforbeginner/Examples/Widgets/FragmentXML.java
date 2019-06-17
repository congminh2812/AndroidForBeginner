package com.example.androidforbeginner.Examples.Widgets;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.androidforbeginner.Examples.Acitivity_Fragment.EActLifeActivity;
import com.example.androidforbeginner.Examples.Acitivity_Fragment.EDialogFragActivity;
import com.example.androidforbeginner.Examples.Acitivity_Fragment.EFragLifeActivity;
import com.example.androidforbeginner.Examples.Acitivity_Fragment.EListFragActivity;
import com.example.androidforbeginner.Examples.Animation.EBlinkActivity;
import com.example.androidforbeginner.Examples.Animation.EBounceActivity;
import com.example.androidforbeginner.Examples.Animation.EFadeActivity;
import com.example.androidforbeginner.Examples.Animation.ERotateActivity;
import com.example.androidforbeginner.Examples.Animation.EZoomActivity;
import com.example.androidforbeginner.Examples.Containers.ECusListViewActivity;
import com.example.androidforbeginner.Examples.Containers.EGridViewActivity;
import com.example.androidforbeginner.Examples.Containers.EListViewActivity;
import com.example.androidforbeginner.Examples.Containers.ESearchViewActivity;
import com.example.androidforbeginner.Examples.Containers.EWebViewActivity;
import com.example.androidforbeginner.Examples.DataStorage.ECacheActivity;
import com.example.androidforbeginner.Examples.DataStorage.EExternalActivity;
import com.example.androidforbeginner.Examples.DataStorage.EInternalActivity;
import com.example.androidforbeginner.Examples.DataStorage.EPublicActivity;
import com.example.androidforbeginner.Examples.DataStorage.ESharedActivity;
import com.example.androidforbeginner.Examples.DateTime.EChronometerActivity;
import com.example.androidforbeginner.Examples.DateTime.EChronometerRunActivity;
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
import com.example.androidforbeginner.Examples.Menu.EContextActivity;
import com.example.androidforbeginner.Examples.Menu.EOptionActivity;
import com.example.androidforbeginner.Examples.Menu.EPopUpActivity;
import com.example.androidforbeginner.Examples.SQLite.EDeleteActivity;
import com.example.androidforbeginner.Examples.SQLite.EInsertActivity;
import com.example.androidforbeginner.Examples.SQLite.EReadActivity;
import com.example.androidforbeginner.Examples.SQLite.EUpdateActivity;
import com.example.androidforbeginner.Examples.Toast.ECustomActivity;
import com.example.androidforbeginner.Examples.Toast.EMessageActivity;
import com.example.androidforbeginner.Examples.Toast.ESimpleActivity;
import com.example.androidforbeginner.R;

public class FragmentXML extends Fragment {
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
        if (getActivity() instanceof ETextViewActivity) {
            ETextViewActivity activity = (ETextViewActivity) getActivity();
            columnOne.setText(activity.getColumnOneXML());
            columnTwo.setText(activity.getColumnTwoXML());
        }
        if (getActivity() instanceof EButtonActivity) {
            EButtonActivity activity = (EButtonActivity) getActivity();
            columnOne.setText(activity.getColumnOneXML());
            columnTwo.setText(activity.getColumnTwoXML());
        }
        if (getActivity() instanceof EEditTextActivity) {
            EEditTextActivity activity = (EEditTextActivity) getActivity();
            columnOne.setText(activity.getColumnOneXML());
            columnTwo.setText(activity.getColumnTwoXML());
        }
        if (getActivity() instanceof ERadioActivity) {
            ERadioActivity activity = (ERadioActivity) getActivity();
            columnOne.setText(activity.getColumnOneXML());
            columnTwo.setText(activity.getColumnTwoXML());
        }
        if (getActivity() instanceof ECheckBoxActivity) {
            ECheckBoxActivity activity = (ECheckBoxActivity) getActivity();
            columnOne.setText(activity.getColumnOneXML());
            columnTwo.setText(activity.getColumnTwoXML());
        }
        if (getActivity() instanceof ERatingBarActivity) {
            ERatingBarActivity activity = (ERatingBarActivity) getActivity();
            columnOne.setText(activity.getColumnOneXML());
            columnTwo.setText(activity.getColumnTwoXML());
        }
        if (getActivity() instanceof EProgressActivity) {
            EProgressActivity activity = (EProgressActivity) getActivity();
            columnOne.setText(activity.getColumnOneXML());
            columnTwo.setText(activity.getColumnTwoXML());
        }
        if (getActivity() instanceof ESeekBarActivity) {
            ESeekBarActivity activity = (ESeekBarActivity) getActivity();
            columnOne.setText(activity.getColumnOneXML());
            columnTwo.setText(activity.getColumnTwoXML());
        }
        if (getActivity() instanceof ESwitchActivity) {
            ESwitchActivity activity = (ESwitchActivity) getActivity();
            columnOne.setText(activity.getColumnOneXML());
            columnTwo.setText(activity.getColumnTwoXML());
        }
        if (getActivity() instanceof EToggleActivity) {
            EToggleActivity activity = (EToggleActivity) getActivity();
            columnOne.setText(activity.getColumnOneXML());
            columnTwo.setText(activity.getColumnTwoXML());
        }
        if (getActivity() instanceof ESpinnerActivity) {
            ESpinnerActivity activity = (ESpinnerActivity) getActivity();
            columnOne.setText(activity.getColumnOneXML());
            columnTwo.setText(activity.getColumnTwoXML());
        }
        if (getActivity() instanceof EAutoCompleteActivity) {
            EAutoCompleteActivity activity = (EAutoCompleteActivity) getActivity();
            columnOne.setText(activity.getColumnOneXML());
            columnTwo.setText(activity.getColumnTwoXML());
        }
        if (getActivity() instanceof EMutilAutoActivity) {
            EMutilAutoActivity activity = (EMutilAutoActivity) getActivity();
            columnOne.setText(activity.getColumnOneXML());
            columnTwo.setText(activity.getColumnTwoXML());
        }
        if (getActivity() instanceof ECheckedActivity) {
            ECheckedActivity activity = (ECheckedActivity) getActivity();
            columnOne.setText(activity.getColumnOneXML());
            columnTwo.setText(activity.getColumnTwoXML());
        }
        if (getActivity() instanceof ETextSwitcherActivity) {
            ETextSwitcherActivity activity = (ETextSwitcherActivity) getActivity();
            columnOne.setText(activity.getColumnOneXML());
            columnTwo.setText(activity.getColumnTwoXML());
        }
        if (getActivity() instanceof EImageSwitcherActivity) {
            EImageSwitcherActivity activity = (EImageSwitcherActivity) getActivity();
            columnOne.setText(activity.getColumnOneXML());
            columnTwo.setText(activity.getColumnTwoXML());
        }
        if (getActivity() instanceof EViewFlipperActivity) {
            EViewFlipperActivity activity = (EViewFlipperActivity) getActivity();
            columnOne.setText(activity.getColumnOneXML());
            columnTwo.setText(activity.getColumnTwoXML());
        }
        if (getActivity() instanceof EImageButtonActivity) {
            EImageButtonActivity activity = (EImageButtonActivity) getActivity();
            columnOne.setText(activity.getColumnOneXML());
            columnTwo.setText(activity.getColumnTwoXML());
        }
        if (getActivity() instanceof EImageViewActivity) {
            EImageViewActivity activity = (EImageViewActivity) getActivity();
            columnOne.setText(activity.getColumnOneXML());
            columnTwo.setText(activity.getColumnTwoXML());
        }
        if (getActivity() instanceof EVideoViewActivity) {
            EVideoViewActivity activity = (EVideoViewActivity) getActivity();
            columnOne.setText(activity.getColumnOneXML());
            columnTwo.setText(activity.getColumnTwoXML());
        }
        if (getActivity() instanceof ETextClockActivity) {
            ETextClockActivity activity = (ETextClockActivity) getActivity();
            columnOne.setText(activity.getColumnOneXML());
            columnTwo.setText(activity.getColumnTwoXML());
        }
        if (getActivity() instanceof ETimePickerActivity) {
            ETimePickerActivity activity = (ETimePickerActivity) getActivity();
            columnOne.setText(activity.getColumnOneXML());
            columnTwo.setText(activity.getColumnTwoXML());
        }
        if (getActivity() instanceof EChronometerActivity) {
            EChronometerActivity activity = (EChronometerActivity) getActivity();
            columnOne.setText(activity.getColumnOneXML());
            columnTwo.setText(activity.getColumnTwoXML());
        }
        if (getActivity() instanceof EEmailActivity) {
            EEmailActivity activity = (EEmailActivity) getActivity();
            columnOne.setText(activity.getColumnOneXML());
            columnTwo.setText(activity.getColumnTwoXML());
        }
        if (getActivity() instanceof EMapActivity) {
            EMapActivity activity = (EMapActivity) getActivity();
            columnOne.setText(activity.getColumnOneXML());
            columnTwo.setText(activity.getColumnTwoXML());
        }
        if (getActivity() instanceof ECallActivity) {
            ECallActivity activity = (ECallActivity) getActivity();
            columnOne.setText(activity.getColumnOneXML());
            columnTwo.setText(activity.getColumnTwoXML());
        }
        if (getActivity() instanceof EDialActivity) {
            EDialActivity activity = (EDialActivity) getActivity();
            columnOne.setText(activity.getColumnOneXML());
            columnTwo.setText(activity.getColumnTwoXML());
        }
        if (getActivity() instanceof ECameraActivity) {
            ECameraActivity activity = (ECameraActivity) getActivity();
            columnOne.setText(activity.getColumnOneXML());
            columnTwo.setText(activity.getColumnTwoXML());
        }
        if (getActivity() instanceof ETransitionActivity) {
            ETransitionActivity activity = (ETransitionActivity) getActivity();
            columnOne.setText(activity.getColumnOneXML());
            columnTwo.setText(activity.getColumnTwoXML());
        }
        if (getActivity() instanceof EPassingActivity) {
            EPassingActivity activity = (EPassingActivity) getActivity();
            columnOne.setText(activity.getColumnOneXML());
            columnTwo.setText(activity.getColumnTwoXML());
        }
        if (getActivity() instanceof EForResultActivity) {
            EForResultActivity activity = (EForResultActivity) getActivity();
            columnOne.setText(activity.getColumnOneXML());
            columnTwo.setText(activity.getColumnTwoXML());
        }
        if (getActivity() instanceof ESimpleActivity) {
            ESimpleActivity activity = (ESimpleActivity) getActivity();
            columnOne.setText(activity.getColumnOneXML());
            columnTwo.setText(activity.getColumnTwoXML());
        }
        if (getActivity() instanceof EMessageActivity) {
            EMessageActivity activity = (EMessageActivity) getActivity();
            columnOne.setText(activity.getColumnOneXML());
            columnTwo.setText(activity.getColumnTwoXML());
        }
        if (getActivity() instanceof ECustomActivity) {
            ECustomActivity activity = (ECustomActivity) getActivity();
            columnOne.setText(activity.getColumnOneXML());
            columnTwo.setText(activity.getColumnTwoXML());
        }
        if (getActivity() instanceof EListViewActivity) {
            EListViewActivity activity = (EListViewActivity) getActivity();
            columnOne.setText(activity.getColumnOneXML());
            columnTwo.setText(activity.getColumnTwoXML());
        }
        if (getActivity() instanceof ECusListViewActivity) {
            ECusListViewActivity activity = (ECusListViewActivity) getActivity();
            columnOne.setText(activity.getColumnOneXML());
            columnTwo.setText(activity.getColumnTwoXML());
        }
        if (getActivity() instanceof EGridViewActivity) {
            EGridViewActivity activity = (EGridViewActivity) getActivity();
            columnOne.setText(activity.getColumnOneXML());
            columnTwo.setText(activity.getColumnTwoXML());
        }
        if (getActivity() instanceof EWebViewActivity) {
            EWebViewActivity activity = (EWebViewActivity) getActivity();
            columnOne.setText(activity.getColumnOneXML());
            columnTwo.setText(activity.getColumnTwoXML());
        }
        if (getActivity() instanceof ESearchViewActivity) {
            ESearchViewActivity activity = (ESearchViewActivity) getActivity();
            columnOne.setText(activity.getColumnOneXML());
            columnTwo.setText(activity.getColumnTwoXML());
        }
        if (getActivity() instanceof EContextActivity) {
            EContextActivity activity = (EContextActivity) getActivity();
            columnOne.setText(activity.getColumnOneXML());
            columnTwo.setText(activity.getColumnTwoXML());
        }
        if (getActivity() instanceof EOptionActivity) {
            EOptionActivity activity = (EOptionActivity) getActivity();
            columnOne.setText(activity.getColumnOneXML());
            columnTwo.setText(activity.getColumnTwoXML());
        }
        if (getActivity() instanceof EPopUpActivity) {
            EPopUpActivity activity = (EPopUpActivity) getActivity();
            columnOne.setText(activity.getColumnOneXML());
            columnTwo.setText(activity.getColumnTwoXML());
        }
        if (getActivity() instanceof EActLifeActivity) {
            EActLifeActivity activity = (EActLifeActivity) getActivity();
            columnOne.setText(activity.getColumnOneXML());
            columnTwo.setText(activity.getColumnTwoXML());
        }
        if (getActivity() instanceof EFragLifeActivity) {
            EFragLifeActivity activity = (EFragLifeActivity) getActivity();
            columnOne.setText(activity.getColumnOneXML());
            columnTwo.setText(activity.getColumnTwoXML());
        }
        if (getActivity() instanceof EListFragActivity) {
            EListFragActivity activity = (EListFragActivity) getActivity();
            columnOne.setText(activity.getColumnOneXML());
            columnTwo.setText(activity.getColumnTwoXML());
        }
        if (getActivity() instanceof EDialogFragActivity) {
            EDialogFragActivity activity = (EDialogFragActivity) getActivity();
            columnOne.setText(activity.getColumnOneXML());
            columnTwo.setText(activity.getColumnTwoXML());
        }
        if (getActivity() instanceof EFadeActivity) {
            EFadeActivity activity = (EFadeActivity) getActivity();
            columnOne.setText(activity.getColumnOneXML());
            columnTwo.setText(activity.getColumnTwoXML());
        }
        if (getActivity() instanceof EZoomActivity) {
            EZoomActivity activity = (EZoomActivity) getActivity();
            columnOne.setText(activity.getColumnOneXML());
            columnTwo.setText(activity.getColumnTwoXML());
        }
        if (getActivity() instanceof ERotateActivity) {
            ERotateActivity activity = (ERotateActivity) getActivity();
            columnOne.setText(activity.getColumnOneXML());
            columnTwo.setText(activity.getColumnTwoXML());
        }
        if (getActivity() instanceof EBounceActivity) {
            EBounceActivity activity = (EBounceActivity) getActivity();
            columnOne.setText(activity.getColumnOneXML());
            columnTwo.setText(activity.getColumnTwoXML());
        }
        if (getActivity() instanceof EBlinkActivity) {
            EBlinkActivity activity = (EBlinkActivity) getActivity();
            columnOne.setText(activity.getColumnOneXML());
            columnTwo.setText(activity.getColumnTwoXML());
        }
        if (getActivity() instanceof ESharedActivity) {
            ESharedActivity activity = (ESharedActivity) getActivity();
            columnOne.setText(activity.getColumnOneXML());
            columnTwo.setText(activity.getColumnTwoXML());
        }
        if (getActivity() instanceof EInternalActivity) {
            EInternalActivity activity = (EInternalActivity) getActivity();
            columnOne.setText(activity.getColumnOneXML());
            columnTwo.setText(activity.getColumnTwoXML());
        }
        if (getActivity() instanceof EExternalActivity) {
            EExternalActivity activity = (EExternalActivity) getActivity();
            columnOne.setText(activity.getColumnOneXML());
            columnTwo.setText(activity.getColumnTwoXML());
        }
        if (getActivity() instanceof EPublicActivity) {
            EPublicActivity activity = (EPublicActivity) getActivity();
            columnOne.setText(activity.getColumnOneXML());
            columnTwo.setText(activity.getColumnTwoXML());
        }
        if (getActivity() instanceof ECacheActivity) {
            ECacheActivity activity = (ECacheActivity) getActivity();
            columnOne.setText(activity.getColumnOneXML());
            columnTwo.setText(activity.getColumnTwoXML());
        }
        if (getActivity() instanceof EInsertActivity) {
            EInsertActivity activity = (EInsertActivity) getActivity();
            columnOne.setText(activity.getColumnOneXML());
            columnTwo.setText(activity.getColumnTwoXML());
        }
        if (getActivity() instanceof EReadActivity) {
            EReadActivity activity = (EReadActivity) getActivity();
            columnOne.setText(activity.getColumnOneXML());
            columnTwo.setText(activity.getColumnTwoXML());
        }
        if (getActivity() instanceof EUpdateActivity) {
            EUpdateActivity activity = (EUpdateActivity) getActivity();
            columnOne.setText(activity.getColumnOneXML());
            columnTwo.setText(activity.getColumnTwoXML());
        }
        if (getActivity() instanceof EDeleteActivity) {
            EDeleteActivity activity = (EDeleteActivity) getActivity();
            columnOne.setText(activity.getColumnOneXML());
            columnTwo.setText(activity.getColumnTwoXML());
        }
    }
}
