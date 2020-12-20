package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Person p1 = new Person("Ivan", "Dulin", Gender.MALE);
        Person p2 = new Person("Mariya", "Savina", Gender.FEMALE);
        Person p3 = new Person("Igor", "Kolosov", Gender.MALE);
        Person p4 = new Person("Kirill", "Gesko", Gender.MALE);
        Person p5 = new Person("Alina", "Makarova", Gender.FEMALE);
        Person p6 = new Person("Anastasia", "Volochkova", Gender.FEMALE);
        Person p7 = new Person("Anastasia", "Volochkova", Gender.FEMALE);
        Person p8 = new Person("Lev", "Tolstoy", Gender.MALE);
        Person p9 = new Person("Lev", "Tolstoy", Gender.MALE);
        Person p10 = new Person("Artur", "Sharifov", Gender.MALE);
        Person p11 = new Person("Egor", "Abvgdejkin", Gender.MALE);
        Person p12 = new Person("Mariya", "Kozhevnikova", Gender.FEMALE);
        Person p13 = new Person("Sergei", "Nemchinsky", Gender.MALE);
        Person p14 = new Person("Alexander", "Makedonsky", Gender.MALE);
        Person p15 = new Person("Jeanne", "d'Arc", Gender.FEMALE);

        List<Person> myList1 = new ArrayList<>();
        myList1.add(p1);
        myList1.add(p2);
        myList1.add(p3);
        myList1.add(p4);
        myList1.add(p5);

        Set<Person> myList2 = new HashSet<>();
        myList2.add(p6);
        myList2.add(p7);
        myList2.add(p8);
        myList2.add(p9);
        myList2.add(p10);

        Map<Integer, Person> myList3 = new HashMap<>();
        myList3.put(1, p11);
        myList3.put(2656, p12);
        myList3.put(7, p13);
        myList3.put(32, p14);
        myList3.put(64, p15);

        System.out.println(myList1);
        System.out.println("Общее количество элементов в коллекции типа List: " + myList1.size());

        System.out.println("------------------------------------------------------------");

        System.out.println(myList2);
        System.out.println("Общее количество элементов в коллекции типа Set: " + myList2.size());

        System.out.println("------------------------------------------------------------");

        for (Map.Entry<Integer, Person> entry : myList3.entrySet()) {
            System.out.println("Ключ: " + entry.getKey() + ", Значение: " + entry.getValue());
        }
        System.out.println("[Общее количество элементов в коллекции типа Map: " + myList3.size() + "]");

    }
}
