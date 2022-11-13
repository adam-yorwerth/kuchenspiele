package com.yorwerth;

//returns true if all conditions are met, false if they're not.
public class Validator {

    /*
        a list of 9 pieces, referring to the below positions:
        ______
        |0|1|2|
        |3|4|5|
        |6|7|8|
        _______
     */

    public static boolean validate(Attempt attempt){
        return attempt.getGrid().size() == 9;
    }
}
