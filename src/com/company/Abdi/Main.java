package com.company.Abdi;

import java.util.*;
public class Main {

    public static void main(String[] args){
        System.out.println("hello");

        Person person1 = new Person("mubarik", "brown", 17);
        Person person2 = new Person("Mr.K", "pink", 25);
        Person person3 = new Person("sam", "green", 30);

        person1.setName("bark");

        ArrayList<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(4);
        list.add(3);

        ArrayList<Person> people = new ArrayList<>();
        list.add(person1);
        list.add(person2);
        list.add(person3);


        System.out.println(list);
        list.remove(0);
        System.out.println(list);

    }


}
