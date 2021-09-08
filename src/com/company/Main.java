package com.company;

public class Main {

    public static void main(String[] args) { //0
        zippo("rattle", 13); // 1
    }
    public static void baffle(String blimp) { //6
        System.out.println(blimp); //7
        zippo("ping", -5); //8
    }
    public static void zippo(String quince, int flag) {// 2
        if (flag < 0) { // 3
            System.out.println(quince + " zoop"); //4
        } else { //4
            System.out.println("ik"); //4
            baffle(quince); //5
            System.out.println("boo-wa-ha-ha"); // 9
        }
    }
}
// The value of blimp is "Rattle"
/*
The output is:
 ik
rattle
ping zoop
boo-wa-ha-ha
 */
