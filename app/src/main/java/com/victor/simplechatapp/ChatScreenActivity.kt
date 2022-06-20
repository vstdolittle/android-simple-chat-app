package com.victor.simplechatapp

import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import com.victor.simplechatapp.databinding.ActivityChatScreenBinding
import viper.test.sampleapp.ChatScreenRouter

class ChatScreenActivity : AppCompatActivity(), ChatScreenView {

    lateinit var interactor: ChatScreenInteractor
    lateinit var router: ChatScreenRouter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chat_screen)
        ChatScreenConfigurator.configure(this)
       // interactor.getSomething("param1", "param2")
    }
    override fun displaySomething() {
        //display something
        print("displaySomething")
    }
}