package com.bridgeLabz.Day3_EmployeeWageProblem;


import java.util.Random;


public class EmployeeWage {
   public static void main(String[] args){

       System.out.println("Welcome to Employee Wage Computation Program on Master Branch");
       Random random = new Random();


       final int IS_ABSENT_TODAY = 0;
       final int IS_FULL_DAY = 1;
       final int IS_HALF_DAY = 2;
       final int FULL_DAY_TIME = 8;
       final int ABSENT_DAY_TIME = 0;
       final int WAGE_PER_HOUR = 20;
       int total_emp_times = 0;
       int total_emp_wage = 0;
       final int HALF_DAY_TIME = 4;
       int attendance;
       int total_working_days = 0;

      while (total_emp_wage <= 100 && total_working_days < 20) {
           attendance = random.nextInt(3);


           total_emp_times = switch (attendance) {
               case IS_FULL_DAY -> FULL_DAY_TIME;
               case IS_HALF_DAY -> HALF_DAY_TIME;
               case IS_ABSENT_TODAY -> ABSENT_DAY_TIME;
               default -> 0;
           };
       }

       total_emp_wage += WAGE_PER_HOUR*total_emp_times;
       System.out.println("Total working days= "+total_working_days);
       System.out.println("Total working time= "+total_emp_times);
       System.out.println("Total wage of employee= "+total_emp_wage);
   }
}
