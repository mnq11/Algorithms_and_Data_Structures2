package task1;

import java.util.*;

public class task1 {


    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\033[0;32m";
    public static final String ANSI_WHITE = "\u001B[37m";


    public static void main(String[] args) {
        LinkedList<String> q = new LinkedList<>();
        //     valid
        q.offer("int a; ");
        q.offer("int a; /* random comment */ ");
        q.offer("int a; /* for storing width * height */  ");
        q.offer("int a = b*c; ");
        q.offer("int a = b / c;  ");
        q.offer("int a = 55; // This is a comment /  ");
        q.offer("public void doIt(int x) {System.out.println(x*100);}  ");
        q.offer("int []arr = new int[10];  ");
        //  not valid
        q.offer("/* */ {}  ");
        q.offer("int [arr = new int[10];");
        q.offer("int b = 5; /* this is a comment / ");
        q.offer("{a=b; ");
        //      valid
        q.offer("if(a == b) {a++;} ");
        q.offer("if(a < (b*c)) {t = 5;}  ");
        q.offer("int []b = new int[5];  ");
        q.offer("[](){}  ");
        q.offer("int a = 5; // init a to 5  ");
        //  not valid
        q.offer("for(int i=0;i<10;i++] {a+= b;}  ");
        q.offer("{abc) ");


//        while (!q.isEmpty()) {
//            if (isBalanced(q.poll())) {
//                System.out.println(ANSI_GREEN + "Ok\n" + ANSI_WHITE);
//            } else {
//                System.out.println(ANSI_RED + "error\n" + ANSI_WHITE);
//            }
//        }

        while (!q.isEmpty()) {
            if (isBalanced(q.poll())) {
                System.out.println(ANSI_GREEN + "Ok\n" + ANSI_WHITE);
            } else {
                System.out.println(ANSI_RED + "error\n" + ANSI_WHITE);
            }
        }

//        Scanner sc = new Scanner(System.in);
//        System.out.println("enter a string with '(', '{' or '['");
//        String s = sc.nextLine();
//        isBalanced(s);
//        System.out.println();
//        main(args);
    }

    private static boolean isBalanced(String s) {
        ArrayList<String> arrayList = new ArrayList<>();


        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) == '(') {
                arrayList.add("(");

            }
            if (s.charAt(i) == '[') {
                arrayList.add("[");
            }
            if (s.contains("/*")) {
                arrayList.add("/*");
            }


            if (s.charAt(i) == '{') {
                arrayList.add("{");

            }


            if (s.charAt(i) == ']') {
                arrayList.remove("[");
            }
            if (s.contains("*/")) {
                arrayList.remove("/*");

            }

            if (s.charAt(i) == '}') {
                arrayList.remove("{");

            }
            if (s.charAt(i) == ')') {
                arrayList.remove("(");

            }

        }
        if (arrayList.isEmpty()) {
            System.out.print(s);
            return true;
        }
        System.out.print(s);
        System.out.print("                                you need to fix the block  " + ANSI_RED + arrayList.get(0) + ANSI_WHITE);
        System.out.println();
        return false;
    }



}