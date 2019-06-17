package com.example.androidforbeginner.Quiz;

import android.content.Intent;
import android.os.SystemClock;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.Chronometer;
import android.widget.TextView;
import android.widget.Toast;

import com.example.androidforbeginner.QuizFragment;
import com.example.androidforbeginner.R;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class QuestionActivity extends AppCompatActivity {

        Chronometer chronometer;
        TextView txtQuestion,txtAnswerA,txtAnswerB,txtAnswerC,txtAnswerD,txtQuestionNumber;
        private int index;
        private int questionNumber;
        private String answerRight;
        ArrayList<Question> questionArrayList;
        boolean answer = false;
        int score;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_question);

            Toolbar toolbar = findViewById(R.id.toolbar);
            setSupportActionBar(toolbar);
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);


            chronometer = findViewById(R.id.chronometer);
            txtAnswerA = findViewById(R.id.txt_answerA);
            txtAnswerB = findViewById(R.id.txt_answerB);
            txtAnswerC = findViewById(R.id.txt_answerC);
            txtAnswerD = findViewById(R.id.txt_answerD);
            txtQuestion = findViewById(R.id.txt_question);
            txtQuestionNumber = findViewById(R.id.txt_questionNumber);

            chronometer.setBase(SystemClock.elapsedRealtime() + (20 * 60000 + 0 * 1000));
            chronometer.start();

            BottomNavigationView navigationView = findViewById(R.id.bottom_navigation);
            navigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
                @Override
                public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                    switch (menuItem.getItemId()) {
                        case R.id.action_next:
                            setItemNext();
                            break;
                    }
                    return true;
                }
            });

            // set first question
            index = 0;
            score = 0;
            questionNumber = 1;
            txtQuestionNumber.setText(questionNumber+"/10");

            setQuestion();
            setClickTextView();

        }

        private void setQuestion() {
            questionArrayList = QuestionData.getData();
            setData();
        }

        private void setClickTextView() {
            txtAnswerA.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    setAnswerRight(v);
                    setEnableTextView(false);
                    answer = true;
                }
            });
            txtAnswerB.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    setAnswerRight(v);
                    setEnableTextView(false);
                    answer = true;
                }
            });
            txtAnswerC.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    setAnswerRight(v);
                    setEnableTextView(false);
                    answer = true;
                }
            });
            txtAnswerD.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    setAnswerRight(v);
                    setEnableTextView(false);
                    answer = true;
                }
            });
        }

        private void setAnswerRight(View v) {
            TextView textView = (TextView) v;
            if (textView.getText().toString() == answerRight) {
                textView.setBackgroundColor(getResources().getColor(R.color.right));
                score++;
            } else {
                if (txtAnswerA.getText().toString() == answerRight)
                    txtAnswerA.setBackgroundColor(getResources().getColor(R.color.right));
                else if (txtAnswerB.getText().toString() == answerRight)
                    txtAnswerB.setBackgroundColor(getResources().getColor(R.color.right));
                else if (txtAnswerC.getText().toString() == answerRight)
                    txtAnswerC.setBackgroundColor(getResources().getColor(R.color.right));
                else if (txtAnswerD.getText().toString() == answerRight)
                    txtAnswerD.setBackgroundColor(getResources().getColor(R.color.right));

                textView.setBackgroundColor(getResources().getColor(R.color.wrong));
            }
        }

        private void setEnableTextView(boolean value) {
            txtAnswerA.setEnabled(value);
            txtAnswerB.setEnabled(value);
            txtAnswerC.setEnabled(value);
            txtAnswerD.setEnabled(value);
        }

        private void setItemNext() {
            if (answer) {
                if (index < questionArrayList.size()) {
                    setBackGround();
                    setEnableTextView(true);

                    index++;
                    questionNumber++;
                    if (index < 10) {
                        txtQuestionNumber.setText(questionNumber + "/10");
                        setData();
                    } else {
                        Intent intent = new Intent();
                        intent.putExtra("score",score+"/10");
                        setResult(QuizFragment.REQUEST_CODE,intent);
                        finish();
                    }
                }
            }else
                Toast.makeText(this, "You don't choose answer ! Let you choose, Please !", Toast.LENGTH_SHORT).show();

        }

        private void setData() {
            txtQuestion.setText(questionArrayList.get(index).getQuestion());
            answerRight = questionArrayList.get(index).getAnswerRight();

            List<String> answerList = questionArrayList.get(index).getAnswerList();
            Collections.shuffle(answerList);

            // set answer to four text view
            txtAnswerA.setText(answerList.get(0));
            txtAnswerB.setText(answerList.get(1));
            txtAnswerC.setText(answerList.get(2));
            txtAnswerD.setText(answerList.get(3));
        }
        private void setBackGround() {
            txtAnswerA.setBackgroundResource(R.drawable.bg_stroke);
            txtAnswerB.setBackgroundResource(R.drawable.bg_stroke);
            txtAnswerC.setBackgroundResource(R.drawable.bg_stroke);
            txtAnswerD.setBackgroundResource(R.drawable.bg_stroke);
        }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                finish();
                overridePendingTransition(R.anim.anim_enter_right,R.anim.anim_exit_right);
                break;
        }
        return super.onOptionsItemSelected(item);
    }
    }
