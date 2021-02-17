/*
Author.Rasul Mehdiyev
Date:26/01/2021

 */
package pzzler01;

import java.util.Scanner;

public class Pzzler01 {
 private static Scanner Keyboard = new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Author: Rasul ");
        int month=9,year;
        System.out.print("Write the year?: "); 
        year=Keyboard.nextInt();
        int day = 0;
        
        if(year%4==0 && year%100!=0 || year%400==0){
            day=12;
        }
        
        else{
            
            day=13;
        }
        
      
        
        
        String showresult;
        showresult=InicioDiaMesZeller(day,month,year);
        System.out.println("iternational program day: "+showresult+" "+day);
                  
    }
    
    private static String InicioDiaMesZeller(int day,int month, int year){
    String dayString="";
    String[] week={"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday"};
    int a, y, m, d;
    
    
    a=(14-month)/12;
    y=year-a;
    m=month+12 * a -2;
    d= (day+y+y/4-y/100+y/400+(31*m)/12)%7;

    return week[d];

    }
   
    
    
    
}
