package com.example.androidforbeginner;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.example.androidforbeginner.Quiz.QuestionActivity;

public class QuizFragment extends Fragment {
    public static final String TAG = "QuizFragment";
    public static final int REQUEST_CODE = 123;
    TextView txtScore;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.quiz_fragment,container,false);
        Button button = view.findViewById(R.id.btn_start);
        txtScore = view.findViewById(R.id.txt_score);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), QuestionActivity.class);
                startActivityForResult(intent,REQUEST_CODE);
            }
        });
        return view;
    }
    @Override
    public void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == REQUEST_CODE && resultCode != 0) {
            String score = data.getStringExtra("score");
            txtScore.setText("Score is : "+score);
        }
    }

}
