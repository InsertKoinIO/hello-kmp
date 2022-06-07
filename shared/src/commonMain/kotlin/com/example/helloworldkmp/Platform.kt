package com.example.helloworldkmp

import org.koin.core.annotation.Single

@Single
expect class Platform() {
    val name: String
}