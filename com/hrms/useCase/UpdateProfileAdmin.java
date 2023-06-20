package com.hrms.useCase;

import java.util.Scanner;

import com.hrms.dao.AdminDao;
import com.hrms.dao.AdminDaoImpl;
import com.hrms.exceptions.AdmException;

public class UpdateProfileAdmin {

	public static void main(String[] args) {
		
		AdminDao a = new AdminDaoImpl();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Welcome!!  You are about to change the password for admin.....");

		System.out.println("Enter admin ID: ");
		int id = Integer.parseInt(sc.nextLine());
		
		System.out.println("Enter new password : ");
		String pass = sc.nextLine();
		
		
		String s="";
		try {
			 s = a.updateProfile(id, pass);
		} catch (AdmException e) {
			s=e.getMessage();
		}
		
		System.out.println(s);
		
	}

}
