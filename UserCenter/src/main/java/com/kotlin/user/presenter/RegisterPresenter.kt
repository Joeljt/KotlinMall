package com.kotlin.user.presenter

import com.kotlin.base.ext.execute
import com.kotlin.base.presenter.BasePresenter
import com.kotlin.base.rx.BaseSubscriber
import com.kotlin.user.presenter.view.RegisterView
import com.kotlin.user.service.impl.UserServiceImpl

/**
 * Author: ljt@yonyou.com
 * Date&Time: 2018/04/15, 19:49
 * For：
 */
class RegisterPresenter: BasePresenter<RegisterView>() {

    /**
     * 联网操作，处理业务逻辑
     */
    fun register(phone:String, verifyCode: String, pwd: String){

        val userServive = UserServiceImpl()
        userServive.register(phone, verifyCode, pwd)
                .execute(object : BaseSubscriber<Boolean>() {
                    override fun onNext(t: Boolean) {
                        mView.onRegister(t)
                    }
                })

    }

}