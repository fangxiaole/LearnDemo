package com.presenter;

import com.libhttp.entity.LoginResult;
import com.model.LoginModel;
import com.view.LoginView;

/**
 * Created by lele on 2019/2/22.
 */
public class LoginPresenter {
    private LoginModel loginModel = new LoginModel(this);
    private LoginView loginView;


    public LoginPresenter(LoginView loginView) {
        this.loginView = loginView;
    }

    /**
     * 登录
     */
    public void login(String userName, String password) {
        loginModel.login(userName, password);
    }


    /**
     * 登录成功
     *
     * @param loginResult
     */
    public void loginSuccess(LoginResult loginResult) {
        loginView.LoginSuccess(loginResult);
    }


    /**
     * 登录失败
     *
     * @param error
     */
    public void loginFail(String error) {
        loginView.LoginFail(error);
    }


}
