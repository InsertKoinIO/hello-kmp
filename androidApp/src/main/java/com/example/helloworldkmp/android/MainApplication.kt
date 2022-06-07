package com.example.helloworldkmp.android

import android.app.Application
import com.example.helloworldkmp.android.di.AndroidModule
import com.example.helloworldkmp.di.appModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin
import org.koin.ksp.generated.*

class MainApplication : Application() {
    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidContext(this@MainApplication)
            androidLogger()
            modules(appModule() + AndroidModule().module)
        }
    }
}