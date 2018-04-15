package com.kotlin.base.ui.activity

import com.kotlin.base.presenter.BasePresenter
import com.kotlin.base.presenter.view.BaseView

/**
 * Author: ljt@yonyou.com
 * Date&Time: 2018/04/15, 19:38
 * For：
 */
open class BaseMvpActivity<T: BasePresenter<*>>: BaseActivity(), BaseView {

    override fun showLoading() {

    }

    override fun hideLoading() {
    }

    override fun onError() {
    }

    lateinit var mPresenter: T

}