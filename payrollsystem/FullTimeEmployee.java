/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.payrollsystem;
import java.time.LocalDate;


public class FullTimeEmployee extends Employee {

    private double allowance;

    public FullTimeEmployee(String id, String name, double baseSalary, LocalDate joinDate,double allowance) {

        super(id, name, baseSalary, joinDate);
        this.allowance = allowance;
    }

    @Override
    public double calculateNetSalary() {
        return baseSalary + allowance;
    }

    @Override
    public double calculateBonus(double performanceScore) {
        return baseSalary * 0.10 * performanceScore;
    }
}
