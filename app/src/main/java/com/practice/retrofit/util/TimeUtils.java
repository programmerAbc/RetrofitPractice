package com.practice.retrofit.util;

import android.text.TextUtils;
import android.text.format.Time;

import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Formatter;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TimeUtils {

    public static String formatTalkTime(long when) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(when);
        SimpleDateFormat format = new SimpleDateFormat("HH:mm");
        if (isToday(when)) {
            return format.format(calendar.getTime());
        } else if (isYesterday(when)) {
            return "昨天" + format.format(calendar.getTime());
        } else {
            format = new SimpleDateFormat("yyyy-MM-dd HH:mm");
            return format.format(calendar.getTime());
        }
    }

    public static String formatDateTime(long when) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(when);
        SimpleDateFormat format = new SimpleDateFormat("HH:mm");

        if (isToday(when)) {
            return "今天" + format.format(calendar.getTime());
        } else if (isYesterday(when)) {
            return "昨天" + format.format(calendar.getTime());
        } else {
            format = new SimpleDateFormat("yyyy-MM-dd HH:mm");
            return format.format(calendar.getTime());
        }
    }

    public static String formatDateTimeMMDD(long when) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(when);
        SimpleDateFormat format = new SimpleDateFormat("MM-dd");

        if (isToday(when)) {
            return "今天";
        } else if (isYesterday(when)) {
            return "昨天";
        } else {
            format = new SimpleDateFormat("MM-dd");
            return format.format(calendar.getTime());
        }
    }

    public static boolean isToday(long when) {
        Time time = new Time();
        time.set(when);

        int thenYear = time.year;
        int thenMonth = time.month;
        int thenMonthDay = time.monthDay;

        time.set(System.currentTimeMillis());
        return (thenYear == time.year)
                && (thenMonth == time.month)
                && (thenMonthDay == time.monthDay);
    }

    public static boolean isYesterday(long when) {
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.DAY_OF_MONTH, -1);

        int thenYear = calendar.get(Calendar.YEAR);
        int thenMonth = calendar.get(Calendar.MONTH);
        int thenMonthDay = calendar.get(Calendar.DAY_OF_MONTH);

        calendar.setTimeInMillis(when);
        return (thenYear == calendar.get(Calendar.YEAR))
                && (thenMonth == calendar.get(Calendar.MONTH))
                && (thenMonthDay == calendar.get(Calendar.DAY_OF_MONTH));
    }


    public static String getDurationTime(long time) {
        int minu = (int) (time / 60);
        int second = (int) time - (minu * 60);
        return (minu < 10 ? ("0" + minu) : minu) + ":"
                + (second < 10 ? ("0" + second) : second);
    }

    public static String stringForTime(long timeMs) {
        StringBuilder formatBuilder = new StringBuilder();
        Formatter formatter = new Formatter(formatBuilder, Locale.getDefault());
        long totalSeconds = timeMs / 1000;

        long seconds = totalSeconds % 60;
        long minutes = (totalSeconds / 60) % 60;
        long hours = totalSeconds / 3600;
        formatBuilder.setLength(0);
        if (hours > 0) {
            return formatter.format("%d:%02d:%02d", hours, minutes, seconds).toString();
        } else {
            return formatter.format("%02d:%02d", minutes, seconds).toString();
        }
    }

    public static String getTimeBetween(long start, long end) {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm");

        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(start);
        String startStr = format.format(calendar.getTime());

        calendar = Calendar.getInstance();
        calendar.setTimeInMillis(end);
        String endStr = format.format(calendar.getTime());

        String date = startStr.substring(0, 10);

        return date + startStr.replace(date, "") + "~" + endStr.replace(date, "");
    }

    public static String getUseTime(long timeSec) {
        StringBuilder formatBuilder = new StringBuilder();
        Formatter formatter = new Formatter(formatBuilder, Locale.getDefault());
        long totalSeconds = timeSec;

        long seconds = totalSeconds % 60;
        long minutes = (totalSeconds / 60) % 60;
        long hours = totalSeconds / 3600;
        formatBuilder.setLength(0);
        return formatter.format("%02d:%02d:%02d", hours, minutes, seconds).toString();
    }

    public static boolean isSameDay(long time1, long time2) {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(time1);
        String date1 = format.format(calendar.getTime());
        calendar = Calendar.getInstance();
        calendar.setTimeInMillis(time2);
        String date2 = format.format(calendar.getTime());
        return date2.equals(date1);
    }

    /**
     * @param date: yyyy-MM-dd
     * @return
     */
    public static long dateToLong(String date) {
        try {
            SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
            return format.parse(date).getTime();
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return 0;
    }

    public static String dateToYYYYMMDDHHSS(long time) {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(time);
        String timeString = format.format(calendar.getTime());
        return timeString;
    }

    public static String dateToYYYYMMDD(long time) {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");

        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(time);
        String timeString = format.format(calendar.getTime());
        return timeString;
    }

    public static String dateToMMDD(long time) {
        SimpleDateFormat format = new SimpleDateFormat("MM-dd");

        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(time);
        String timeString = format.format(calendar.getTime());
        return timeString;
    }

    public static String dateToDD(long time) {
        SimpleDateFormat format = new SimpleDateFormat("dd");

        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(time);
        String timeString = format.format(calendar.getTime());
        return timeString;
    }

    public static String dateToYYYY(long time) {
        SimpleDateFormat format = new SimpleDateFormat("yyyy");
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(time);
        String timeString = format.format(calendar.getTime());
        return timeString;
    }

    public static String dateToMM(long time) {
        SimpleDateFormat format = new SimpleDateFormat("MM");
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(time);
        String timeString = format.format(calendar.getTime());
        return timeString;
    }

    public static String dateToYYYYMM(long time) {
        String yyyymm = "";
        String mm = dateToMM(time);
        int mmInt = Integer.parseInt(mm);
        yyyymm = getMonthEnglish(mmInt) + " . " + dateToYYYY(time);
        return yyyymm;
    }

    private static String getMonthEnglish(int month) {
        String monthString = "";
        switch (month) {
            case 1:
                monthString = "Jan";
                break;
            case 2:
                monthString = "Feb";
                break;
            case 3:
                monthString = "Mar";
                break;
            case 4:
                monthString = "Apr";
                break;
            case 5:
                monthString = "May";
                break;
            case 6:
                monthString = "Jun";
                break;
            case 7:
                monthString = "Jul";
                break;
            case 8:
                monthString = "Agu";
                break;
            case 9:
                monthString = "Sep";
                break;
            case 10:
                monthString = "Oct";
                break;
            case 11:
                monthString = "Nov";
                break;
            case 12:
                monthString = "Dec";
                break;
        }
        return monthString;
    }

    public static String dateToChinaYYYYMM(long time, String year, String month) {
        String mm = dateToMM(time);
        return dateToYYYY(time) + year + mm + month;
    }

    /**
     * 将时间戳转为代表"距现在多久之前"的字符串
     *
     * @param timeStr 时间戳
     * @return
     */
    public static String getStandardDate(String timeStr) {

        StringBuffer sb = new StringBuffer();

        long t = Long.parseLong(timeStr);
        long time = System.currentTimeMillis() - (t * 1000);
        long mill = (long) Math.ceil(time / 1000);//秒前

        long minute = (long) Math.ceil(time / 60 / 1000.0f);// 分钟前

        long hour = (long) Math.ceil(time / 60 / 60 / 1000.0f);// 小时

        long day = (long) Math.ceil(time / 24 / 60 / 60 / 1000.0f);// 天前

        if (day - 1 > 0) {
            //判断是否为数字
            Pattern p = Pattern.compile("[0-9]*");
            Matcher m = p.matcher(timeStr);
            if (m.matches()) {
                Calendar c = Calendar.getInstance();
                int year = c.get(Calendar.YEAR);
                String date = dateToYYYYMMDD(Long.valueOf(timeStr).longValue() * 1000);
                if (date.contains(String.valueOf(year))) {
                    return dateToMMDD(Long.valueOf(timeStr).longValue() * 1000);
                } else {
                    return date;
                }
            } else {
                sb.append(day + "天");
            }
        } else if (hour - 1 > 0) {
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(Long.valueOf(timeStr).longValue() * 1000);
            SimpleDateFormat format = new SimpleDateFormat("HH:mm");
            if (isYesterday(Long.valueOf(timeStr).longValue() * 1000)) {
                sb.append("昨天" + format.format(calendar.getTime()));
            } else {
                if (hour >= 24) {
                    sb.append("1天");
                } else {
                    sb.append(hour + "小时");
                }
            }
        } else if (minute - 1 > 0) {
            if (minute == 60) {
                sb.append("1小时");
            } else {
                sb.append(minute + "分钟");
            }
        } else if (mill - 1 > 0) {
            if (mill == 60) {
                sb.append("1分钟");
            } else {
                sb.append(mill + "秒");
            }
        } else {
            sb.append("刚刚");
        }
        if (!sb.toString().equals("刚刚") && !sb.toString().contains("昨天")) {
            sb.append("前");
        }
        return sb.toString();
    }

    /**
     * 将时间转换为时间戳
     */
    public static long getStringDataToLong(String time) {
        if (TextUtils.isEmpty(time)) {
            return 0;
        }
        try {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
            Date date = simpleDateFormat.parse(time);
            long ts = date.getTime();
            return ts;
        } catch (Exception e) {

        }
        return 0;
    }

    public static String getClickCount(String value) {
        int count = Integer.valueOf(value).intValue();
        if (count > 1000000) {
            float temp = count * 1.0f / 10000 * 1.0f;
            BigDecimal mData = new BigDecimal(temp).setScale(0, BigDecimal.ROUND_HALF_UP);
            value = mData.toString() + "万";
        } else if (count > 10000) {
            float temp = count * 1.0f / 10000 * 1.0f;
            BigDecimal mData = new BigDecimal(temp).setScale(1, BigDecimal.ROUND_HALF_UP);
            value = mData.toString() + "万";
        }
        return value;
    }
}
