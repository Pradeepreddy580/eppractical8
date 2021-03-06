package inlab;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class StoreRiceDetails {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int id;
		double cost;
		String type;
		
		Scanner sc =new Scanner(System.in);
	
		
		while(true) {
			
		System.out.println("Enter 'yes' to insert values and 'no' to exit.");
		
		String val = sc.next();
	
		if(val.equals("yes")) {
			SessionFactory f =new Configuration().configure().buildSessionFactory();
			
			Session s = f.openSession();
			
			Transaction tx = s.beginTransaction();
			
			System.out.println("Enter ID:");
			id = sc.nextInt();
			
			System.out.println("Enter COST:");
			cost = sc.nextDouble();
			
			System.out.println("Enter Type:");
			type = sc.next();
			
			RiceDetails rd = new RiceDetails();
			
			rd.setId(id);
			rd.setCost(cost);
			rd.setType(type);
			
			s.save(rd);
			
			tx.commit();
			
			System.out.println("Values inserted");
			
		}else {
			System.out.println("Exiting ....");
			break;
		}
		}
	}

}
