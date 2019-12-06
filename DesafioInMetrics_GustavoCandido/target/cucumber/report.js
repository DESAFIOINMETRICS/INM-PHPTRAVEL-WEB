$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri('features\PhpTravelLoginFeature.feature');
formatter.feature({
  "line": 2,
  "name": "PhpTravels login",
  "description": "",
  "id": "phptravels-login",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@loginFeature"
    }
  ]
});
formatter.scenario({
  "line": 5,
  "name": "Navigate and login at PhpTravels portal",
  "description": "",
  "id": "phptravels-login;navigate-and-login-at-phptravels-portal",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@loginScenario"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "that the user opens the browser",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "the user navigate to PhpTravels website",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "Insert the administrator\u0027s E-mail",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "Insert the administrator\u0027s Password",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "click at LOGIN button",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "the user should access PhpTravels main page",
  "keyword": "Then "
});
formatter.match({
  "location": "PhpTravelLoginStep.openBrowser()"
});
formatter.result({
  "duration": 10156627761,
  "status": "passed"
});
formatter.match({
  "location": "PhpTravelLoginStep.navigateTo()"
});
formatter.result({
  "duration": 10930098873,
  "status": "passed"
});
formatter.match({
  "location": "PhpTravelLoginStep.insertEmail()"
});
formatter.result({
  "duration": 521989732,
  "status": "passed"
});
formatter.match({
  "location": "PhpTravelLoginStep.insertPassword()"
});
formatter.result({
  "duration": 251020345,
  "status": "passed"
});
formatter.match({
  "location": "PhpTravelLoginStep.clickLogin()"
});
formatter.result({
  "duration": 227523872,
  "status": "passed"
});
formatter.match({
  "location": "PhpTravelLoginStep.pageAccess()"
});
formatter.result({
  "duration": 518552351,
  "status": "passed"
});
});