package com.bridgeLabz.Day3_EmployeeWageProblem;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Random;


public class EmployeeWage {
   public static void main(String args[]){

       System.out.println("Welcome to Employee Wage Computation Program on Master Branch");
       Random random = new Random();
       int attendance = random.nextInt(2);
       int IS_ABSENT_TODAY = 0;
       int IS_FULL_DAY = 1;
       int IS_HALF_DAY = 2;

       if (attendance == IS_ABSENT_TODAY){
           System.out.println("Today Employee is absent");
       }
       else{
           System.out.println("Today employee is present");
       }

   }
}
