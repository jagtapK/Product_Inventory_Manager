package com.ProductInventory;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println("Product Inventory Manager! ");
        
        System.out.println("Choose an option:" + "\n1.Add New Product" + "\n2.Search By product name"
			+ "\n3.Delete Product By ID" + "\n4.Update Quantity"+ "\n5.Details" + "\n6.Exit");
    
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Choice");
        
        int choice = sc. nextInt();
        sc.nextLine();
        
        switch(choice) {
        
        case 1:
        	Add_Products ae = new Add_Products();
            ae.AddProduct();
            break;
             
        case 2:
        	SearchByName an = new SearchByName();
        	an.SearchProducts();
        	break;
        	
        case 3:
        	DeleteProductByID de = new DeleteProductByID();
        	de.DeleteDetails();
        	break;
        	
        case 4:
        	UpdateQuantity ue = new UpdateQuantity();
        	ue.UpdateEmpDetails();
        	break;
        	
        case 5:
        	Details d = new Details();
        	d.details();
    	
        case 6:
        	System.out.println("Exiting program. Goodbye!");
    		System.exit(0); // Terminates the program immediately
    		break;
        }
    
    }
}
