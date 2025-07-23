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
		
		
		Products p = new Products();
		
		p.setName("coco cola");
		p.setPrice(25);
		p.setManufacturer("ABC");
		p.setQuantity(20);
		p.setProductDe(pd);
		pd.setProduct(p);
		
		session.persist(p);
		
		transaction.commit();
		session.close();
		
	}
}
