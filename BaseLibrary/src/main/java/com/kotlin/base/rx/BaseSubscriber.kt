package com.kotlin.base.rx

import rx.Subscriber

/**
 * Author: ljt@yonyou.com
 * Date&Time: 2018/04/15, 20:35
 * For：
 */
open class BaseSubscriber<T>: Subscriber<T>() {
    override fun onNext(t: T) {

    }

    override fun onCompleted() {
    }

    override fun onError(e: Throwable?) {
    }
}