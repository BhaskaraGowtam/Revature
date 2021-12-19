package com.gmail;

import java.util.Scanner;

import com.gmail.controller.GmailController;
import com.gmail.controller.GmailControllerInterfacce;

public class Gmail_View {

	
	public static void main(String[] args) {
		String ss= "y";
		while(ss.equals("y")){
			
		System.out.println("*-*-*-*-*-*-Welcome-*-*-*-*-*-*-*-*");
		System.out.println("Press 1 to create a profile");
		System.out.println("Press 2 to view all profiles");
		System.out.println("Enter your choice");
		
		Scanner sc = new Scanner(System.in);
		int ch = sc.nextInt();
		GmailControllerInterfacce gc= new GmailController();
		
		switch(ch) {
			case 1: int i = gc.CreateProfileController();
					if (i>0) {
						System.out.println("Profile created successfully");
					}
					else {
						System.out.println("Couldn't create profile");
					}
					break;
			case 2: int j = gc.ViewAllProfileController();
					if(j>0) {
						System.out.println(j+" profiles found");
					}
					else {
						System.out.println(" No profiles found");
					}
					break;
					default : System.out.println("Invalid choice");
		           }
		System.out.println("If you want to continue, press y/n");
		ss=sc.next();
		
		}
	}
}
