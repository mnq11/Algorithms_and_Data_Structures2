package task3;

import java.util.LinkedList;
import java.util.Queue;


class Stack1 {
    Queue<Integer> q = new LinkedList<>();

    // Push operation
    void push(int x) throws Exception {
        if(x ==q.size()){
            throw new Exception("overflow");
        }
        // get previous size of queue
        int size = q.size();

        // Add current element
        q.add(x);

        for (int i = 0; i < size; i++) {

            int Y = q.remove();
            q.add(Y);
        }
    }

    // Removes the top element
    int pop() {
        if (q.isEmpty()) {
            System.out.println("No elements");
            return -1;
        }
        return q.remove();
    }


}
