package task3;

public class task3 {

    private static final int N=1500;


    public static void main(String[] args) throws Exception {
        Queue1.Queue<Number> queue1 = new Queue1.Queue<>();
        Q2.Queue2 queue2 = new Q2.Queue2();
        Stack1 stack1 = new Stack1();

//Long time =System.nanoTime();
        for (int i = 0; i < N; i++) {

            queue1.enqueue(i);
            queue2.push(i);
            stack1.push(i);
            Stack2.push(i);

        }
//        Long endgame =System.nanoTime()-time;
//        System.out.println(endgame);

        for (int i = 0; i < N; i++) {
//            System.out.println("Queue1 size:" +queue1.s1.size());
//            System.out.println("Queue2 size:" +queue2.s2.size());
//            System.out.println("stack1 size:" +stack1.size());
//            System.out.println("stack2 size:" +stack2.size());


            System.out.println(queue1.dequeue());
            System.out.println(Q2.Queue2.pop());
//
            System.out.println(Stack2.top());
            Stack2.pop();
            System.out.println(stack1.pop());

        }


    }
}