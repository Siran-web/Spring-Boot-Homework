package com.example.demo;

import org.springframework.stereotype.Component;

@Component

public class CakeBake {

    final Frosting frosting;
    final Syrup syrup;

    public CakeBake(Frosting frosting, Syrup syrup) {
        this.frosting = frosting;
        this.syrup = syrup;
    }

    public void bakeCake(){
        System.out.println("This cake has " + frosting.getFrostingType() + " and " +  syrup.getSyrupType());
    }
}
