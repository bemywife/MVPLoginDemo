package com.fightzhao.mvplogindemo.module.presenter;


import com.fightzhao.mvplogindemo.base.BasePresenterImpl;
import com.fightzhao.mvplogindemo.entity.User;
import com.fightzhao.mvplogindemo.module.model.ILoginInterator;
import com.fightzhao.mvplogindemo.module.model.ILoginInteratorImpl;
import com.fightzhao.mvplogindemo.module.view.LoginView;

/**
 * 作者 ：fightzhao on 2016/11/9 10:04.
 * 功能 :
 */

public class ILoginPresenterImpl extends BasePresenterImpl<LoginView, User> implements ILoginPresenter {

    private ILoginInterator mLoginInterator;

    public ILoginPresenterImpl(LoginView mView) {
        super(mView);
        mLoginInterator = new ILoginInteratorImpl();
    }

    @Override
    public void requestSuccess() {
        if (mView != null)
            mView.navigateToHome();
    }

    @Override
    public void validateCredentials(String username, String password) {
        if (mView != null)
            mView.showProgress();
        mLoginInterator.login(this, username, password);
    }

    @Override
    public void requestError(String msg) {
        super.requestError(msg);
        mView.setPasswordError();
        mView.setUsernameError();
    }
}
