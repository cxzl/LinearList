import java.util.EmptyStackException;

public class StackWithArray {
    //栈顶
    private int top;
    //存储栈内容的数组
    private Object[] array;

    public StackWithArray(int size) throws Exception {
        if(size < 0){
            throw new IllegalArgumentException("stack size must be greater or equal to 0");
        } else {
            //栈顶指向-1，代表空栈
            top = -1;
            array = new Object[size];
        }
    }

    public boolean isEmpty(){
        return (top == -1);
    }

    public boolean isFull(){
        return (top == array.length-1);
    }

    /**
     * 入栈
     * @param date 插入的元素
     */
    public void push(Object date){
        if(isFull()){
            throw new IndexOutOfBoundsException("stack is full");
        }else {
            array[++top] = date;
        }
    }

    /**
     * 出栈
     * @return 弹出的元素
     */
    public Object pop(){
        if(isEmpty()){
            throw new EmptyStackException();
        }else {
            return array[top--];
        }
    }

    /**
     * 返回栈顶元素
     * @return 栈顶元素
     */
    public Object peek(){
        if(isEmpty()){
            throw new EmptyStackException();
        }
        return array[top];
    }
}
