/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package converting_decimal_to_hexadecimal;

import java.util.Scanner;

/**
 *
 * @author MAshapole Raletsemo
 */
public class Conversion {
    
       public static void main(String[] args) 
       {
           //libriary that allow us to get input from user
           Scanner scan= new Scanner(System.in);
           //this variable is going to store the value inputed by the user
           int getNumber;
           //this variable is going to store calculations
           int setConv;
           //this variable is going to store hexa single chracter
           String rule="";
           
           //prompting and getting value
           System.out.println("Enter Number As Decimal To Conver To Hexadecimal");
           System.out.print("Input:");
           getNumber=scan.nextInt();
           
           //checking if the value inputed is not in given criteria and re-prompt until value is correctly entered
           while(getNumber<0 || getNumber>10000)
           {
            System.out.println("Please enter valid decimal number between 0-10000");
            System.out.print("Input:");
            getNumber=scan.nextInt();
           }
           
           
            while (getNumber > 0) 
            {
            setConv = getNumber % 16;

            //condition checking where the calculated number falls.
            if(setConv==10)
                {
                 rule += "A";
                }
            else if(setConv==11)
                {
                 rule += "B";
                }
            else if(setConv==12)
                {
                 rule += "C";
                }
            else if(setConv==13)
                {
                 rule += "D";
                }
            else if(setConv==14)
                {
                 rule += "E";
                }
            else if(setConv==15)
                {
                 rule += "f";
                }
            else
                {
                    //store number bellow 10
                rule += Integer.toString(setConv); 
                } 
               getNumber = getNumber / 16;
            }

            int i;
            System.out.println("**********************************************");
            System.out.println("--------------------REPORT-------------------\n");
            System.out.println("Hello, Your Hexa-decimal Is:");
            for (i = rule.length() - 1; i >= 0; i--)
            {
              System.out.print(rule.charAt(i));  
            }
            System.out.println("\n------------------END OF REPORT----------------");
            System.out.println("**********************************************");
           
              
  }
}
