package com.victor.simplechatapp

import android.view.View
interface ChatScreenView {
    fun displaySomething()
}
class ChatScreenPresenter {
    lateinit var activity: ChatScreenActivity
    fun presentSomething() {
        activity.displaySomething()
    }
}