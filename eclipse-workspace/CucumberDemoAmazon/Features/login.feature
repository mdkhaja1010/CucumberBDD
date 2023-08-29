Feature: Login to SauceDemo Application

   Scenario Outline: Sucessfull login with valid credentials
      Given the user launches the sauceDemo website
      And the user enters the "<username>"
      And the user enters the password as "<password>"
      And user click on the sign button
      And the user click on the red shirt
      And the user click on the cartbutton
      And the user click on the checkoutbutton
      And the user enters the firstname "<firstname>"
      And the user enters the secondname "<secondname>"
      And the user enters the zipcode "<postalcode>"
      And the user clicks the continue
      And the user click the finish
      And the user click on backtohome
      Then user click on the menubutton
      And the user click on logoutbutton
      
      
    Examples:
      |username|      |password     ||firstname||secondname||postalcode|
      |standard_user||secret_sauce ||abc      ||xyz       ||abcdee|