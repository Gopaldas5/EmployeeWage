package com.bridgeLabz.Day3_EmployeeWageProblem;


import java.util.Random;


public class EmployeeWage {
   public static void main(String[] args){

       System.out.println("Welcome to Employee Wage Computation Program on Master Branch");
       Random random = new Random();
       int attendance = random.nextInt(3);
       int IS_ABSENT_TODAY = 0;
       int IS_FULL_DAY = 1;
       int IS_HALF_DAY = 2;
       int FULL_DAY_TIME = 8;
       int ABSENT_DAY_TIME = 0;
       int WAGE_PER_HOUR = 20;
       int total_emp_times = 0;
       int total_emp_wage = 0;
       int HALF_DAY_TIME = 4;

       if (attendance == IS_ABSENT_TODAY){
           System.out.println("Today Employee is absent");
           total_emp_wage += 0;

       }
       else if (attendance == IS_HALF_DAY)
       {
           System.out.println("Employee is working half time today");
           total_emp_times += HALF_DAY_TIME;
           total_emp_wage += WAGE_PER_HOUR * HALF_DAY_TIME;
       }

       else{
           System.out.println("Today employee is present");
           total_emp_times += FULL_DAY_TIME;
           total_emp_wage += WAGE_PER_HOUR*FULL_DAY_TIME;
       }
       System.out.println("Total wage of employee= "+total_emp_wage);
   }
}
