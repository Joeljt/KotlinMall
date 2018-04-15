package com.kotlin.base.presenter

import com.kotlin.base.presenter.view.BaseView

/**
 * Author: ljt@yonyou.com
 * Date&Time: 2018/04/15, 19:37
 * For：
 */
open class BasePresenter<T: BaseView> {
    lateinit var mView: T

}