package com.yorwerth;

import lombok.Data;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

@Data
public class Piece {
    // list of 4 (0,1,2,3) Kuchen, referring to positions top, right, bottom and left
    public ArrayList<Kuchen> slots = new ArrayList<>();

    public Piece(Kuchen one, Kuchen two, Kuchen three, Kuchen four){
        slots.add(0, one);
        slots.add(1, two);
        slots.add(2, three);
        slots.add(3, four);
    }

    public void rotateRandomly(){
        Random random = new Random();
        int rotations = random.nextInt(4);
        Collections.rotate(slots,rotations);
    }

    public Kuchen getKuchen(int index){
        return slots.get(index);
    }

    public void print() {
        slots.forEach(Kuchen::print);
    }
}
