/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.atm;
import java.util.*;
/**
 *
 * @author Priya
 */
public class Atm{
    

    public static void main(String[] args) {
         Scanner s = new Scanner(System.in);

    //User input of user details

    String nm, ifsc;
    long acc;
    double amt;
    long mb;
    double total = 100000;

    System.out.println("Enter name: ");
    nm = s.next();

    System.out.println("Enter IFSC CODE: ");
    ifsc = s.next();


    System.out.println("Enter mobile no.: ");
    mb = s.nextLong();



    System.out.println("Enter account number: ");
    acc = s.nextLong();


    //Asking user consent for type of operation they want to perform
    
    int choice;
    while(true)
    {
        System.out.println("\n\nPRESS 1 FOR SBI"+"\n"+"PRESS 2 FOR HDFC"+"\n"+"PRESS 3 PNB");
        choice =s.nextInt();

      if(choice <= 3)
      {
        break;
      }

      if (choice >3)
      {
       continue;
      }
    }

    int c1;
    switch(choice)
    {
      case 1:

        SBI r = new SBI();
        r.welcome();

        while(true)
        {
        System.out.println("\n\nPRESS 1 FOR WITHDRAWL"+"\n"+"PRESS 2 FOR DEPOSIT"+"\n"+"PRESS 3 TO KNOW YOUR LOAN STATUS..");
        c1 =s.nextInt();

        if(c1<=3)
        {
          break;
        }
        if(c1>3)
        {
          continue;
        }
      }

                               
                        switch(c1)
                       {
                         case 1:
                          
                            System.out.println("\n\nEnter amount: ");
                            amt = s.nextDouble();       
                            r.wtrl(nm,ifsc,mb,acc,amt);
                            break;

                          case 2: 
                             System.out.println("\n\nEnter amount: ");

                             amt = s.nextDouble();      
                             r.dpst(nm,ifsc,mb,acc,amt);
                             break;

                           case 3:
                               
                               System.out.println("\n\nUSER DETAILS :\n\nEnter the loan amount you require :");
                               double a = s.nextDouble();

                               System.out.println("Enter the annual income :");
                               double income = s.nextDouble();

                               System.out.println("Enter time period :");
                               int time = s.nextInt();

                               r.loan(nm,ifsc,mb,acc,a,income,time);
                               break;

                         }

         break;

      case 2:

        HDFC r2 = new HDFC();
        r2.welcome();

       while(true)
       {
         System.out.println("\n\nPRESS 1 FOR WITHDRAWL"+"\n"+"PRESS 2 FOR DEPOSIT"+"\n"+"PRESS 3 TO KNOW YOUR LOAN STATUS..");
         c1 =s.nextInt();

         if(c1 <=3)
         {
           break;
          }
         if(c1 >3)
         {
           continue;
          }
        }

       
                        switch(c1)
                       {
                         case 1:
                           
                            System.out.println("\n\nEnter amount: ");
                            amt = s.nextDouble();       
                            r2.wtrl(nm,ifsc,mb,acc,amt);
                            break;

                          case 2: 
                             System.out.println("\n\nEnter amount: ");

                             amt = s.nextDouble();      
                             r2.dpst(nm,ifsc,mb,acc,amt);
                             break;

                           case 3:
                              
                               System.out.println("\n\nUSER DETAILS :\n\nEnter the loan amount you require :");
                               double a = s.nextDouble();

                               System.out.println("Enter the annual income :");
                               double income = s.nextDouble();

                               System.out.println("Enter time period :");
                               int time = s.nextInt();

                               r2.loan(nm,ifsc,mb,acc,a,income,time);
                               break;

                     }


        break;

      case 3:
        
        PNB r3 = new PNB();
        r3.welcome();

        while(true)
        {
           System.out.println("\n\nPRESS 1 FOR WITHDRAWL"+"\n"+"PRESS 2 FOR DEPOSIT"+"\n"+"PRESS 3 TO KNOW YOUR LOAN STATUS..");
           c1 =s.nextInt();

           if(c1<=3)
           {
             break;
            }
           if(c1>3)
           {
             continue;
          }
        }

                         
                        switch(c1)
                       {
                         case 1:
                            
                            System.out.println("\n\nEnter amount: ");
                            amt = s.nextDouble();       
                            r3.wtrl(nm,ifsc,mb,acc,amt);
                            break;

                          case 2:
                              
                             System.out.println("\n\nEnter amount: ");

                             amt = s.nextDouble();      
                             r3.dpst(nm,ifsc,mb,acc,amt);
                             break;

                           case 3:
                              
                               System.out.println("\n\nUSER DETAILS :\n\nEnter the loan amount you require :");
                               double a = s.nextDouble();

                               System.out.println("Enter the annual income :");
                               double income = s.nextDouble();

                               System.out.println("Enter time period :");
                               int time = s.nextInt();

                               r3.loan(nm,ifsc,mb,acc,a,income,time);
                               break;

                         }



               break;
    }
  }

}
