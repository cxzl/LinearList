public class Node {
    private Object element;
    public Node next;

    public Node(Object element){
        this(element,null);
    }

    /**
     * 创建节点
     * @param element 节点的内容
     * @param node 节点指向的节点
     */
    public Node(Object element,Node node){
        this.element = element;
        next = node;
    }

    public Object getElement() {
        return element;
    }

}
