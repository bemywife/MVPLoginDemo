package com.fightzhao.mvplogindemo.base;

/**
 * 作者 ：fightzhao on 2016/11/7 16:37.
 * 功能 : 视图的基类接口
 */

public interface BaseView {
    void toast(String msg);

    void showProgress();

    void hideProgress();

    void showRequest();
}
