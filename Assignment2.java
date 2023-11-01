import java.util.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class User {
    private int id;
    private String name;
    private int age;
    private double hourlyRate;
    private int completedHours;

    public User(int id, String name, int age, double hourlyRate, int completedHours) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.hourlyRate = hourlyRate;
        this.completedHours = completedHours;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public int getCompletedHours() {
        return completedHours;
    }
}

class FakeDatabase {
    private Map<Integer, User> users = new HashMap<>();

    public void addUser(User user) {
        users.put(user.getId(), user);
    }

    public User getUser(int userId) {
        return users.get(userId);
    }
}

class Manager extends User {
    private List<User> staff;

    public Manager(int id, String name, int age, double hourlyRate, int completedHours) {
        super(id, name, age, hourlyRate, completedHours);
        staff = new ArrayList<>();
    }

    public void addStaff(User staffMember) {
        staff.add(staffMember);
    }

    public List<User> getStaff() {
        return staff;
    }
}

class Director extends Manager {
    public Director(int id, String name, int age, double hourlyRate, int completedHours) {
        super(id, name, age, hourlyRate, completedHours);
    }
}

public static void generateStaffListReport(Manager manager, FakeDatabase fakeDatabase) {
        System.out.println("Staff list for " + manager.getName() + ":");
        List<User> staffList = manager.getStaff();
        for (User staff : staffList) {
            System.out.println(staff.getName());
        }
        System.out.println();
    }

    public static void generateBudgetReport(Manager manager, FakeDatabase fakeDatabase) {
        double budget = calculateBudget(manager, fakeDatabase);
        System.out.println("Budget for " + manager.getName() + ": $" + budget);
        System.out.println();
    }

    public static double calculateBudget(Manager manager, FakeDatabase fakeDatabase) {
        double budget = manager.getHourlyRate() * manager.getCompletedHours();
        for (User staffMember : manager.getStaff()) {
            budget += staffMember.getHourlyRate() * staffMember.getCompletedHours();
        }
        return budget;
    }

    
public class CompanyManagementSystem {
    public static void main(String[] args) {
        FakeDatabase fakeDatabase = new FakeDatabase();

        Director director = new Director(1, "Mohammad Mohammad", 30, 50.0, 160);
        Manager manager1 = new Manager(2, "Ahmed Ahmed", 35, 40.0, 160);
        Manager manager2 = new Manager(3, "Sami Sami", 38, 45.0, 160);
        User staff1 = new User(4, "Ali Ali", 25, 25.0, 160);
        User staff2 = new User(5, "Sara Sara", 32, 30.0, 160);

        fakeDatabase.addUser(director);
        fakeDatabase.addUser(manager1);
        fakeDatabase.addUser(manager2);
        fakeDatabase.addUser(staff1);
        fakeDatabase.addUser(staff2);

        manager1.addStaff(staff1);
        manager2.addStaff(staff2);

        System.out.println("Staff list for Manager 1:");
        List<User> staffList = manager1.getStaff();
        for (User staff : staffList) {
            System.out.println(staff.getName());
        }

        System.out.println("Budget for Manager 1: $" + calculateBudget(manager1, fakeDatabase));
        System.out.println("Budget for Director: $" + calculateBudget(director, fakeDatabase));
    }

    public static double calculateBudget(Manager manager, FakeDatabase fakeDatabase) {
        double budget = manager.getHourlyRate() * manager.getCompletedHours();
        for (User staffMember : manager.getStaff()) {
            budget += staffMember.getHourlyRate() * staffMember.getCompletedHours();
        }
        return budget;
    }
}