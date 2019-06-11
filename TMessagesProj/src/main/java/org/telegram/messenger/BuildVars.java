/*
 * This is the source code of Telegram for Android v. 5.x.x.
 * It is licensed under GNU GPL v. 2 or later.
 * You should have received a copy of the license in this archive (see LICENSE).
 *
 * Copyright Nikolai Kudashov, 2013-2018.
 */

package org.telegram.messenger;

import android.content.Context;
import android.content.SharedPreferences;

public class BuildVars {

    public static boolean DEBUG_VERSION = true;
    public static boolean DEBUG_PRIVATE_VERSION = true;
    public static boolean LOGS_ENABLED = true;
    public static boolean USE_CLOUD_STRINGS = true;
    public static boolean CHECK_UPDATES = false;
    public static int BUILD_VERSION = 1608;
    public static String BUILD_VERSION_STRING = "5.7.0";
    public static int APP_ID = 832213; //obtain your own APP_ID at https://core.telegram.org/api/obtaining_api_id
    public static String APP_HASH = "50ca680003af0ff01d98676c57839fb3"; //obtain your own APP_HASH at https://core.telegram.org/api/obtaining_api_id
    public static String HOCKEY_APP_HASH = "b623294bebf74cc5bdcef0e09a5ea2e8";
    public static String HOCKEY_APP_HASH_DEBUG = "b623294bebf74cc5bdcef0e09a5ea2e8";
    public static String SMS_HASH = ""; //https://developers.google.com/identity/sms-retriever/overview
    public static String PLAYSTORE_APP_URL = "";

    static {
        if (ApplicationLoader.applicationContext != null) {
            SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("systemConfig", Context.MODE_PRIVATE);
            LOGS_ENABLED = sharedPreferences.getBoolean("logsEnabled", DEBUG_VERSION);
        }
    }
}
