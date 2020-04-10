package com.heweather.owp.utils;


import com.heweather.owp.MyApplication;

/**
 * Created by niuchong on 2019/4/7.
 */

public class ContentUtil {

    //用户id
//    public static final String APK_USERNAME = "HE2004091051171061";

    //用户key
//    public static final String APK_KEY = "4d7b5da90d924c27a351caf1c76a388e";

    //用户id
    public static final String APK_USERNAME = "HE1903211415311839";
    //用户key
    public static final String APK_KEY = "a7b3fdf76a2b44fc91e36b2afe63d080";

    //当前所在位置
    public static Double NOW_LON = 74.00;
    public static Double NOW_LAT = 40.43;

    //当前城市
    public static String NOW_CITY_ID = SpUtils.getString(MyApplication.getContext(), "lastLocation", "US3290117");
    public static String NOW_CITY_NAME = SpUtils.getString(MyApplication.getContext(), "nowCityName", "纽约");

    public static boolean FIRST_OPEN = SpUtils.getBoolean(MyApplication.getContext(), "first_open", true);

    //应用设置里的文字
    public static String SYS_LANG = "zh";
    public static String APP_SETTING_LANG = SpUtils.getString(MyApplication.getContext(), "language", "sys");
    public static String APP_SETTING_UNIT = SpUtils.getString(MyApplication.getContext(), "unit", "she");
    public static String APP_SETTING_TESI = SpUtils.getString(MyApplication.getContext(), "size", "mid");
    public static String APP_PRI_TESI = SpUtils.getString(MyApplication.getContext(), "size", "mid");
    public static String APP_SETTING_THEME = SpUtils.getString(MyApplication.getContext(), "theme", "浅色");


    public static boolean UNIT_CHANGE = false;
    public static boolean CHANGE_LANG = false;
    public static boolean CITY_CHANGE = false;

}
