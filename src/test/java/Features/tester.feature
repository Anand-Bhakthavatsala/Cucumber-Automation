Feature: About Testers

In order to get a high paid job
As a Tester
I want to learn automation

Scenario Outline: I am a manual tester
Given I am a "<testerType>" tester
When I apply for a job
Then I got "<jobType>" paid job
And I am "<satisfactionType>" satisfied with my salary
But my parents are "<parentsSatisfaction>" satisfied

#Scenario: I am a automation tester
#Given I am a "automation" tester
#When I apply for a job
#Then I got "high" paid job
#And I am "very" satisfied with my salary
#But my parents are "highly" satisfied

Examples:
| testerType | jobType | satisfactionType | parentsSatisfaction |
| 1Manual     | Less    | Low              | Average             |
| Automation | High    | Very             | Highly              |
| API        | Medium  | Quite            | Average              |
| DataBase   | Moderate| Very High        | Good                 |