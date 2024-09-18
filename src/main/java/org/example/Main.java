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
//        List<String> m =m3(1,3,-4);
//        System.out.println(m);
//          System.out.println(m4());
          System.out.println(m5("Do geese see God"));

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
    public static List<String> m3(int a,int b,int c){
        List<String> m1=new ArrayList<>();
        float d=b*b-4*a*c;
        if(d<0){
            m1.add("нет вещественных корней");
        } else if (d>0) {
            m1.add(String.valueOf((-b-Math.sqrt(d))/(2*a)));
            m1.add(String.valueOf((-b+Math.sqrt(d))/(2*a)));
        }else {
            m1.add(String.valueOf((b/(2*a))*-1));
        }
        return  m1;
    }
    public static float m4(){
        float otv=0;
        float n=1;
        for (float i=2;n>=Math.pow(10,-6);i++){
            n=1/(i*i+i-2);
            otv=otv+n;
        }
        return otv;
    }
    public static boolean m5(String n){
        String nn=m2(n).replaceAll(" ","");
        n=n.replaceAll(" ","");
        return n.equalsIgnoreCase(nn);
    }
}
