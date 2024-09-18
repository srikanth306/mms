//package mms;
//
//import java.util.List;
//import java.util.Set;
//
//import javax.persistence.EntityManager;
//import javax.persistence.EntityTransaction;
//
//import org.springframework.context.ApplicationContext;
//import org.springframework.context.annotation.AnnotationConfigApplicationContext;
//
//public class Test 
//{
//	public static void main(String[] args) 
//	{
//		ApplicationContext ac= new AnnotationConfigApplicationContext(Config.class);
//		EntityManager em=ac.getBean(EntityManager.class);
//		
//		User u=ac.getBean(User.class);
//		u.setName("Srikanth");
//		u.setEmail("@mail");
//		u.setPhone(1234567l);
//		u.setPassword("kanth");
//		
//		EntityTransaction et=em.getTransaction();
//		et.begin();
//		em.persist(u);
//		et.commit();
//		System.out.println("User Saved Succesdfully..");
//		
//		
//		
//	}
//
//}
