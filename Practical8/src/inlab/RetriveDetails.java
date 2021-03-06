package inlab;
import org.hibernate.*;
import org.hibernate.cfg.*;
import javax.persistence.Query;
import java.util.Scanner;

public class RetriveDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory f = new Configuration().configure().buildSessionFactory();
		
		Session s =f.openSession();
		
		Transaction tx = s.beginTransaction();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Id of the item:");
		
		int id = sc.nextInt();
		
		RiceDetails rd = s.load(RiceDetails.class, id);
		
		System.out.println("Cost of Rice is : "+rd.getCost());
		
		System.out.println("Enter 'yes' to make payment and 'no' to cancel it.");
		String x = sc.next();
		
		if(x.equals("yes")) {
			RiceDetails rd1 = s.load(RiceDetails.class, id);
			
			s.delete(rd1);
			
			s.save(rd1);
			
			tx.commit();
			System.out.println("Value Deleted");
		}else {
			System.out.println("Exiting");
		}
	}

}
