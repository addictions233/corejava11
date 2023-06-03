package com.corejava.date;

import java.util.Date;

/**
 * java类库中的Date类  --> 用来表示时间点  年月日时分秒
 *      Date类的实例: 当前时间点 或 某个特定的时间点
 */
public class DateDemo1 {
    public static void main(String[] args) {
        Date date = new Date();
        /**
         *  输出格式: 星期  月份 日期  HH:mm:ss  CST 年份
         */
        System.out.println("date = " + date);
    }

}
