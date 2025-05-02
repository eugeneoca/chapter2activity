package com.eboengineering;

public class TaskThree {

    public static void run(){
        System.out.println("Task 3 Output:");
        String a = "Wow!";
        String b = "Wow!";
        String c = "???";
        String d = b + "!";

        boolean b1 = a == b;
        boolean b2 = d.equals(b+"!");
        boolean b3 = !c.equals(a);

        if(b1&&b2&&b3){
            System.out.println("Success!");
        }
    }
}
