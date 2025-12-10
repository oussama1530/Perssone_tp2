package com.Oussama_Oujamaa.Calculator_p;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PerssonneTest {

    private Perssonne p1;
    @BeforeEach
    public void Star(){
        p1 = new Perssonne("Ahmed");
        System.out.println("test Start...");
    }
    @AfterEach
    public void end(){
        System.out.println("test end dispo for new test...");
    }

//    public Perssonne p1 = new Perssonne("oussama");

    @Test
    public void test_dir(){
        System.out.println("Loading..");
        int i = 5;
        p1.tourner(i);  // First rotate the person
        assertEquals(Direction_po.EST, p1.Direction);  // Check the direction field
    }

}