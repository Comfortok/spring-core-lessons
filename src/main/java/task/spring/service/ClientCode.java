package task.spring.service;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import task.spring.bean.AutomationTester;
import task.spring.bean.Developer;
import task.spring.bean.HumanFactory;
import task.spring.bean.Manager;

public class ClientCode {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        Developer developer = context.getBean("dev", Developer.class);
        //developer.setCoffeeConsumer(true);
        System.out.println(developer.toString());

        AutomationTester tester = context.getBean("tester", AutomationTester.class);
        System.out.println(tester.toString());

        Manager manager = context.getBean("manager", Manager.class);
        System.out.println(manager.toString());
    }
}