package com.example.androidforbeginner.Tutorials.Item.PhpMySQL_Child;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.widget.TextView;

import com.example.androidforbeginner.R;

public class LoginActivity extends AppCompatActivity {

    TextView rowOne;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        setTitle(getString(R.string.mysql_php));

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        rowOne = findViewById(R.id.row_one_text_view);

        String row1 = "MYSQL Login:-Steps of Creating XML File:-Create a Layout file as shown below. It contains two EditText fields to get the UserName and Password and a Button.\n" +
                "<?xml version=\"1.0\" encoding=\"utf-8\"?> \n" +
                "<LinearLayout xmlns:android=\"http://schemas.android.com/apk/res/android.com/apk/res/android\" \n" +
                "xmlns:tools=\"http://schemas.android.com/tools\" \n" +
                "android:id=\"@+id/activity_main\" \n" +
                "android:layout_width=\"match_parent\" \n" +
                "android:layout_height=\"match_parent\" \n" +
                "android:orientation=\"vertical\" android:padding=\"16dp\" \n" +
                "tools:context=\"com.example.arjun.mysql.MainActivity\"› \n" +
                "<EditText\n" +
                "\tandroid:layout width=\"match parent\" android:layout_height=\"wrap_content\" \n" +
                "android:id=\"@+id/idUserName\"\n" +
                " android:hint=\"UserName\" /> \n" +
                "<EditText\n" +
                " \tandroid:layout width=\"match_parent\" \n" +
                "android:layout_height=\"wrap_content\" \n" +
                "android:id=\"@+id/idPassword\" \n" +
                "android:hint=\"Password\" /> \n" +
                "<Button \n" +
                "android:layout width=\"match_parent\" \n" +
                "android:layout_height=\"wrap_content\" \n" +
                "android:id=\"@+id/idBtnLogin\"\n" +
                " android:text=\"Login\" /> \n" +
                "</LinearLayout>\n" +
                "\n" +
                "Steps of Creating  Java File:-\n" +
                " 1 . Create a new Java Class (say Background Worker) extending AsyncTask \n" +
                "public class BackGroundWorker extends AsyncTask <String, String, String>{ } \n" +
                "2. Implement Methods:- \n" +
                "public class BackGroundWorker extends AsyncTask <String, String, String>{ \n" +
                "@Override protected String doInBackground(String... params) { \n" +
                "return null;\n" +
                " }\n" +
                "}\n" +
                "\n" +
                "3. Add onPreExecute and onPostExecute method:- \n" +
                "public class BackGroundWorker extends AsyncTask <String, String, String>{ \n" +
                "@Override\n" +
                " protected String doInBackground(String... params) { \n" +
                "return null; \n" +
                "} \n" +
                "@Override\n" +
                " protected void onPreExecute() {\n" +
                " super. onPreExecute(); \n" +
                "@Override protected void onPostExecute(String s) { \n" +
                "super. onPostExecute(s); \n" +
                "} \n" +
                "4. Create a Constructor taking Context as a parameter. \n" +
                "BackGroundWorker(Context ctx){ }\n" +
                "\n" +
                "5. Create a Context object and assign this object to the Context of the constructor. \n" +
                "Context context; \n" +
                "BackGroundWorker(Context ctx){\n" +
                " context=this.ctx; \n" +
                "} \n" +
                "6. Call your php file using the url:- \n" +
                "String login_url=\"http://myandroid-tester.esy.es/login.php\"; \n" +
                "URL url = new URL(login_url); \n" +
                "7. Create an Object of class HttpURLConnection and obtain a new HttpURLConnection by calling URL.openConnection()  and casting the result to HttpURLConnection. \n" +
                "HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection(); \n" +
                "8. Set the method for url request as \"POST\" on HttpURLConnection object. \n" +
                "httpURLConnection.setRequestMethod(\"POST\");\n" +
                "9. Set doOutput() as true since we are using \"POST\" and we want to allow sending a body via the connection. \n" +
                "httpURLConnection.setDoOutput(true); \n" +
                "10. Create an object of OutputStream and get the OutputStream from our httpURLConnection. A program uses an output stream to write data to a destination, one item at time. \n" +
                "OutputStream outputStream = httpURLConnection.getOutputStream();\n" +
                "11. Encode the characters obtained into bytes using a specified charset.This can be done by using OutputStreamWriter. \n" +
                "OutputStreamWriter outputStreamWriter = new OutputStreamWriter(outputStream,\"UTF-8\"; \n" +
                "12. To avoid frequent converter invocations wrap an OutputStreamWriter within a BufferedWriter. \n" +
                "BufferedWriter bufferedWriter = new BufferedWriter(outputStreamWriter);\n" +
                "\n" +
                "13. Encode the url using URLEncoder class. \n" +
                "String post_data= URLEncoder.encode(\"username\",\"UTF-8\")+\"=\"+URLEncoder.encode(user_name,”UTF-8”)+”&”\n" +
                "+URLEncoder.encode(\"password\",\"UTF-8\")+\"=\"URLEncoder. encode(\"password\",\"UTF-8\");\n" +
                "14. Write the data into bufferedWriter and flush and close it. \n" +
                "bufferedWriter.write(post_data); bufferedWriter.flush(); bufferedWriter.close();\n" +
                "\n" +
                "\n" +
                "1 5. set dolnput() as true since we want to allow reading information from the response. httpURLConnection.setDolnput(true); \n" +
                "16. Create an object of InputStream and get the InputStream from our httpURLConnection.\n" +
                " A program uses an input stream to read data from a source, one item at a time: \n" +
                "InputStream inputStream = httpURLConnection.getInputStream(); \n" +
                "17. Encode the bytes obtained back into characters using a specified charset.This can be done by using InputStreamWriter. \n" +
                "InputStreamWriter inputStreamWriter = new InputStreamWriter(inputStream,\"iso-8859-1\");\n" +
                "\n" +
                "18. To avoid frequent converter invocations wrap an InputStreamWriter within a BufferedReader. Read the data and close InputStreamWriter and BufferedReader. \n" +
                "BufferedReader bufferedReader = new BufferedReader(); \n" +
                "String result=\"\"; String line=\"\"; \n" +
                "while ((line = bufferedReader.readLine())!=null) { \n" +
                "result+=line; \n" +
                "} \n" +
                "bufferedReader.close(); \n" +
                "inputStream.close();\n" +
                "\n" +
                "\n" +
                "19. Disconnect the httpURLConnection. \n" +
                "httpURLConnection.disconnect(); \n" +
                "20. Return the result so obtained. So the complete method would be:- \n" +
                "protected String doInBackground(String... params) { \n" +
                "String type = params[0]; \n" +
                "String user_name = params[1]; \n" +
                "String password = params[2]; \n" +
                "String login_url=\"http://myandroid-tester.esy.es/login.php\";\n" +
                " if(type.equals(\"login\")){ \n" +
                "try { \n" +
                "\tHttpURLConnection  HttpURLConnection = (HttpURLConnection) url.openConecttion();\n" +
                "\t\thttpURLConnection.setRequestMethod(“POST”);\n" +
                "\t\thttpURLConnection.setDoOutput(true);\n" +
                "\t\thttpURLConnection.setDoInput(true);\n" +
                "\tOutputStream output Stream = httpURLConnection.getOutputStream();\n" +
                "\tBufferedWriter  bufferedWriter = new BufferedWriter( new OutputStreamWriter(outputStream,”UTF-8”));\n" +
                "\tString post_data= URLEncoder.encode(‘username’,”UTF-8”)+”=”+URLEncoder.encode(user_name,”UTF-8”)+”&”\n" +
                "\tbufferedWriter.write(post_data);\n" +
                "\tbufferedWriter.fush();\n" +
                "\tbufferedWriter.close();\n" +
                "\tInputStream inputStream = httpURLConnection.getInptStream();\n" +
                "\tBufferedReader bufferedReader = new BufferesdReader (new InputSTreamReader(inputStream,”iso-8859-1”));\n" +
                "\tString result = “”;\n" +
                "\tString line =””;\n" +
                "\t\tWhile((line = bufferedReader.readline())!= null)\n" +
                "\t\t\t\t{ result+=line; } \n" +
                "bufferedReader.close(); \n" +
                "inputStream.close(); \n" +
                "httpURLConnection.disconnect(); \n" +
                "return result; \n" +
                "} catch (IOException e) { \n" +
                "e. printStackTrace();\n" +
                "    }\n" +
                "                        } catch (MalformedURLException e) {\n" +
                " \t     e. printStackTrace(); \n" +
                "}\n" +
                "\t}\n" +
                "} return null;\n" +
                "}\n" +
                "\n" +
                "\t\n" +
                "\n" +
                "\n" +
                "\n" +
                "21. In onPostExecute method show the result. \n" +
                "protected void onPostExecute(String s) { Toast.makeText(context,\"Result:\"+s,Toast.LENGTH_LONG).show();\n";

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
