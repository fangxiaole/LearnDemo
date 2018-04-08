package com.lele.sharedemo.sdk;

import android.app.Application;

import com.p2p.core.P2PSpecial.P2PSpecial;

/**
 * Created by lele on 2018/4/8.
 */

public class MyApplication extends Application {
    public static final String APPID="c5a9718a80dc4f283a254cce2163a3db";
    public static final String APPTOKEN="80e0db1d0d765fd04fd9e5d6ab2b338cd29af3e37d5fd737a7440b1ca9a8304d";
    @Override
    public void onCreate() {
        super.onCreate();
        P2PSpecial.getInstance().init(this,APPID,APPTOKEN,"06.14.00.01");
    }
}
