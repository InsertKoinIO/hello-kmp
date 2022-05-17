package com.example.helloworldkmp.di

import com.example.helloworldkmp.Greeting
import org.koin.core.module.dsl.singleOf
import org.koin.dsl.module

val commonModule = module {
    singleOf(::Greeting)
}