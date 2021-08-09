package com.org.Assessment1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class DisplayEmployee {
    @Autowired
    @Qualifier("srmemployee")
    private Employee employee;

    public DisplayEmployee() {
        System.out.println("Employee Details: ");
    }
    public void empName(){
        System.out.println("Employee Name: " +employee.getEmpname());
    }
    public void empId(){
        System.out.println("Employee Id: " +employee.getEmpid());
    }
}
