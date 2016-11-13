package com.fightzhao.mvplogindemo.module.presenter;

import com.fightzhao.mvplogindemo.base.BasePresenter;

/**
 * 作者 ：fightzhao on 2016/11/9 10:03.
 * 功能 :
 */

public interface ILoginPresenter extends BasePresenter {
    void validateCredentials(String username, String password);
}
