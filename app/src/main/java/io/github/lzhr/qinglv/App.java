package io.github.lzhr.qinglv;

import android.app.Application;

import com.orm.SugarContext;

/**
 * Created by lz on 2016-07-29.
 */
public class App extends Application {
    private static App App = null ;
    @Override
    public void onCreate() {
        super.onCreate();
        App = this;
        SugarContext.init(this);
    }

    @Override
    public void onTerminate() {
        SugarContext.terminate();
        super.onTerminate();
    }

    public static App getInstance() {return App;}
}
