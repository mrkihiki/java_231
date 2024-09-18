package org.example;

import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        //System.out.printf("Hello and welcome!");
        //List<String> m =m1(500);
//        System.out.println(m);
        System.out.println(m2("make install"));
//        String n="make install";
//        System.out.println(n.length());

    }
    public static List<String> m1(int n){
        if (n<0){return null;}
        List<String> m1=new ArrayList<>();
        for (int i=1; i<=n;i++){
            if (i % 5 == 0){
                m1.add("fizz");
                if(i % 7 == 0){
                    m1.set(i-1,"fizzbuzz");
                }
            } else if (i % 7 == 0) {
                m1.add("buzz");
            }else {
                m1.add(String.valueOf(i));
            }
        }
        return m1;
    }
    public static String m2(String n){
        String otv = "";
        for (int i = n.length()-1;i>=0; i--){
            otv=otv + n.charAt(i);
        }
        return otv;
    }
}