package com.victor.simplechatapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import dagger.hilt.android.AndroidEntryPoint
import viper.test.sampleapp.ChatScreenRouter
import javax.inject.Inject

@AndroidEntryPoint
class ChatScreenActivity : AppCompatActivity(), ChatScreenView {

    lateinit var interactor: ChatScreenInteractor
    lateinit var router: ChatScreenRouter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chat_screen)
        ChatScreenConfigurator.configure(this)
        interactor.getSomething("param1", "param2")
    }
    override fun displaySomething() {
        //display something
        print("displaySomething")
    }
}