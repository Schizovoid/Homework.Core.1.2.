package Homework.JavaCore2.Homework3;

import java.util.*;

public class PhoneBook {
    private HashMap<String, List<String>> pb;

    public PhoneBook() {
        this.pb = new HashMap<String, List<String>>();
    }

    public void get(String surname) {
        if (pb.containsKey(surname)) {
            System.out.println(pb.get(surname));
        } else {
            System.out.println("В телефонной книге нет такой фамилии!");

        }
    }

    public void add(String surname, String number) {
        if (pb.containsKey(surname)) {
        pb.get(surname).add(number);
        } else {
            pb.put(surname, new ArrayList<String>(Collections.singleton(number)));
        }
    }
}