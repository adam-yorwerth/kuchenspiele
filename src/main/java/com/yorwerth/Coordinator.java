package com.yorwerth;

import java.util.ArrayList;

//entry point for the programme
public class Coordinator {
    public static void main(String[] args) {
        //define the pieces we have in the set within an attempt

        ArrayList<Piece> pieces = new ArrayList<>();

        //1
        pieces.add(0,
                new Piece(
                        new Kuchen(Flavour.Dark, true),
                        new Kuchen(Flavour.Nuts, true),
                        new Kuchen(Flavour.Bumpy, false),
                        new Kuchen(Flavour.Dark, false)
                )
        );

        //2
        pieces.add(1,
                new Piece(
                        new Kuchen(Flavour.Dark, true),
                        new Kuchen(Flavour.Nuts, true),
                        new Kuchen(Flavour.Bumpy, false),
                        new Kuchen(Flavour.Dark, false)
                )
        );

        //3
        pieces.add(2,
                new Piece(
                        new Kuchen(Flavour.Dark, true),
                        new Kuchen(Flavour.Nuts, true),
                        new Kuchen(Flavour.Bumpy, false),
                        new Kuchen(Flavour.Dark, false)
                )
        );

        //4
        pieces.add(3,
                new Piece(
                        new Kuchen(Flavour.Dark, true),
                        new Kuchen(Flavour.Nuts, true),
                        new Kuchen(Flavour.Bumpy, false),
                        new Kuchen(Flavour.Dark, false)
                )
        );

        //5
        pieces.add(4,
                new Piece(
                        new Kuchen(Flavour.Dark, true),
                        new Kuchen(Flavour.Nuts, true),
                        new Kuchen(Flavour.Bumpy, false),
                        new Kuchen(Flavour.Dark, false)
                )
        );

        //6
        pieces.add(5,
                new Piece(
                        new Kuchen(Flavour.Dark, true),
                        new Kuchen(Flavour.Nuts, true),
                        new Kuchen(Flavour.Bumpy, false),
                        new Kuchen(Flavour.Dark, false)
                )
        );

        //7
        pieces.add(6,
                new Piece(
                        new Kuchen(Flavour.Dark, true),
                        new Kuchen(Flavour.Nuts, true),
                        new Kuchen(Flavour.Bumpy, false),
                        new Kuchen(Flavour.Dark, false)
                )
        );

        //8
        pieces.add(7,
                new Piece(
                        new Kuchen(Flavour.Dark, true),
                        new Kuchen(Flavour.Nuts, true),
                        new Kuchen(Flavour.Bumpy, false),
                        new Kuchen(Flavour.Dark, false)
                )
        );

        //9
        pieces.add(8,
                new Piece(
                        new Kuchen(Flavour.Dark, true),
                        new Kuchen(Flavour.Nuts, true),
                        new Kuchen(Flavour.Bumpy, false),
                        new Kuchen(Flavour.Dark, false)
                )
        );

        Attempt attempt = new Attempt(pieces);
        getToWork(attempt);
    }

    static void getToWork(Attempt attempt){
        int x=0;
        while(x<1) {
            System.out.println("attempt "+x);
            attempt.randomise();
            if (Validator.validate(attempt)){
                System.out.println("SOLVED");
                attempt.print();
                break;
            }
            x++;
        }
        attempt.print();
        System.out.println("programme finished");
    }
}
