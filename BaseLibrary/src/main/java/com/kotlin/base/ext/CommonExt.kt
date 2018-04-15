package com.kotlin.base.ext

import com.kotlin.base.rx.BaseSubscriber
import rx.Observable
import rx.android.schedulers.AndroidSchedulers
import rx.schedulers.Schedulers

/**
 * Author: ljt@yonyou.com
 * Date&Time: 2018/04/15, 20:39
 * For：自定义扩展
 */

fun <T> Observable<T>.execute(baseSubscriber: BaseSubscriber<T>) {
    this.observeOn(AndroidSchedulers.mainThread())
            .subscribeOn(Schedulers.io())
            .subscribe(baseSubscriber)
}