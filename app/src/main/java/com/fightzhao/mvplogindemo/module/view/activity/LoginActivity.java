package com.fightzhao.mvplogindemo.module.view.activity;

import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.fightzhao.mvplogindemo.R;
import com.fightzhao.mvplogindemo.base.BaseActivity;
import com.fightzhao.mvplogindemo.entity.User;
import com.fightzhao.mvplogindemo.module.presenter.ILoginPresenterImpl;
import com.fightzhao.mvplogindemo.module.view.LoginView;

public class LoginActivity extends BaseActivity<ILoginPresenterImpl> implements View.OnClickListener, LoginView {
    private ProgressBar mProgressBar;
    private EditText mUsername;
    private EditText mPassword;
    private User user;


    @Override
    protected void initView() {
        setContentView(R.layout.activity_login);
        mProgressBar = (ProgressBar) findViewById(R.id.progress);
        mUsername = (EditText) findViewById(R.id.et_username);
        mPassword = (EditText) findViewById(R.id.et_password);
        findViewById(R.id.btn_login).setOnClickListener(this);
        user = new User();
        mPresenter = new ILoginPresenterImpl(this);
    }

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.btn_login) {
            Toast.makeText(this, "btn_login", Toast.LENGTH_LONG).show();
            Log.i("LoginActivity","点击了");
            mPresenter.validateCredentials(mUsername.getText().toString(), mPassword.getText().toString());
        }
    }

    @Override
    public void setUsernameError() {
        mUsername.setError(getString(R.string.username_error));

    }

    @Override
    public void setPasswordError() {
        mPassword.setError(getString(R.string.password_error));
    }

    @Override
    public void navigateToHome() {
        Toast.makeText(this, "login success", Toast.LENGTH_LONG).show();
        mProgressBar.setVisibility(View.GONE);
    }

    @Override
    public void showProgress() {
        mProgressBar.setVisibility(View.VISIBLE);
    }

    @Override
    public void hideProgress() {
        mProgressBar.setVisibility(View.GONE);
        Toast.makeText(this, "123", Toast.LENGTH_LONG).show();
    }

    @Override
    public void showRequest() {
        super.showRequest();
    }
}
