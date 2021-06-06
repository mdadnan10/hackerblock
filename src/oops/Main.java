package oops;

public class Main {
    public static void main(String[] args) {

        Dog bruzo = new Dog("Brunzo", 10);
        bruzo.eat();
        bruzo.myAge();
        Dog namni = new Cat("Namni", 5);
        ((Cat)namni).sleep();

        Animal a = new Animal();

        StringBuilder s = new StringBuilder();

    }

    public void eat() {
        System.out.println("I am eating");
    }
}

class Cat extends Dog {

    public Cat(){}

    public Cat(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void sleep(){
        System.out.println(name + " is sleeping");
    }

}

class Dog extends Animal{

    public Dog(){}

    public Dog(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void myAge(){
        System.out.println(name + " is " + age + " years old");
    }

}

class Animal {

    protected String name;
    protected int age;

    public Animal() {
    }

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }


    protected void eat(){
        System.out.println(name + " is eating");
    }

}
