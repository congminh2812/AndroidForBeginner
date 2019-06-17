package com.example.androidforbeginner.Tutorials.Item.DataStorage_Child;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.widget.TextView;

import com.example.androidforbeginner.R;

public class ExternalActivity extends AppCompatActivity {
    TextView rowOne;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_external);
        setTitle(getString(R.string.external));

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        rowOne = findViewById(R.id.row_one_text_view);
        String row1 = "Android External Storage: \n" +
                "Like internal storage, we are able to save or read data from the device external memory such as sdcard. Files saved to the external storage are world-readable and can be modified by the user when they enable USB mass storage to transfer files on a computer. \n" +
                "\n" +
                "How to write to external storage? \n" +
                "1. Adding Permissions In order to read or write files on the external storage, your app must acquire the READ_EXTERNAL_STORAGE or WRITE_EXTERNAL_STORAGE system permissions. If you need to both read and write files, then you need to request only the WRITE_EXTERNAL_STORAGE permission, because it implicitly requires read access as well. \n" +
                "Thus adding WRITE_EXTERNAL_STORAGE in AndroidManifest.xml \n" +
                "<uses-permission android:name=\"android.permission.WRITE_EXTERNAL_STORAGE\"/>\n" +
                "2. Checking media availability Call getExternalStorageState() to check whether the media is available. For example, here are a couple methods you can use to check the availability:\n" +
                "/* Checks if external storage is available for read and write public boolean isExternalStorageWritable() { \n" +
                "\n" +
                "String state = Environment.getExternalStorageState(); \n" +
                "if (Environment.MEDIA_MOUNTED.equals(state)) {\n" +
                " return true; \n" +
                "} \n" +
                "return false;\n" +
                "}\n" +
                "/* Checks if external storage is available to at least read \n" +
                "*/ public boolean isExternalStorageReadable() { \n" +
                "String state = Environment.getExternalStorageState(); \n" +
                "if (Environment.MEDIA_MOUNTED.equals(state) ||Environment.MEDIA MOUNTED_READ ONLY.equals(state)) {\n" +
                " return true; \n" +
                "} return false; \n" +
                "}\n" +
                "3. Get the files directory by calling\n" +
                "a.getExternalStorageFilesDir(String type):\n" +
                "• Create Files specific to your app and are removed when your app in uninstalled \n" +
                "File folder = getExternalStorageFilesDir(\"MyFolder\"); File myfile = new File(folder,\"mydata.txt\"); \n" +
                "b. getExternalStoragePublicDirectory(String type): Create files not just specific to your app and should not be deleted when your app in uninstalled \n" +
                "File folder = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_D( File myfile = new File(folder,\"mydata.txt\"); \n" +
                "4. Use FilelnputStream and FileOutputStream to do the required operation\n" +
                "String string = \"hello world!\";\n" +
                " FileOutputStream fos = openFileOutput(FILENAME, Context.MODE_PRIVATE); fos.write(string.getBytes());\n" +
                " fos.close();\n" +
                "How to read from External Storage? \n" +
                "1. Get the files directory by calling a. getExternalStorageFilesDir(String type): Create Files specific to your app and are removed when your app in uninstalled \n" +
                "File folder = getExternalStorageFilesDir(\"MyFolder\");\n" +
                " File myfile = new File(folder,\"mydata.txt\");\n" +
                "b. getExternalStoragePublicDirectory(String type): Create files not just specific to your app and should not be deleted when your app in uninstalled \n" +
                "File folder = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_D( File myfile = new File(folder,\"mydata.txt\"); \n" +
                "2. Call FilelnputStream() and pass it the name of the file to read. This returns a FilelnputStream. \n" +
                "3. Read bytes from the file with read() Note:\n" +
                "-Since we are going to read data byte by byte we need to append each character.\n" +
                "4. Then close the stream with close(). \n" +
                "FileInputStream fis = openFileInput(FILENAME); int read=-1; StringBuffer buffer= new \n" +
                "StringBuffer(); while(read=fis.read())!=-1) \n" +
                "{ \n" +
                "buffer.append((char)read); \n" +
                "}\n" +
                " fis.close();\n";

        rowOne.setText(row1);
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
