package com.example.androidforbeginner.Quiz;

import java.util.ArrayList;
import java.util.Arrays;

public class QuestionData {

    public static ArrayList<Question> getData() {
        ArrayList<Question> questionArrayList = new ArrayList<>();
        questionArrayList.add(new Question("Which Database is Automatically supplied to you in Android?",
                "SQLite",
                new ArrayList<>(Arrays.asList(new String[]{"SQLite","Apache", "Mysql", "Oracal"}))));
        questionArrayList.add(new Question("On which Thread Services work in Android?",
                "Main Thread",
                new ArrayList<>(Arrays.asList(new String[]{"Own Thread","Worker Thread", "Background Thread", "Main Thread"}))));
        questionArrayList.add(new Question("What built in database is Android shipped with?",
                "SQLite",
                new ArrayList<>(Arrays.asList(new String[]{"SQLite","Apache", "Mysql", "Oracal"}))));
        questionArrayList.add(new Question("Which field accepts only digits?",
                "android:digits",
                new ArrayList<>(Arrays.asList(new String[]{"android:capitalize","android:digits", "android:digitsOnly", "android:num"}))));
        questionArrayList.add(new Question("Is it mandatory to call onCreate() in android?",
                "No",
                new ArrayList<>(Arrays.asList(new String[]{"Yes","No", "Depends on minSdk version", "Depends on target api level"}))));
        questionArrayList.add(new Question("Whats is GCM in Android?",
                "Google Count Messaging",
                new ArrayList<>(Arrays.asList(new String[]{"Google Message pack","Google Count Messaging", "Google Could Messaging", "Geo Message pack"}))));
        questionArrayList.add(new Question("What is ANR in Android?",
                "Application Not Responding",
                new ArrayList<>(Arrays.asList(new String[]{"Dialog box is called as ANR","Application Not Responding", "Android Not Responding", "None of the above"}))));
        questionArrayList.add(new Question("Is it possible to have an activity without UI in android?",
                "Yes",
                new ArrayList<>(Arrays.asList(new String[]{"No","Yes", "It will give run time error", "Cant say"}))));
        questionArrayList.add(new Question("What is the time limit of broadcast receiver in Android?",
                "10sec",
                new ArrayList<>(Arrays.asList(new String[]{"15sec","5sec", "1 hour", "10sec"}))));
        questionArrayList.add(new Question("We can pass Data between Activities in Android using-",
                "Intent",
                new ArrayList<>(Arrays.asList(new String[]{"Intent","Content Provider", "Broadcast Receiver", "None of the above"}))));

        return questionArrayList;
    }
}
