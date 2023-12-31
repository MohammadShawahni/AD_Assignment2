The objective of this assignment is to design and implement a small application for a company that manages a user structure consisting of Directors, Managers, and Staff. 

1_) Report: Defines an interface for report templates, which can be implemented to generate various reports. The generateReport method is required for implementing report templates.

2_) BudgetReport class: Implements a specific report template for calculating the required budget for Managers and Directors. It calculates the budget based on the user type.

3_) ListStaff class: Implements a specific report template for listing Staff under Managers or Directors. It includes logic to generate Staff lists based on the user type.

4_) User class: The base class for Director, Manager, and Staff. It contains common attributes and methods for all user types.

5_) Manager class: Also a subclass of User, represents Managers who can have a list of Staff members working under them. It includes methods to manage Staff and calculate budgets.

6_) Director class: Is a subclass of User that represents Directors, who can have Managers and Staff working under them. It includes methods to manage Managers, list Staff, and calculate budgets.

7_) Staff class: Subclass of User, represents individual Staff members with specific attributes and methods.

8_) CompanyManagementSystem: The main application, where the core functionality of the company management system is implemented. It includes the creation of user instances, adding them to the database, and generating reports.

9_) FakeDatabase class: That simulates a fake database for storing user data and relationships. It allows adding users, getting users, and assigning Managers to Directors.
![Class_Digram drawio](https://github.com/MohammadShawahni/AD_Assignment2/assets/92360594/3f936f2c-9a2b-459a-9400-9507ece35803)
