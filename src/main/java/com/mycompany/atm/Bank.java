/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.atm;

/**
 *
 * @author Priya
 */
public class Bank {
    
double total = 100000;

  // methods for performing operastions namely withdrawl, deposit, loan etc..

  public void loan(String nm,String ifsc,long mb,long acc,double loanAmount,double incm, int tenure )
  {

    System.out.println("\n\nACCOUNT INFORMATION :\n\nCustomer name :"+ nm + "\n" + "IFSC :" + ifsc + "\n" + "Mobile no. :" + mb+ "\n" + "Account Number : "+ acc+ "\n" + "Account Balance : "+ total);

      //checking loan eligibility w.r.t income

    if(incm >=100000 && incm <= 500000)
    {

      // checking for eligible loan amount

      if(loanAmount <= 1500000)
      {
        System.out.println("\n\nLOAN DESCRIPTION : \n\nRate : 8%");
        System.out.println("Loan Amount : "+loanAmount);

          // Display INTEREST + PAYABLE AMOUNT year wise w.r.t tenure mentioned

        for(int i=1; i<=tenure ; i++)
        {
          double SI = loanAmount * i * (8/100);
          System.out.println("Interest in "+i+" year :"+ SI + "\n"+ "Total amout to be paid to bank : "+ (loanAmount + SI));
        }

      }

      //Eligibility denied considering annual income

      else
      {
        System.out.println("\n\nAPOLOGIES !! You are not eligible to take loan ");
      }
    }

    //eligible for any loan amount if annual income exceeds 500000

    else if (incm >= 500000)
    {

      System.out.println("\n\nLOAN DESCRIPTION :\n\nRate : 15%");
      System.out.println("Loan Amount : "+loanAmount);

      for(int i=1; i<=tenure ; i++)
        {
          double SI = loanAmount * i * (15/10);
          System.out.println("Interest in "+i+" year :"+ SI + "\n"+ "Total amout to be paid to bank : "+ (loanAmount + SI));
        }
    }
    if(incm<100000)
      System.out.println("\n\nAPOLOGIES !! You are not eligible to take loan");
  }


  //METHOD FOR WITHDRAWL
public void wtrl(String nm,String ifsc,long mb,long acc,double amt)
{
  if(total < 1000 || total < amt)
  {
    System.out.println("\n\nInsufficient Balance !!");
  }
  if (amt > 25000)
  {
    System.out.println("\n\nWithdraw amount exceedeed 25000 limit ");
  }

  //updating balance
  total = total-amt;

  //display updated information
  System.out.println("\n\nACCOUNT INFORMATION :\n\nCustomer name :"+ nm + "\n" + "IFSC :" + ifsc + "\n" + "Mobile no. :" + mb + "\n" + "Account Number : "+ acc+ "\n" + "Remaining Balance : "+ total);
}

  //METHOD FOR AMT. DEPOSIT
public void dpst(String nm,String ifsc,long mb,long acc, double amt)
{
  total += amt;
  System.out.println("\n\nACCOUNT INFORMATION :\n\nCustomer name :"+ nm + "\n" + "IFSC :" + ifsc + "\n" + "Mobile no. :" + mb + "\n" + "Account Number : "+ acc+ "\n" + "Total Balance : "+ total);
}
}

