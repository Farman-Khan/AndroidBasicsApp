package com.bluetech.androidbasicapp.ui

import javax.inject.Inject


class Logger @Inject constructor() {

    fun log(msg: String) {
        println("panda: $msg")

    }
}