package com.flp.ems.view;

import java.util.Scanner;

public class BootClass 
{
public static void main(String[] args) 
{
	
	
	
	System.out.println("1.Add");
	System.out.println("2.modify");
	System.out.println("3.delete");

    Scanner sc=new Scanner(System.in);
    int menu = sc.nextInt();
	BootClass ms=new BootClass();
menuselection(menu);
}



public static void menuselection(int j)
{
Userinteraction c=new Userinteraction();
	do{
	    switch(j){
	        case 1:
	        	// System.out.println("create");
	        	c.addemployee();
	            break;
	        case 2:
	            //System.out.println("modify");
	        	c.modifyemployee();
	            break;
	        case 3:
	           // System.out.println("delete");
	        	c.deleteemployee();
	            break;
	        default:
	            System.out.println("select correct option");
	            break;
	    }	
	} while(j!=4);
	

	       

}

}



