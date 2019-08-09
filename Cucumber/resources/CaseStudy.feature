Feature: Registration

  @Registration
  Scenario: Registration Of User
    Given Navigate to home
    When user clicks on signup button
    And user enters userName as "shift@12345"
    And user enters Firstname as "Mohan"
    And user enters LastNAme as "Ram"
    And user enters Password as "xyz"
    And user enters ConfirmPassword as "xyz"
    And user selects Gender as "male"
    And user enters Email as "mohan@gmail.com"
    And user enters Mobile as "9875578545"
    And user enters DOB as "12/05/1995"
    And user enters Address as "Kothi Mahal,Ujjain"
    And user selects Security Question as "What is your Birth Place?" and  enters Answer as "Ujjain"
    And user click on Submit button
    Then user Registration is successfully

  @case4
  Scenario: Login with valid Credentials
    Given Navigate to home pag
    When user enters username as "lalitha" & password as "password123"
    Then user logged in successfuly

  @case4
  Scenario: Search Product and add to cart
    Given on Search page
    When lalitha searches for below product
    Then product should be add in the cart if possible

  @case4
  Scenario: Make payment
    When Open cart
    And Checkout
    And Fiiling Address and proceed to pay
    Then Successful Payment
