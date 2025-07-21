package com.ProductInventory;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import ProductInventory.Entity.Products;
import ProductInventory.Utility.ProductInventoryUtility;

public class DeleteProductByID {
		
		public void DeleteDetails() {
        SessionFactory factory = ProductInventoryUtility.getSessionFactory();
		
		Session session = factory.openSession();
		
		Transaction transaction = session.beginTransaction();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Product Id");
		int id = sc.nextInt();
		
		Products st = session.find(Products.class, id);
		session.remove(st);
		
		transaction.commit();
		session.close();

	}

}
