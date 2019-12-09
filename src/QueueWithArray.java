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
            //初始化的时候把队首和队尾都置为-1，代表空队列
            front = -1;
            rear = -1;
            this.size = size;
        }
    }

    public boolean isEmpty(){
        return front == -1;
    }

    public boolean isFull(){
        //因为数组实现队列在有元素出队时会出现“假满”现象，所以循环使用数组，
        //把出队的空间给后面入队的元素使用，所以队尾和队头对size取模，队尾在
        //后面与对头相邻队列就是满的（循环数组0下标位在最大下标位后面）
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
        //如果队列为空，有元素入队，队首指向0
        if(front == -1){
            front = 0;
        }
        //每入队一个元素队尾指向+1,取余是循环数组
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
        Object delete = array[front];
        //如果取元素时队首等于队尾，说明是队列的最后一个元素，取完置空
        if(front==rear){
            front=-1;
            rear=-1;
        }else{
            //如果队列不为空，每取一个元素，对头向前进一位，取余是利用循环数组
            front=(front+1)%size;
        }
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
