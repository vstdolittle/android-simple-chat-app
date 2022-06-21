package com.victor.simplechatapp

import javax.inject.Inject

class ChatScreenInteractor {
    lateinit var presenter: ChatScreenPresenter

    fun getSomething(aParam1: String, aParam2: String) {
//Show loading
        val request = ChatScreenViewModel.Request(aParam1, aParam2)
//Initiate Worker if need using 'request'
        showSomething()

    }
    private fun showSomething() {
        presenter.presentSomething()
//Hide loading
    }
}