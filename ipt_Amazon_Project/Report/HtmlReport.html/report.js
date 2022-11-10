$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/shakt/eclipse-workspace/ipt_Amazon_Project/src/test/java/com/feature/amazon.feature");
formatter.feature({
  "line": 1,
  "name": "search of product in amazon",
  "description": "",
  "id": "search-of-product-in-amazon",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Launch the amazon application in web",
  "description": "",
  "id": "search-of-product-in-amazon;launch-the-amazon-application-in-web",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "enter the url",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user select the product from the category",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user should enter the product name in the search box",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "user should compare with the suggestion and Click the product name",
  "keyword": "Then "
});
formatter.match({
  "location": "Amazon_Step_Definition.enter_the_url()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Amazon_Step_Definition.user_select_the_product_from_the_category()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Amazon_Step_Definition.user_should_enter_the_product_name_in_the_search_box()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Amazon_Step_Definition.user_should_compare_with_the_suggestion_and_Click_the_product_name()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "line": 10,
  "name": "Product page",
  "description": "",
  "id": "search-of-product-in-amazon;product-page",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 11,
  "name": "user search the result page and enter the total number of product",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "user search the more result page and enter the total number of product",
  "keyword": "Then "
});
formatter.match({
  "location": "Amazon_Step_Definition.user_search_the_result_page_and_enter_the_total_number_of_product()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Amazon_Step_Definition.user_search_the_more_result_page_and_enter_the_total_number_of_product()"
});
formatter.result({
  "status": "skipped"
});
});