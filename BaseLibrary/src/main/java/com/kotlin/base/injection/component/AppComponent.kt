package com.kotlin.base.injection.component

import android.content.Context
import com.kotlin.base.injection.module.AppModule
import dagger.Component
import javax.inject.Singleton

/**
 * Author: ljt@yonyou.com
 * Date&Time: 2018/04/16, 07:27
 * For：
 */
@Singleton
@Component(modules = arrayOf(AppModule::class))
interface AppComponent {

    /**
     * 对应 AppModule 中的 provicesContext()
     */
    fun context(): Context

}