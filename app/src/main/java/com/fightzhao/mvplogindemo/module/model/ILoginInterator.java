package com.fightzhao.mvplogindemo.module.model;

import com.fightzhao.mvplogindemo.base.RequestCallback;

/**
 * 作者 ：fightzhao on 2016/11/7 18:53.
 * 功能 : Model层接口
 */

public interface ILoginInterator<D> {
    void login(RequestCallback<D> data, String username, String password);
}
