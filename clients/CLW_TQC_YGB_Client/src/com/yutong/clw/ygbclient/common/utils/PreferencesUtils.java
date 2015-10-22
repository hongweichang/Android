/**
 * @公司名称：YUTONG
 * @作者：zhangzhia
 * @版本号：1.0
 * @生成日期：2013-10-25 上午10:53:32
 * @功能描述：
 */
package com.yutong.clw.ygbclient.common.utils;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;

/**
 * PreferencesUtils, easy to get or put data
 * <ul>
 * <strong>Preference Name</strong>
 * <li>you can change preference name by {@link #Preference_Name}</li>
 * </ul>
 * <ul>
 * <strong>Put Value</strong>
 * <li>put string {@link #putString(Context, String, String)}</li>
 * <li>put int {@link #putInt(Context, String, int)}</li>
 * <li>put long {@link #putLong(Context, String, long)}</li>
 * <li>put float {@link #putFloat(Context, String, float)}</li>
 * <li>put boolean {@link #putBoolean(Context, String, boolean)}</li>
 * </ul>
 * <ul>
 * <strong>Get Value</strong>
 * <li>get string {@link #getString(Context, String)},
 * {@link #getString(Context, String, String)}</li>
 * <li>get int {@link #getInt(Context, String)},
 * {@link #getInt(Context, String, int)}</li>
 * <li>get long {@link #getLong(Context, String)},
 * {@link #getLong(Context, String, long)}</li>
 * <li>get float {@link #getFloat(Context, String)},
 * {@link #getFloat(Context, String, float)}</li>
 * <li>get boolean {@link #getBoolean(Context, String)},
 * {@link #getBoolean(Context, String, boolean)}</li>
 * </ul>
 * 
 * @author <a href="http://www.trinea.cn" target="_blank">Trinea</a> 2013-3-6
 */
public class PreferencesUtils
{
	/**
     * 标志设置Preferences名称
     */
    public static final String PREFS_NAME_FLAG="FlagPrefs";
    
