package com.ryuunoakaihitomi.rebootmenu;

import android.app.admin.DeviceAdminReceiver;
import android.content.Context;
import android.content.Intent;

import com.ryuunoakaihitomi.rebootmenu.util.DebugLog;

/**
 * AdminReceiver.class
 * Created by ZQY on 2018/2/12.
 */

//componentName = new ComponentName(this, AdminReceiver.class);
public class AdminReceiver extends DeviceAdminReceiver {
    @Override
    public void onDisabled(Context context, Intent intent) {
        new DebugLog("AdminReceiver:onDisabled", DebugLog.LogLevel.V);
    }

    @Override
    public void onEnabled(Context context, Intent intent) {
        new DebugLog("AdminReceiver:onEnabled", DebugLog.LogLevel.V);
    }
}
