package com.practice2;

import java.util.ArrayList;

public class Dog {
    private String nick;
    private int age;

    Dog(String nick, int age) {
        this.age = age;
        this.nick = nick;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public String getNick() {
        return nick;
    }

    public int intoHumanAge(){
        return age*7;
    }

    public String toString() {
        return "Dog{" +
                "nick='" + nick + '\'' +
                ", age=" + age +
                '}';
    }

}

class CyberDogKennel{
    public static void main(String[] args){
        ArrayList<Dog> dogs = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            Dog doge = new Dog("K"+(int)(Math.random()*10), (int) (Math.random() * 12));
            dogs.add(doge);
        }
        for (Dog doge:dogs) {
            System.out.println(doge.toString());
        }

    }
}
