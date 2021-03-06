package com.example.launchpadx

import android.app.Application
import com.example.launchpadx.di.mapperModule
import com.example.launchpadx.di.network.apiLaunchpadsServiceModule
import com.example.launchpadx.di.network.networkModule
import com.example.launchpadx.di.repositoryModule
import com.example.launchpadx.di.systemModule
import com.example.launchpadx.di.viewModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class App : Application() {

    override fun onCreate() {
        super.onCreate()
        initKoin()
    }

    private fun initKoin() {
        startKoin {
            androidContext(this@App)
            modules(
                listOf(
                    networkModule,
                    systemModule,
                    viewModule,
                    apiLaunchpadsServiceModule,
                    repositoryModule,
                    mapperModule
                )
            )
        }
    }
}