    /**
     * put string preferences
     * 
     * @param context
     * @param key The name of the preference to modify
     * @param value The new value for the preference
     * @return True if the new values were successfully written to persistent
     *         storage.
     */
    public static boolean putString(Context context, String Preference_Name, String key, String value)
    {
        SharedPreferences settings = context.getSharedPreferences(Preference_Name, Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = settings.edit();
        editor.putString(key, value);
        return editor.commit();
    }

    /**
     * get string preferences
     * 
     * @param context
     * @param key The name of the preference to retrieve
     * @return The preference value if it exists, or null. Throws
     *         ClassCastException if there is a preference with this name that
     *         is not a string
     * @see #getString(Context, String, String)
     */
    public static String getString(Context context, String Preference_Name, String key)
    {
        return getString(context, Preference_Name, key, null);
    }

    /**
     * get string preferences
     * 
     * @param context
     * @param key The name of the preference to retrieve
     * @param defaultValue Value to return if this preference does not exist
     * @return The preference value if it exists, or defValue. Throws
     *         ClassCastException if there is a preference with this name that
     *         is not a string
     */
    public static String getString(Context context, String Preference_Name, String key, String defaultValue)
    {
    	if(context==null)
    		return defaultValue;
        SharedPreferences settings = context.getSharedPreferences(Preference_Name, Context.MODE_PRIVATE);
        return settings.getString(key, defaultValue);
    }

    /**
     * put int preferences
     * 
     * @param context
     * @param key The name of the preference to modify
     * @param value The new value for the preference
     * @return True if the new values were successfully written to persistent
     *         storage.
     */
    public static boolean putInt(Context context, String Preference_Name, String key, int value)
    {
        SharedPreferences settings = context.getSharedPreferences(Preference_Name, Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = settings.edit();
        editor.putInt(key, value);
        return editor.commit();
    }

    /**
     * get int preferences
     * 
     * @param context
     * @param key The name of the preference to retrieve
     * @return The preference value if it exists, or -1. Throws
     *         ClassCastException if there is a preference with this name that
     *         is not a int
     * @see #getInt(Context, String, int)
     */
    public static int getInt(Context context, String Preference_Name, String key)
    {
        return getInt(context, Preference_Name, key, -1);
    }

    /**
     * get int preferences
     * 
     * @param context
     * @param key The name of the preference to retrieve
     * @param defaultValue Value to return if this preference does not exist
     * @return The preference value if it exists, or defValue. Throws
     *         ClassCastException if there is a preference with this name that
     *         is not a int
     */
    public static int getInt(Context context, String Preference_Name, String key, int defaultValue)
    {
        SharedPreferences settings = context.getSharedPreferences(Preference_Name, Context.MODE_PRIVATE);
        return settings.getInt(key, defaultValue);
    }

    /**
     * put long preferences
     * 
     * @param context
     * @param key The name of the preference to modify
     * @param value The new value for the preference
     * @return True if the new values were successfully written to persistent
     *         storage.
     */
    public static boolean putLong(Context context, String Preference_Name, String key, long value)
    {
        SharedPreferences settings = context.getSharedPreferences(Preference_Name, Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = settings.edit();
        editor.putLong(key, value);
        return editor.commit();
    }

    /**
     * get long preferences
     * 
     * @param context
     * @param key The name of the preference to retrieve
     * @return The preference value if it exists, or -1. Throws
     *         ClassCastException if there is a preference with this name that
     *         is not a long
     * @see #getLong(Context, String, long)
     */
    public static long getLong(Context context, String Preference_Name, String key)
    {
        return getLong(context, Preference_Name, key, -1);
    }

    /**
     * get long preferences
     * 
     * @param context
     * @param key The name of the preference to retrieve
     * @param defaultValue Value to return if this preference does not exist
     * @return The preference value if it exists, or defValue. Throws
     *         ClassCastException if there is a preference with this name that
     *         is not a long
     */
    public static long getLong(Context context, String Preference_Name, String key, long defaultValue)
    {
        SharedPreferences settings = context.getSharedPreferences(Preference_Name, Context.MODE_PRIVATE);
        return settings.getLong(key, defaultValue);
    }

    /**
     * put float preferences
     * 
     * @param context
     * @param key The name of the preference to modify
     * @param value The new value for the preference
     * @return True if the new values were successfully written to persistent
     *         storage.
     */
    public static boolean putFloat(Context context, String Preference_Name, String key, float value)
    {
        SharedPreferences settings = context.getSharedPreferences(Preference_Name, Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = settings.edit();
        editor.putFloat(key, value);
        return editor.commit();
    }

    /**
     * get float preferences
     * 
     * @param context
     * @param key The name of the preference to retrieve
     * @return The preference value if it exists, or -1. Throws
     *         ClassCastException if there is a preference with this name that
     *         is not a float
     * @see #getFloat(Context, String, float)
     */
    public static float getFloat(Context context, String Preference_Name, String key)
    {
        return getFloat(context, Preference_Name, key, -1);
    }

    /**
     * get float preferences
     * 
     * @param context
     * @param key The name of the preference to retrieve
     * @param defaultValue Value to return if this preference does not exist
     * @return The preference value if it exists, or defValue. Throws
     *         ClassCastException if there is a preference with this name that
     *         is not a float
     */
    public static float getFloat(Context context, String Preference_Name, String key, float defaultValue)
    {
        SharedPreferences settings = context.getSharedPreferences(Preference_Name, Context.MODE_PRIVATE);
        return settings.getFloat(key, defaultValue);
    }

    /**
     * put boolean preferences
     * 
     * @param context
     * @param key The name of the preference to modify
     * @param value The new value for the preference
     * @return True if the new values were successfully written to persistent
     *         storage.
     */
    public static boolean putBoolean(Context context, String Preference_Name, String key, boolean value)
    {
        SharedPreferences settings = context.getSharedPreferences(Preference_Name, Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = settings.edit();
        editor.putBoolean(key, value);
        return editor.commit();
    }

    /**
     * get boolean preferences, default is false
     * 
     * @param context
     * @param key The name of the preference to retrieve
     * @return The preference value if it exists, or false. Throws
     *         ClassCastException if there is a preference with this name that
     *         is not a boolean
     * @see #getBoolean(Context, String, boolean)
     */
    public static boolean getBoolean(Context context, String Preference_Name, String key)
    {
        return getBoolean(context, Preference_Name, key, false);
    }

    /**
     * get boolean preferences
     * 
     * @param context
     * @param key The name of the preference to retrieve
     * @param defaultValue Value to return if this preference does not exist
     * @return The preference value if it exists, or defValue. Throws
     *         ClassCastException if there is a preference with this name that
     *         is not a boolean
     */
    public static boolean getBoolean(Context context, String Preference_Name, String key, boolean defaultValue)
    {
        SharedPreferences settings = context.getSharedPreferences(Preference_Name, Context.MODE_PRIVATE);
        return settings.getBoolean(key, defaultValue);
    }

    
    /**
     * 删除数据
     *@author zhangzhia 2013-11-15 上午10:54:30
     *
     * @param context
     * @param Preference_Name
     * @param key
     */
    public static void remove(Context context, String Preference_Name)
    {
        
        SharedPreferences settings = context.getSharedPreferences(Preference_Name, Context.MODE_PRIVATE);
        
        Editor editor = settings.edit();
        editor.clear();
        editor.commit();
        
    }
    
    /**
     * 删除数据
     *@author zhangzhia 2013-11-15 上午10:54:30
     *
     * @param context
     * @param Preference_Name
     * @param key
     */
    public static void remove(Context context, String Preference_Name, String key)
    {
        
        SharedPreferences settings = context.getSharedPreferences(Preference_Name, Context.MODE_PRIVATE);
        
        Editor editor = settings.edit();
        editor.remove (key);
        editor.commit();
        
    }
    /**
     * 获取SharedPreferences配置
     * 
     * @author zhangzhia 2013-9-2 下午3:46:33
     * @param prefs_name Preferences名称
     * @param key 键
     * @param value 值
     */
    public static String get(Context context,String prefs_name, String key, String defaultValue)
    {
        SharedPreferences sharedPreferences = context.getSharedPreferences(prefs_name, Context.MODE_PRIVATE);
        return sharedPreferences.getString(key, defaultValue);
    }
    
    /**
     * 新增SharedPreferences配置
     *@author zhangzhia 2013-9-2 下午3:50:19
     *
     * @param prefs_name  name Preferences名称
     * @param key   键
     * @param value  值
     */
    public static void set(Context context,String prefs_name, String key, String value)
    {
        SharedPreferences settings = context.getSharedPreferences(prefs_name, Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = settings.edit();
        editor.putString(key, value);
        editor.commit();
    }
}
