package com.company;

import javax.security.auth.login.AccountNotFoundException;
import javax.sound.midi.Soundbank;
import java.util.Random;
import java.util.Scanner;
import java.util.logging.SocketHandler;

public class Main {
    public static void main(String[] args) {
        Farm farm1 = new Farm("abs12",5,2,3,"Uluk");
        Cow cow1 = new Cow(20,5,"abs","tt");
        Cow cow2 = new Cow(16,6,"dv","tt");
        Cow cow3 = new Cow(22,4,"sa","asd");
        Cow cow4 = new Cow(18,2,"asd","dg");
        Cow cow5= new Cow(50,7,"sd","tj");
        Sheep sheep1 = new Sheep(10,2,"jk","nm");
        Sheep sheep2 = new Sheep(35,5,"jk","nm");
        Sheep sheep3 = new Sheep(32,3,"jk","nm");
        Horse horse1 = new Horse(80,6,"white","xg","sf");
        Horse horse2 = new Horse(90,5,"black","lo","dg");
        System.out.println("1-"+farm1);
        System.out.println("                        cow                          "          );
        System.out.println(cow1);
        System.out.println(cow2);
        System.out.println(cow3);
        System.out.println(cow4);
        System.out.println(cow5);
        System.out.println("                           sheep                             ");



        System.out.println(sheep1);
        System.out.println(sheep2);
        System.out.println(sheep3);
        System.out.println("                                horse                             ");

        System.out.println(horse1);
        System.out.println(horse2);

        System.out.println("                                                                     ");



        Farm farm2 = new Farm("Banken",1,1,1,"Ulukbek");
        Cow cow = new Cow(43,4,"efg","jk");
        Sheep sheep = new Sheep(54,2,"df","gn");
        Horse horse = new Horse(70,7,"white","ik","ft");
        System.out.println("2-"+farm2);
        System.out.println("                     Cow              ");
        System.out.println(cow);
        System.out.println("                      Sheep            ");
        System.out.println(sheep);
        System.out.println("                       houre            ");
        System.out.println(horse);




    }
}