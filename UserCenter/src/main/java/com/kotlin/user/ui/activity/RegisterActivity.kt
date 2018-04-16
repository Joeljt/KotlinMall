package com.kotlin.user.ui.activity

import android.os.Bundle
import android.widget.Toast
import com.kotlin.base.ui.activity.BaseMvpActivity
import com.kotlin.user.R
import com.kotlin.user.injection.component.DaggerUserComponent
import com.kotlin.user.injection.module.UserModule
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

        initInjection()

        mBtn.setOnClickListener {
            mPresenter.register("", "", "")
        }



    }

    private fun initInjection() {
        // 使用Dagger，实现依赖注入
        DaggerUserComponent.builder().activityComponent(activityComponent).userModule(UserModule()).build().inject(this)
        mPresenter.mView = this
    }


}
