package com.kotlin.user.service.impl

import com.kotlin.base.data.net.BaseException
import com.kotlin.base.data.protocol.BaseResp
import com.kotlin.user.data.Repository.UserRepository
import com.kotlin.user.service.UserService
import rx.Observable
import rx.functions.Func1

/**
 * Author: ljt@yonyou.com
 * Date&Time: 2018/04/15, 20:14
 * For：
 */
class UserServiceImpl: UserService {

    override fun register(phone: String, verifyCode: String, pwd: String): Observable<Boolean> {

        val userRepository = UserRepository()
        return userRepository.register(phone, pwd, verifyCode)
                .flatMap(object : Func1<BaseResp<String>, Observable<Boolean>>{
                    override fun call(t: BaseResp<String>): Observable<Boolean> {
                        if (t.status != 0){
                            return Observable.error(BaseException(t.status, t.msg))
                        }
                        return Observable.just(true)
                    }

                })
    }

}