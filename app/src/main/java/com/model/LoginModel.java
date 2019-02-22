package com.model;

import com.libhttp.entity.LoginResult;
import com.libhttp.subscribers.SubscriberListener;
import com.p2p.core.P2PSpecial.HttpSend;
import com.presenter.LoginPresenter;

/**
 * Created by lele on 2019/2/22.
 */
public class LoginModel {
    LoginPresenter loginPresenter;

    public LoginModel(LoginPresenter loginPresenter) {
        this.loginPresenter = loginPresenter;
    }

    public void login(String userName, String password) {
        HttpSend.getInstance().login(userName, password, new SubscriberListener<LoginResult>() {
            @Override
            public void onStart() {

            }

            @Override
            public void onNext(LoginResult loginResult) {
                if ("0".equals(loginResult.getError_code())) {
                    if (loginPresenter != null) {
                        loginPresenter.loginSuccess(loginResult);
                    }
                } else {
                    if (loginPresenter != null) {
                        loginPresenter.loginFail(loginResult.getError() + loginResult.getError_code());
                    }
                }
            }

            @Override
            public void onError(String error_code, Throwable throwable) {
                if (loginPresenter != null) {
                    loginPresenter.loginFail(error_code);
                }
            }
        });
    }


}
