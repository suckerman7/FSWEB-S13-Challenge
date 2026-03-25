package org.example;

import org.example.enums.Plan;

public class Main {
    public static void main(String[] args) {
        Healthplan healthplan = new Healthplan(2345, "Plan #2345", Plan.BASIC);
        Company company = new Company(124, "XYZ", 4000.00, new String[]{"dev1, dev2"});
        Employee employee = new Employee(563, "Mert Yüksel", "mrty.yksl@gmail.com", "my2146165", new String[]{"plan1", "plan2"});

        System.out.println(healthplan);
        System.out.println(company);
        System.out.println(employee);
    }
}