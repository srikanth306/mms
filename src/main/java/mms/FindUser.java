package mms;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;
@Component
public class FindUser 
{
	@Autowired
	 EntityManager em;
	public static void main(String[] args) 
	{
		ApplicationContext ac=new  AnnotationConfigApplicationContext(Config.class);
		
		FindUser fu=ac.getBean(FindUser.class);
		User u=fu.em.find(User.class, 1);
		System.out.println(u.getName());
		System.out.println(u.getEmail());
		System.out.println(u.getPhone());
		System.out.println(u.getPassword());
		
		
		
		
	}

}
