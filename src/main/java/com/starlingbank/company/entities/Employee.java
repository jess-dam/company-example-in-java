package com.starlingbank.company.entities;

public abstract class Employee {
    private int employeeId;
    private String name;
    private String dateOfBirth;
    private Salary salaryId;
    protected double bonusPercentage;
    private boolean hasHadAnnualReview;
    private double extraHoursWorked;



    public Employee(int employeeId, String name, String dateOfBirth, Salary salary) {
        this.employeeId = employeeId;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.salaryId = salary;
        this.bonusPercentage = 0.0;
        this.hasHadAnnualReview = false;
        this.extraHoursWorked = 0.0;
    }

    public int getEmployeeId() { return employeeId; }

    public String getName() {
        return name;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public Salary getSalaryId() {
        return salaryId;
    }


    public double getBonusPercentage() {
        return bonusPercentage;
    }

    public void setBonusPercentage(double bonusPercentage) {
        this.bonusPercentage = bonusPercentage;
    }

    public boolean hasHadAnnualReview() {
        return hasHadAnnualReview;
    }

    public void setHasHadAnnualReview(boolean hasHadAnnualReview) {
        this.hasHadAnnualReview = hasHadAnnualReview;
    }

    public double getExtraHoursWorked() {
        return extraHoursWorked;
    }

    public void setExtraHoursWorked(double extraHoursWorked) {
        this.extraHoursWorked = extraHoursWorked;
    }


    @Override
    public String toString() {
        return employeeId + " " + name + ": " + " Born: " + dateOfBirth + " Salary: " + salaryId + " Bonus of: " + bonusPercentage;
    }


}
