package com.example.helloworldkmp.android

import com.example.helloworldkmp.Greeting
import org.koin.core.annotation.Factory

@Factory
class GreetPresenter(val greeting: Greeting) {
    fun print() = greeting.greeting()
}