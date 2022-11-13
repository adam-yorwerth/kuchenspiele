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
                        new Kuchen(Flavour.Bumpy, false),
                        new Kuchen(Flavour.Nuts, false),
                        new Kuchen(Flavour.Dark, true),
                        new Kuchen(Flavour.Sugar, true)
                )
        );

        //2
        pieces.add(1,
                new Piece(
                        new Kuchen(Flavour.Dark, false),
                        new Kuchen(Flavour.Sugar, false),
                        new Kuchen(Flavour.Nuts, true),
                        new Kuchen(Flavour.Bumpy, true)
                )
        );

        //3
        pieces.add(2,
                new Piece(
                        new Kuchen(Flavour.Dark, false),
                        new Kuchen(Flavour.Nuts, false),
                        new Kuchen(Flavour.Bumpy, true),
                        new Kuchen(Flavour.Sugar, true)
                )
        );

        //4
        pieces.add(3,
                new Piece(
                        new Kuchen(Flavour.Dark, false),
                        new Kuchen(Flavour.Bumpy, false),
                        new Kuchen(Flavour.Sugar, true),
                        new Kuchen(Flavour.Nuts, true)
                )
        );

        //5
        pieces.add(4,
                new Piece(
                        new Kuchen(Flavour.Bumpy, false),
                        new Kuchen(Flavour.Sugar, false),
                        new Kuchen(Flavour.Dark, true),
                        new Kuchen(Flavour.Sugar, true)
                )
        );

        //6
        pieces.add(5,
                new Piece(
                        new Kuchen(Flavour.Bumpy, false),
                        new Kuchen(Flavour.Dark, false),
                        new Kuchen(Flavour.Dark, true),
                        new Kuchen(Flavour.Nuts, true)
                )
        );

        //7
        pieces.add(6,
                new Piece(
                        new Kuchen(Flavour.Dark, false),
                        new Kuchen(Flavour.Nuts, false),
                        new Kuchen(Flavour.Bumpy, true),
                        new Kuchen(Flavour.Sugar, true)
                )
        );

        //8
        pieces.add(7,
                new Piece(
                        new Kuchen(Flavour.Bumpy, false),
                        new Kuchen(Flavour.Sugar, false),
                        new Kuchen(Flavour.Bumpy, true),
                        new Kuchen(Flavour.Nuts, true)
                )
        );

        //9
        pieces.add(8,
                new Piece(
                        new Kuchen(Flavour.Dark, false),
                        new Kuchen(Flavour.Nuts, false),
                        new Kuchen(Flavour.Dark, true),
                        new Kuchen(Flavour.Nuts, false)
                )
        );

        Attempt attempt = new Attempt(pieces);
        getToWork(attempt);
    }

    static void getToWork(Attempt attempt){
        int x=0;

        while(x<100000000) {
            attempt.randomise();

            if (Validator.validate(attempt)){
                solved(attempt);
                break;
            }

            //print status updates
            if(x % 1000000 == 0){
                System.out.println("Completed "+x+" permutations");
            }

            x++;
        }
        System.out.println("programme finished");
    }

    private static void solved(Attempt attempt) {
        System.out.println("SOLVED");
        attempt.print();
    }


}
