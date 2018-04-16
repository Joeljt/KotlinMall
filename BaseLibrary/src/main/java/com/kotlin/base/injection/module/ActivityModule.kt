package com.kotlin.base.injection.module

import android.app.Activity
import dagger.Module
import dagger.Provides

/**
 * Author: ljt@yonyou.com
 * Date&Time: 2018/04/16, 07:27
 * For：
 */
@Module
class ActivityModule(private val activity: Activity) {

    @Provides
    fun providesActivity(): Activity{
        return activity
    }

}