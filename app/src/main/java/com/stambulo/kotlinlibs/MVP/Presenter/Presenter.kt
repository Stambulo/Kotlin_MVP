package com.stambulo.kotlinlibs.MVP.Presenter

import com.stambulo.kotlinlibs.MVP.Model.Model
import com.stambulo.kotlinlibs.MVP.View.MainView
import com.stambulo.kotlinlibs.R

class Presenter(val view: MainView) {
    val model = Model()

    //Архитектурная ошибка. В качестве практического задания — исправить
    fun counterClick(id: Int){
        when(id){
            R.id.btn_counter1 -> {
                val nextValue = model.next(0)
                view.setButtonText(0, nextValue.toString())
            }
            R.id.btn_counter2 -> {
                val nextValue = model.next(1)
                view.setButtonText(1, nextValue.toString())
            }
            R.id.btn_counter3 -> {
                val nextValue = model.next(2)
                view.setButtonText(2, nextValue.toString())
            }
        }
    }

}