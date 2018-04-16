package com.kotlin.base.common

import android.app.Application
import com.kotlin.base.injection.component.AppComponent
import com.kotlin.base.injection.component.DaggerAppComponent
import com.kotlin.base.injection.module.AppModule

/**
 * Author: ljt@yonyou.com
 * Date&Time: 2018/04/16, 07:28
 * For：
 */
class BaseApplication: Application() {

    lateinit var appComponent: AppComponent

    override fun onCreate() {
        super.onCreate()

        initInjection()

    }

    private fun initInjection() {

        appComponent = DaggerAppComponent.builder().appModule(AppModule(this)).build()

    }

}