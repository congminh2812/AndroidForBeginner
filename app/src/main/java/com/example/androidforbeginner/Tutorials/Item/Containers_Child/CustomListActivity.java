package com.example.androidforbeginner.Tutorials.Item.Containers_Child;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.widget.TextView;

import com.example.androidforbeginner.R;
import com.example.androidforbeginner.StatusBar;

public class CustomListActivity extends AppCompatActivity {
    TextView rowOne,rowTwo,rowThree,rowFour,code11,code12,code13,code14;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_list);
        setTitle(getString(R.string.custom_lv));
        StatusBar.changingStatusBar(this);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        rowOne = findViewById(R.id.row_one_text_view);
        rowTwo = findViewById(R.id.row_two_text_view);
        rowThree = findViewById(R.id.row_three_text_view);
        rowFour = findViewById(R.id.row_four_text_view);
        code11 = findViewById(R.id.code1);
        code12 = findViewById(R.id.code2);
        code13 = findViewById(R.id.code3);
        code14 = findViewById(R.id.code4);

        String row1 = "<b><u>Custom ListView</u></b><br/>" +
                "In Android by default an ArrayAdapter assumes a single textview for each row. <br/>" +
                "i.e. No more than one view is present in a single row. Also ,the default layout used for displaying lists in android android.R.layout.simple_list_item_1 contains a single textview for each row. \n" +
                "Thus whenever we want to have more than one view in a single row we need to make our own custom layout file.<br/>" +
                "<b>Steps of Creating Custom ListView: </b><br/>" +
                "1. Prepare the Data Sources \n";

         String row2 = "2. Create a custom layout i e say custom_row.xm w is wi •e me ow t e items in t e row s ou s appear in the list \n";


          String row3 = "Define the custom Adapter extending the Array Adapter Class since array adapter by default displays only one text view in a row. <br/>" +
                "3. Create a Java Class (say CustomAdapter) extending ArrayAdapter<br/>" +
                "4. Override the Default constructor of ArrayAdapter<br/>" +
                "5. Inflate the custom layout in getView0 Method which will get the view at the specified position <br/>" +
                "6. Get the Java view object of the XML views";

           String row4 = "7. Create a reference of your Adapter and pass the required parameters and set the adapter to the Listview. ";


        String code1= "String [] titles={'Title1','Title2','Title3','Title4','Title5'};\n" +
                "                String [] descriptions={'Descriptionl','Description2','Description3','Description4'} \n" +
                "                int [] images={R.drawable.imgl,R.drawable.img2,R.drawable.img3,R.drawable.img4}";
        String code2 = " <?xml version=1 .0 encoding=utf-8?> \n" +
                "                <RelativeLayout \n" +
                "                android : orientation=vertical \n" +
                "                android : layout_width=match_parent \n" +
                "                android: layout_height=match_parent>\n" +
                "                 <ImageView+\n" +
                "                android: layout_width=wrap_content \n" +
                "                android: layout_height=wrap_content \n" +
                "                android : id=@+id/idPic \n" +
                "                android : src=@drawable/ic_launcher/> \n" +
                "                <TextView\n" +
                "                android : layout_width=match_parent \n" +
                "                android: layout_height=wrap_content \n" +
                "                android : id=@+id/idTitle \n" +
                "                android: text=Title android : textSize=20sp\n" +
                "                 android : layout_toRightOf=@id/idPic /> \n" +
                "                <TextView\n" +
                "                 android:layout_width=match_parent \n" +
                "                android:layout_height=wrap_content \n" +
                "                android:id=@+id/idDescription \n" +
                "                android:text=Description Comes Here \n" +
                "                android:layout_below=@id/idTitle \n" +
                "                android: layout_toRightOf=@id/idPic/>\n" +
                "</RelativeLayout>";
        String code3= "  class MyAdapter extends ArrayAdapter \n" +
                "       {  \n" +
                "                int[] imageArray; \n" +
                "                String[] titleArray; \n" +
                "                String[] descArray; \n" +
                "          public MyAdapter(Context context,String[] titles1,String[] descriptions1,int [] img1\n" +
                "                 //Overriding Default Constructor off ArratAdapter \n" +
                "                super(context, R.layout.custom_row,R.id.idTitle,titles); \n" +
                "                this. imageArray=img1; \n" +
                "                this.titleArray=titles1; \n" +
                "                this.descArray=descriptions1; \n" +
                "           }\n" +
                "       @NonNull\n" +
                "        @Override \n" +
                "        public View getView(int position, View convertView, ViewGroup parent) \n" +
                "        { \n" +
                "                //Inflating the layout \n" +
                "                LayoutInflater inflater = (LayoutInflater) getContext().getSystemService(Context View row = inflater.inflate(R.layout.custom_row,parent,false);\n" +
                "                //Get the reference to the view objects \n" +
                "                ImageView mylmage = (ImageView) row.findViewByld(R.id.idPic); \n" +
                "                TextView myTitle = (TextView) row.findViewById(R.id.idTitle); \n" +
                "                TextView myDescription = (TextView) row.findViewByld(R.id.idDescription); \n" +
                "                //Providing the element of an array by specifying its position \n" +
                "                myImage.setImageResource(imageArray[position]); \n" +
                "                myTitle.setText(titleArray[position]); myDescription.setText(descArray[position]); \n" +
                "                return row; \n" +
                "        }\n" +
                " }\n" +
                "";
        String code4 = "lv = (ListView) findViewById(R.id.idListView); \n" +
                "MyAdapter adapter = new MyAdapter(this,titles,descriptions,images); \n" +
                "lv.setAdapter(adapter);";

        rowOne.setText(android.text.Html.fromHtml(row1));
        rowTwo.setText(android.text.Html.fromHtml(row2));
        rowThree.setText(android.text.Html.fromHtml(row3));
        rowFour.setText(android.text.Html.fromHtml(row4));
        code11.setText(code1);
        code12.setText(code2);
        code13.setText(code3);
        code14.setText(code4);
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            finish();
            overridePendingTransition(R.anim.anim_enter_right, R.anim.anim_exit_right);
        }
        return super.onOptionsItemSelected(item);
    }
}
