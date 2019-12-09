public class Node {
    //节点的元素
    private Object element;
    //节点指向的节点
    public Node next;

    public Node(Object element){
        this(element,null);
    }

    public Node(Object element,Node node){
        this.element = element;
        next = node;
    }

    public Object getElement() {
        return element;
    }
}
