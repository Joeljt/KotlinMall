package com.kotlin.user.injection.component

import com.kotlin.base.injection.PerComponentScope
import com.kotlin.base.injection.component.ActivityComponent
import com.kotlin.user.injection.module.UserModule
import com.kotlin.user.ui.activity.RegisterActivity
import dagger.Component

/**
 * Author: ljt@yonyou.com
 * Date&Time: 2018/04/16, 07:13
 * For：
 */
@PerComponentScope
@Component(dependencies = arrayOf(ActivityComponent::class), modules = arrayOf(UserModule::class))
interface UserComponent {

    /**
     * 注入到RegisterActivity中
     */
    fun inject(acitivity: RegisterActivity)

}