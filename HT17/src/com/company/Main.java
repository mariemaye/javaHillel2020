package com.company;

import sun.awt.windows.ThemeReader;

public class Main {

    public static void main(String[] args) {
     CreditCard card = new CreditCard();
        Thread masha = new Thread(card);
        Thread natasha = new Thread(card);
        masha.setName("Masha");
        natasha.setName("Natasha");
        masha.start();
        natasha.start();
    }
}
