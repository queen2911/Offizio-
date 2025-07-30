package com.officemanagement.models;

import com.google.gson.annotations.SerializedName;

public class User {
    @SerializedName("id")
    private int id;
    
    @SerializedName("name")
    private String name;
    
    @SerializedName("email")
    private String email;
    
    @SerializedName("role")
    private String role;
    
    @SerializedName("phone")
    private String phone;
    
    @SerializedName("department")
    private String department;
    
    @SerializedName("salary")
    private double salary;
    
    @SerializedName("hire_date")
    private String hireDate;
    
    @SerializedName("status")
    private String status;

    // Constructors
    public User() {}

    public User(int id, String name, String email, String role, String phone, 
               String department, double salary, String hireDate, String status) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.role = role;
        this.phone = phone;
        this.department = department;
        this.salary = salary;
        this.hireDate = hireDate;
        this.status = status;
    }

    // Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getHireDate() {
        return hireDate;
    }

    public void setHireDate(String hireDate) {
        this.hireDate = hireDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    // Role checking methods
    public boolean isOwner() {
        return "owner".equalsIgnoreCase(role);
    }

    public boolean isCEO() {
        return "ceo".equalsIgnoreCase(role);
    }

    public boolean isManager() {
        return "manager".equalsIgnoreCase(role);
    }

    public boolean isEmployee() {
        return "employee".equalsIgnoreCase(role);
    }

    public boolean isClient() {
        return "client".equalsIgnoreCase(role);
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", role='" + role + '\'' +
                ", phone='" + phone + '\'' +
                ", department='" + department + '\'' +
                ", salary=" + salary +
                ", hireDate='" + hireDate + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}