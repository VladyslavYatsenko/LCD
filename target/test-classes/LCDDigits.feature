Feature: Represent LCD Numbers

  Scenario: Represented numeric in LCD type on console
    Given Initialize Numeric Representation
    When User set numeric 0

    Then Return "._.|.||_|"

