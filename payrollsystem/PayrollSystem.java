/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.payrollsystem;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.time.LocalDate;

public class PayrollSystem {

    public static void main(String[] args) {

List<Employee> employees = new ArrayList<>();

        employees.add(new FullTimeEmployee(
"E01", "Ahmed", 5000,
LocalDate.of(2022, 1, 10), 1000
));
employees.add(new ContractorEmployee( "E02", "Ali",LocalDate.of(2023, 5, 15),50, 100));
employees.add(new FullTimeEmployee("E03", "Mohamed", 6000, LocalDate.of(2021, 3, 20), 1500));
 employees.add(new ContractorEmployee("E04", "Omar",LocalDate.of(2024, 2, 10),40, 120));

        Collections.sort(employees);

        System.out.println("Employees Sorted By Salary:");

        for (Employee emp : employees) {
            System.out.println(emp);
        }

        // Sort by Join Date using Comparator

        Collections.sort(employees,
                new Comparator<Employee>() {

            @Override
            public int compare(Employee e1, Employee e2) {
                return e1.getJoinDate().compareTo(e2.getJoinDate());
            }
        });

        System.out.println("\nEmployees Sorted By Join Date:");

        for (Employee emp : employees) {
            System.out.println(emp);
        }

        // Calculate Total Tax and Bonus

        double totalTax = 0;
        double totalBonus = 0;

        for (Employee emp : employees) {

            double performanceScore = 4.5;

            totalTax += emp.calculateTax();

            totalBonus += emp.calculateBonus(performanceScore);
        }

        System.out.println("\nPayroll Summary:");

        System.out.println("Total Tax = " + totalTax);

        System.out.println("Total Bonus = " + totalBonus);

        System.out.println("Total Cost = "
                + (totalTax + totalBonus));
    }
}

