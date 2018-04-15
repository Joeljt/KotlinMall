package com.kotlin.user.service

import rx.Observable

/**
 * Author: ljt@yonyou.com
 * Date&Time: 2018/04/15, 20:13
 * For：
 */
interface UserService {

    fun register(phone: String, verfityCode: String, pwd: String): Observable<Boolean>

}