package com.hengqin.utils;

import org.apache.log4j.Logger;

/**
 * Created by pc on 2018/6/26.
 */
public class Log4jTest {
    private static Logger Log = Logger.getLogger(Log4jTest.class.getName());

    //定义一个静态方法，打印自定义的某个测试用例开始的日志信息
    public static void startTestCase(String sTestCaseName){
        Log.info("-----------------------------");
        Log.info("********          "+sTestCaseName+"            *******");
    }
    //定义一个静态方法，打印自定义的某个测试用例结束的日志信息
    public static void endTestCase(String sTestCaseName){

        Log.info("********          "+sTestCaseName+"             *******");
        Log.info("-----------------------------");
    }
    public static void info(String message){
        Log.info(message);
    }
    public static void warn(String message){
        Log.warn(message);
    }
    public static void error(String message){
        Log.error(message);
    }
    public static void fatal(String message){
        Log.fatal(message);
    }
    public static void debug(String message){
        Log.debug(message);
    }

}
