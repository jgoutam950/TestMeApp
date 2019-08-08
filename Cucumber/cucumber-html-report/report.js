$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("LoginFeature.feature");
formatter.feature({
  "line": 1,
  "name": "Login Fuctionality",
  "description": "",
  "id": "login-fuctionality",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 4,
  "name": "Login with valid Credentials",
  "description": "",
  "id": "login-fuctionality;login-with-valid-credentials",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@Login"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "Navigate to home page",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "user enters \"\u003cusername\u003e\" and \"\u003cpassword\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "user logged in successfully Via New Method.",
  "keyword": "Then "
});
formatter.examples({
  "line": 9,
  "name": "",
  "description": "",
  "id": "login-fuctionality;login-with-valid-credentials;",
  "rows": [
    {
      "cells": [
        "username",
        "",
        "password"
      ],
      "line": 10,
      "id": "login-fuctionality;login-with-valid-credentials;;1"
    },
    {
      "cells": [
        "Admin",
        "",
        "password456"
      ],
      "line": 11,
      "id": "login-fuctionality;login-with-valid-credentials;;2"
    },
    {
      "cells": [
        "lalitha",
        "",
        "password123"
      ],
      "line": 12,
      "id": "login-fuctionality;login-with-valid-credentials;;3"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 11,
  "name": "Login with valid Credentials",
  "description": "",
  "id": "login-fuctionality;login-with-valid-credentials;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@Login"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "Navigate to home page",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "user enters \"Admin\" and \"password456\"",
  "matchedColumns": [
    0,
    2
  ],
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "user logged in successfully Via New Method.",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginFeatureStepDefinition.navigateToHomePage()"
});
formatter.result({
  "duration": 6873485700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Admin",
      "offset": 13
    },
    {
      "val": "password456",
      "offset": 25
    }
  ],
  "location": "LoginFeatureStepDefinition.userEntersAnd(String,String)"
});
formatter.result({
  "duration": 1259571600,
  "status": "passed"
});
formatter.match({
  "location": "LoginFeatureStepDefinition.userLoggedInSuccessfullyViaNewMethod()"
});
formatter.result({
  "duration": 779470600,
  "status": "passed"
});
formatter.scenario({
  "line": 12,
  "name": "Login with valid Credentials",
  "description": "",
  "id": "login-fuctionality;login-with-valid-credentials;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@Login"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "Navigate to home page",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "user enters \"lalitha\" and \"password123\"",
  "matchedColumns": [
    0,
    2
  ],
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "user logged in successfully Via New Method.",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginFeatureStepDefinition.navigateToHomePage()"
});
formatter.result({
  "duration": 5828228000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "lalitha",
      "offset": 13
    },
    {
      "val": "password123",
      "offset": 27
    }
  ],
  "location": "LoginFeatureStepDefinition.userEntersAnd(String,String)"
});
formatter.result({
  "duration": 1945283900,
  "status": "passed"
});
formatter.match({
  "location": "LoginFeatureStepDefinition.userLoggedInSuccessfullyViaNewMethod()"
});
formatter.result({
  "duration": 731503400,
  "status": "passed"
});
});