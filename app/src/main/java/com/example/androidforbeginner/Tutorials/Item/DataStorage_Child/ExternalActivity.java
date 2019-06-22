package com.example.androidforbeginner.Tutorials.Item.DataStorage_Child;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.widget.TextView;

import com.example.androidforbeginner.R;
import com.example.androidforbeginner.StatusBar;

public class ExternalActivity extends AppCompatActivity {
    TextView rowOne, rowTwo, rowThree, rowFour, rowFive, rowSix,rowSeven,rowEight,codeOne, codeTwo, codeThree, codeFour, codeFive,codeSix,codeSeven,codeEight;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_external);
        setTitle(getString(R.string.external));
        StatusBar.changingStatusBar(this);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        rowOne = findViewById(R.id.row_one_text_view);
        rowTwo = findViewById(R.id.row_two_text_view);
        rowThree = findViewById(R.id.row_three_text_view);
        rowFour = findViewById(R.id.row_four_text_view);
        rowFive = findViewById(R.id.row_five_text_view);
        rowSix = findViewById(R.id.row_six_text_view);
        rowSeven = findViewById(R.id.row_seven_text_view);
        rowEight = findViewById(R.id.row_eight_text_view);

        codeOne = findViewById(R.id.code1);
        codeTwo = findViewById(R.id.code2);
        codeThree = findViewById(R.id.code3);
        codeFour = findViewById(R.id.code4);
        codeFive = findViewById(R.id.code5);
        codeSix = findViewById(R.id.code6);
        codeSeven = findViewById(R.id.code7);
        codeEight = findViewById(R.id.code8);

        String row1 = "<b><u>Android External Storage:</u></b> <br>" +
                "Like internal storage, we are able to save or read data from the device external memory such as sdcard. Files saved to the external storage are world-readable and can be modified by the user when they enable USB mass storage to transfer files on a computer. <br>" +
                "<br>" +
                "<b>How to write to external storage?</b> <br>" +
                "1. Adding Permissions In order to read or write files on the external storage, your app must acquire the <b>READ_EXTERNAL_STORAGE</b> or <b>WRITE_EXTERNAL_STORAGE</b> system permissions. If you need to both read and write files, then you need to request only the <b>WRITE_EXTERNAL_STORAGE</b> permission, because it implicitly requires read access as well. <br>" +
                "Thus adding <b>WRITE_EXTERNAL_STORAGE</b> in AndroidManifest.xml <br>";
                String code1 = "<uses-permission android:name=\"android.permission.WRITE_EXTERNAL_STORAGE\"/>";
                String row2="2. Checking media availability Call getExternalStorageState() to check whether the media is available. For example, here are a couple methods you can use to check the availability:<br>" +
                "/* Checks if external storage is available for read and write public boolean isExternalStorageWritable() { <br>";
        String code2="String state = Environment.getExternalStorageState(); \n" +
                "if (Environment.MEDIA_MOUNTED.equals(state)) {\n" +
                "   return true; \n" +
                "} \n" +
                "   return false;\n" +
                "}\n";
                String row3= "/* Checks if external storage is available to at least read */";
                String code3= "public boolean isExternalStorageReadable() { \n" +
                "String state = Environment.getExternalStorageState(); \n" +
                "if (Environment.MEDIA_MOUNTED.equals(state) || Environment.MEDIA MOUNTED_READ ONLY.equals(state)) {\n" +
                "   return true; \n" +
                "   } \n" +
                "   return false; \n" +
                "}\n";
                String row4="3. Get the files directory by calling\n" +
                "a.getExternalStorageFilesDir(String type):\n" +
                "• Create Files specific to your app and are removed when your app in uninstalled \n";
                String code4="File folder = getExternalStorageFilesDir(\"MyFolder\"); \n" +
                        "File myfile = new File(folder,\"mydata.txt\"); \n";
                String row5 = "b. getExternalStoragePublicDirectory(String type): Create files not just specific to your app and should not be deleted when your app in uninstalled <br>"
                + "4. Use FilelnputStream and FileOutputStream to do the required operation<br>";
                String code5 = "String string = \"hello world!\";\n" +
                " FileOutputStream fos = openFileOutput(FILENAME, Context.MODE_PRIVATE); \n" +
                "fos.write(string.getBytes());\n" +
                " fos.close();\n";;
                String row6 = "<b>How to read from External Storage?</b> <br>" +
                "1. Get the files directory by calling a. getExternalStorageFilesDir(String type): Create Files specific to your app and are removed when your app in uninstalled <br>";
                String code6 = "File folder = getExternalStorageFilesDir(\"MyFolder\");\n" +
                " File myfile = new File(folder,\"mydata.txt\");\n";
                String row7 = "b. getExternalStoragePublicDirectory(String type): Create files not just specific to your app and should not be deleted when your app in uninstalled <br>";
                String code7 = "File folder = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_D( File myfile = new File(folder,\"mydata.txt\"); \n";
                String row8 = "2. Call FilelnputStream() and pass it the name of the file to read. This returns a FilelnputStream. <br>" +
                "3. Read bytes from the file with read()<br> Note:<br>" +
                "-Since we are going to read data byte by byte we need to append each character.<br>" +
                "4. Then close the stream with close(). <br>";
                String code8 = "FileInputStream fis = openFileInput(FILENAME);\n " +
                        "int read=-1;\n " +
                        "StringBuffer buffer= new \n" +
                "StringBuffer(); \n" +
                "while(read=fis.read())!=-1) \n" +
                "{ \n" +
                "   buffer.append((char)read); \n" +
                "}\n" +
                " fis.close();\n";

        rowOne.setText(android.text.Html.fromHtml(row1));
        rowTwo.setText(android.text.Html.fromHtml(row2));
        rowThree.setText(android.text.Html.fromHtml(row3));
        rowFour.setText(android.text.Html.fromHtml(row4));
        rowFive.setText(android.text.Html.fromHtml(row5));
        rowSix.setText(android.text.Html.fromHtml(row6));
        rowSeven.setText(android.text.Html.fromHtml(row7));
        rowEight.setText(android.text.Html.fromHtml(row8));

        codeOne.setText(code1);
        codeTwo.setText(code2);
        codeThree.setText(code3);
        codeFour.setText(code4);
        codeFive.setText(code5);
        codeSix.setText(code6);
        codeSeven.setText(code7);
        codeEight.setText(code8);

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
