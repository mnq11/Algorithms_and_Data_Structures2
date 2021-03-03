package task3;

import java.util.LinkedList;
import java.util.Queue;

class Stack2 {


    // Two inbuilt queues
    static Queue<Integer> q1 = new LinkedList<>();
    static Queue<Integer> q2 = new LinkedList<>();

    // To maintain current number of
    // elements
    static int curr_size;

    Stack2() {
        curr_size = 0;
    }

    static void push(int x) throws Exception {
        if(x ==q1.size()){

            throw new Exception("overflow");
        }
        curr_size++;

        // Push x first in empty q2
        q2.add(x);

        // Push all the remaining
        // elements in q1 to q2.
        while (!q1.isEmpty()) {
            q2.add(q1.peek());
            q1.remove();
        }

        // swap the names of two queues
        Queue<Integer> q = q1;
        q1 = q2;
        q2 = q;
    }

    static void pop() {
        if (q1.isEmpty()){
            System.out.println("No elements");
        }
            // if no elements are there in q1
            if (q1.isEmpty())
                return;
        q1.remove();
        curr_size--;
    }

    static int top() {
        if (q1.isEmpty())
            return -1;
        return q1.peek();
    }


}
