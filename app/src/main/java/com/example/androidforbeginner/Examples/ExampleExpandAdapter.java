package com.example.androidforbeginner.Examples;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.androidforbeginner.Examples.Acitivity_Fragment.EActLifeActivity;
import com.example.androidforbeginner.Examples.Acitivity_Fragment.EActLifeRunActivity;
import com.example.androidforbeginner.Examples.Acitivity_Fragment.EDialogFragActivity;
import com.example.androidforbeginner.Examples.Acitivity_Fragment.EDialogFragRunActivity;
import com.example.androidforbeginner.Examples.Acitivity_Fragment.EFragLifeActivity;
import com.example.androidforbeginner.Examples.Acitivity_Fragment.EFragLifeRunActivity;
import com.example.androidforbeginner.Examples.Acitivity_Fragment.EListFragActivity;
import com.example.androidforbeginner.Examples.Acitivity_Fragment.EListFragRunActivity;
import com.example.androidforbeginner.Examples.Animation.EBlinkActivity;
import com.example.androidforbeginner.Examples.Animation.EBlinkRunActivity;
import com.example.androidforbeginner.Examples.Animation.EBounceActivity;
import com.example.androidforbeginner.Examples.Animation.EBounceRunActivity;
import com.example.androidforbeginner.Examples.Animation.EFadeActivity;
import com.example.androidforbeginner.Examples.Animation.EFadeRunActivity;
import com.example.androidforbeginner.Examples.Animation.ERotateActivity;
import com.example.androidforbeginner.Examples.Animation.ERotateRunActivity;
import com.example.androidforbeginner.Examples.Animation.EZoomActivity;
import com.example.androidforbeginner.Examples.Animation.EZoomRunActivity;
import com.example.androidforbeginner.Examples.Containers.ECusListViewActivity;
import com.example.androidforbeginner.Examples.Containers.ECusListViewRunActivity;
import com.example.androidforbeginner.Examples.Containers.EGridViewActivity;
import com.example.androidforbeginner.Examples.Containers.EGridViewRunActivity;
import com.example.androidforbeginner.Examples.Containers.EListViewActivity;
import com.example.androidforbeginner.Examples.Containers.EListViewRunActivity;
import com.example.androidforbeginner.Examples.Containers.ESearchViewActivity;
import com.example.androidforbeginner.Examples.Containers.ESearchViewRunActivity;
import com.example.androidforbeginner.Examples.Containers.EWebViewActivity;
import com.example.androidforbeginner.Examples.Containers.EWebViewRunActivity;
import com.example.androidforbeginner.Examples.DataStorage.ECacheActivity;
import com.example.androidforbeginner.Examples.DataStorage.ECacheRunActivity;
import com.example.androidforbeginner.Examples.DataStorage.EExternalActivity;
import com.example.androidforbeginner.Examples.DataStorage.EExternalRunActivity;
import com.example.androidforbeginner.Examples.DataStorage.EInternalActivity;
import com.example.androidforbeginner.Examples.DataStorage.EInternalRunActivity;
import com.example.androidforbeginner.Examples.DataStorage.EPublicActivity;
import com.example.androidforbeginner.Examples.DataStorage.EPublicRunActivity;
import com.example.androidforbeginner.Examples.DataStorage.ESharedActivity;
import com.example.androidforbeginner.Examples.DataStorage.ESharedRunActivity;
import com.example.androidforbeginner.Examples.DateTime.EChronometerActivity;
import com.example.androidforbeginner.Examples.DateTime.EChronometerRunActivity;
import com.example.androidforbeginner.Examples.DateTime.EDatePickerActivity;
import com.example.androidforbeginner.Examples.DateTime.EDatePickerRunActivity;
import com.example.androidforbeginner.Examples.DateTime.ETextClockActivity;
import com.example.androidforbeginner.Examples.DateTime.ETextClockRunActivity;
import com.example.androidforbeginner.Examples.DateTime.ETimePickerActivity;
import com.example.androidforbeginner.Examples.DateTime.ETimePickerRunActivity;
import com.example.androidforbeginner.Examples.ExplicitIntent.EForResultActivity;
import com.example.androidforbeginner.Examples.ExplicitIntent.EForResultRunActivity;
import com.example.androidforbeginner.Examples.ExplicitIntent.EPassingActivity;
import com.example.androidforbeginner.Examples.ExplicitIntent.EPassingRunActivity;
import com.example.androidforbeginner.Examples.ExplicitIntent.ETransitionActivity;
import com.example.androidforbeginner.Examples.ExplicitIntent.ETransitionRunActivity;
import com.example.androidforbeginner.Examples.ImageAndMedia.EImageButtonActivity;
import com.example.androidforbeginner.Examples.ImageAndMedia.EImageButtonRunActivity;
import com.example.androidforbeginner.Examples.ImageAndMedia.EImageViewActivity;
import com.example.androidforbeginner.Examples.ImageAndMedia.EImageViewRunActivity;
import com.example.androidforbeginner.Examples.ImageAndMedia.EVideoViewActivity;
import com.example.androidforbeginner.Examples.ImageAndMedia.EVideoViewRunActivity;
import com.example.androidforbeginner.Examples.ImplicitIntent.ECallActivity;
import com.example.androidforbeginner.Examples.ImplicitIntent.ECallRunActivity;
import com.example.androidforbeginner.Examples.ImplicitIntent.ECameraActivity;
import com.example.androidforbeginner.Examples.ImplicitIntent.ECameraRunActivity;
import com.example.androidforbeginner.Examples.ImplicitIntent.EDialActivity;
import com.example.androidforbeginner.Examples.ImplicitIntent.EDialRunActivity;
import com.example.androidforbeginner.Examples.ImplicitIntent.EEmailActivity;
import com.example.androidforbeginner.Examples.ImplicitIntent.EEmailRunActivity;
import com.example.androidforbeginner.Examples.ImplicitIntent.EMapActivity;
import com.example.androidforbeginner.Examples.ImplicitIntent.EMapRunActivity;
import com.example.androidforbeginner.Examples.Menu.EContextActivity;
import com.example.androidforbeginner.Examples.Menu.EContextRunActivity;
import com.example.androidforbeginner.Examples.Menu.EOptionActivity;
import com.example.androidforbeginner.Examples.Menu.EOptionRunActivity;
import com.example.androidforbeginner.Examples.Menu.EPopUpActivity;
import com.example.androidforbeginner.Examples.Menu.EPopUpRunActivity;
import com.example.androidforbeginner.Examples.SQLite.EDeleteRunActivity;
import com.example.androidforbeginner.Examples.SQLite.EInsertActivity;
import com.example.androidforbeginner.Examples.SQLite.EInsertRunActivity;
import com.example.androidforbeginner.Examples.SQLite.EReadActivity;
import com.example.androidforbeginner.Examples.SQLite.EReadRunActivity;
import com.example.androidforbeginner.Examples.SQLite.EUpdateActivity;
import com.example.androidforbeginner.Examples.SQLite.EUpdateRunActivity;
import com.example.androidforbeginner.Examples.Toast.ECustomActivity;
import com.example.androidforbeginner.Examples.Toast.ECustomRunActivity;
import com.example.androidforbeginner.Examples.Toast.EMessageActivity;
import com.example.androidforbeginner.Examples.Toast.EMessageRunActivity;
import com.example.androidforbeginner.Examples.Toast.ESimpleActivity;
import com.example.androidforbeginner.Examples.Toast.ESimpleRunActivity;
import com.example.androidforbeginner.Examples.Widgets.EAutoCompleteActivity;
import com.example.androidforbeginner.Examples.Widgets.EAutoCompleteRunActivity;
import com.example.androidforbeginner.Examples.Widgets.EButtonActivity;
import com.example.androidforbeginner.Examples.Widgets.EButtonRunActivity;
import com.example.androidforbeginner.Examples.Widgets.ECheckBoxActivity;
import com.example.androidforbeginner.Examples.Widgets.ECheckBoxRunActivity;
import com.example.androidforbeginner.Examples.Widgets.ECheckedActivity;
import com.example.androidforbeginner.Examples.Widgets.ECheckedRunActivity;
import com.example.androidforbeginner.Examples.Widgets.EEditTextActivity;
import com.example.androidforbeginner.Examples.Widgets.EEditTextRunActivity;
import com.example.androidforbeginner.Examples.Widgets.EImageSwitcherActivity;
import com.example.androidforbeginner.Examples.Widgets.EImageSwitcherRunActivity;
import com.example.androidforbeginner.Examples.Widgets.EMutilAutoActivity;
import com.example.androidforbeginner.Examples.Widgets.EMutilAutoRunActivity;
import com.example.androidforbeginner.Examples.Widgets.EProgressActivity;
import com.example.androidforbeginner.Examples.Widgets.EProgressRunActivity;
import com.example.androidforbeginner.Examples.Widgets.ERadioActivity;
import com.example.androidforbeginner.Examples.Widgets.ERadioRunActivity;
import com.example.androidforbeginner.Examples.Widgets.ERatingBarActivity;
import com.example.androidforbeginner.Examples.Widgets.ERatingBarRunActivity;
import com.example.androidforbeginner.Examples.Widgets.ESeekBarActivity;
import com.example.androidforbeginner.Examples.Widgets.ESeekBarRunActivity;
import com.example.androidforbeginner.Examples.Widgets.ESpinnerActivity;
import com.example.androidforbeginner.Examples.Widgets.ESpinnerRunActivity;
import com.example.androidforbeginner.Examples.Widgets.ESwitchActivity;
import com.example.androidforbeginner.Examples.Widgets.ESwitchRunActivity;
import com.example.androidforbeginner.Examples.Widgets.ETextSwitcherActivity;
import com.example.androidforbeginner.Examples.Widgets.ETextSwitcherRunActivity;
import com.example.androidforbeginner.Examples.Widgets.ETextViewActivity;
import com.example.androidforbeginner.Examples.Widgets.ETextViewRunActivity;
import com.example.androidforbeginner.Examples.Widgets.EToggleActivity;
import com.example.androidforbeginner.Examples.Widgets.EToggleRunActivity;
import com.example.androidforbeginner.Examples.Widgets.EViewFlipperActivity;
import com.example.androidforbeginner.Examples.Widgets.EViewFlipperRunActivity;
import com.example.androidforbeginner.R;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ExampleExpandAdapter extends BaseExpandableListAdapter {
    private Context context;
    private HashMap<String, List<Example>> myChild;
    private List<String> myHeader;

    public ExampleExpandAdapter(Context context, HashMap<String, List<Example>> myChild, List<String> myHeader) {
        this.context = context;
        this.myChild = myChild;
        this.myHeader = myHeader;
    }

    @Override
    public int getGroupCount() {
        return myHeader.size();
    }

    @Override
    public int getChildrenCount(int groupPosition) {
        return myChild.get(myHeader.get(groupPosition)).size();
    }

    @Override
    public Object getGroup(int groupPosition) {
        return myHeader.get(groupPosition);
    }

    @Override
    public Object getChild(int groupPosition, int childPosition) {
        return myChild.get(myHeader.get(groupPosition)).get(childPosition);
    }

    @Override
    public long getGroupId(int groupPosition) {
        return 0;
    }

    @Override
    public long getChildId(int groupPosition, int childPosition) {
        return 0;
    }

    @Override
    public boolean hasStableIds() {
        return false;
    }

    @Override
    public View getGroupView(int groupPosition, boolean isExpanded, View convertView, ViewGroup parent) {
        String title = (String) this.getGroup(groupPosition);
        if (convertView == null) {
            LayoutInflater inflater = (LayoutInflater) this.context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.expand_header,null);
        }
        TextView textView = convertView.findViewById(R.id.tv_header);
        textView.setText(title);

        return convertView;
    }
    Intent intent = null;
    @Override
    public View getChildView(final int groupPosition, final int childPosition, boolean isLastChild, View convertView, ViewGroup parent) {
        Example item = (Example) this.getChild(groupPosition,childPosition);
        if (convertView == null) {
            LayoutInflater inflater = (LayoutInflater) this.context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.expand_content,null);
        }
        TextView textView = convertView.findViewById(R.id.tv_child);
        ImageView imageView = convertView.findViewById(R.id.image_view_child);
        ImageView imageView1 = convertView.findViewById(R.id.image_view_play);

        textView.setText(item.getTitle());
        imageView.setImageResource(item.getImage());
        imageView1.setImageResource(R.drawable.play);


            textView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    switchIntent(groupPosition,childPosition);
                }
            });

            imageView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    switchIntent(groupPosition,childPosition);
                }
            });

            imageView1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                   switchIntent2(groupPosition,childPosition);
                }
            });

        return convertView;
    }

    private void switchIntent(int group,int child) {

        switch (group) {
            case 0:
                switch (child) {
                    case 0:
                        intent = new Intent(context,ETextViewActivity.class);
                        break;
                    case 1:
                        intent = new Intent(context, EButtonActivity.class);
                        break;
                    case 2:
                        intent = new Intent(context, EEditTextActivity.class);
                        break;
                    case 3:
                        intent = new Intent(context, ERadioActivity.class);
                        break;
                    case 4:
                        intent = new Intent(context, ECheckBoxActivity.class);
                        break;
                    case 5:
                        intent = new Intent(context, ERatingBarActivity.class);
                        break;
                    case 6:
                        intent = new Intent(context, EProgressActivity.class);
                        break;
                    case 7:
                        intent = new Intent(context, ESeekBarActivity.class);
                        break;
                    case 8:
                        intent = new Intent(context, ESwitchActivity.class);
                        break;
                    case 9:
                        intent = new Intent(context, EToggleActivity.class);
                        break;
                    case 10:
                        intent = new Intent(context, ESpinnerActivity.class);
                        break;
                    case 11:
                        intent = new Intent(context, EAutoCompleteActivity.class);
                        break;
                    case 12:
                        intent = new Intent(context, EMutilAutoActivity.class);
                        break;
                    case 13:
                        intent = new Intent(context, ECheckedActivity.class);
                        break;
                    case 14:
                        intent = new Intent(context, ETextSwitcherActivity.class);
                        break;
                    case 15:
                        intent = new Intent(context, EImageSwitcherActivity.class);
                        break;
                    case 16:
                        intent = new Intent(context, EViewFlipperActivity.class);
                        break;
                }
                break;
            case 1:
                switch (child) {
                    case 0:
                        intent = new Intent(context, EImageButtonActivity.class);
                        break;
                    case 1:
                        intent = new Intent(context, EImageViewActivity.class);
                        break;
                    case 2:
                        intent = new Intent(context, EVideoViewActivity.class);
                        break;
                }
                break;
            case 2:
                switch (child) {
                    case 0:
                        intent = new Intent(context, ETextClockActivity.class);
                        break;
                    case 1:
                        intent = new Intent(context, EDatePickerActivity.class);
                        break;
                    case 2:
                        intent = new Intent(context, ETimePickerActivity.class);
                        break;
                    case 3:
                        intent = new Intent(context, EChronometerActivity.class);
                        break;
                }
                break;
            case 3:
                switch (child) {
                    case 0:
                        intent = new Intent(context, EEmailActivity.class);
                        break;
                    case 1:
                        intent = new Intent(context, EMapActivity.class);
                        break;
                    case 2:
                        intent = new Intent(context, ECallActivity.class);
                        break;
                    case 3:
                        intent = new Intent(context, EDialActivity.class);
                        break;
                    case 4:
                        intent = new Intent(context, ECameraActivity.class);
                        break;
                }
                break;
            case 4:
                switch (child) {
                    case 0:
                        intent = new Intent(context, ETransitionActivity.class);
                        break;
                    case 1:
                        intent = new Intent(context, EPassingActivity.class);
                        break;
                    case 2:
                        intent = new Intent(context, EForResultActivity.class);
                        break;
                }
                break;
            case 5:
                switch (child) {
                    case 0:
                        intent = new Intent(context, ESimpleActivity.class);
                        break;
                    case 1:
                        intent = new Intent(context, EMessageActivity.class);
                        break;
                    case 2:
                        intent = new Intent(context, ECustomActivity.class);
                        break;
                }
                break;
            case 6:
                switch (child) {
                    case 0:
                        intent = new Intent(context, EListViewActivity.class);
                        break;
                    case 1:
                        intent = new Intent(context, ECusListViewActivity.class);
                        break;
                    case 2:
                        intent = new Intent(context, EGridViewActivity.class);
                        break;
                    case 3:
                        intent = new Intent(context, EWebViewActivity.class);
                        break;
                    case 4:
                        intent = new Intent(context, ESearchViewActivity.class);
                        break;
                }
                break;
            case 7:
                switch (child) {
                    case 0:
                        intent = new Intent(context, EContextActivity.class);
                        break;
                    case 1:
                        intent = new Intent(context, EOptionActivity.class);
                        break;
                    case 2:
                        intent = new Intent(context, EPopUpActivity.class);
                        break;
                }
                break;
            case 8:
                switch (child) {
                    case 0:
                        intent = new Intent(context, EActLifeActivity.class);
                        break;
                    case 1:
                        intent = new Intent(context, EFragLifeActivity.class);
                        break;
                    case 2:
                        intent = new Intent(context, EListFragActivity.class);
                        break;
                    case 3:
                        intent = new Intent(context, EDialogFragActivity.class);
                        break;
                }
                break;
            case 9:
                switch (child) {
                    case 0:
                        intent = new Intent(context, EFadeActivity.class);
                        break;
                    case 1:
                        intent = new Intent(context, EZoomActivity.class);
                        break;
                    case 2:
                        intent = new Intent(context, ERotateActivity.class);
                        break;
                    case 3:
                        intent = new Intent(context, EBounceActivity.class);
                        break;
                    case 4:
                        intent = new Intent(context, EBlinkActivity.class);
                        break;
                }
                break;
            case 10:
                switch (child) {
                    case 0:
                        intent = new Intent(context, ESharedActivity.class);
                        break;
                    case 1:
                        intent = new Intent(context, EInternalActivity.class);
                        break;
                    case 2:
                        intent = new Intent(context, EExternalActivity.class);
                        break;
                    case 3:
                        intent = new Intent(context, EPublicActivity.class);
                        break;
                    case 4:
                        intent = new Intent(context, ECacheActivity.class);
                        break;
                }
                break;
            case 11:
                switch (child) {
                    case 0:
                        intent = new Intent(context, EInsertActivity.class);
                        break;
                    case 1:
                        intent = new Intent(context, EReadActivity.class);
                        break;
                    case 2:
                        intent = new Intent(context, EUpdateActivity.class);
                        break;
                    case 3:
                        intent = new Intent(context, EDeleteRunActivity.class);
                        break;
                }
                break;
        }
        if (intent != null) {
            context.startActivity(intent);
            ((Activity) context).overridePendingTransition(R.anim.anim_exit_left,R.anim.anim_enter_left);
        }
    }

    private void switchIntent2(int group,int child) {

        switch (group) {
            case 0:
                switch (child) {
                    case 0:
                        intent = new Intent(context,ETextViewRunActivity.class);
                        break;
                    case 1:
                        intent = new Intent(context, EButtonRunActivity.class);
                        break;
                    case 2:
                        intent = new Intent(context, EEditTextRunActivity.class);
                        break;
                    case 3:
                        intent = new Intent(context, ERadioRunActivity.class);
                        break;
                    case 4:
                        intent = new Intent(context, ECheckBoxRunActivity.class);
                        break;
                    case 5:
                        intent = new Intent(context, ERatingBarRunActivity.class);
                        break;
                    case 6:
                        intent = new Intent(context, EProgressRunActivity.class);
                        break;
                    case 7:
                        intent = new Intent(context, ESeekBarRunActivity.class);
                        break;
                    case 8:
                        intent = new Intent(context, ESwitchRunActivity.class);
                        break;
                    case 9:
                        intent = new Intent(context, EToggleRunActivity.class);
                        break;
                    case 10:
                        intent = new Intent(context, ESpinnerRunActivity.class);
                        break;
                    case 11:
                        intent = new Intent(context, EAutoCompleteRunActivity.class);
                        break;
                    case 12:
                        intent = new Intent(context, EMutilAutoRunActivity.class);
                        break;
                    case 13:
                        intent = new Intent(context, ECheckedRunActivity.class);
                        break;
                    case 14:
                        intent = new Intent(context, ETextSwitcherRunActivity.class);
                        break;
                    case 15:
                        intent = new Intent(context, EImageSwitcherRunActivity.class);
                        break;
                    case 16:
                        intent = new Intent(context, EViewFlipperRunActivity.class);
                        break;
                }
                break;
            case 1:
                switch (child) {
                    case 0:
                        intent = new Intent(context, EImageButtonRunActivity.class);
                        break;
                    case 1:
                        intent = new Intent(context, EImageViewRunActivity.class);
                        break;
                    case 2:
                        intent = new Intent(context, EVideoViewRunActivity.class);
                        break;
                }
                break;
            case 2:
                switch (child) {
                    case 0:
                        intent = new Intent(context, ETextClockRunActivity.class);
                        break;
                    case 1:
                        intent = new Intent(context, EDatePickerRunActivity.class);
                        break;
                    case 2:
                        intent = new Intent(context, ETimePickerRunActivity.class);
                        break;
                    case 3:
                        intent = new Intent(context, EChronometerRunActivity.class);
                        break;
                }
                break;
            case 3:
                switch (child) {
                    case 0:
                        intent = new Intent(context, EEmailRunActivity.class);
                        break;
                    case 1:
                        intent = new Intent(context, EMapRunActivity.class);
                        break;
                    case 2:
                        intent = new Intent(context, ECallRunActivity.class);
                        break;
                    case 3:
                        intent = new Intent(context, EDialRunActivity.class);
                        break;
                    case 4:
                        intent = new Intent(context, ECameraRunActivity.class);
                        break;
                }
                break;
            case 4:
                switch (child) {
                    case 0:
                        intent = new Intent(context, ETransitionRunActivity.class);
                        break;
                    case 1:
                        intent = new Intent(context, EPassingRunActivity.class);
                        break;
                    case 2:
                        intent = new Intent(context, EForResultRunActivity.class);
                        break;
                }
                break;
            case 5:
                switch (child) {
                    case 0:
                        intent = new Intent(context, ESimpleRunActivity.class);
                        break;
                    case 1:
                        intent = new Intent(context, EMessageRunActivity.class);
                        break;
                    case 2:
                        intent = new Intent(context, ECustomRunActivity.class);
                        break;
                }
                break;
            case 6:
                switch (child) {
                    case 0:
                        intent = new Intent(context, EListViewRunActivity.class);
                        break;
                    case 1:
                        intent = new Intent(context, ECusListViewRunActivity.class);
                        break;
                    case 2:
                        intent = new Intent(context, EGridViewRunActivity.class);
                        break;
                    case 3:
                        intent = new Intent(context, EWebViewRunActivity.class);
                        break;
                    case 4:
                        intent = new Intent(context, ESearchViewRunActivity.class);
                        break;
                }
                break;
            case 7:
                switch (child) {
                    case 0:
                        intent = new Intent(context, EContextRunActivity.class);
                        break;
                    case 1:
                        intent = new Intent(context, EOptionRunActivity.class);
                        break;
                    case 2:
                        intent = new Intent(context, EPopUpRunActivity.class);
                        break;
                }
                break;
            case 8:
                switch (child) {
                    case 0:
                        intent = new Intent(context, EActLifeRunActivity.class);
                        break;
                    case 1:
                        intent = new Intent(context, EFragLifeRunActivity.class);
                        break;
                    case 2:
                        intent = new Intent(context, EListFragRunActivity.class);
                        break;
                    case 3:
                        intent = new Intent(context, EDialogFragRunActivity.class);
                        break;
                }
                break;
            case 9:
                switch (child) {
                    case 0:
                        intent = new Intent(context, EFadeRunActivity.class);
                        break;
                    case 1:
                        intent = new Intent(context, EZoomRunActivity.class);
                        break;
                    case 2:
                        intent = new Intent(context, ERotateRunActivity.class);
                        break;
                    case 3:
                        intent = new Intent(context, EBounceRunActivity.class);
                        break;
                    case 4:
                        intent = new Intent(context, EBlinkRunActivity.class);
                        break;
                }
                break;
            case 10:
                switch (child) {
                    case 0:
                        intent = new Intent(context, ESharedRunActivity.class);
                        break;
                    case 1:
                        intent = new Intent(context, EInternalRunActivity.class);
                        break;
                    case 2:
                        intent = new Intent(context, EExternalRunActivity.class);
                        break;
                    case 3:
                        intent = new Intent(context, EPublicRunActivity.class);
                        break;
                    case 4:
                        intent = new Intent(context, ECacheRunActivity.class);
                        break;
                }
                break;
            case 11:
                switch (child) {
                    case 0:
                        intent = new Intent(context, EInsertRunActivity.class);
                        break;
                    case 1:
                        intent = new Intent(context, EReadRunActivity.class);
                        break;
                    case 2:
                        intent = new Intent(context, EUpdateRunActivity.class);
                        break;
                    case 3:
                        intent = new Intent(context, EDeleteRunActivity.class);
                        break;
                }
                break;

        }
        if (intent != null) {
            context.startActivity(intent);
            ((Activity) context).overridePendingTransition(R.anim.anim_exit_left,R.anim.anim_enter_left);
        }
    }


    @Override
    public boolean isChildSelectable(int groupPosition, int childPosition) {
        return false;
    }
}
