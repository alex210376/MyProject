@LoginProfile
Feature: Тестируем страницу авторизации
  Бла-бла-бла

  Scenario Outline: Неудачная авторизация
    Given Я нахожусь на домашней странице
    Then Я нажимаю ссылку signIn
    When Ввожу логин '<логин>'
    And Ввожу пароль '<пароль>'
    And нажимаю отправить
    Then должен увидеть сообщение об ошибке '<сообщение>'

    Examples:
      | логин                    | пароль        | сообщение                   |
      | yavoric@rambler.ru.com   |123            |Invalid password.            |
      | 123                      |123qwerty      |Invalid email address.       |
      | user1@gmail.com          |user1          |Authentication failed.       |
      | stovbenko@gmail.com      |123456         |Authentication failed.       |
      | user1@gmail.com          |Lamborgini21   |Authentication failed.       |
      | stovbenko@gmail.com      |               |Password is required.        |
      |                          |Lamborgini21   |An email address required.   |
      |                          |               |An email address required.   |
      | 126                      |               |Invalid email address.       |
