package com.yorwerth;

import lombok.Data;

@Data
public class Kuchen {
    public Flavour flavour;
    public boolean isBite;

    public Kuchen(Flavour flavour, boolean isBite) {
        this.flavour = flavour;
        this.isBite = isBite;
    }

    public void print() {
        System.out.println(flavour + " " + isBite);
    }
}
