package com.hengqin.common;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/*
 *包名:com.zxkj.operate
 *作者:Adien_cui
 *时间:2017-8-21  上午10:20:01
 *描述:初始化Driver
 **/
public class InitDriver {
		//初始化ChromeDriver
		public static ChromeDriver launchChromeDriver(String browserName){
//			System.setProperty("webdriver.chrome.driver","resource/chromedriver.exe");
			DesiredCapabilities capabilities = DesiredCapabilities.chrome();
	        capabilities.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
	        //允许浏览器运行js脚本
	        capabilities.setJavascriptEnabled(true);
	        //设置页面加载策略
//			capabilities.setCapability("pageLoadStrategy","none");
			//设置chrome下载路径
			ChromeOptions options = new ChromeOptions();
			String downloadPath ="/Users/Wangjr/Desktop/down";
			HashMap<String,Object> hm = new  HashMap();
			hm.put("download.default_directory",downloadPath);
			options.setExperimentalOption("prefs",hm);

			if (browserName.equals("weidian") || browserName.equals("guanwei")){
				//设置iphoneX浏览网页模式
				Map<String, String> mobileEmulation = new HashMap<String, String>();
				mobileEmulation.put("deviceName", "iPhone 8");
				options.setExperimentalOption("mobileEmulation", mobileEmulation);
			}

			//浏览器最大化
//			options.addArguments("window-size=3750x812");

			capabilities.setCapability(ChromeOptions.CAPABILITY,options);
			//new一个chromedriver
	        ChromeDriver driver = new ChromeDriver(capabilities);
			//设置超时时间
	        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	        driver.manage().timeouts().setScriptTimeout(10, TimeUnit.SECONDS);
//	        driver.manage().window().setSize(new Dimension(375,812));
			return driver;
		}

		//初始化firefoxDriver
		public static FirefoxDriver launchFirefoxDriver(){
			FirefoxDriver driver = new FirefoxDriver();
			driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.manage().timeouts().setScriptTimeout(10, TimeUnit.SECONDS);
			driver.manage().window().maximize();
			return driver;
		}

		//初始化InternetExplorerDriver
		public static InternetExplorerDriver launchInternetExplorerDriver(){
			System.setProperty("webdriver.chrome.driver","F:/AutoTestAttachment/internetExplorerDriver.exe");
			InternetExplorerDriver driver = new InternetExplorerDriver();
			driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.manage().timeouts().setScriptTimeout(10, TimeUnit.SECONDS);
			driver.manage().window().maximize();
			return driver;
		}

		//初始化EdgeDriver
		public static EdgeDriver launchEdgeDriver(){
			EdgeDriver driver = new EdgeDriver();
			driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.manage().timeouts().setScriptTimeout(10, TimeUnit.SECONDS);
			driver.manage().window().maximize();
			return driver;
		}
}

