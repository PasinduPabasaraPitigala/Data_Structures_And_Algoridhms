//public class Queue {
//    private int[] elementData;
//    private int front;
//    private int rear;
//
//    public Queue(int initialCapacity){
//        elementData = new int[initialCapacity];
//        front = -1;
//        rear = -1;
//    }
//
//    public void enQueue(int data){
//        if (front == -1){
//            front = 0;
//        }
//        elementData[++rear] = data;
//    }
//    public int peek(){
//        return elementData[front];
//    }
//
//    public void printQueue(){
//        System.out.print("[ ");
//        if (front==-1){
//            System.out.println(" ]");
//            return;
//        }
//        for (int i= front; i<=rear; i++){
//            System.out.print(elementData[i]+" , ");
//        }
//        System.out.println("\b\b]");
//}
//
//    public int deQueue(){
//        if(isEmpty()){
//            System.out.println("Queue is empty");
//            return -1;
//        }
//        return elementData[front++];
//    }
//}
//
