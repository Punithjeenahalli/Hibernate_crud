package hibmock;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;



public class Sports
{
public static void main(String[] args) 
{
	EntityManagerFactory factory=Persistence.createEntityManagerFactory("akshay");
	EntityManager manager=factory.createEntityManager();
	EntityTransaction transaction=manager.getTransaction();
	
	IPL p=new IPL();
	p.setTeam("rcb");
	p.setCaptain("virat");
	p.setPlace("benglore");
	
	IPL p1=new IPL();
	p1.setTeam("csk");
	p1.setCaptain("dhoni");
	p1.setPlace("chenni");
	
	IPL p2=new IPL();
	p2.setTeam("gt");
	p2.setCaptain("rahul");
	p2.setPlace("gujarath");
	
	//  *****to save******
//	
//	transaction.begin();
//	manager.persist(p);
//	manager.persist(p1);
//	manager.persist(p2);
//	transaction.commit();
//	
	
	//****to update*****
	
//	IPL l=manager.find(IPL.class, 2);
//	l.setPlace("tamil nadu");
//	
//	transaction.begin();
//	manager.merge(l);
//	transaction.commit();
	
	
	//*****to delete******
	
	
//	IPL i=manager.find(IPL.class, 2);
//	transaction.begin();
//	manager.remove(i);
//	transaction.commit();
	
	//****to featch*******
	
	
//	IPL k=manager.find(IPL.class, 1);
//	System.out.println(k);
	
	
	// **** fetch by query******
	
	
  Query a = manager.createQuery("select s from IPL s");
  List<IPL> x = a.getResultList();
  for(IPL k : x)
  {
	  System.out.println(k);
  }
  
		  
		
}
}
