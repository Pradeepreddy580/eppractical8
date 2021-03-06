package postlab;

import org.hibernate.*;
import org.hibernate.cfg.*;
import java.util.Scanner;

public class UpdateFabrics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory f = new Configuration().configure().buildSessionFactory();
		
		Session s = f.openSession();
		
		Transaction tx = s.beginTransaction();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter item id : ");
		
		int id = sc.nextInt();
		
		Fabrics fab = s.load(Fabrics.class, id);
		
		System.out.println("Type of Fabric :"+ fab.getType());
		System.out.println("Color of fabric :"+ fab.getColor());
		System.out.println("Length remaining :"+ fab.getLength());
		System.out.println("Cost per meter :"+ fab.getCostPerLength());
		
		System.out.println("Enter length to be sold : ");
		double lengthSold = sc.nextDouble();
		
		double totalCost = lengthSold * fab.getCostPerLength();
		
		System.out.println("Total Cost is : " + totalCost);
		
		double remainingLength = fab.getLength() - lengthSold;
		
		Fabrics fab1 = s.load(Fabrics.class, id);
		
		fab1.setLength(remainingLength);
		
		s.save(fab1);
		
		tx.commit();
		
		System.out.println("Update Successfull");
	}

}
