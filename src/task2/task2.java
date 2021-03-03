package task2;

import java.util.ArrayList;
import java.util.LinkedList;

public class task2 {
    public static final String ANSI_GREEN = "\033[0;32m";
    public static final String ANSI_WHITE = "\u001B[37m";

    static Long start;
    static Long time;


    public static void main(String[] args) {
        int people =5;
        int skip =2;

//        Scanner in = new Scanner(System.in);
//        System.out.print("Enter number of people: ");
//        peopleNumber = in.nextInt();
//        in.nextLine();
//        System.out.print("Enter number of passes: ");
//        skipNumber = in.nextInt();
//        in.nextLine();



        for (int i = 0; i < 5; i++) {
            System.out.println(ANSI_GREEN + "\npeople input " + people +"  gap" +skip +ANSI_WHITE);
            potato_is_passed_Arraylist(people, skip);
            potato_is_passed_linklist(people, skip);
            potato_is_passed_Iterator(people, skip);
            people = people * 2;
        }

    }




    private static int potato_is_passed_Iterator(int people, int passes) {
        start = System.nanoTime();

        int sum = 0;
        // For finding out the removed
        // chairs in each iteration
        for (int i = 2; i <= people; i++) {
            sum = (sum + passes) % i;
        }


        time = System.nanoTime() - start;
        System.out.println("\nIterator survivor : " + sum + "        time :" + time);
        return sum  ;
    }


    private static void potato_is_passed_linklist(int people, int passes) {
        start = System.nanoTime();
        LinkedList<Integer> linkedList = new LinkedList<Integer>();

        // Load the initial list of numbers
        for (int i = 1; i <= people; i++)
            linkedList.add(i - 1, i);

        // Set index of first element to be removed
        int p = 0;


        // Treating the list as circular, remove every d'th element
        // until only one element remains
        while (linkedList.size() > 1) {
            linkedList.remove(p);
            p = (p + passes - 1) % linkedList.size();
        }
        time = System.nanoTime() - start;
        // Print last number remaining in list
        System.out.println("linklist survivor : " + (linkedList.get(0)) + "        time :" + time);
        linkedList.clear();

    }


    public static void potato_is_passed_Arraylist(int people, int passes) {
        start = System.nanoTime();

        ArrayList<Integer> arrayList = new ArrayList<>();

        // Load the initial list of numbers
        for (int i = 1; i <= people; i++)
            arrayList.add(i - 1, i);

        // Set index of first element to be removed
        int p = 0;


        // Treating the list as circular, remove every d'th element
        // until only one element remains
        while (arrayList.size() > 1) {
            arrayList.remove(p);
            p = (p + passes - 1) % arrayList.size();
        }
        time = System.nanoTime() - start;
        // Print last number remaining in list
        System.out.println("Arraylist survivor: " + (arrayList.get(0) + "        time :" + time));

        arrayList.clear();
    }
}






