package task4;

import task2.MyLinkedList;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public final class Task4 {


    public static void main(String[] args) {
        MyLinkedList<AddressBook> list = new MyLinkedList<AddressBook>();

        Random rand = new Random();
        Set<String> words = new HashSet<>();


        for (int i = 0; i < 10; i++) {
            words.add(Long.toString(Math.abs(rand.nextLong() % 3656158440062976L), 36));
            AddressBook a10 = new AddressBook(String.valueOf(i), "home" + i);
            words.clear();
            list.add(i, a10);

        }
        System.out.println(list);
        for (int i = 0; i < list.size(); i++) {
            list.remove(i);
        }

        System.out.println(list);
//        for (int i = 0; i < list.size(); i++) {
//
//            System.out.println(list.get(i));
//        }


    }

}