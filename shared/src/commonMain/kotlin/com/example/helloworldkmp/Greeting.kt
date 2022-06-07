package com.example.helloworldkmp

import org.koin.core.annotation.Single

@Single
class Greeting(private val platform: Platform) {

    fun greeting(): String {
        return "Hello, ${platform.name}!"
    }
}