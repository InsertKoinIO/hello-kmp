package com.example.helloworldkmp.android

import android.app.Application
import com.example.helloworldkmp.android.di.androidModule
import com.example.helloworldkmp.di.appModule
import com.example.helloworldkmp.di.commonModule
import com.example.helloworldkmp.di.platformModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin

class MainApplication : Application() {
    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidContext(this@MainApplication)
            androidLogger()
            modules(appModule() + androidModule)
        }
    }
}