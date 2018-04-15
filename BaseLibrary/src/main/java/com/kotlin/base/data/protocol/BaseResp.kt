package com.kotlin.base.data.protocol

/**
 * Author: ljt@yonyou.com
 * Date&Time: 2018/04/15, 21:44
 * For：
 */
class BaseResp<out T>(val status: Int, val msg: String, val data: T) {



}