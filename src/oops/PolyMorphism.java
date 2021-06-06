package oops;

import practice.Test;

public class PolyMorphism {
    public static void main(String[] args) {

        PolyMorphism t = new PolyMorphism();

        t.show('a');
        t.show(10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20);

        main();

    }

    public static void main(){
        System.out.println("main");
    }

    void show(Object a){
        System.out.println(a);
    }

    void show(String s){
        System.out.println("String buffer " + s);
    }

    void show(StringBuilder s){
        System.out.println("String " + s);
    }

    void show(int... a){
        for (int val : a)
            System.out.print(val + " ");
        System.out.println();
    }

}
