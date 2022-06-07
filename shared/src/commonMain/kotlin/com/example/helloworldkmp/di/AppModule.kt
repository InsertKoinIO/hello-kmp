package com.example.helloworldkmp.di

import org.koin.core.annotation.ComponentScan
import org.koin.core.annotation.Module
import org.koin.ksp.generated.module

fun appModule() = listOf(AppModule().module)

@Module
@ComponentScan("com.example.helloworldkmp")
class AppModule