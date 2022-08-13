package com.mariia.timetracking.datainput;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

public class Test {

    public static void main(String[] args) throws ParseException {

        HashMap<Employee, String> employeeToTextMap = new HashMap<>();

        Employee employee = new Employee("Ivan", "Ivanov");
        var employeeSame = employee;
        employeeToTextMap.put(employee, "Hello");

        Employee employeeToSearch = new Employee("Ivan", "Ivanov");
        String text = employeeToTextMap.get(employeeToSearch);


        System.out.println(employee.equals(employeeToSearch));
        System.out.println(employee.equals(employeeSame));

        System.out.println(text);

    }

}
