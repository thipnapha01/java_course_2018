package com.example.demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MainSorting {

    public static void main(String[] args) {
       MainSorting p = new MainSorting();
       p.start();
    }

    private void start() {
        //Create data
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(1,"AAA",100));
        employees.add(new Employee(2,"BBB",300));
        employees.add(new Employee(3,"CCC",200));
        employees.forEach(System.out::println);
        
        //Sorting with comparator
       
        Collections.sort(employees,new SortingBySalaryWithDecending()); {

//            @Override
//            public int compare(Employee e1, Employee e2) {
  
                //return 0; // -1 = Desc, 0 = not Change, 1= Asc  // sort by id
//                return e1.getName().compareTo(e2.getName());   // sort by name
//                return (int)(e1.getSalary() - e2.getSalary());      // sort by Salary
//                                
//            }
//        });
        employees.forEach(System.out::println);
    }

}

class SortingBySalaryWithDecending implements Comparator<Employee>{

    @Override
    public int compare(Employee e1, Employee e2) {
        return (int)(e1.getSalary() - e2.getSalary());
    }
    
}

}