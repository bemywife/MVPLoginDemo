package com.fightzhao.mvplogindemo.module.view;

import com.fightzhao.mvplogindemo.base.BaseView;

/**
 * 作者 ：fightzhao on 2016/11/7 18:52.
 * 功能 :
 */

public interface LoginView extends BaseView {
    void setUsernameError();

    void setPasswordError();

    void navigateToHome();
}
