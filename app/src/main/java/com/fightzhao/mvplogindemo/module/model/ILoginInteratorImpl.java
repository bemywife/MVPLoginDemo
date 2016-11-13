package com.fightzhao.mvplogindemo.module.model;

import android.os.Handler;
import android.text.TextUtils;

import com.fightzhao.mvplogindemo.base.RequestCallback;
import com.fightzhao.mvplogindemo.entity.User;

/**
 * 作者 ：fightzhao on 2016/11/7 18:57.
 * 功能 :
 */

public class ILoginInteratorImpl implements ILoginInterator<User> {


    @Override
    public void login(final RequestCallback<User> callback, final String username, final String password) {
        new Handler().postDelayed(new Runnable() {
            @Override
                public void run() {
                    boolean error = false;
                    if (TextUtils.isEmpty(username)) {
                        callback.requestError("");//model层里面回调listener
                        error = true;
                    }
                    if (TextUtils.isEmpty(password)) {
                        callback.requestError("");//model层里面回调listener
                        error = true;
                    } else if (!error && "zy".equals(username) && "123".equals(password)) {
                        callback.requestSuccess();
                    }
                }
            }, 2000);
    }
}
