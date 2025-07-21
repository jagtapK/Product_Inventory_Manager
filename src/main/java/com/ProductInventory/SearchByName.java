package com.ProductInventory;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import ProductInventory.Entity.Products;
import ProductInventory.Utility.ProductInventoryUtility;

public class SearchByName {

		
		public void SearchProducts() {
		//1/session factory
		SessionFactory factory = ProductInventoryUtility.getSessionFactory();
		
		//2. session from session factory
		Session session = factory.openSession();
		
		// 3. Transaction from session
		Transaction transaction = session.beginTransaction();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Search Product Name: ");
		String product = sc.nextLine();
		// 4.write your logic here
		Products st = session.find(Products.class, product);
		System.out.println(st.toString());
		
		 // 5.pass to database
		transaction.commit();
		
		 // 6.session close
		session.close();
		
	}

}
