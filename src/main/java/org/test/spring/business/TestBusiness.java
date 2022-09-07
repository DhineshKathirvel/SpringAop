package org.test.spring.business;


import org.springframework.stereotype.Component;
import org.test.spring.annotation.LogExecutionTime;

@Component
public class TestBusiness {

    @LogExecutionTime
    public void testAopAdvise() {
        System.out.println("Business Class Invoked !!");
        System.out.println("Complete !!");
    }

}
