package com.Oussama_Oujamaa.Calculator_p;

public class Perssonne {
    private String Nom;
    public Direction_po Direction ;

    public Direction_po tourner(int fois){
        int current = Direction.ordinal();
        for(int j = 1;j<=fois;j++){
            if(j!=3){
                Direction = Direction_po.values()[Direction.ordinal()+1];
            }else{
                Direction = Direction_po.NORD;
            }
        }
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