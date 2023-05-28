package org.example;

import JavaSamples.Animal;
import JavaSamples.Bird;
import JavaSamples.SubClassB;
import JavaSamples.Sum;

public class Main {

    public static void main(String[] args){
        //create car object

        /*Car myCar = new Car("red","axio",100);
        System.out.println("Hello world");
        myCar.myValue();


        SubClassB b = new SubClassB();
        b.bar();
        b.foo();



        Sum s=new Sum();
        System.out.println (s.sum(10,20));
        System.out.println(s.sum(10.5,12.5));
 */
        Animal myanimal=new Animal();
       // myanimal.eat();
        Animal myBird=new Bird();
        myBird.eat();


    }
}