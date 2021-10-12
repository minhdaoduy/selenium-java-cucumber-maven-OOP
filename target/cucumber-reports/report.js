$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/functionalTests/Purchase.feature");
formatter.feature({
  "line": 1,
  "name": "Purchase feature",
  "description": "I want to make a purchase on automationpractice website",
  "id": "purchase-feature",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 4,
  "name": "Purchase successfull scenario",
  "description": "",
  "id": "purchase-feature;purchase-successfull-scenario",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "I want to go to automationpractice website",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "verify the mystore title",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "I click on sign in",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "I should see the login page",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "I enter \"\u003ccustomer\u003e\" login credentials",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "I should see the my account page",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "I choose the option women and choose tshirts",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "I should see the tshirts section",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "I choose medium size",
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "I add the faded short sleeve tshirt to the cart",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "I choose proceed to checkout on tshirts selection page",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "I should see my order page",
  "keyword": "Then "
});
formatter.step({
  "line": 17,
  "name": "I choose proceed to checkout on order page",
  "keyword": "When "
});
formatter.step({
  "line": 18,
  "name": "I choose the payment method cheque",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "I confirm my order",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "I should see order confirmation page",
  "keyword": "Then "
});
formatter.step({
  "line": 21,
  "name": "validate the payment amount",
  "keyword": "And "
});
formatter.examples({
  "line": 23,
  "name": "",
  "description": "",
  "id": "purchase-feature;purchase-successfull-scenario;",
  "rows": [
    {
      "cells": [
        "customer"
      ],
      "line": 24,
      "id": "purchase-feature;purchase-successfull-scenario;;1"
    },
    {
      "cells": [
        "Minh"
      ],
      "line": 25,
      "id": "purchase-feature;purchase-successfull-scenario;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 374388,
  "status": "passed"
});
formatter.scenario({
  "line": 25,
  "name": "Purchase successfull scenario",
  "description": "",
  "id": "purchase-feature;purchase-successfull-scenario;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "I want to go to automationpractice website",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "verify the mystore title",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "I click on sign in",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "I should see the login page",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "I enter \"Minh\" login credentials",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "I should see the my account page",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "I choose the option women and choose tshirts",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "I should see the tshirts section",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "I choose medium size",
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "I add the faded short sleeve tshirt to the cart",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "I choose proceed to checkout on tshirts selection page",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "I should see my order page",
  "keyword": "Then "
});
formatter.step({
  "line": 17,
  "name": "I choose proceed to checkout on order page",
  "keyword": "When "
});
formatter.step({
  "line": 18,
  "name": "I choose the payment method cheque",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "I confirm my order",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "I should see order confirmation page",
  "keyword": "Then "
});
formatter.step({
  "line": 21,
  "name": "validate the payment amount",
  "keyword": "And "
});
formatter.match({
  "location": "APHomePageSteps.java:17"
});
formatter.result({
  "duration": 9956964843,
  "status": "passed"
});
formatter.match({
  "location": "APHomePageSteps.java:23"
});
formatter.result({
  "duration": 20203788,
  "status": "passed"
});
formatter.match({
  "location": "APHomePageSteps.java:29"
});
formatter.result({
  "duration": 7597390822,
  "status": "passed"
});
formatter.match({
  "location": "APSignInPageSteps.java:17"
});
formatter.result({
  "duration": 7903317,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Minh",
      "offset": 9
    }
  ],
  "location": "APSignInPageSteps.java:23"
});
formatter.result({
  "duration": 6420853202,
  "status": "passed"
});
formatter.match({
  "location": "APMyAccountPageSteps.java:15"
});
formatter.result({
  "duration": 5785542,
  "status": "passed"
});
formatter.match({
  "location": "APMyAccountPageSteps.java:21"
});
formatter.result({
  "duration": 13000683101,
  "status": "passed"
});
formatter.match({
  "location": "APTshirtsSectionPageSteps.java:15"
});
formatter.result({
  "duration": 5853561,
  "status": "passed"
});
formatter.match({
  "location": "APTshirtsSectionPageSteps.java:21"
});
formatter.result({
  "duration": 86374725,
  "status": "passed"
});
formatter.match({
  "location": "APTshirtsSectionPageSteps.java:27"
});
formatter.result({
  "duration": 5181027657,
  "status": "passed"
});
formatter.match({
  "location": "APTshirtsSectionPageSteps.java:33"
});
formatter.result({
  "duration": 4669880728,
  "status": "passed"
});
formatter.match({
  "location": "APOrderPageSteps.java:16"
});
formatter.result({
  "duration": 6340029,
  "status": "passed"
});
formatter.match({
  "location": "APOrderPageSteps.java:22"
});
formatter.result({
  "duration": 6355065473,
  "status": "passed"
});
formatter.match({
  "location": "APOrderPageSteps.java:31"
});
formatter.result({
  "duration": 1494329080,
  "status": "passed"
});
formatter.match({
  "location": "APOrderPageSteps.java:37"
});
formatter.result({
  "duration": 7730138504,
  "status": "passed"
});
formatter.match({
  "location": "APOrderConfirmationPageSteps.java:16"
});
formatter.result({
  "duration": 28665166,
  "status": "passed"
});
formatter.match({
  "location": "APOrderConfirmationPageSteps.java:22"
});
formatter.result({
  "duration": 36801655,
  "status": "passed"
});
formatter.after({
  "duration": 183737283,
  "status": "passed"
});
});