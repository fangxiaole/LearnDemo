package com.view;

import com.libhttp.entity.LoginResult;

/**
 * Created by lele on 2019/2/22.
 */
public interface LoginView {

    void LoginSuccess(LoginResult loginResult);

    void LoginFail(String error);
}
