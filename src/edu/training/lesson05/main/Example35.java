package edu.training.lesson05.main;

public class Example35 {

	public static void main(String[] args) {

		int year = 2023;
        int dayNum = 123;
        int [] daysInMonths = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String [] months = {"Январь", "Февраль", "Март", "Апрель", "Май","Июнь", "Июль", "Август", "Сентябрь", "Октябрь", "Ноябрь", "Декабрь"};
        
        int monthNum = 0;
        boolean isLeapYear = (year%4 == 0) && (year % 100 != 0 || year % 400 == 0);
        
            for(int days : daysInMonths){
                if (isLeapYear && days == 28) ++days;
                if (dayNum <= days) break;
                
                dayNum -= days;
                monthNum++;
            }
        System.out.printf("%d %s \n", dayNum, months[monthNum]);

	}

}