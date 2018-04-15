package com.kotlin.user.ui.activity

import android.os.Bundle
import android.widget.Toast
import com.kotlin.base.ui.activity.BaseMvpActivity
import com.kotlin.user.R
import com.kotlin.user.presenter.RegisterPresenter
import com.kotlin.user.presenter.view.RegisterView
import kotlinx.android.synthetic.main.activity_register2.*

class RegisterActivity : BaseMvpActivity<RegisterPresenter>(), RegisterView {

    override fun onRegister(isSuccess: Boolean) {
        Toast.makeText(this, "注册成功 -> $isSuccess", Toast.LENGTH_LONG).show()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register2)

        mPresenter = RegisterPresenter()
        mPresenter.mView = this

        mBtn.setOnClickListener {
            mPresenter.register("", "", "")
        }



    }


}
