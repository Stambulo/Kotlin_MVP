package com.stambulo.kotlinlibs.MVP.Presenter

import com.stambulo.kotlinlibs.MVP.Model.Model
import com.stambulo.kotlinlibs.MVP.View.MainView
import com.stambulo.kotlinlibs.R

class Presenter(val view: MainView) {
    val model = Model()

    fun counterOneClick(){
        val nextValue = model.next(0)
        view.setButtonOneText(nextValue.toString())
    }

    fun counterTwoClick(){
        val nextValue = model.next(1)
        view.setButtonTwoText(nextValue.toString())
    }

    fun counterTreeClick(){
        val nextValue = model.next(2)
        view.setButtonTreeText(nextValue.toString())
    }
}
