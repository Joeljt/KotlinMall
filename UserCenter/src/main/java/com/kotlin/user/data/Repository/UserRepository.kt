package com.kotlin.user.data.Repository

import com.kotlin.base.data.net.RetrofitFactory
import com.kotlin.base.data.protocol.BaseResp
import com.kotlin.user.data.api.UserApi
import com.kotlin.user.data.protocol.RegisterReq
import rx.Observable
import javax.inject.Inject

/**
 * Author: ljt@yonyou.com
 * Date&Time: 2018/04/15, 21:54
 * For：直接与网络进行通信
 */
class UserRepository @Inject constructor(){

    fun register(phone:String,  pwd: String, verifyCode: String): Observable<BaseResp<String>>{
        return RetrofitFactory.instance.create(UserApi::class.java)
                .register(RegisterReq(phone, pwd, verifyCode))
    }

}