The objective of this assignment is to design and implement a small application for a company that manages a user structure consisting of Directors, Managers, and Staff. 

1_) User class: The base class for Director, Manager, and Staff. It contains common attributes and methods for all user types.

2_) Staff class: Subclass of User, represents individual Staff members with specific attributes and methods.

3_) Manager class: Also a subclass of User, represents Managers who can have a list of Staff members working under them. It includes methods to manage Staff and calculate budgets.

4_) Director class: Is a subclass of User that represents Directors, who can have Managers and Staff working under them. It includes methods to manage Managers, list Staff, and calculate budgets.

5_) Report: Defines an interface for report templates, which can be implemented to generate various reports. The generateReport method is required for implementing report templates.

6_) ListStaff class: Implements a specific report template for listing Staff under Managers or Directors. It includes logic to generate Staff lists based on the user type.

7_) BudgetReport class: Implements a specific report template for calculating the required budget for Managers and Directors. It calculates the budget based on the user type.

8_) CompanyManagementApp: The main application, where the core functionality of the company management system is implemented. It includes the creation of user instances, adding them to the database, and generating reports.

9_) FakeDatabase class: That simulates a fake database for storing user data and relationships. It allows adding users, getting users, and assigning Managers to Directors.
