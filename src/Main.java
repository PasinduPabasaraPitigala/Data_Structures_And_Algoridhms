import jdk.incubator.foreign.CLinker;

public class Main {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();

        ll.insertAtEnding(10);
        ll.insertAtEnding(20);
        ll.insertAtEnding(30);

        ll.insertAtEnding(40);

        ll.traverse();

        ll.insertAtPosition(50,2);

        ll.traverse();
    }
}
//        Queue queue = new Queue(5);
//        queue.enQueue(10);
//        queue.enQueue(20);
//        queue.enQueue(30);
//
//        queue.deQueue();
//
//        System.out.println("Size:"+queue.size());
//
//        System.out.println("Peak: "+queue.peek());
//
//        queue.printQueue();
//
//        queue.deQueue();
//
//        queue.printQueue();
//
//    }
//}
































//        Stack stack = new Stack(10);
//
//        stack.push(10);
//        stack.push(20);
//        stack.push(30);
//
//        int peek = stack.peek();
//        System.out.println("Peek:"+peek);
//
//        stack.push(40);
//        System.out.println("Peek"+stack.peek());
//
//        stack.push(50);
//        System.out.println("Peek"+stack.peek());
//
//        System.out.println("Pop"+stack.pop());//50
//        System.out.println("Pop"+stack.pop());//40
//
//        stack.printStack();//[10 20 30]
//
//        stack.push(400);
//
//        stack.printStack();//[10 20 30 400]
//
//        stack.push(500);
//
//        stack.printStack();//[10 20 30 400 500]
//
//        stack.push(600);
//    }

