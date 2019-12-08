public class QueueWithLinked {
    //最早添加的节点
    private Node front;
    //最近添加的节点
    private Node rear;
    //队列内元素个数
    private int elementCount;
    private int size;

    public QueueWithLinked(int size) {
        front = null;
        rear = null;
        elementCount = 0;
        this.size = size;
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
        Node oldrear = rear;
        rear = new Node(data);
        if (isEmpty()) {
            //如果是第一个元素，队首就是队尾
            front = rear;
        } else {
            oldrear.next = rear;
        }
        elementCount++;
    }

    public Object deQueue() {
        if (isEmpty()) {
            throw new IndexOutOfBoundsException("queue is empty");
        }
        Object delete = front.getElement();
        if (front.next == null) {
            front = null;
            rear = null;
        } else {
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
