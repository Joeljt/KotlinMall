package com.kotlin.base.injection

import java.lang.annotation.Documented
import java.lang.annotation.Retention
import java.lang.annotation.RetentionPolicy.RUNTIME
import javax.inject.Scope

/**
 * Author: ljt@yonyou.com
 * Date&Time: 2018/04/16, 07:35
 * For：
 */
@Scope
@Documented
@Retention(RUNTIME)
annotation class PerComponentScope