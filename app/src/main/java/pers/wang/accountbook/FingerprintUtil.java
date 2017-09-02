package pers.wang.accountbook;

import android.content.Context;
import android.content.Intent;
/**
 * Created by winnw on 2017/9/2.
 */

public class FingerprintUtil {
    private static final String ACTION_SETTING = "android.settings.SETTINGS";

    public static void openFingerPrintSettingPage(Context context) {
        Intent intent = new Intent(ACTION_SETTING);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        try {
            context.startActivity(intent);
        } catch (Exception e) {
        }
    }
}