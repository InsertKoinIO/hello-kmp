package com.example.helloworldkmp.android.di

import com.example.helloworldkmp.android.GreetPresenter
import org.koin.core.module.dsl.singleOf
import org.koin.dsl.module


val androidModule = module {
    singleOf(::GreetPresenter)
}