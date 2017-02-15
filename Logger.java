package jzg.taskdemo.utils;

import android.util.Log;

import java.sql.Timestamp;


/**
 * author：doujianshun on 2017/2/8 10:24
 * email：doujs@jingzhengu.com
 */

public class Logger {

    private Class<?> clazz;

    /**
     * @param clazz the class.
     * @return a new logger.
     */
    public static Logger getLogger(Class<?> clazz) {
        return new Logger(clazz);
    }

    private Logger(Class<?> newClazz) {
        clazz = newClazz;
    }

    /**
     * @param e the exception to log.
     */
    public void error(Exception e) {
        Timestamp t = new Timestamp(new java.util.Date().getTime());
        Log.e(clazz.getName(), t.toString() + " " + e.getMessage());
    }

    /**
     * @param msg the message to log
     * @param e the exception to log.
     */
    public void error(final String msg, Exception e) {
        Timestamp t = new Timestamp(new java.util.Date().getTime());
        Log.e(clazz.getName(), t.toString() + " " + msg + ":" + e.getMessage());
    }

    /**
     * @param msg the message to log
     */
    public void error(final String msg) {
        Timestamp t = new Timestamp(new java.util.Date().getTime());
        Log.e(clazz.getName(), t.toString() + " " + msg);
    }

    /**
     * @param msg the message to log
     */
    public void warn(final String msg) {
        Timestamp t = new Timestamp(new java.util.Date().getTime());
        Log.w(clazz.getName(), t.toString() + " " + msg);
    }

    /**
     * @param msg the message to log
     */
    public void info(final String msg) {
        Timestamp t = new Timestamp(new java.util.Date().getTime());
        Log.i(clazz.getName(), t.toString() + " " + msg);
    }

    /**
     * @param msg the message to log
     */
    public void debug(final String msg) {
        Timestamp t = new Timestamp(new java.util.Date().getTime());
        Log.d(clazz.getName(), t.toString() + " " + msg);
    }
}