package com.service.demo01.controller;



import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class TestDemo01 {

        Demo01Delegate demo01Delegate = new Demo01Delegate();


    @Test
    public void testhelloworld(){

        String expactReturnValue = "hello"; // You should put the expect String type value here.

        String returnValue = demo01Delegate.helloworld("hello");

        assertEquals(expactReturnValue, returnValue);
    }

}