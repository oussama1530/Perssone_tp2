package com.Oussama_Oujamaa.Calculator_p;

public class Perssonne {
    private String Nom;
    public Direction_po Direction ;

    public Direction_po tourner(int fois){
        int current = Direction.ordinal();
        int nouveau_direction = (current+fois)%4 ;
        this.Direction = Direction_po.values()[nouveau_direction];
        return Direction;
    }

    Perssonne(String nom){
        this.Nom = nom;
        this.Direction = Direction_po.NORD;
    }

    @Override
    public String toString(){
        return  "Name: " + this.Nom + "  Direction Actuelle: " + this.Direction;
    }
}