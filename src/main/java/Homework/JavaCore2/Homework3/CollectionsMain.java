package Homework.JavaCore2.Homework3;

import java.util.*;

public class CollectionsMain {
    public static void main(String[] args) {
        ArrayList<String> arrList = new ArrayList<>(Arrays.asList("Cat", "Dog", "Bird", "Fish", "Bear", "Bull", "Snake", "Dog", "Cat", "Bird"));
        Set<String> uniqueList = new HashSet<String>(arrList);
        System.out.println(uniqueList);
        for (String s : uniqueList) {
            System.out.println(s + ": " + Collections.frequency(arrList, s));
        }
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add ("Ivanov", "+71111111111");
        phoneBook.add ("Sidorov", "+72222222222");
        phoneBook.add ("Ivanov", "+73333333333");
        phoneBook.get("Sidorov");
        phoneBook.get("Ivanov");
    }
}
