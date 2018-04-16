package com.kotlin.user.presenter

import com.kotlin.base.ext.execute
import com.kotlin.base.presenter.BasePresenter
import com.kotlin.base.rx.BaseSubscriber
import com.kotlin.user.presenter.view.RegisterView
import com.kotlin.user.service.UserService
import javax.inject.Inject

/**
 * Author: ljt@yonyou.com
 * Date&Time: 2018/04/15, 19:49
 * For：注册功能的presenter层
 * dagger：将声明的变量，和对应需要实例化的类使用 @Inject 注解来实现关联
 */
class RegisterPresenter @Inject constructor(): BasePresenter<RegisterView>() {

    @Inject
    lateinit var userService: UserService

    /**
     * 联网操作，处理业务逻辑
     */
    fun register(phone:String, verifyCode: String, pwd: String){

        userService.register(phone, verifyCode, pwd)
                .execute(object : BaseSubscriber<Boolean>() {
                    override fun onNext(t: Boolean) {
                        mView.onRegister(t)
                    }
                })

    }

}