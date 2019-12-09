public class QueueWithLinked {
    //最早添加的节点
    private Node front;
    //最近添加的节点
    private Node rear;
    //队列内元素个数
    private int elementCount;
    private int size;

    public QueueWithLinked(int size) {
        if(size < 0){
            throw new IllegalArgumentException("queue size must be greater or equal to 0");
        } else {
            front = null;
            rear = null;
            elementCount = 0;
            this.size = size;
        }
    }

    public Boolean isEmpty() {
        return elementCount == 0;
    }

    public boolean isFull(){
        return elementCount == size;
    }

    public void enQueue(Object data) {
        if(isFull()){
            throw new IndexOutOfBoundsException("queue is full");
        }
        //先用一个Node对象保存原队尾
        Node oldrear = rear;
        //队尾new一个新Node，并填入数据
        rear = new Node(data);
        if (isEmpty()) {
            //如果当前添加的是第一个元素，队首就是队尾
            front = rear;
        } else {
            //不是第一个元素原队尾元素指向新队尾元素
            oldrear.next = rear;
        }
        elementCount++;
    }

    public Object deQueue() {
        if (isEmpty()) {
            throw new IndexOutOfBoundsException("queue is empty");
        }
        Object delete = front.getElement();
        //如果队首没下一个元素，则取完该元素队列为空
        if (front.next == null) {
            front = null;
            rear = null;
        } else {
            //否则把下一个元素提升为队首
            front = front.next;
        }
        elementCount--;
        return delete;
    }

    public Object getFront() {
        if(isEmpty()){
            throw new IndexOutOfBoundsException("queue is empty");
        }
        return front.getElement();
    }
}
