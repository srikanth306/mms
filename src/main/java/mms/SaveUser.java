package mms;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SaveUser 
{
	public static void main(String[] args) 
	{
		ApplicationContext ac =new AnnotationConfigApplicationContext(Config.class);
		 User u=ac.getBean(User.class);
			u.setName("Srikanth");
			u.setEmail("@mail");
			u.setPhone(1234567l);
			u.setPassword("kanth");
		 
		 EntityManager em=ac.getBean(EntityManager.class);
		 
		 EntityTransaction et=em.getTransaction();
		 et.begin();
		 User dbUser=em.merge(u);
		 et.commit();
		 System.out.println(dbUser.getId());
		
		
	}

}
