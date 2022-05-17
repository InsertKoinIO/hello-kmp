package com.example.helloworldkmp.di

import com.example.helloworldkmp.Platform
import org.koin.core.module.dsl.singleOf
import org.koin.dsl.module

val platformModule = module {
    singleOf(::Platform)
}