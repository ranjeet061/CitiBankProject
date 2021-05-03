package nit.HelloWorld;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.pojo.Student;

public class App {
  public static void main(String[] args) {
    System.out.println("Hello World!");
    ApplicationContext context=new ClassPathXmlApplicationContext("/com/nt/cfg/applicationcontext.xml");
    Student student1=(Student)context.getBean("student1");
    System.out.println(student1);
    
  }
}
