package me.a3zcs.courtcounter.courtcounter;

/**
 * Created by root on 17/07/17.
 */

import android.support.v7.app.AppCompatActivity;
import android.arch.lifecycle.ViewModelProviders;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import me.a3zcs.courtcounter.courtcounter.databinding.ActivityMainBinding;

/**
 * Created by root on 17/07/17.
 */

class MainActivity extends AppCompatActivity {
    ScoreModel score;
    ActivityMainBinding dataBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        score = ViewModelProviders.of(this).get(ScoreModel.class);
        dataBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        display();

        dataBinding.buttonReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                score.setTeamA(0);
                score.setTeamB(0);
                display();
            }
        });
    }

    public void display() {
        dataBinding.scoreaTextView.setText(String.valueOf(score.getTeamA()));
        dataBinding.scorebTextView.setText(String.valueOf(score.getTeamB()));
    }

    public void addThreePointToA(View view) {
        score.setTeamA(score.getTeamA() + 3);
        display();
    }

    public void addTwoPointTwoToA(View view) {
        score.setTeamA(score.getTeamA() + 2);
        display();
    }

    public void addFreeThrowToA(View view) {
        score.setTeamA(score.getTeamA() + 1);
        display();
    }

    public void addThreePointToB(View view) {
        score.setTeamB(score.getTeamB() + 3);
        display();
    }

    public void addTwoPointToB(View view) {
        score.setTeamB(score.getTeamB() + 2);
        display();
    }

    public void addFreeThrowToB(View view) {
        score.setTeamB(score.getTeamB() + 1);
        display();
    }
}
