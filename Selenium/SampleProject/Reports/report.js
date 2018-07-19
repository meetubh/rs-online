$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Features/feature.feature");
formatter.feature({
  "name": "Booking a Hotel at Adactin",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Booking a hotel with all mandatory details",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "I am on Adactin Home page with browser \"Chrome\"",
  "keyword": "Given "
});
formatter.match({
  "location": "Test.user_is_on_Login_Page(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I login to the application by providing below credentials",
  "rows": [
    {
      "cells": [
        "Username",
        "Password"
      ]
    },
    {
      "cells": [
        "RobinCAP",
        "79D209"
      ]
    }
  ],
  "keyword": "And "
});
formatter.match({
  "location": "Test.login(String,String\u003e)"
});
formatter.result({
  "error_message": "org.openqa.selenium.WebDriverException: unknown error: keys should be a string\n  (Session info: chrome\u003d67.0.3396.99)\n  (Driver info: chromedriver\u003d2.40.565498 (ea082db3280dd6843ebfb08a625e3eb905c4f5ab),platform\u003dWindows NT 10.0.17134 x86_64) (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 0 milliseconds\nBuild info: version: \u00273.13.0\u0027, revision: \u00272f0d292\u0027, time: \u00272018-06-25T15:32:19.891Z\u0027\nSystem info: host: \u0027CWAZCLIENT-20\u0027, ip: \u002710.14.0.13\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_171\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, acceptSslCerts: false, applicationCacheEnabled: false, browserConnectionEnabled: false, browserName: chrome, chrome: {chromedriverVersion: 2.40.565498 (ea082db3280dd6..., userDataDir: C:\\Users\\P10138~1\\AppData\\L...}, cssSelectorsEnabled: true, databaseEnabled: false, handlesAlerts: true, hasTouchScreen: false, javascriptEnabled: true, locationContextEnabled: true, mobileEmulationEnabled: false, nativeEvents: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: XP, platformName: XP, rotatable: false, setWindowRect: true, takesHeapSnapshot: true, takesScreenshot: true, unexpectedAlertBehaviour: , unhandledPromptBehavior: , version: 67.0.3396.99, webStorageEnabled: true}\nSession ID: 8b611f5105259acab76a1ba1e2df1ac7\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat java.lang.reflect.Constructor.newInstance(Unknown Source)\r\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:214)\r\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:166)\r\n\tat org.openqa.selenium.remote.http.JsonHttpResponseCodec.reconstructValue(JsonHttpResponseCodec.java:40)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:80)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:44)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:548)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.execute(RemoteWebElement.java:276)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.sendKeys(RemoteWebElement.java:100)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(Unknown Source)\r\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(Unknown Source)\r\n\tat java.lang.reflect.Method.invoke(Unknown Source)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:51)\r\n\tat com.sun.proxy.$Proxy14.sendKeys(Unknown Source)\r\n\tat pageObjects.LoginPage.enter_Pwd(LoginPage.java:43)\r\n\tat stepDefinitions.Test.login(Test.java:124)\r\n\tat ✽.I login to the application by providing below credentials(Features/feature.feature:6)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "I input required information to search a hotel",
  "keyword": "Then "
});
formatter.match({
  "location": "Test.validate_login()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Select the resulted hotel and proceed to book the hotel",
  "keyword": "And "
});
formatter.match({
  "location": "Test.select_hotel()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "I validate the booking confirmation message",
  "keyword": "And "
});
formatter.match({
  "location": "Test.booking_confirmation()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "I logout of the application",
  "keyword": "Then "
});
formatter.match({
  "location": "Test.logout()"
});
formatter.result({
  "status": "skipped"
});
});