package org.carder.tool;

import java.util.Calendar;

public class Time {
    private final static Calendar CALENDAR = Calendar.getInstance();

    static {
        CALENDAR.setFirstDayOfWeek(Calendar.MONDAY);
    }

    /**
     * 获取现在是几点 (24 小时制)
     *
     * @return 如当前是下午 13 点则返回 13，以此类推
     */
    public static int getHour() {
        updateCalendar();
        return CALENDAR.get(Calendar.HOUR_OF_DAY);
    }

    /**
     * 获取现在是几分
     *
     * @return 如现在是 10:18 分则返回 18，以此类推
     */
    public static int getMinute() {
        updateCalendar();
        return CALENDAR.get(Calendar.MINUTE);
    }

    /**
     * 获取现在是上午还是下午
     *
     * @return 如上午则返回 true, 反之则返回 false
     */
    public static boolean isAm() {
        updateCalendar();
        return CALENDAR.get(Calendar.AM_PM) == Calendar.AM;
    }

    /**
     * 获取当前月份
     *
     * @return 如当前为 10 月份则返回 10，以此类推
     */
    public static int getMonth() {
        updateCalendar();
        return CALENDAR.get(Calendar.MONTH) + 1;
    }

    /**
     * 获取今日是本月的第几天
     *
     * @return 如今天是 10 号则返回 10，以此类推
     */
    public static int getDayOfMonth() {
        updateCalendar();
        return CALENDAR.get(Calendar.DAY_OF_MONTH);
    }

    /**
     * 获取本周是当月的第几周
     *
     * @return 如本周是当月的第 2 周则返回 2，以此类推
     */
    public static int getWeekOfMonth() {
        updateCalendar();
        return CALENDAR.get(Calendar.WEEK_OF_MONTH);
    }

    /**
     * 获取当前是第几个季度
     *
     * @return 如当前是第一季度则返回1，以此类推
     */
    public static int getQuarter() {
        switch (getMonth()) {
            case 1:
            case 2:
            case 3:
                return 1;
            case 4:
            case 5:
            case 6:
                return 2;
            case 7:
            case 8:
            case 9:
                return 3;
            case 10:
            case 11:
            case 12:
                return 4;
        }
        return 0;
    }

    /**
     * 获取当前系统时间的年份
     *
     * @return 如当前为 2019 年则返回 2019，以此类推
     */
    public static int getYear() {
        updateCalendar();
        return CALENDAR.get(Calendar.YEAR);
    }

    /**
     * 获取今日是今年的第几天
     *
     * @return 如今天是今年的第 283 天则返回 283，以此类推
     */
    public static int getDayOfYear() {
        updateCalendar();
        return CALENDAR.get(Calendar.DAY_OF_YEAR);
    }

    private static void updateCalendar() {
        CALENDAR.setTimeInMillis(System.currentTimeMillis());
    }
}
