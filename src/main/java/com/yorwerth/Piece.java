package com.yorwerth;

import lombok.Data;

import java.util.ArrayList;

@Data
public class Piece {
    // list of 4 (0,1,2,3) Kuchen, referring to positions top, right, bottom and left
    public ArrayList<Kuchen> slots;
}
