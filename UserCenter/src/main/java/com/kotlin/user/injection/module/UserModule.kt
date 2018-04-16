package com.kotlin.user.injection.module

import com.kotlin.user.service.UserService
import com.kotlin.user.service.impl.UserServiceImpl
import dagger.Module
import dagger.Provides

/**
 * Author: ljt@yonyou.com
 * Date&Time: 2018/04/16, 07:06
 * For：Dagger工厂类，用于实现
 */
@Module
class UserModule {

    @Provides
    fun providesUserService(service: UserServiceImpl): UserService{
        return service
    }

}