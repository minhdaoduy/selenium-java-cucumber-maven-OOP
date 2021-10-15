$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Purchase.feature");
formatter.feature({
  "line": 1,
  "name": "Purchase feature",
  "description": "I want to make a purchase on automationpractice website",
  "id": "purchase-feature",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 5,
  "name": "Purchase successfull scenario",
  "description": "",
  "id": "purchase-feature;purchase-successfull-scenario",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 4,
      "name": "@SmokeTest"
    },
    {
      "line": 4,
      "name": "@End2End"
    },
    {
      "line": 4,
      "name": "@debug"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "I want to go to automationpractice website",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "verify the mystore title",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "I click on sign in",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "I should see the login page",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "I enter \"\u003ccustomer\u003e\" login credentials",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "I should see the my account page",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "I choose the option women and choose tshirts",
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "I should see the tshirts section",
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "I choose medium size",
  "keyword": "When "
});
formatter.step({
  "line": 15,
  "name": "I add the faded short sleeve tshirt to the cart",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "I choose proceed to checkout on tshirts selection page",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "I should see my order page",
  "keyword": "Then "
});
formatter.step({
  "line": 18,
  "name": "I choose proceed to checkout on order page",
  "keyword": "When "
});
formatter.step({
  "line": 19,
  "name": "I choose the payment method cheque",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "I confirm my order",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "I should see order confirmation page",
  "keyword": "Then "
});
formatter.step({
  "line": 22,
  "name": "validate the payment amount",
  "keyword": "And "
});
formatter.examples({
  "line": 24,
  "name": "",
  "description": "",
  "id": "purchase-feature;purchase-successfull-scenario;",
  "rows": [
    {
      "cells": [
        "customer"
      ],
      "line": 25,
      "id": "purchase-feature;purchase-successfull-scenario;;1"
    },
    {
      "cells": [
        "Minh"
      ],
      "line": 26,
      "id": "purchase-feature;purchase-successfull-scenario;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 191522,
  "status": "passed"
});
formatter.scenario({
  "line": 26,
  "name": "Purchase successfull scenario",
  "description": "",
  "id": "purchase-feature;purchase-successfull-scenario;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 4,
      "name": "@End2End"
    },
    {
      "line": 4,
      "name": "@debug"
    },
    {
      "line": 4,
      "name": "@SmokeTest"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "I want to go to automationpractice website",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "verify the mystore title",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "I click on sign in",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "I should see the login page",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "I enter \"Minh\" login credentials",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "I should see the my account page",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "I choose the option women and choose tshirts",
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "I should see the tshirts section",
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "I choose medium size",
  "keyword": "When "
});
formatter.step({
  "line": 15,
  "name": "I add the faded short sleeve tshirt to the cart",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "I choose proceed to checkout on tshirts selection page",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "I should see my order page",
  "keyword": "Then "
});
formatter.step({
  "line": 18,
  "name": "I choose proceed to checkout on order page",
  "keyword": "When "
});
formatter.step({
  "line": 19,
  "name": "I choose the payment method cheque",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "I confirm my order",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "I should see order confirmation page",
  "keyword": "Then "
});
formatter.step({
  "line": 22,
  "name": "validate the payment amount",
  "keyword": "And "
});
formatter.match({
  "location": "APHomePageSteps.java:15"
});
formatter.result({
  "duration": 8680547066,
  "status": "passed"
});
formatter.match({
  "location": "APHomePageSteps.java:21"
});
formatter.result({
  "duration": 18110022,
  "status": "passed"
});
formatter.match({
  "location": "APHomePageSteps.java:27"
});
formatter.result({
  "duration": 2623852710,
  "status": "passed"
});
formatter.match({
  "location": "APSignInPageSteps.java:15"
});
formatter.result({
  "duration": 6634841,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Minh",
      "offset": 9
    }
  ],
  "location": "APSignInPageSteps.java:21"
});
formatter.result({
  "duration": 2337724180,
  "status": "passed"
});
formatter.match({
  "location": "APMyAccountPageSteps.java:13"
});
formatter.result({
  "duration": 7292279,
  "status": "passed"
});
formatter.match({
  "location": "APMyAccountPageSteps.java:19"
});
formatter.result({
  "duration": 2750135012,
  "status": "passed"
});
formatter.match({
  "location": "APTshirtsSectionPageSteps.java:13"
});
formatter.result({
  "duration": 6504684,
  "status": "passed"
});
formatter.match({
  "location": "APTshirtsSectionPageSteps.java:19"
});
formatter.result({
  "duration": 94050820,
  "status": "passed"
});
formatter.match({
  "location": "APTshirtsSectionPageSteps.java:25"
});
formatter.result({
  "duration": 209486006,
  "status": "passed"
});
formatter.match({
  "location": "APTshirtsSectionPageSteps.java:31"
});
formatter.result({
  "duration": 3145093743,
  "status": "passed"
});
formatter.match({
  "location": "APOrderPageSteps.java:14"
});
formatter.result({
  "duration": 5385698,
  "status": "passed"
});
formatter.match({
  "location": "APOrderPageSteps.java:20"
});
formatter.result({
  "duration": 4960762692,
  "status": "passed"
});
formatter.match({
  "location": "APOrderPageSteps.java:29"
});
formatter.result({
  "duration": 2670683571,
  "status": "passed"
});
formatter.match({
  "location": "APOrderPageSteps.java:35"
});
formatter.result({
  "duration": 2701827960,
  "status": "passed"
});
formatter.match({
  "location": "APOrderConfirmationPageSteps.java:14"
});
formatter.result({
  "duration": 5367424,
  "status": "passed"
});
formatter.match({
  "location": "APOrderConfirmationPageSteps.java:20"
});
formatter.result({
  "duration": 25287672,
  "status": "passed"
});
formatter.after({
  "duration": 199160236,
  "status": "passed"
});
});