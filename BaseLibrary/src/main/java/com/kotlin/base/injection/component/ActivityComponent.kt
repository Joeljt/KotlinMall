package com.kotlin.base.injection.component

import android.app.Activity
import com.kotlin.base.injection.ActivityScope
import com.kotlin.base.injection.module.ActivityModule
import com.kotlin.base.injection.module.LifecycleProviderModule
import com.trello.rxlifecycle.LifecycleProvider
import dagger.Component

/**
 * Author: ljt@yonyou.com
 * Date&Time: 2018/04/16, 07:27
 * For：
 */
@ActivityScope
@Component(dependencies = arrayOf(AppComponent::class), modules = arrayOf(ActivityModule::class, LifecycleProviderModule::class))
interface ActivityComponent {

    fun activity(): Activity

    fun lifecycle(): LifecycleProvider<*>

}