$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Feature123/mytest1.feature");
formatter.feature({
  "name": "Login applications on jenkins today",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Login functionality on app",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "Testme app Login",
  "keyword": "Given "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "User launched the app",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "User enters the vald credentials",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "verifies for login status in his credentials",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});