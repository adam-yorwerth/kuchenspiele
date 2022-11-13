package com.yorwerth;

import java.util.ArrayList;

//entry point for the programme
public class Coordinator {
    public static void main(String[] args) {
        //define the pieces we have in the set within an attempt

        ArrayList<Piece> pieces = new ArrayList<>();

        //1
        Kuchen kuchen1 = new Kuchen(Flavour.Dark, true);
        Kuchen kuchen2 = new Kuchen(Flavour.Nuts, true);
        Kuchen kuchen3 = new Kuchen(Flavour.Bumpy, false);
        Kuchen kuchen4 = new Kuchen(Flavour.Dark, false);

        Piece one = new Piece(kuchen1, kuchen2, kuchen3, kuchen4);
        pieces.add(0, one);

        Attempt attempt = new Attempt(pieces);
        getToWork(attempt);
    }

    static void getToWork(Attempt attempt){
        int x=0;
        while(x<1000) {
            System.out.println("attempt "+x);
            attempt.randomise();
            if (Validator.validate(attempt)){
                System.out.println("SOLVED");
                attempt.print();
                break;
            }
            x++;
        }
        System.out.println("programme finished");
    }
}
