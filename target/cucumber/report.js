$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/features/ButtonFun.feature");
formatter.feature({
  "line": 2,
  "name": "Sky Blue Background",
  "description": "",
  "id": "sky-blue-background",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@Scenario1"
    }
  ]
});
formatter.before({
  "duration": 2639199900,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "Sky Blue Background is displayed",
  "description": "",
  "id": "sky-blue-background;sky-blue-background-is-displayed",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "Set SkyBlue Background button exists",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I click on the button",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "the background color will change to sky blue",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.set_SkyBlue_Background_button_exists()"
});
formatter.result({
  "duration": 4186237600,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.i_click_on_the_button()"
});
formatter.result({
  "duration": 3068728000,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.the_background_color_will_change_to_sky_blue()"
});
formatter.result({
  "duration": 3001816100,
  "status": "passed"
});
formatter.after({
  "duration": 758511800,
  "status": "passed"
});
formatter.before({
  "duration": 1442066800,
  "status": "passed"
});
formatter.scenario({
  "line": 11,
  "name": "White Background is displayed",
  "description": "",
  "id": "sky-blue-background;white-background-is-displayed",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 9,
      "name": "@Scenario2"
    }
  ]
});
formatter.step({
  "line": 12,
  "name": "Set White Background button exists",
  "keyword": "Given "
});
formatter.step({
  "line": 13,
  "name": "I click on the white button",
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "the background color will change to White",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.set_White_Background_button_exists()"
});
formatter.result({
  "duration": 3531818100,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.i_click_on_the_white_button()"
});
formatter.result({
  "duration": 3072140700,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.the_background_color_will_change_to_White()"
});
formatter.result({
  "duration": 3006109000,
  "status": "passed"
});
formatter.after({
  "duration": 754178800,
  "status": "passed"
});
});