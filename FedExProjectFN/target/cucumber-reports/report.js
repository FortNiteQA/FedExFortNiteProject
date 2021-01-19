$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/Features/CoupnPDF.feature");
formatter.feature({
  "name": "verify Cupon pdf feature",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "As a user , customer should be able to see cupon pdf file",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Sanity"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user navigate the url of fedex",
  "keyword": "Given "
});
formatter.match({
  "location": "fedex.StepDefinition.CouponPdfStepDef.user_navigate_the_url_of_fedex()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on print and design menu , select get cupon and deals",
  "keyword": "When "
});
formatter.match({
  "location": "fedex.StepDefinition.CouponPdfStepDef.click_on_print_and_design_menu_select_get_cupon_and_deals()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on get cupon button",
  "keyword": "And "
});
formatter.match({
  "location": "fedex.StepDefinition.CouponPdfStepDef.click_on_get_cupon_button()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.uri("file:src/test/resources/Features/CreatePrintProfile.feature");
formatter.feature({
  "name": "Verify create a print profile",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "As a user , customer should be able to verify profile after create a print profile",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Sanity"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user navigate the url",
  "keyword": "Given "
});
formatter.match({
  "location": "fedex.StepDefinition.CreatePrintProfileStepDef.user_navigate_the_url()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on print and design menu , select custom design template",
  "keyword": "When "
});
formatter.match({
  "location": "fedex.StepDefinition.CreatePrintProfileStepDef.click_on_print_and_design_menu_select_custom_design_template()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on sign up or log in , click on create a print profile link",
  "keyword": "And "
});
formatter.match({
  "location": "fedex.StepDefinition.CreatePrintProfileStepDef.click_on_sign_up_or_log_in_click_on_create_a_print_profile_link()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "enter first name , last name , email , phone number , user id ,password , confirm password ,check on terms of use",
  "keyword": "And "
});
formatter.match({
  "location": "fedex.StepDefinition.CreatePrintProfileStepDef.enter_first_name_last_name_email_phone_number_user_id_password_confirm_password_check_on_terms_of_use()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on submit button",
  "keyword": "And "
});
formatter.match({
  "location": "fedex.StepDefinition.CreatePrintProfileStepDef.click_on_submit_button()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.uri("file:src/test/resources/Features/FedExLogin.feature");
formatter.feature({
  "name": "Verify Login page",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "As a user , Customer should be able to Login successfully",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Sanity"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Customer land on Fedex Homepage",
  "keyword": "Given "
});
formatter.match({
  "location": "fedex.StepDefinition.LoginStepDef.customer_land_on_Fedex_Homepage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "customer clicks on Signup or login",
  "keyword": "When "
});
formatter.match({
  "location": "fedex.StepDefinition.LoginStepDef.customer_clicks_on_Signup_or_login()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "customer put UserId \"Ruhi123\"",
  "keyword": "And "
});
formatter.match({
  "location": "fedex.StepDefinition.LoginStepDef.customer_put_UserId(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Customer put Password \"Crazy1234\"",
  "keyword": "And "
});
formatter.match({
  "location": "fedex.StepDefinition.LoginStepDef.customer_put_Password(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Customer able to Login Successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "fedex.StepDefinition.LoginStepDef.customer_able_to_Login_Successfully()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.uri("file:src/test/resources/Features/Language.feature");
formatter.feature({
  "name": "Verify Language Chnage",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "As a user I should be able change Language as I need",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Sanity"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "customer is in homepage",
  "keyword": "Given "
});
formatter.match({
  "location": "fedex.StepDefinition.LanguageStepDef.customer_is_in_homepage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "scroll end of the page and click on language",
  "keyword": "When "
});
formatter.match({
  "location": "fedex.StepDefinition.LanguageStepDef.scroll_end_of_the_page_and_click_on_language()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "select espaniol",
  "keyword": "And "
});
formatter.match({
  "location": "fedex.StepDefinition.LanguageStepDef.select_espaniol()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "displayed spanish language",
  "keyword": "Then "
});
formatter.match({
  "location": "fedex.StepDefinition.LanguageStepDef.displayed_spanish_language()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.uri("file:src/test/resources/Features/PageBackandForth.feature");
formatter.feature({
  "name": "Verify navigate back and forth among pages",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "As a user , customer should be able to go back from about page to hame page",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Sanity"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Customer launch in  Home Page of the FedEx",
  "keyword": "Given "
});
formatter.match({
  "location": "fedex.StepDefinition.PageBackandForthStepDef.customer_launch_in_FedEx_Home_Page_https_www_fedex_com_en_us_home_html()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "scroll end of the page and click on aboutFedex link",
  "keyword": "When "
});
formatter.match({
  "location": "fedex.StepDefinition.PageBackandForthStepDef.scroll_end_of_the_page_and_click_on_aboutFedex_link()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on see full story button and go back",
  "keyword": "And "
});
formatter.match({
  "location": "fedex.StepDefinition.PageBackandForthStepDef.click_on_see_full_story_button_and_go_back()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should be see home page",
  "keyword": "Then "
});
formatter.match({
  "location": "fedex.StepDefinition.PageBackandForthStepDef.user_should_be_see_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.uri("file:src/test/resources/Features/SearchVerfy.feature");
formatter.feature({
  "name": "Verify Search icon",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "As a user, customer should be able to Search tracking number in search icon",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Sanity"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user navigate the url",
  "keyword": "Given "
});
formatter.match({
  "location": "fedex.StepDefinition.CreatePrintProfileStepDef.user_navigate_the_url()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on search icon",
  "keyword": "When "
});
formatter.match({
  "location": "fedex.StepDefinition.SearchVerifyStepDef.i_click_on_search_icon()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Input tracking number",
  "keyword": "And "
});
formatter.match({
  "location": "fedex.StepDefinition.SearchVerifyStepDef.input_tracking_number()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "press enter",
  "keyword": "And "
});
formatter.match({
  "location": "fedex.StepDefinition.SearchVerifyStepDef.press_enter()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "displayed error msg",
  "keyword": "Then "
});
formatter.match({
  "location": "fedex.StepDefinition.SearchVerifyStepDef.displayed_error_msg()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.uri("file:src/test/resources/Features/ShipRate.feature");
formatter.feature({
  "name": "Verify price quotes and available options for shipments",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "As a user I should be able to find price options for shipments.",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Sanity"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user navigate the url",
  "keyword": "Given "
});
formatter.match({
  "location": "fedex.StepDefinition.CreatePrintProfileStepDef.user_navigate_the_url()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks on Rate \u0026 Ship",
  "keyword": "When "
});
formatter.match({
  "location": "fedex.StepDefinition.ShipRateStepDef.user_clicks_on_Rate_Ship()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Input from and to",
  "keyword": "And "
});
formatter.match({
  "location": "fedex.StepDefinition.ShipRateStepDef.input_from_and_to()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on checkbox",
  "keyword": "And "
});
formatter.match({
  "location": "fedex.StepDefinition.ShipRateStepDef.click_on_checkbox()"
});
formatter.result({
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"//*[@id\u003d\"shippingToResidenceAddressLabel\"]\"}\n  (Session info: chrome\u003d87.0.4280.141)\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027LAPTOP-PJGQ8E5S\u0027, ip: \u0027192.168.1.165\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u002715.0.1\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 87.0.4280.141, chrome: {chromedriverVersion: 87.0.4280.88 (89e2380a3e36c..., userDataDir: C:\\Users\\Hasan\\AppData\\Loca...}, goog:chromeOptions: {debuggerAddress: localhost:51294}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:virtualAuthenticators: true}\nSession ID: 814863873f6097af3137b74f3d34f477\n*** Element info: {Using\u003dxpath, value\u003d//*[@id\u003d\"shippingToResidenceAddressLabel\"]}\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:64)\r\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.base/java.lang.reflect.Constructor.newInstanceWithCaller(Constructor.java:500)\r\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:481)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:428)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:353)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\r\n\tat com.sun.proxy.$Proxy22.isDisplayed(Unknown Source)\r\n\tat fedex.Actions.ShipRateActions.check(ShipRateActions.java:56)\r\n\tat fedex.StepDefinition.ShipRateStepDef.click_on_checkbox(ShipRateStepDef.java:26)\r\n\tat ✽.click on checkbox(file:///C:/Users/Hasan/git/FedExFortNiteProject/FedExProjectFN/src/test/resources/Features/ShipRate.feature:7)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "Selects packaging option from drop-down list.",
  "keyword": "And "
});
formatter.match({
  "location": "fedex.StepDefinition.ShipRateStepDef.selects_packaging_option_from_drop_down_list()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Selects number of pkg , lb",
  "keyword": "And "
});
formatter.match({
  "location": "fedex.StepDefinition.ShipRateStepDef.selects_number_of_pkg_lb()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Inserts length weight height per packagee",
  "keyword": "And "
});
formatter.match({
  "location": "fedex.StepDefinition.ShipRateStepDef.inserts_length_weight_height_per_packagee()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Selects ship-date from drop-down list",
  "keyword": "And "
});
formatter.match({
  "location": "fedex.StepDefinition.ShipRateStepDef.selects_ship_date_from_drop_down_list()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Click Show Rates",
  "keyword": "And "
});
formatter.match({
  "location": "fedex.StepDefinition.ShipRateStepDef.click_Show_Rates()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "FedEx Retails rates shows",
  "keyword": "Then "
});
formatter.match({
  "location": "fedex.StepDefinition.ShipRateStepDef.fedex_Retails_rates_shows()"
});
formatter.result({
  "status": "skipped"
});
formatter.embedding("image/png", "embedded0.png", "As_a_user_I_should_be_able_to_find_price_options_for_shipments.");
formatter.after({
  "status": "passed"
});
formatter.uri("file:src/test/resources/Features/Shipping.feature");
formatter.feature({
  "name": "FedEx Shipping page validation",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "As a user, customer should be able to land on Create FedEx shipment page",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Sanity"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User lands on FedEx homepage",
  "keyword": "Given "
});
formatter.match({
  "location": "fedex.StepDefinition.ShippingStepDef.user_lands_on_FedEx_homepage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clicks Return A Package",
  "keyword": "When "
});
formatter.match({
  "location": "fedex.StepDefinition.ShippingStepDef.clicks_Return_A_Package()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clicks on creating a shipping level",
  "keyword": "And "
});
formatter.match({
  "location": "fedex.StepDefinition.ShippingStepDef.clicks_on_creating_a_shipping_level()"
});
formatter.result({
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"/html/body/div[2]/div[2]/div[1]/div[4]/div/div[2]/div[13]/div/a\"}\n  (Session info: chrome\u003d87.0.4280.141)\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027LAPTOP-PJGQ8E5S\u0027, ip: \u0027192.168.1.165\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u002715.0.1\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 87.0.4280.141, chrome: {chromedriverVersion: 87.0.4280.88 (89e2380a3e36c..., userDataDir: C:\\Users\\Hasan\\AppData\\Loca...}, goog:chromeOptions: {debuggerAddress: localhost:51352}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:virtualAuthenticators: true}\nSession ID: f56fee88acd7235a099cb642e72d6d3b\n*** Element info: {Using\u003dxpath, value\u003d/html/body/div[2]/div[2]/div[1]/div[4]/div/div[2]/div[13]/div/a}\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:64)\r\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.base/java.lang.reflect.Constructor.newInstanceWithCaller(Constructor.java:500)\r\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:481)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:428)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:353)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\r\n\tat com.sun.proxy.$Proxy22.click(Unknown Source)\r\n\tat fedex.Actions.ShippingActions.clickCreateShipmentLevel(ShippingActions.java:29)\r\n\tat fedex.StepDefinition.ShippingStepDef.clicks_on_creating_a_shipping_level(ShippingStepDef.java:26)\r\n\tat ✽.clicks on creating a shipping level(file:///C:/Users/Hasan/git/FedExFortNiteProject/FedExProjectFN/src/test/resources/Features/Shipping.feature:6)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "new window will be open for shipment",
  "keyword": "Then "
});
formatter.match({
  "location": "fedex.StepDefinition.ShippingStepDef.new_window_will_be_open_for_shipment()"
});
formatter.result({
  "status": "skipped"
});
formatter.embedding("image/png", "embedded1.png", "As_a_user,_customer_should_be_able_to_land_on_Create_FedEx_shipment_page");
formatter.after({
  "status": "passed"
});
formatter.uri("file:src/test/resources/Features/SignUP.feature");
formatter.feature({
  "name": "FedEx signup Page test",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "As a user, customer should be able to fillup FedEx signup Page",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Sanity"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Customer launch in Home Page of the FedEx Website",
  "keyword": "Given "
});
formatter.match({
  "location": "fedex.StepDefinition.SignUpStepDef.customer_launch_in_Home_Page_of_the_FedEx()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Customer click on Sign Up",
  "keyword": "When "
});
formatter.match({
  "location": "fedex.StepDefinition.SignUpStepDef.customer_click_on_Sign_Up()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on Create Account",
  "keyword": "And "
});
formatter.match({
  "location": "fedex.StepDefinition.SignUpStepDef.click_on_Create_Account()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on Open Account",
  "keyword": "And "
});
formatter.match({
  "location": "fedex.StepDefinition.SignUpStepDef.click_on_Open_Account()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "enter First Name and Last Name",
  "keyword": "And "
});
formatter.match({
  "location": "fedex.StepDefinition.SignUpStepDef.enter_First_Name_and_Last_Name()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "enter E-mail Name and Re- enter e-mail",
  "keyword": "And "
});
formatter.match({
  "location": "fedex.StepDefinition.SignUpStepDef.enter_E_mail_Name_and_Re_enter_e_mail()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "enter Address and City",
  "keyword": "And "
});
formatter.match({
  "location": "fedex.StepDefinition.SignUpStepDef.enter_Address_and_City()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "enter State",
  "keyword": "And "
});
formatter.match({
  "location": "fedex.StepDefinition.SignUpStepDef.enter_State()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "enter ZIP and Phone Number",
  "keyword": "And "
});
formatter.match({
  "location": "fedex.StepDefinition.SignUpStepDef.enter_ZIP_and_Phone_Number()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "enter Address and City",
  "keyword": "And "
});
formatter.match({
  "location": "fedex.StepDefinition.SignUpStepDef.enter_Address_and_City()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "enter Valid User ID, Password and Re-enter Password",
  "keyword": "And "
});
formatter.match({
  "location": "fedex.StepDefinition.SignUpStepDef.enter_Valid_User_ID_Password_and_Re_enter_Password()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Customer select a secret question and enter  answer",
  "keyword": "And "
});
formatter.match({
  "location": "fedex.StepDefinition.SignUpStepDef.customer_select_a_secret_question_and_enter_answer()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Customer accept terms and conditions",
  "keyword": "And "
});
formatter.match({
  "location": "fedex.StepDefinition.SignUpStepDef.customer_accept_terms_and_conditions()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Customer clik on continue button",
  "keyword": "And "
});
formatter.match({
  "location": "fedex.StepDefinition.SignUpStepDef.Customer_clik_on_continue_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User can see the accont information page",
  "keyword": "Then "
});
formatter.match({
  "location": "fedex.StepDefinition.SignUpStepDef.user_can_see_the_accont_information_page()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.uri("file:src/test/resources/Features/Tracking.feature");
formatter.feature({
  "name": "Tracking progress of shipment",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "As a user, customer should be able to Track a Shipment",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Sanity"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user navigate the homepage",
  "keyword": "Given "
});
formatter.match({
  "location": "fedex.StepDefinition.TrackingStepDef.user_navigate_the_url_of_fedex()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on print and tracking menu",
  "keyword": "When "
});
formatter.match({
  "location": "fedex.StepDefinition.TrackingStepDef.click_on_print_and_tracking_menu()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Input the tracking number",
  "keyword": "And "
});
formatter.match({
  "location": "fedex.StepDefinition.TrackingStepDef.input_the_tracking_number()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on tracking button",
  "keyword": "And "
});
formatter.match({
  "location": "fedex.StepDefinition.TrackingStepDef.click_on_tracking_button()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});