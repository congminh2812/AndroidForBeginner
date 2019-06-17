package com.example.androidforbeginner;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ExpandableListView;

import com.example.androidforbeginner.Examples.Example;
import com.example.androidforbeginner.Examples.ExampleExpandAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ExampleFragment extends Fragment {
    public static final String TAG = "ExampleFragment";
    private HashMap<String, List<Example>> myChild;
    private List<String> myHeader;
    ExampleExpandAdapter adapter;
    ExpandableListView expandableListView;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.example_fragment,container,false);
        expandableListView = view.findViewById(R.id.expand_list_view);

        initData();


        return view;
    }

//    public ExampleExpandAdapter getAdapter() {
//        return adapter;
//    }

    @Override
    public void onResume() {
        super.onResume();
        adapter = new ExampleExpandAdapter(getContext(),myChild,myHeader);
        expandableListView.setAdapter(adapter);
        expandableListView.setOnGroupClickListener(new ExpandableListView.OnGroupClickListener() {
            @Override
            public boolean onGroupClick(ExpandableListView parent, View v, int groupPosition, long id) {
                return true;
            }
        });
        for (int i = 0; i < adapter.getGroupCount(); i++) {
            expandableListView.expandGroup(i);
        }
    }

    public void expandAll() {
        int count = adapter.getGroupCount();
        Log.v("MyListAdapter",count+": size");
        for (int i = 0; i < count; i++){
            expandableListView.expandGroup(i);
        }
    }

    public void filter(String s) {
        HashMap<String, List<Example>> myChild2 = new HashMap<>();
        List<String> myHeader2 = new ArrayList<>();

        if (s.length() == 0) {
            adapter = new ExampleExpandAdapter(getContext(), myChild,myHeader);
            expandableListView.setAdapter(adapter);
            expandAll();
        } else {
            for (String string : myHeader) {
                List<Example> exampleList = new ArrayList<>();
                for (Example example : myChild.get(string)) {
                    if (example.getTitle().toLowerCase().contains(s)) {
                        exampleList.add(example);
                    }
                }
                if (exampleList.size() != 0) {
                    myChild2.put(string, exampleList);
                    myHeader2.add(string);
                }
            }
            adapter = new ExampleExpandAdapter(getContext(),myChild2,myHeader2);
            Log.v("MyListAdapter",myHeader2.size()+": size 2");
            expandableListView.setAdapter(adapter);
            expandAll();
        }

        }

        private void initData() {
        myChild = new HashMap<>();
        myHeader = new ArrayList<>();
        myHeader.add(getString(R.string.widget));
        myHeader.add(getString(R.string.image_media));
        myHeader.add(getString(R.string.date_time));
        myHeader.add(getString(R.string.implicit));
        myHeader.add(getString(R.string.explicit));
        myHeader.add(getString(R.string.toast));
        myHeader.add(getString(R.string.container));
        myHeader.add(getString(R.string.menu).replace("\n",""));
        myHeader.add(getString(R.string.activities_fragments).replace("\n",""));
      //  myHeader.add(getString(R.string.services).replace("\n",""));
//        myHeader.add(getString(R.string.telephony));
//        myHeader.add(getString(R.string.wifi));
        myHeader.add(getString(R.string.animation));
        myHeader.add(getString(R.string.datastorage).replace("\n",""));
        myHeader.add(getString(R.string.sqlite).replace("\n",""));
//        myHeader.add(getString(R.string.notification).replace("\n",""));
//        myHeader.add(getString(R.string.xml_json).replace("\n",""));
//        myHeader.add(getString(R.string.material));

        List<Example> widgets = new ArrayList<>();
        widgets.add(new Example(R.drawable.textview,"Text View"));
        widgets.add(new Example(R.drawable.image_button,"Button"));
        widgets.add(new Example(R.drawable.image_edittext,"EditText"));
        widgets.add(new Example(R.drawable.image_radio,"RadioButton"));
        widgets.add(new Example(R.drawable.image_checkbox,"CheckBox"));
        widgets.add(new Example(R.drawable.image_rating,"RatingBar"));
        widgets.add(new Example(R.drawable.image_progress,"ProgressBar"));
        widgets.add(new Example(R.drawable.seekbar,"SeekBar"));
        widgets.add(new Example(R.drawable.switcher,"Switch"));
        widgets.add(new Example(R.drawable.image_toggle,"ToggleButton"));
        widgets.add(new Example(R.drawable.image_spinner,"Spinner"));
        widgets.add(new Example(R.drawable.image_auto,"AutoComplete TextView"));
        widgets.add(new Example(R.drawable.multiauto,"MultiAutoComplete TextView"));
        widgets.add(new Example(R.drawable.checkedtextview,"CheckedTextView"));
        widgets.add(new Example(R.drawable.textswitcher,"TextSwitcher"));
        widgets.add(new Example(R.drawable.imageswitcher,"ImageSwitcher"));
        widgets.add(new Example(R.drawable.adapterviewflipper,"AdapterViewFlipper"));


        List<Example> images = new ArrayList<>();
        images.add(new Example(R.drawable.image_button,"ImageButton"));
        images.add(new Example(R.drawable.image_view,"ImageView"));
        images.add(new Example(R.drawable.video,"VideoView"));

        List<Example> dateTime = new ArrayList<>();
        dateTime.add(new Example(R.drawable.textclock,"TextClock"));
        dateTime.add(new Example(R.drawable.image_date,"DatePicker"));
        dateTime.add(new Example(R.drawable.image_time,"TimePicker"));
        dateTime.add(new Example(R.drawable.chronometer,"Chronometer"));

        List<Example> implicit = new ArrayList<>();
        implicit.add(new Example(R.drawable.email,"Email"));
        implicit.add(new Example(R.drawable.map,"Maps"));
        implicit.add(new Example(R.drawable.call   ,"Phone Call"));
        implicit.add(new Example(R.drawable.dial,"Phone Dial"));
        implicit.add(new Example(R.drawable.camera,"Camera"));

        List<Example> explicit = new ArrayList<>();
        explicit.add(new Example(R.drawable.transition,"Activity Transition"));
        explicit.add(new Example(R.drawable.passing,"Passing Value from one Activity to another Activity"));
        explicit.add(new Example(R.drawable.activityforresult   ,"StartActivityForResult"));
//        explicit.add(new Example(R.drawable.facebook,"Facebook"));
//        explicit.add(new Example(R.drawable.twitter,"Twitter"));
//        explicit.add(new Example(R.drawable.whatsapp,"Whatsapp"));
//        explicit.add(new Example(R.drawable.google,"GooglePlus"));

        List<Example> toast = new ArrayList<>();
        toast.add(new Example(R.drawable.toast4,"Simple Toast"));
        toast.add(new Example(R.drawable.toast5,"Positioning Toast Message"));
        toast.add(new Example(R.drawable.toast6   ,"Custom Toast"));

        List<Example> container = new ArrayList<>();
        container.add(new Example(R.drawable.container1,"ListView"));
        container.add(new Example(R.drawable.container2,"Custom ListView"));
       // container.add(new Example(R.drawable.container3   ,"Expandable ListView"));
        container.add(new Example(R.drawable.container4,"GridView"));
        container.add(new Example(R.drawable.container5,"WebView"));
        container.add(new Example(R.drawable.container6   ,"SearchView"));

        List<Example> menu = new ArrayList<>();
        menu.add(new Example(R.drawable.menu1,"Context Menu"));
        menu.add(new Example(R.drawable.menu2,"Option Menu"));
        menu.add(new Example(R.drawable.menu3   ,"PopUp Menu"));

        List<Example> activity = new ArrayList<>();
        activity.add(new Example(R.drawable.activity1,"Activity Lifecycle"));
        activity.add(new Example(R.drawable.activity2,"Fragment Lifecycle"));
//        activity.add(new Example(R.drawable.activity3   ,"Fragment And Activity Lifecycle Combined"));
//        activity.add(new Example(R.drawable.activity4,"InterFragment Communication"));
        activity.add(new Example(R.drawable.activity5,"List Fragment"));
        activity.add(new Example(R.drawable.activity6   ,"Dialog Fragment"));

//        List<Example> service = new ArrayList<>();
//        service.add(new Example(R.drawable.service1,"Service Lifecycle"));
//        service.add(new Example(R.drawable.service2,"Service Example"));

//        List<Example> telephony = new ArrayList<>();
//        telephony.add(new Example(R.drawable.telephone1,"Phone Details"));
//        telephony.add(new Example(R.drawable.telephone2,"Read Contacts"));
//        telephony.add(new Example(R.drawable.telephone3   ,"Read SMS"));
//        telephony.add(new Example(R.drawable.telephone4,"Send SMS"));
//
//        List<Example> wifi = new ArrayList<>();
//        wifi.add(new Example(R.drawable.wifi1,"Change Wifi State"));
//        wifi.add(new Example(R.drawable.wifi2,"Get Wifi Info"));
//        wifi.add(new Example(R.drawable.wifi3   ,"Get Wifi List"));

        List<Example> animation = new ArrayList<>();
        animation.add(new Example(R.drawable.pic1,"Fade"));
        animation.add(new Example(R.drawable.pic2,"Zoom"));
        animation.add(new Example(R.drawable.pic3   ,"Rotate"));
//        animation.add(new Example(R.drawable.pic4,"Move"));
//        animation.add(new Example(R.drawable.pic5,"Slide"));
        animation.add(new Example(R.drawable.pic6   ,"Bounce"));
        animation.add(new Example(R.drawable.pic7,"Blink"));
//        animation.add(new Example(R.drawable.pic8,"Sequential"));
//        animation.add(new Example(R.drawable.image_fag_xml   ,"Together"));

        List<Example> datastorage = new ArrayList<>();
        datastorage.add(new Example(R.drawable.dpic1,"SharedPreference"));
        datastorage.add(new Example(R.drawable.dpic2,"Internal Storage"));
        datastorage.add(new Example(R.drawable.dpic3   ,"External Storage"));
        datastorage.add(new Example(R.drawable.dpic4,"External Storage Public Directory"));
        datastorage.add(new Example(R.drawable.dpic5,"Cache Storage"));

        List<Example> sqlite = new ArrayList<>();
        sqlite.add(new Example(R.drawable.spic1,"SQLite Insert"));
        sqlite.add(new Example(R.drawable.spic2,"SQLite Read"));
        sqlite.add(new Example(R.drawable.spic3   ,"SQLite Update"));
        sqlite.add(new Example(R.drawable.spic4,"SQLite Delete"));
        sqlite.add(new Example(R.drawable.spic4,"SQLite Delete"));

//        List<Example> notification = new ArrayList<>();
//        notification.add(new Example(R.drawable.npic1,"Notification"));
//        notification.add(new Example(R.drawable.npic2,"InboxStyle Notification"));
//        notification.add(new Example(R.drawable.npic3   ,"BigTextStyle Notification"));
//        notification.add(new Example(R.drawable.npic4,"BigPictureStyle Notification"));
//
//
//        List<Example> xmlJson = new ArrayList<>();
//        xmlJson.add(new Example(R.drawable.json,"JSON Parsing"));
//        xmlJson.add(new Example(R.drawable.xml,"XML Parsing"));
//
//        List<Example> materialDesign = new ArrayList<>();
//        materialDesign.add(new Example(R.drawable.mpic1,"TextInputEditText"));
//        materialDesign.add(new Example(R.drawable.mpic2,"FloatingActionButton"));
//        materialDesign.add(new Example(R.drawable.mpic3,"SnackBars"));
//        materialDesign.add(new Example(R.drawable.mpic4,"Bottom Navigation"));
//        materialDesign.add(new Example(R.drawable.mpic5,"Bottom Sheets"));
//        materialDesign.add(new Example(R.drawable.mpic6,"Navigation Drawer"));
//        materialDesign.add(new Example(R.drawable.mpic6,"Navigation Drawer"));

        myChild.put(myHeader.get(0),widgets);
        myChild.put(myHeader.get(1),images);
        myChild.put(myHeader.get(2),dateTime);
        myChild.put(myHeader.get(3),implicit);
        myChild.put(myHeader.get(4),explicit);
        myChild.put(myHeader.get(5),toast);
        myChild.put(myHeader.get(6),container);
        myChild.put(myHeader.get(7),menu);
        myChild.put(myHeader.get(8),activity);
      //  myChild.put(myHeader.get(9),service);
       // myChild.put(myHeader.get(9),telephony);
        //myChild.put(myHeader.get(9),wifi);
        myChild.put(myHeader.get(9),animation);
        myChild.put(myHeader.get(10),datastorage);
        myChild.put(myHeader.get(11),sqlite);
//        myChild.put(myHeader.get(14),notification);
//        myChild.put(myHeader.get(15),xmlJson);
//        myChild.put(myHeader.get(16),materialDesign);
    }

}
