import java.util.EmptyStackException;

public class StackWithLinked {
    //栈顶元素
    private Node topElement;
    //栈内元素个数
    private int elementCount;
    //栈的大小
    private int size;

    public StackWithLinked(int size) {
        if(size < 0){
            throw new IllegalArgumentException("stack size must be greater or equal to 0");
        } else {
            topElement = null;
            elementCount = 0;
            this.size = size;
        }
    }

    public boolean isEmpty() {
        return elementCount == 0;
    }

    public boolean isFull() {
        return elementCount == size;
    }

    /**
     * 入栈
     * @param date 插入的元素
     */
    public void push(Object date) {
        if (this.isFull()) {
            throw new IndexOutOfBoundsException("stack is full");
        }
        //将原topElement作为参数传入，然后以新new出来的Node指向原topElement
        topElement = new Node(date, topElement);
        elementCount++;
    }

    /**
     * 出栈
     * @return 弹出的元素
     */
    public Object pop() {
        if (this.isEmpty()) {
            throw new EmptyStackException();
        }
        Object object = topElement.getElement();
        topElement = topElement.next;
        elementCount--;
        return object;
    }

    /**
     * 返回栈顶元素
     * @return 栈顶元素
     */
    public Object peak(){
        if (this.isEmpty()) {
            throw new EmptyStackException();
        }
        return topElement.getElement();
    }
}
