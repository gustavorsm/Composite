package com;

public class FinancialDepartment implements Department {

    private Integer id;
    private String name;

    public FinancialDepartment(int i, String financial_department) {
    }

    public void printDepartmentName() {
        System.out.println(getClass().getSimpleName());
    }

    // standard constructor, getters, setters
}