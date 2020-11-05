package com.stambulo.kotlinlibs

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val counters = mutableListOf(0, 0, 0)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btn_counter1.setOnClickListener {
            btn_counter1.text = (++counters[0]).toString()
        }

        btn_counter2.setOnClickListener {
            btn_counter2.text = (++counters[1]).toString()
        }

        btn_counter3.setOnClickListener {
            btn_counter3.text = (++counters[2]).toString()
        }

        initViews()
    }

    fun initViews(){
        btn_counter1.text = counters[0].toString()
        btn_counter2.text = counters[1].toString()
        btn_counter3.text = counters[2].toString()
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putIntArray("counters", counters.toIntArray())
    }

    override fun onSaveInstanceState(outState: Bundle, outPersistentState: PersistableBundle) {
        super.onSaveInstanceState(outState, outPersistentState)
        outState.putIntArray("counters", counters.toIntArray())
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        val countersArray = savedInstanceState.getIntArray("counters")
        countersArray?.toList()?.let {
            counters.clear()
            counters.addAll(it)
        }
        initViews()
    }
}
