Feature: El generarLogInfo responde
  Scenario: client makes call to GET /generarLogInfo
    When the client calls /generarLogInfo
    Then the client receives status code of 200
    And the client receives server version 1.0