Feature:  Login Functionality
  As a user
  I want to  login virginGames website

  @Smoke@Sanity@Regression
  Scenario Outline: verify User should not login with Invalid credentials
    Given I am home page
    And   I click on login link
    When  I enter invalid email"<email>" in email field
    And   I enter invalid password "<password>" in password field
    And   I click on login button
    Then  I should see error "<message>" for invalid credentials

    Examples:
      | email           | password | message                                                                   |
      |gopu@outlook.com | gopu123  | Please try again, your username/email or password has not been recognised |
      | abcde@gmail.com | @@@@@@@  | Please try again, your username/email or password has not been recognised |
      | abc@yahoo.com   | eacrfgh  | Please try again, your username/email or password has not been recognised |
      |                 |          | Both your username and password are required                              |
      |                 | pass1234 | Both your username and password are required                              |
      | xyz@yahoo.com   |          | Both your username and password are required                              |

