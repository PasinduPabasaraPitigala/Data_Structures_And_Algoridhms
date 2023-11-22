public class Stack {

    private int[] elementData;

    private int top;
    public Stack(int initicalCapacity) {
        elementData = new int[initicalCapacity];
        top = -1;
    }

    public void push(int data) { //add value to the stack
//        if(top == elementData.length-1){
//            System.out.println("Stack is full");
//            return;
//        }
        if (isFull()) {
            System.out.println("Stack is full");
        }
        elementData[++top] = data;  // frist increment and add the value for the element
    }

    public int peek() {   //return the top value
        return elementData[top];
    }

    public int pop() {   // remove the top value and return that value
        return elementData[top--]; // frist return the value and point the top for next element
    }

    public void printstack() {
        System.out.print("[ ");
        for (int i = 0; i <= top; i++) {
            System.out.print(elementData[i] + " , ");
        }
        System.out.print("\b\b]\n");
    }

    public boolean isFull() {
        return top == elementData.length - 1;
    }


    public void grow() {
        int[] temp = elementData;   //length -> 5

        elementData = new int[elementData.length * 2];  //length -> 10
        for (int i = 0; i < temp.length; i++) {
            elementData[i] = temp[i];
        }
    }
}


































//    private int[] elementData;
//    private int top;
//
//    public Stack(int initialCapacity){
//        elementData = new int[initialCapacity];
//        top = -1;
//    }
//
//    public void push(int data){
//        if(top == elementData.length - 1){
//            System.out.println("Stack is full");
//            return;
//        }
//        elementData[++top] = data;
//    }
//
//    public int peek(){
//        return elementData[top];
//    }
//    public int pop(){
//        return elementData[top--];
//    }
//
//    public void printStack(){
//        System.out.println("[");
//        for (int i=0; i <= top; i++){
//        System.out.println(elementData[i]+ ",");
//        }
//        System.out.println("\b\b]");
//    }

