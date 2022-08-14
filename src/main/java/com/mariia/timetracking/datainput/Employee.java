package com.mariia.timetracking.datainput;

public final class Employee {

    private final String lastName;
    private final String firstName;
    //private String position;

    public Employee (String firstName, String lastName) {
        this.lastName = lastName;
        this.firstName = firstName;
    }

    @Override
    public int hashCode() {
        return firstName.hashCode() + lastName.hashCode();
    }

    @Override
    public boolean equals(Object anObject) {
        if (anObject == null) {
            return false;
        }
        if (anObject instanceof Employee) {
            Employee employee = (Employee) anObject;
            return this.firstName.equals(employee.firstName) &&
                    this.lastName.equals(employee.lastName);
        }
        return false;

    }

     @Override
    public String toString() {
        return firstName + " " + lastName;
    }


}
