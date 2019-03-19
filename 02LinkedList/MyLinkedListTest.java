public class MyLinkedListTest{

    public static void main(String[] args){

        MyLinkedList<String> l = new MyLinkedList("qqq");
        l.insert("www");
        l.insert("eee");
        l.insert("rrr");

        System.out.println(l.getSize());
        System.out.println(l.toString());

        l.delete("www");

        System.out.println(l.toString());
        System.out.println(l.getSize());

        l.insert("1111");

        System.out.println(l.toString());
        System.out.println(l.getSize());

        l.insert("2222");
        
        System.out.println(l.toString());
        System.out.println(l.getSize());
        
        l.delete("1111");
        
        System.out.println(l.toString());
        System.out.println(l.getSize());
        
        l.delete("eee"); l.delete("rrr"); l.delete("2222"); l.delete("qqq");
        System.out.println(l.toString());
        System.out.println(l.isEmpty());
        System.out.println(l.getSize());

    }

}


class MyLinkedList<T>{

    private int size;
    private Node<T> headNode;

    public MyLinkedList(T content){
        this.headNode = new Node(content, null);
        size++;
    }

    public int getSize() { return this.size; }

    public boolean isEmpty(){

        if(this.size == 0)
            return true;
        else
            return false;

    }

    public void insert(T content){

        if(this.headNode == null){
            this.headNode = new Node(content, null);
            size++;
        }else{
            this.insert(content, this.headNode);
            size++;
        }
        
    }

    /* Internal function to insert */
    private void insert(T content, Node node){

        if(node.hasNext() == true){
            insert(content, node.getNext());
        }else{
            node.setNext(new Node(content, null));
            return;
        }

    }

    
    public boolean isContained(T content){

        if(this.headNode == null)
            return false;
        else
            return isContained(content, this.headNode);

    }

    /* Internal function to isContained */
    private boolean isContained(T content, Node node){

        if(node.getContent().equals(content))
            return true;
        else{
            if(node.hasNext())
                return isContained(content, node.getNext());
        }
        return false;

    }

    public boolean delete(T content){

        if(isContained(content))
            return (this.headNode = delete(content, this.headNode)) != null;
        else
            return false;

    }

    private Node delete(T content, Node node){

        if(node.getContent().equals(content)){
            size--;
            if(node.hasNext())
                return node.getNext();
            else
                return null;
        }else{
            if(node.hasNext())
                node.setNext(delete(content, node.getNext()));
        }
        return node;

    }
    
    public String toString(){

        if(this.headNode == null)
            return "\"  \"";
        return this.toString(this.headNode);


    }

    private String toString(Node node){
        
        String s = node.getContent().toString() + ", ";
        if(node.hasNext())
            return (s += toString(node.getNext()));
        else
            return s;

    }


}

class Node<T>{

    private T content;
    private Node<T> next;
    private boolean hasNext;

    public Node(T content, Node<T> nextNode){

        this.content = content;
        if(nextNode != null){
            this.next = nextNode;
            this.hasNext = true;
        }else{
            this.next = nextNode;
        }

    }

    public void setContent(T content){

        this.content = content;

    }

    public T getContent(){

        return this.content;

    }

    public void setNext(Node<T> next){

        if(next == null){
            this.next = null;
            this.hasNext = false;
        }else{
            this.next = next;
            this.hasNext = true;
        }

    }

    public Node<T> getNext(){

        if(this.next == null)
            return null;
        else
            return this.next;

    }

    public boolean hasNext(){

        if(this.next == null)
            return false;
        else
            return true;

    }

    @Override
    public boolean equals(Object o){

        Node node = (Node)o;
        if(node.getContent().equals(this.content))
            return true;
        else
            return false;

    }

}