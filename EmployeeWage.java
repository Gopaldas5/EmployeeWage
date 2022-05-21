package com.bridgeLabz.Day3_EmployeeWageProblem;


import java.util.Random;


public class EmployeeWage {
   public static void main(String[] args){

       System.out.println("Welcome to Employee Wage Computation Program on Master Branch");
       Random random = new Random();
       int attendance = random.nextInt(3);
       final int IS_ABSENT_TODAY = 0;
       final int IS_FULL_DAY = 1;
       final int IS_HALF_DAY = 2;
       int FULL_DAY_TIME = 8;
       int ABSENT_DAY_TIME = 0;
       int WAGE_PER_HOUR = 20;
       int total_emp_times = 0;
       int total_emp_wage = 0;
       int HALF_DAY_TIME = 4;

       total_emp_times = switch (attendance) {
           case IS_FULL_DAY -> FULL_DAY_TIME;
           case IS_HALF_DAY -> HALF_DAY_TIME;
           case IS_ABSENT_TODAY -> ABSENT_DAY_TIME;
           default -> 0;
       };
       total_emp_wage += WAGE_PER_HOUR*total_emp_times;
       System.out.println("Total wage of employee= "+total_emp_wage);
   }
}
