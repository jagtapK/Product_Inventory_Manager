package com.ProductInventory;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import ProductInventory.Entity.ProductDetails;
import ProductInventory.Entity.Products;
import ProductInventory.Utility.ProductInventoryUtility;

public class Details {

	public void details() {
		
		SessionFactory factory = ProductInventoryUtility.getSessionFactory();
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		
		ProductDetails pd = new ProductDetails();
		pd.setStock(10);
		//pd.setId(101);
		
		
		Products p = new Products();
		//p.setId(201);
		p.setName("coco cola");
		p.setPrice(25);
		p.setManufacturer("ABC");
		p.setQuantity(20);
		p.setProductDe(pd);
		pd.setProduct(p);
		
		session.persist(p);
		//session.persist(pd);
		transaction.commit();
		session.close();
		
	}
}
