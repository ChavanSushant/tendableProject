
# Project Title

## Introduction
This project is a set of automated tests for the Tendable website. The tests are written in Java with Selenium and can be run as Java applications in Eclipse IDE.

## Requirements
- Java 8 or higher
- Selenium WebDriver 3.141.59
- Eclipse IDE
- Make sure git installed.
- Give chrome.exe path in System.set...

## Setup
1. Clone the repository to your local machine.
2. Open Eclipse IDE and import the project.
3. Configure the build path to include the Selenium WebDriver jar files.

## Running the Tests
To run the tests, follow these steps:
1. Open the test case you want to run.
2. Right-click on the file in the Project Explorer.
3. Click on Run As -> Java Application.

## Test Strategy
The tests were designed to verify the functionality of the top-level menus and the "Request a Demo" button on the Tendable website. The strategy was to validate they are accecible or not
In second testcase we are varifing "Request a Demo" tab present for each tab
In third we are checking error handling coverage with proper error msg should throw when we don't input msg.

## Contact Information
For any queries or contributions, please contact...


Note-- this can be done with Maven,testng,POM.but i did with simple approach of java application.
