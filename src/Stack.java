public class Stack {
    private int[] elementData;
    private int top;

    public Stack(int initialCapacity){
        elementData = new int[initialCapacity];
        top = -1;
    }

    public void push(int data){
        elementData[++top] = data;
    }
}
