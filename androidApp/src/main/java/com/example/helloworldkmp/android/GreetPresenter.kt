package com.example.helloworldkmp.android

import com.example.helloworldkmp.Greeting

class GreetPresenter(val greeting: Greeting) {
    fun print() = greeting.greeting()
}