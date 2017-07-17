package me.a3zcs.courtcounter.courtcounter;

import android.arch.lifecycle.ViewModel;

/**
 * Created by root on 17/07/17.
 */

public class ScoreModel extends ViewModel {
    int TeamA;
    int TeamB;

    public int getTeamA() {
        return TeamA;
    }

    public void setTeamA(int teamA) {
        TeamA = teamA;
    }

    public int getTeamB() {
        return TeamB;
    }

    public void setTeamB(int teamB) {
        TeamB = teamB;
    }
}
