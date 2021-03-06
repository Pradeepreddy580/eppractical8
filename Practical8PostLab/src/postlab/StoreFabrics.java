package postlab;

import org.hibernate.*;
import org.hibernate.cfg.*;
import java.util.Scanner;

public class StoreFabrics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		SessionFactory f =new Configuration().configure().buildSessionFactory();
		
		Session s = f.openSession();
		
		Transaction tx = s.beginTransaction();
		
		Fabrics fab = new Fabrics();
		
		System.out.println("Enter ID :");
		int id = sc.nextInt();
		
		System.out.println("Enter Type :");
		String type = sc.next();
		
		System.out.println("Enter color :");
		String color = sc.next();
		
		System.out.println("Enter length :");
		double length = sc.nextDouble();
		
		System.out.println("Enter Cost Per Length :");
		double cpl = sc.nextDouble();
		
		fab.setId(id);
		fab.setType(type);
		fab.setColor(color);
		fab.setLength(length);
		fab.setCostPerLength(cpl);
		
		s.save(fab);
		tx.commit();
		
		System.out.println("Values inserted");
	}

}
