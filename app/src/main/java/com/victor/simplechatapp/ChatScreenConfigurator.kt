package com.victor.simplechatapp

import viper.test.sampleapp.ChatScreenRouter

class ChatScreenConfigurator {
    companion object Singleton {
        fun configure(activity: ChatScreenActivity) {
            val router = ChatScreenRouter()
            router.activity = activity
            val presenter = ChatScreenPresenter()
            presenter.activity = activity
            val interactor = ChatScreenInteractor()
            interactor.presenter = presenter
            activity.interactor = interactor
            activity.router = router
        }
    }
}