package com.victor.simplechatapp

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

class ChatScreenViewModel : ViewModel() {
    @Inject
    lateinit var repo : FirebaseModule

    class Request(aParam1: String, aParam2: String) {
        val param1: String = aParam1
        val param2: String = aParam2
    }
    class Response {
    }
    class DisplayedResult {
    }
}