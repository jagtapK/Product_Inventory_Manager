package com.ProductInventory;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import ProductInventory.Entity.Products;
import ProductInventory.Utility.ProductInventoryUtility;

public class UpdateQuantity {

	public void UpdateEmpDetails() {

		SessionFactory factory = ProductInventoryUtility.getSessionFactory();

		Session session = factory.openSession();

		Transaction transaction = session.beginTransaction();

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Product Id");

		int Employee_id = sc.nextInt();
		sc.nextLine();

		Products s1 = session.find(Products.class, Employee_id);

		System.out.println("Enter Updated Quantity");
		int pQuantity = sc.nextInt();
		s1.setQuantity(pQuantity);

		transaction.commit();

		session.close();
	}
}
