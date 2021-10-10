$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/functionalTests/Booking.feature");
formatter.feature({
  "line": 1,
  "name": "Booking feature",
  "description": "",
  "id": "booking-feature",
  "keyword": "Feature"
});
formatter.before({
  "duration": 2154436985,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "Booking scenario",
  "description": "",
  "id": "booking-feature;booking-scenario",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "Access booking page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "Do some thing",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "Verify something",
  "keyword": "Then "
});
formatter.match({
  "location": "BookingSteps.access_booking_page()"
});
formatter.result({
  "duration": 3420921536,
  "status": "passed"
});
formatter.match({
  "location": "BookingSteps.do_some_thing()"
});
formatter.result({
  "duration": 60627,
  "status": "passed"
});
formatter.match({
  "location": "BookingSteps.verify_something()"
});
formatter.result({
  "duration": 40363,
  "status": "passed"
});
formatter.after({
  "duration": 235391134,
  "status": "passed"
});
});