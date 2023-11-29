Feature: verify exact location of city bikes around the world

@location
  Scenario Outline: Find location
    Given as a user I want to verify <cityName> with <countryName>
    And  <latitude>, <longitude> of that city
    Examples:
      | cityName  | countryName | latitude | longitude |
      | "Frankfurt" | "Germany"     | 50.1072  | 8.66375   |
