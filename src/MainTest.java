public class MainTest {
    public static void main(String[] args){
//        testQueueWithArray();
//        testQueueWithLinked();
        testStackWithArray();
//        testStackWithLinked();
    }

    private static void testQueueWithArray(){
        QueueWithArray queueWithArray = new QueueWithArray(3);
        queueWithArray.enQueue(1);
        queueWithArray.enQueue(2);
        queueWithArray.enQueue(3);
        System.out.println(queueWithArray.deQueue());
        System.out.println(queueWithArray.deQueue());
        System.out.println(queueWithArray.deQueue());
    }

    private static void testQueueWithLinked(){
        QueueWithLinked queueWithLinked = new QueueWithLinked(3);
        queueWithLinked.enQueue(1);
        queueWithLinked.enQueue(2);
        queueWithLinked.enQueue(3);
        System.out.println(queueWithLinked.deQueue());
        System.out.println(queueWithLinked.deQueue());
        System.out.println(queueWithLinked.deQueue());
    }

    private static void testStackWithArray() {
        StackWithArray stackWithArray = new StackWithArray(3);
        stackWithArray.push(1);
        stackWithArray.push(2);
        stackWithArray.push(3);
        System.out.println(stackWithArray.pop());
        System.out.println(stackWithArray.pop());
        System.out.println(stackWithArray.pop());
    }

    private static void testStackWithLinked(){
        StackWithLinked stackWithLinked = new StackWithLinked(3);
        stackWithLinked.push(1);
        stackWithLinked.push(2);
        stackWithLinked.push(3);
        System.out.println(stackWithLinked.pop());
        System.out.println(stackWithLinked.pop());
        System.out.println(stackWithLinked.pop());
    }
}
