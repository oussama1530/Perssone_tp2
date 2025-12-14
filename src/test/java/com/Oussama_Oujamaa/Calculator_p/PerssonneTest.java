package com.Oussama_Oujamaa.Calculator_p;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;


class PerssonneTest {

    private Perssonne p1;
    @BeforeEach
    public void Star(){
        p1 = new Perssonne("PERSSO");
        System.out.println("test Start...");
    }
    @AfterEach
    public void end(){
        System.out.println("test end dispo for new test...");
    }

    @Test
    public void test_changer_direction_du_nord_vers_est(){
        assertThat(p1.tourner(1)).isEqualTo(Direction_po.EST);
    }

    @Test
    public void test_changer_direction_du_nord_vers_nord(){
        assertThat(p1.tourner(4)).isEqualTo(Direction_po.NORD);
    }



}