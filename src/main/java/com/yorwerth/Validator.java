package com.yorwerth;

import java.util.ArrayList;

//returns true if all conditions are met, false if they're not.
public class Validator {

    /*
        a list of 9 pieces, referring to the below positions:
        ______
        |0|1|2|
        |3|4|5|
        |6|7|8|
        _______

        Piece:
        |*|0|*|
        |3|*|1|
        |*|2|*|
     */

    public static boolean validate(Attempt attempt){

        ArrayList<Piece> grid = attempt.getGrid();

        //12 comparisons need making

        //centre
        //1-4

        if(
                !validMatch(
                        grid.get(1).getKuchen(2),
                        grid.get(4).getKuchen(0)
                )
        ) return false;


        //5-4
        if(
                !validMatch(
                        grid.get(5).getKuchen(3),
                        grid.get(4).getKuchen(1)
                )
        ) return false;

        //7-4
        if(
                !validMatch(
                        grid.get(7).getKuchen(0),
                        grid.get(4).getKuchen(2)
                )
        ) return false;
        //3-4
        if(
                !validMatch(
                        grid.get(3).getKuchen(1),
                        grid.get(4).getKuchen(3)
                )
        ) return false;

        //middles
        //0-1
        if(
                !validMatch(
                        grid.get(0).getKuchen(1),
                        grid.get(1).getKuchen(3)
                )
        ) return false;
        //2-1
        if(
                !validMatch(
                        grid.get(2).getKuchen(3),
                        grid.get(1).getKuchen(1)
                )
        ) return false;
        //System.out.println("got to 6 away from perfect");
        //2-5
        if(
                !validMatch(
                        grid.get(2).getKuchen(2),
                        grid.get(5).getKuchen(0)
                )
        ) return false;

        //System.out.println("got to 5 away from perfect");
        //8-5
        if(
                !validMatch(
                        grid.get(8).getKuchen(0),
                        grid.get(5).getKuchen(2)
                )
        ) return false;
        System.out.println("got to 4 away from perfect");
        //8-7
        if(
                !validMatch(
                        grid.get(8).getKuchen(3),
                        grid.get(7).getKuchen(1)
                )
        ) return false;
        System.out.println("=====got to 3 away from perfect");
        //6-7
        if(
                !validMatch(
                        grid.get(6).getKuchen(1),
                        grid.get(7).getKuchen(3)
                )
        ) return false;
        System.out.println("====got to 2 away from perfect=====");
        //6-3
        if(
                !validMatch(
                        grid.get(6).getKuchen(0),
                        grid.get(3).getKuchen(2)
                )
        ) return false;
        System.out.println("got to 1 away from perfect");
        //0-3
        if(
                !validMatch(
                        grid.get(0).getKuchen(2),
                        grid.get(3).getKuchen(0)
                )
        ) return false;
        System.out.println("BOOOOM");
        attempt.print();

        return true;
    }

    public static boolean validMatch(Kuchen one, Kuchen two){
        return (one.isBite != two.isBite) && (one.getFlavour() == two.getFlavour());
    }
}
