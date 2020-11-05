package com.stambulo.kotlinlibs

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.stambulo.kotlinlibs.MVP.Presenter.Presenter
import com.stambulo.kotlinlibs.MVP.View.MainView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), MainView {
    val presenter = Presenter(this)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val listener = View.OnClickListener {
            when(it.id){
                R.id.btn_counter1 -> {presenter.counterOneClick()}
                R.id.btn_counter2 -> {presenter.counterTwoClick()}
                R.id.btn_counter3 -> {presenter.counterTreeClick()}
            }
        }

        btn_counter1.setOnClickListener(listener)
        btn_counter2.setOnClickListener(listener)
        btn_counter3.setOnClickListener(listener)
    }

    override fun setButtonOneText(text: String){
        btn_counter1.text = text
    }

    override fun setButtonTwoText(text: String) {
        btn_counter2.text = text
    }

    override fun setButtonTreeText(text: String) {
        btn_counter3.text = text
    }
}
