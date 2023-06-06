package sg.edu.rp.c346.id22012027.demoriddlel5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class AnswerActivity2 extends AppCompatActivity {

    TextView textViewAnswer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_answer2);

        textViewAnswer=findViewById(R.id.textView);
        textViewAnswer.setText("in second activity");
        Intent intentReceived = getIntent();
        String questionsSelected = intentReceived.getStringExtra("Question");
        textViewAnswer.setText(questionsSelected + " answer is: Gone");
    }
}