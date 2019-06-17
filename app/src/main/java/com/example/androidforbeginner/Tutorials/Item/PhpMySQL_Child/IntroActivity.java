package com.example.androidforbeginner.Tutorials.Item.PhpMySQL_Child;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.widget.TextView;

import com.example.androidforbeginner.R;

public class IntroActivity extends AppCompatActivity {

    TextView rowOne;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro);
        setTitle(getString(R.string.mysql_php));

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        rowOne = findViewById(R.id.row_one_text_view);

        String row1 = "Android PHP and MySQL Database:\n" +
                "-In this Tutorial we are going to learn how to create an Android App using MySQL database. The Android app calls the defined php script to perform the operation which in turns connects to the MySQL Database. \n" +
                "1. Download and install WAMPP which is a local web server. \n" +
                "2. Create a Database and a Table in WAMPP Server. \n" +
                "3. Create File called conn.php  for Database connection. Write this  php script to connect the database:-  \n" +
                "<?php Sclb_name=\"\" ;    //write your database name\n" +
                " $mysql_username=\"\" ;' //write your database name\n" +
                "$mysgl_password=\"\" ;   //write your database name\n" +
                "$server_name=\"\" ;          //write your database name\n" +
                " $conn= mysgli_connect($server_name , $mysql_password,$mysql_username,$db_name);\n" +
                "if($conn)\n" +
                "{ echo \"connection success\" ; }\n" +
                "else{ echo \"connection not success\" ; \n" +
                "Go to wampp->www and save this file. Go to your webbrowser and type: localhost://conn.php to check for connection success. \n" +
                "4. Create a File called login.php. Write this  php script inside login.php:- \n" +
                "<?php\n" +
                "require \"conn.php\", Suser_name.\"\", Suser_pass.\"\";\n" +
                " $mysql_query=\"Select * from Employee_Dat $result.mysqli_query($conn,$mysql_query; if(mysqli_num_rows(Sresult)>0){ \n" +
                "echo \"login success\" \n" +
                "}else{ echo \"login failed\" }\n" +
                "?>\n" +
                "Goto  wampp->www and save this file. Go to  your  webbrowser and type: localhost://login.php to check for login success/login failure.\n";

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
