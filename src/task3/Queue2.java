package task3;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

class Q2 {
static class Queue2 {
    static Queue<Integer> q1 = new PriorityQueue<>();
    Queue<Integer> q2 = new LinkedList<>();

    public static int pop() throws Exception {

        if (q1.isEmpty()) {
                throw new Exception("underflow");
        } else {
            int pop = q1.remove();
            return pop;
        }
}
    public void push(int data) throws Exception {
        if(data<0){
            throw new Exception("overflow");}

            if (q1.peek() == null) {
            q1.add(data);
        } else {
            for (int i = q1.size(); i > 0; i--) {
                q2.add(q1.remove());
            }
            q1.add(data);
            for (int j = q2.size(); j > 0; j--) {
                q1.add(q2.remove());
            }

        }
    }
}}