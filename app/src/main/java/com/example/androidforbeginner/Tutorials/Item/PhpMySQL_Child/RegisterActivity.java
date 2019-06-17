package com.example.androidforbeginner.Tutorials.Item.PhpMySQL_Child;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.widget.TextView;

import com.example.androidforbeginner.R;

public class RegisterActivity extends AppCompatActivity {

    TextView rowOne;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        setTitle(getString(R.string.mysql_php));

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        rowOne = findViewById(R.id.row_one_text_view);

        String row1 = "MYSQL Register:- \n" +
                "Steps of Creating XML File:-Create a Layout file as shown below. It contains two EditText fields to get the UserName and Password and a Button. \n" +
                "<?xml version=\"1.0\" encoding=\"utf-8\"?> \n" +
                "<LinearLayout xmlns:android=\"http://schemas.android.com/apk/res/android.com/apk/res/android\" \n" +
                "xmlns:tools=\"http://schemas.android.com/tools\" \n" +
                "android:id=\"@+id/activity_main\" \n" +
                "android:layout_width=\"match_parent\" \n" +
                "android:layout_height=\"match_parent\"\n" +
                " android:orientation=\"vertical\"\n" +
                " android:padding=\"16dp\"\n" +
                " tools:context=\"com.example.arjun.mysql.MainActivity\"›\n" +
                "<EditText\n" +
                " android:layout_width=\"match_parent\"\n" +
                " android:layout_height=\"wrap_content\"\n" +
                " android:hint=\"UserName: \" \n" +
                "android:id=\"@+id/idFullName\" /> \n" +
                "<EditText \n" +
                " android:layout_width=\"match_parent\"\n" +
                " android:layout_height=\"wrap_content\"\n" +
                " android:hint=\"Password: \" \n" +
                "android:id=\"@+id/idPassword\" />\n" +
                " <EditText \n" +
                "android:layout_width=\"match_parent\" \n" +
                "android:layout height=\"wrap_content\" \n" +
                "android:hint=\"Email Id: \" \n" +
                "android:id=\"@+id/idEmailId\" \n" +
                "/> \n" +
                "<EditText \n" +
                "android:layout_width=\"match_parent\" \n" +
                "android:layout_height=\"wrap_content\"\n" +
                " android:hint=\"Cell No: \" \n" +
                "android:id=\"@+id/idCellNo\" I> \n" +
                "<Button \n" +
                "android:layout_width=\"match_parent\" \n" +
                "android:layout height=\"wrap_content\" \n" +
                "android:id=\"@+id/idBtnLogin\"\n" +
                " android:text=\"Login\" /> \n" +
                "</LinearLayout>\n" +
                "\n" +
                "\n" +
                "Steps of Creating Java File:- \n" +
                "1. MainActivity.java Class should be like: \n" +
                "public class MainActivity extends AppCompatActivity { \n" +
                "Button registerBtn; \n" +
                "EditText  txtUserName,txtPassword,txtEmail,txtTel;\n" +
                " @Override \n" +
                "protected void onCreate(Bundle savedInstanceState) {\n" +
                " super.onCreate(savedInstanceState); \n" +
                "setContentView(R.layout.activity_main);\n" +
                " txtUserName= (EditText) findViewById(R.id.idUserName);\n" +
                " txtPassword= (EditText) findViewById(R.id.idPassword); \n" +
                "txtEmail = (EditText) findViewById(R.id.idEmailId);\n" +
                " txtTel = (EditText) findViewById(R.id.idCellNo);\n" +
                "\n" +
                "registerBtn = (Button) findViewById(R.id.idBtnLogin); registerBtn.setOnClickListener(new View.OnClickListener() { \n" +
                "@Override public void onClick(View v) { register(); \n" +
                "}\n" +
                "} ); \n" +
                "private void register() { \n" +
                "String username = txtUserName.getText().toString(); \n" +
                "String password = txtPassword.getText().toString(); \n" +
                "String email = txtEmail.getText().toString(); \n" +
                "String tel = txtTel.getText().toString(); \n" +
                "String type=\"register\"; \n" +
                "BackGroundWorker backGroundWorker = new BackGroundWorker(this);\n" +
                "backGroundWorker.execute(type,username,password,email,tel); \n" +
                "2. Create a new Java Class (say Background Worker) extending AsyncTask \n" +
                "public class BackGroundWorker extends AsyncTask <String, String, String>{ } \n" +
                "3. Implement Methods:-\n" +
                "public class BackGroundWorker extends AsyncTask <String, String, String>{ \n" +
                "@Override protected String doInBackground(String... params) { return null; \n" +
                "4. Add onPreExecute and onPostExecute method:- \n" +
                "public class BackGroundWorker extends AsyncTask <String, String, String>\n" +
                "\n" +
                "public class BackGroundWorker extends AsyncTask <String, String, String>{ \n" +
                "@Override protected String doInBackground(String... params) { \n" +
                "return null; \n" +
                "} \n" +
                "@Override protected void onPreExecute() {\n" +
                " super. onPreExecute(); \n" +
                "}\n" +
                "@Override protected void onPostExecute(String s) { \n" +
                "super.onPostExecute(s);\n" +
                " }\n" +
                "5. Create a Constructor taking Context as a parameter. \n" +
                "BackGroundWorker(Context ctx){ } \n" +
                "6. Create a Context object and assign this object to the Context of the constructor. \n" +
                "Context context; BackGroundWorker(Context ctx){ \n" +
                "context=this.ctx;\n" +
                " }\n" +
                "7. Call your php file using your ur1:- \n" +
                "String register_url=\"http://myandroid-tester.esy.es/register.php\"; URL url = new URL(register_url); \n" +
                "PHP File looks like:- \n" +
                "<?php define('HOSTI,'my_host1); define('USER','my_username'); define('PASS1,1my_password'); define('DB',1my_db_name'); \n" +
                "$con = mysqli_connect(HOST,USER,PASS,DB);\n" +
                "if($_SERVER['REQUEST_METHODI]=1POST'){ \n" +
                "$username = $_POST['username'];\n" +
                " $password = $_POST['password']; \n" +
                "$email = $_POST['email']; \n" +
                "$tel = $_POST['tel']; \n" +
                "if($username == \" || $password == \" ||$email == \" ||$tel == \"){ \n" +
                "echo 'please fill all values';\n" +
                " }else{ \n" +
                "require_once('dbConnect.php'); \n" +
                "$sql = \"SELECT * FROM users WHERE username='$username' OR email='$email'\"; \n" +
                "$check = mysqli_fetch_array(mysqli_query($con,$sql)); \n" +
                "if(isset($check)){\n" +
                "echo 'username or email already exist';\n" +
                "}else{\n" +
                " $sql = \"INSERT INTO users (username,password,email,tel,uid) VALUES('$username', '$password, '$email', '$tel');\n" +
                "if(mysqli_query($con,$sql)){\n" +
                " echo 'successfully registered'; \n" +
                "}else{ \n" +
                "echo 'oops! Please try again!'; \n" +
                "}\n" +
                " }\n" +
                "      mysqli_close($con); \n" +
                "     }\n" +
                "else{ echo 'error'; \n" +
                "} \n" +
                "Note:-You need to replace the credentials with that of yours and host this file.\n" +
                "8. Create an Object of class HttpURLConnection and obtain a new HttpURLConnection by calling URL.openConnection() and casting the result to HttpURLConnection. \n" +
                "HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection(); \n" +
                "9. Set the method for url request as \"POST\" on HttpURLConnection object. \n" +
                "httpURLConnection.setRequestMethod(\"POST\"); \n" +
                "10. Set doOutput() as true since we are using \"POST\" and we want to allow sending a body via the connection.  \n" +
                "11. Create an object of OutputStream and get the OutputStream from our httpURLConnection. A program uses an output stream to write data to a destination, one item at time. \n" +
                "OutputStream outputStream = httpURLConnection.getOutputStream(); \n" +
                "12. .Encode the characters obtained into bytes using a specified charset.This can be done by using OutputStreamWriter. \n" +
                "OutputStreamWriter outputStreamWriter = new OutputStreamWriter(outputtream,”UTF-8”);\n" +
                "13. To avoid frequent converter invocations wrap an OutputStreamWriter within a Buffered Writer. \n" +
                "BufferedWriter bufferedWriter = new BufferedWriter(outputStreamWriter); \n" +
                "14. Encode the url using URLEncoder class. \n" +
                "String post_data =\n" +
                "URLEncoder.encode(\"username\",\"UTF-8\")+\"=\"+URLEncoder.encode(user_name,\"UTF-8\")+\"&\" +URLEncoder.encode(\"password\",\"UTF-8\")+\"=\"+URLEncoder.encode(pass_word,\"UTF-8\")+\"&\" +URLEncoder.encode(\"email\",\"UTF-8\")+\"=\"+URLEncoder.encode(email,\"UTF-8\")+\"&\" +URLEncoder.encode(\"tel\",\"UTF-8\")+\"=\"+URLEncoder.encode(tel,\"UTF-8\"); \n" +
                "\n" +
                "15. Write the data into bufferedWriter and flush and close it. \n" +
                "bufferedWriter.write(post_data); bufferedWriter.flush(); bufferedWriter.close(); \n" +
                "6. set dolnput() as true since we want to allow reading information from the response. httpURLConnection.setDolnput(true);\n" +
                " 17. Create an object of InputStream and get the InputStream from our httpURLConnection. A program uses an input stream to read data from a source, one item at a time: \n" +
                "InputStream inputStream = httpURLConnection.getInputStream();\n" +
                "18. Encode the bytes obtained back into characters using a specified charset.This can be done by using InputStreamWriter. \n" +
                "InputStreamWriter inputStreamWriter = new InputStreamWriter(inputStream,\"iso-8859- \n" +
                "19. To avoid frequent converter invocations wrap an InputStreamWriter within a BufferedReader. Read the data and close InputStreamWriter and BufferedReader. \n" +
                "BufferedReader bufferedReader = new BufferedReader(); \n" +
                "String result=\"\"; \n" +
                "String line=\"\"; \n" +
                "while ((line = bufferedReader.readLine())!=null) {\n" +
                " result+=line;\n" +
                "}\n" +
                "bufferedReader.close(); inputStream.close(); \n" +
                "20. Disconnect the httpURLConnection. \n" +
                "httpURLConnection.disconnect();\n" +
                "\n" +
                "21 Disconnect the httpURLConnection\n" +
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
                "22. In onPostExecute method show the result\n" +
                "Protected void onPostExecute(String s){\n" +
                "\tToast.makeText(context,”Result:”+s,Toast.LENGTH_LONG.SHOW());\n" +
                "}\n";

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
