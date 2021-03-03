package task3;

import java.util.Stack;

class Queue1 {
    public static class Queue<N> {
        Stack<Integer> s1 = new Stack<>();

        private static int size() {
            return 0;
        }

        void enqueue(int i) throws Exception {
            if(i ==s1.size()){
              throw new Exception("overflow");           }
            s1.push(i);
        }


        Integer dequeue() throws Exception {
            if (s1.isEmpty()) {
                throw new Exception("underflow");
            }
            int x = s1.get(0);
            s1.remove(0);
            return x;
        }
    }
}