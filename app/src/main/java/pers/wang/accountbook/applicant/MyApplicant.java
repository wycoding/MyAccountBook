package pers.wang.accountbook.applicant;

import android.app.Application;

/**
 * Created by winnw on 2017/9/3.
 */

public class MyApplicant extends Application{
    private static boolean fingerPrintLock;

    @Override
    public void onCreate() {
        super.onCreate();
    }

    public boolean isFingerPrintLock() {
        return fingerPrintLock;
    }

    public void setFingerPrintLock(boolean fingerPrintLock) {
        this.fingerPrintLock = fingerPrintLock;
    }
}
