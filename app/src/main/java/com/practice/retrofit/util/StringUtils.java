package com.practice.retrofit.util;

import android.text.TextUtils;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

/**
 * Created by xiachao on 16/10/21.
 */

public class StringUtils {

    /**
     *
     * @param string
     * @return
     */
    public static String encodeString(String string)
    {
        String result = "";
        if(!TextUtils.isEmpty(string))
        {
            try {
                result = URLEncoder.encode(string,"UTF-8");
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            }
        }
        return result;
    }

    /**
     * 去掉富文本编辑器中的标签内容
     * @param string
     * @return
     */
    public static String splitString(String string) {
        string = string.replaceAll("<[^>]*>", "");
        string = string.replaceAll("&[^;]+;", "");
        string = string.replaceAll("^\\\\s*|\\\\s*|\\t$", "");
        string = string.replaceAll("\t", "");
        return string;
    }
}
