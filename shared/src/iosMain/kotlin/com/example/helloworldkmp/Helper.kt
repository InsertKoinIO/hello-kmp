package com.example.helloworldkmp

import com.example.helloworldkmp.di.appModule
import org.koin.core.component.KoinComponent
import org.koin.core.component.inject
import org.koin.core.context.startKoin

class GreetingHelper : KoinComponent {
    private val greeting : Greeting by inject()
    fun greet() : String = greeting.greeting()
}

fun initKoin(){
    startKoin {
        modules(appModule())
    }
}
