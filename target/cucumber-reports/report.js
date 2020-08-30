$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("login.feature");
formatter.feature({
  "line": 1,
  "name": "GovtTech Login",
  "description": "",
  "id": "govttech-login",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 199,
  "name": "User submits the application and reviews submission",
  "description": "",
  "id": "govttech-login;user-submits-the-application-and-reviews-submission",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 198,
      "name": "@BGP"
    }
  ]
});
formatter.step({
  "line": 200,
  "name": "user opens the GovtTech URL with \"\u003cUsername\u003e\" and \"\u003cPassword\u003e\"",
  "keyword": "Given "
});
formatter.step({
  "line": 201,
  "name": "User logs in to corpass with \"\u003cNRIC\u003e\" and \"\u003cname\u003e\" and \"\u003cUEN\u003e\" and \"\u003cRole\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 202,
  "name": "User clicks on My Grants and Get new Grant with \"\u003cMenu\u003e\" and \"\u003cSubMenu\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 203,
  "name": "User selects \"\u003csector\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 204,
  "name": "User selects the \"\u003cgrant\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 205,
  "name": "User applies for \"\u003cMarketgrant\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 206,
  "name": "user fills up Application form with \"\u003cq1\u003e\" and \"\u003cq2\u003e\" and \"\u003cq3\u003e\" and \"\u003cq4\u003e\" and \"\u003cq5\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 207,
  "name": "User clicks on Next Button",
  "keyword": "And "
});
formatter.step({
  "line": 208,
  "name": "User fills up contact details form",
  "keyword": "And "
});
formatter.step({
  "line": 209,
  "name": "User clicks on Next Button",
  "keyword": "And "
});
formatter.step({
  "line": 210,
  "name": "user fills up proposal section",
  "keyword": "And "
});
formatter.step({
  "line": 211,
  "name": "User clicks on Next Button",
  "keyword": "And "
});
formatter.step({
  "line": 212,
  "name": "user fills up business impact section",
  "keyword": "And "
});
formatter.step({
  "line": 213,
  "name": "User clicks on Next Button",
  "keyword": "And "
});
formatter.step({
  "line": 214,
  "name": "User provides details of cost",
  "keyword": "And "
});
formatter.step({
  "line": 215,
  "name": "User clicks on Next Button",
  "keyword": "And "
});
formatter.step({
  "line": 216,
  "name": "User reviews the form",
  "keyword": "And "
});
formatter.step({
  "line": 217,
  "name": "User verifies the errors in form",
  "keyword": "And "
});
formatter.step({
  "line": 218,
  "name": "User reviews submission",
  "keyword": "And "
});
formatter.examples({
  "line": 221,
  "name": "",
  "description": "",
  "id": "govttech-login;user-submits-the-application-and-reviews-submission;",
  "rows": [
    {
      "cells": [
        "Username",
        "Password",
        "NRIC",
        "name",
        "UEN",
        "Role",
        "Menu",
        "SubMenu",
        "sector",
        "grant",
        "Marketgrant",
        "q1",
        "q2",
        "q3",
        "q4",
        "q5"
      ],
      "line": 222,
      "id": "govttech-login;user-submits-the-application-and-reviews-submission;;1"
    },
    {
      "cells": [
        "public",
        "Let$BeC001",
        "G3267797W",
        "Sneha Shah",
        "A12LL1368E",
        "Acceptor",
        "Dashboard",
        "Get new grant",
        "IT",
        "International Expansion",
        "Market Readiness Assistance",
        "react-eligibility-sg_registered_check",
        "react-eligibility-turnover_check",
        "react-eligibility-global_hq_check",
        "react-eligibility-new_target_market_check",
        "react-eligibility-started_project_check"
      ],
      "line": 223,
      "id": "govttech-login;user-submits-the-application-and-reviews-submission;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 178900,
  "status": "passed"
});
formatter.scenario({
  "line": 223,
  "name": "User submits the application and reviews submission",
  "description": "",
  "id": "govttech-login;user-submits-the-application-and-reviews-submission;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 198,
      "name": "@BGP"
    }
  ]
});
formatter.step({
  "line": 200,
  "name": "user opens the GovtTech URL with \"public\" and \"Let$BeC001\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 201,
  "name": "User logs in to corpass with \"G3267797W\" and \"Sneha Shah\" and \"A12LL1368E\" and \"Acceptor\"",
  "matchedColumns": [
    2,
    3,
    4,
    5
  ],
  "keyword": "And "
});
formatter.step({
  "line": 202,
  "name": "User clicks on My Grants and Get new Grant with \"Dashboard\" and \"Get new grant\"",
  "matchedColumns": [
    6,
    7
  ],
  "keyword": "And "
});
formatter.step({
  "line": 203,
  "name": "User selects \"IT\"",
  "matchedColumns": [
    8
  ],
  "keyword": "And "
});
formatter.step({
  "line": 204,
  "name": "User selects the \"International Expansion\"",
  "matchedColumns": [
    9
  ],
  "keyword": "And "
});
formatter.step({
  "line": 205,
  "name": "User applies for \"Market Readiness Assistance\"",
  "matchedColumns": [
    10
  ],
  "keyword": "And "
});
formatter.step({
  "line": 206,
  "name": "user fills up Application form with \"react-eligibility-sg_registered_check\" and \"react-eligibility-turnover_check\" and \"react-eligibility-global_hq_check\" and \"react-eligibility-new_target_market_check\" and \"react-eligibility-started_project_check\"",
  "matchedColumns": [
    11,
    12,
    13,
    14,
    15
  ],
  "keyword": "And "
});
formatter.step({
  "line": 207,
  "name": "User clicks on Next Button",
  "keyword": "And "
});
formatter.step({
  "line": 208,
  "name": "User fills up contact details form",
  "keyword": "And "
});
formatter.step({
  "line": 209,
  "name": "User clicks on Next Button",
  "keyword": "And "
});
formatter.step({
  "line": 210,
  "name": "user fills up proposal section",
  "keyword": "And "
});
formatter.step({
  "line": 211,
  "name": "User clicks on Next Button",
  "keyword": "And "
});
formatter.step({
  "line": 212,
  "name": "user fills up business impact section",
  "keyword": "And "
});
formatter.step({
  "line": 213,
  "name": "User clicks on Next Button",
  "keyword": "And "
});
formatter.step({
  "line": 214,
  "name": "User provides details of cost",
  "keyword": "And "
});
formatter.step({
  "line": 215,
  "name": "User clicks on Next Button",
  "keyword": "And "
});
formatter.step({
  "line": 216,
  "name": "User reviews the form",
  "keyword": "And "
});
formatter.step({
  "line": 217,
  "name": "User verifies the errors in form",
  "keyword": "And "
});
formatter.step({
  "line": 218,
  "name": "User reviews submission",
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "public",
      "offset": 34
    },
    {
      "val": "Let$BeC001",
      "offset": 47
    }
  ],
  "location": "StepDefinitions.userOpensTheGovtTechURLWithAnd(String,String)"
});
formatter.result({
  "duration": 8463678400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "G3267797W",
      "offset": 30
    },
    {
      "val": "Sneha Shah",
      "offset": 46
    },
    {
      "val": "A12LL1368E",
      "offset": 63
    },
    {
      "val": "Acceptor",
      "offset": 80
    }
  ],
  "location": "StepDefinitions.userLogsInToCorpassWithAndAndAnd(String,String,String,String)"
});
formatter.result({
  "duration": 1536120200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Dashboard",
      "offset": 49
    },
    {
      "val": "Get new grant",
      "offset": 65
    }
  ],
  "location": "StepDefinitions.userClicksOnMyGrantsAndGetNewGrantWithAnd(String,String)"
});
formatter.result({
  "duration": 16039275800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "IT",
      "offset": 14
    }
  ],
  "location": "StepDefinitions.userSelects(String)"
});
formatter.result({
  "duration": 368364700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "International Expansion",
      "offset": 18
    }
  ],
  "location": "StepDefinitions.userSelectsThe(String)"
});
formatter.result({
  "duration": 70504300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Market Readiness Assistance",
      "offset": 18
    }
  ],
  "location": "StepDefinitions.userAppliesFor(String)"
});
formatter.result({
  "duration": 160553900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "react-eligibility-sg_registered_check",
      "offset": 37
    },
    {
      "val": "react-eligibility-turnover_check",
      "offset": 81
    },
    {
      "val": "react-eligibility-global_hq_check",
      "offset": 120
    },
    {
      "val": "react-eligibility-new_target_market_check",
      "offset": 160
    },
    {
      "val": "react-eligibility-started_project_check",
      "offset": 208
    }
  ],
  "location": "StepDefinitions.userFillsUpApplicationFormWithAndAndAndAnd(String,String,String,String,String)"
});
formatter.result({
  "duration": 45394637100,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.userClicksOnNextButton()"
});
formatter.result({
  "duration": 305130500,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.userFillsUpContactDetailsForm()"
});
formatter.result({
  "duration": 3141603800,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.userClicksOnNextButton()"
});
formatter.result({
  "duration": 64409900,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.userFillsUpProposalSection()"
});
formatter.result({
  "duration": 43694873800,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.userClicksOnNextButton()"
});
formatter.result({
  "duration": 1936232000,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.userFillsUpBusinessImpactSection()"
});
formatter.result({
  "duration": 1616929000,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.userClicksOnNextButton()"
});
formatter.result({
  "duration": 62825100,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.userProvidesDetailsOfCost()"
});
formatter.result({
  "duration": 2617637900,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.userClicksOnNextButton()"
});
formatter.result({
  "duration": 97608800,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.userReviewsTheForm()"
});
formatter.result({
  "duration": 2059420200,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.userVerifiesTheErrorsInForm()"
});
formatter.result({
  "duration": 7418125000,
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"//h2[text()\u003d\u0027Submit Your Proposal\u0027]\"}\n  (Session info: chrome\u003d85.0.4183.83)\n  (Driver info: chromedriver\u003d84.0.4147.30 (48b3e868b4cc0aa7e8149519690b6f6949e110a8-refs/branch-heads/4147@{#310}),platform\u003dWindows NT 10.0.18362 x86_64) (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 5.03 seconds\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00272.45.0\u0027, revision: \u00275017cb8e7ca8e37638dc3091b2440b90a1d8686f\u0027, time: \u00272015-02-27 09:10:26\u0027\nSystem info: host: \u0027DESKTOP-RITQEUO\u0027, ip: \u0027192.168.1.94\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_261\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities [{mobileEmulationEnabled\u003dfalse, timeouts\u003d{implicit\u003d0, pageLoad\u003d300000, script\u003d30000}, hasTouchScreen\u003dfalse, platform\u003dXP, acceptSslCerts\u003dfalse, goog:chromeOptions\u003d{debuggerAddress\u003dlocalhost:54144}, acceptInsecureCerts\u003dfalse, webStorageEnabled\u003dtrue, browserName\u003dchrome, takesScreenshot\u003dtrue, javascriptEnabled\u003dtrue, setWindowRect\u003dtrue, unexpectedAlertBehaviour\u003dignore, applicationCacheEnabled\u003dfalse, rotatable\u003dfalse, networkConnectionEnabled\u003dfalse, chrome\u003d{chromedriverVersion\u003d84.0.4147.30 (48b3e868b4cc0aa7e8149519690b6f6949e110a8-refs/branch-heads/4147@{#310}), userDataDir\u003dC:\\Users\\hp\\AppData\\Local\\Temp\\scoped_dir18048_669800730}, takesHeapSnapshot\u003dtrue, pageLoadStrategy\u003dnormal, strictFileInteractability\u003dfalse, databaseEnabled\u003dfalse, handlesAlerts\u003dtrue, version\u003d85.0.4183.83, browserConnectionEnabled\u003dfalse, proxy\u003d{}, nativeEvents\u003dtrue, locationContextEnabled\u003dtrue, cssSelectorsEnabled\u003dtrue, webauthn:virtualAuthenticators\u003dtrue}]\nSession ID: b7f1cafd2e97f0e85c9fea2131dd10ed\n*** Element info: {Using\u003dxpath, value\u003d//h2[text()\u003d\u0027Submit Your Proposal\u0027]}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:204)\r\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:156)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:599)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:352)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:449)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:357)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:344)\r\n\tat pages.LoginPage.verifyerrors(LoginPage.java:524)\r\n\tat stepdefs.StepDefinitions.userVerifiesTheErrorsInForm(StepDefinitions.java:132)\r\n\tat ✽.And User verifies the errors in form(login.feature:217)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "StepDefinitions.userReviewsSubmission()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 50300,
  "status": "passed"
});
});