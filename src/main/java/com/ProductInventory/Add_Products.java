package com.ProductInventory;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import ProductInventory.Entity.Products;
import ProductInventory.Utility.ProductInventoryUtility;

public class Add_Products {
	
		public void AddProduct() {
		//1.session Factory
    	SessionFactory factory = ProductInventoryUtility.getSessionFactory();
      
        //2. session from session factory
    	Session session = factory.openSession();
        
        //3.Transaction from session
    	Transaction transaction = session.beginTransaction();
    	
		
		Products s = new Products();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Product ID: ");
		
		s.setId(sc.nextInt());
		sc.nextLine();
		
		System.out.println("Enter Product Name: ");
		s.setName(sc.nextLine());
		
		System.out.println("Enter Product Manudacturer: ");
		s.setManufacturer(sc.nextLine());
		
		System.out.println("Enter Product Price: ");
		s.setPrice(sc.nextDouble());
		
		System.out.println("Enter Product Quantity: ");
		s.setQuantity(sc.nextInt());
		
		
		//4.save process
    	session.persist(s);
    	
    	System.out.println("Updated Successfully " + s);
    	//5.pass to database
    	transaction.commit();
    	session.close();
		
	}
	

}
