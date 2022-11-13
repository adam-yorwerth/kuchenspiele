package com.yorwerth;

import lombok.Data;

import java.util.ArrayList;

//represents a possible grid layout that might solve the problem
@Data
public class Attempt {

    /*
        a list of 9 pieces, referring to the below positions:
        ______
        |0|1|2|
        |3|4|5|
        |6|7|8|
        _______
     */
    public ArrayList<Piece> grid;

    //rotates all pieces a random amount, puts the list in a random order
    public void randomise() {
    }

    //prints the result
    public void print() {
    }
}
