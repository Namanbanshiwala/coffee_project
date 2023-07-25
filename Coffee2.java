/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package coffee2;

/**
 *
 * @author Naman
 */
import java.util.Scanner;
import java.util.*;
public class Coffee2 {
    /**
     * @param args the command line arguments
     */
    public static class Orderingsystem {
    Scanner sc = new Scanner(System.in);
    String again;
    int choose,quantity=1;
    double total=0,pay;
    void menu(){
    System.out.println("\t\t\t\t+===================================+");
    System.out.println("\t\t\t\t              NAMAN MENU           ");
    System.out.println("\t\t\t\t   1. hot coffee              100.00");
    System.out.println("\t\t\t\t   2. cold coffee             120.00");
    System.out.println("\t\t\t\t   3. tea                     20.00");
    System.out.println("\t\t\t\t   4. CANCEL                         ");
    System.out.println("\t\t\t\t+====================================+");
    }
    
    void order(){
    //System.out.println("Press 1 to Tapsilog , Press 2 to Tocilog , Press 3 to Longsilog and Press 4 to Cancel");
    System.out.print("Press you want to buy? :");
    choose = sc.nextInt();
    //conditions
    if(choose==1){
        System.out.println("You choose Hot coffee");
        System.out.print("How many Hot coffee you want to Buy? :");
        quantity =sc.nextInt();
        total = total +(quantity*100);
        
        System.out.println("You want to buy again? ");
        System.out.println("Press Y for Yes and N for N : ");
        again = sc.next();
        if(again.equalsIgnoreCase("Y")){
            order();//call the method you to create 
        }else{
            System.out.println("Total order is " + total);
            System.out.println("Enter a payment ");
            pay = sc.nextDouble();
            if(pay <=total){
              System.out.println("Not enough payment");
            }else{
           // System.out.println("Total price is " + total);
            total = pay-total;
            System.out.println("The change is " + total);
            }
        }
    }else if(choose==2){
        System.out.println("You choose cold coffee");
        System.out.print("How many cold coffee you want to Buy? :");
        quantity =sc.nextInt();
        total = total +(quantity*120);
        
        System.out.println("You want to buy again? ");
        System.out.println("Press Y for Yes and N for N : ");
        again = sc.next();
        if(again.equalsIgnoreCase("Y")){
            order();//call the method you to create 
        }else{
            System.out.println("Total order is " + total);
            System.out.println("Enter a payment ");
            pay = sc.nextDouble();
            if(pay <=total){
              System.out.println("Not enough payment");
            }else{
           // System.out.println("Total price is " + total);
            total = pay-total;
            System.out.println("The change is " + total);
            }
        }
      }else if(choose==3){
        System.out.println("You choose tea");
        System.out.print("How many tea you want to Buy? :");
        quantity =sc.nextInt();
        total = total +(quantity*20);
        
        System.out.println("You want to buy again? ");
        System.out.println("Press Y for Yes and N for N : ");
        again = sc.next();
        if(again.equalsIgnoreCase("Y")){
            order();//call the method you to create 
        }else{
            System.out.println("Total order is " + total);
            System.out.println("Enter a payment ");
            pay = sc.nextDouble();
            if(pay <=total){
              System.out.println("Not enough payment");
            }else{
           // System.out.println("Total price is " + total);
            total = pay-total;
            System.out.println("The change is " + total);
            }
        }
    }else if(choose==4){
        System.exit(0);//close program
    }else{
        System.out.println("Choose 1 to 4 only!");
        order();
    }
    }
    }
    public static void main(String[] args) {
        // TODO code application logic here
        //naman obj = new naman();
        Orderingsystem obj = new Orderingsystem();
        obj.menu();
       obj.order();
    }
}
