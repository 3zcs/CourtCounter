package me.a3zcs.courtcounter.courtcounter

import android.arch.lifecycle.ViewModelProviders
import android.databinding.DataBindingUtil
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import me.a3zcs.courtcounter.courtcounter.databinding.ActivityMainBinding

/**
 * Created by root on 17/07/17.
 */

class MainActivity : AppCompatActivity() {
    lateinit var score:SocreModel
    lateinit var dataBinding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        score = ViewModelProviders.of(this).get(SocreModel::class.java)
        dataBinding = DataBindingUtil.setContentView(this,R.layout.activity_main)
        display()

        dataBinding.buttonReset.setOnClickListener {
            score.teamB = 0
            score.teamA = 0

            display()
        }
    }

    fun display(){
        dataBinding.scoreaTextView.text = score.teamA.toString()
        dataBinding.scorebTextView.text = score.teamB.toString()
    }

    fun addThreePointToA(view :View){
        score.teamA+=3
        display()
    }

    fun addTwoPointTwoToA(view :View){
        score.teamA+=2
        display()
    }

    fun addFreeThrowToA(view :View){
        score.teamA+=1
        display()
    }

    fun addThreePointToB(view :View){
        score.teamB+=3
        display()
    }

    fun addTwoPointToB(view :View){
        score.teamB+=2
        display()
    }

    fun addFreeThrowToB(view :View){
        score.teamB+=1
        display()
    }

}
