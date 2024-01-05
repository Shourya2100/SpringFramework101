package com.example.Main;

import com.example.beans.Vehicle;
import com.example.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Example1 {

    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.setName("Honda City");
        System.out.println("Vehicle name from non-spring context is: " + vehicle.getName() );

       var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        Vehicle veh = context.getBean(Vehicle.class);
        System.out.println("Vehicle name from spring context is: " + veh.getName());

       String name = context.getBean(String.class);
       Integer num = context.getBean(Integer.class);

        System.out.println(" Name from spring context is: " + name);
        System.out.println(" Num from spring context is: " + num);

    }
}
