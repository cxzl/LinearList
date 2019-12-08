public class QueueWithArray {
    private Object[] array;
    //队首
    private int front;
    //队尾
    private int rear;
    private int size;

    public QueueWithArray(int size) {
        if(size < 0){
            throw new IllegalArgumentException("queue size must be greater or equal to 0");
        } else {
            array = new Object[size];
            front = -1;
            rear = -1;
            this.size = size;
        }
    }

    public boolean isEmpty(){
        return front == -1;
    }

    public boolean isFull(){
        //因为数组下标从0开始rear + 1就是数组的size
        return (rear + 1) % size == front;
    }

    /**
     * 入队
     * @param data 入队元素
     */
    public void enQueue(Object data) {
        if(isFull()){
            throw new IndexOutOfBoundsException("queue is full");
        }
        if(front == -1){
            front = 0;
        }
        rear=(rear+1)%size;
        array[rear] = data;
    }

    /**
     * 出队
     * @return 出队元素
     */
    public Object deQueue() {
        if(isEmpty()){
            throw new IndexOutOfBoundsException("queue is empty");
        }
        if(front==rear){
            front=-1;
            rear=-1;
        }
        Object delete = array[front];
        front=(front+1)%size;
        return delete;
    }

    /**
     * 获取队首元素
     * @return 队首元素
     */
    public Object getFront(){
        if(isEmpty()){
            throw new IndexOutOfBoundsException("queue is empty");
        }
        return array[front];
    }
}
