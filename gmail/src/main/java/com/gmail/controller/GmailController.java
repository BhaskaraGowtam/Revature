package com.gmail.controller;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import com.gmail.entity.GmailUserEntity;
import com.gmail.service.GmailService;
import com.gmail.service.GmailServiceInterface;
import com.gmail.utility.NewNameSorting;

public class GmailController implements GmailControllerInterfacce {

	public int CreateProfileController() {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter your name");
		String name=sc.next();
		System.out.println("Enter your password");
		String password=sc.next();
		System.out.println("Enter your mobile number");
		long number=sc.nextLong();
		System.out.println("Enter your address");
		String address=sc.next();
		
		GmailUserEntity gu = new GmailUserEntity();
		gu.setName(name);
		gu.setPassword(password);
		gu.setNumber(number);
		gu.setAddress(address);
		
		GmailServiceInterface gs = new GmailService();
		int i = gs.CreateProfileController(gu);
		return i;
	}

	public int ViewAllProfileController() {
		int aa=0;
		GmailServiceInterface gs = new GmailService();
		List<GmailUserEntity> g = gs.viewAllprofileService();
		for (GmailUserEntity g3:g) {
			
			if (g3!=null) {
				System.out.println("***********************************************************");
				System.out.println("Your name is "+g3.getName());
				System.out.println("Your password is "+g3.getPassword());
				System.out.println("Your mobile number is "+g3.getNumber());
				System.out.println("Your address is "+g3.getAddress());
				aa++;
			}
			else {
				break;
				}
		}
		
		Collections.sort(g,new NewNameSorting());   
		System.out.println("************************* After Sorting *********************");
		for(GmailUserEntity g4:g) {
			if (g4!=null) {
				System.out.println("------------------------------------------------");
				System.out.println("Your name is "+g4.getName());
				System.out.println("Your password is "+g4.getPassword());
				System.out.println("Your mobile number is "+g4.getNumber());
				System.out.println("Your address is "+g4.getAddress());
				aa++;
			}
			else {
				break;
				}
			
		}
		return aa;
	}

}
