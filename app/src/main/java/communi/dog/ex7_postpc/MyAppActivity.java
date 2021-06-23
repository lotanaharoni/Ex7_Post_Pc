package communi.dog.ex7_postpc;

import android.app.Application;

public class MyAppActivity extends Application {
    private static MyAppActivity appInstance = null;

    @Override
    public void onCreate() {
        super.onCreate();
        appInstance = this;
    }

    public static MyAppActivity getAppInstance() {
        return appInstance;
    }
}
