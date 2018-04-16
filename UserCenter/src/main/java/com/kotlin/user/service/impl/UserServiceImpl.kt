package com.kotlin.user.service.impl

import com.kotlin.user.data.Repository.UserRepository
import com.kotlin.user.service.UserService
import rx.Observable
import javax.inject.Inject

/**
 * Author: ljt@yonyou.com
 * Date&Time: 2018/04/15, 20:14
 * For：
 */
class UserServiceImpl @Inject constructor(): UserService {

    @Inject
    lateinit var userRepository: UserRepository

    override fun register(phone: String, verifyCode: String, pwd: String): Observable<Boolean> {
//        return userRepository.register(phone, pwd, verifyCode)
//                .flatMap(object : Func1<BaseResp<String>, Observable<Boolean>>{
//                    override fun call(t: BaseResp<String>): Observable<Boolean> {
//                        if (t.status != 0){
//                            return Observable.error(BaseException(t.status, t.msg))
//                        }
//                        return Observable.just(true)
//                    }
//
//                })
        return Observable.just(true)
    }

}