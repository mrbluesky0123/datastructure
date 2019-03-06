import java.util.LinkedList;

public class MyLinkedList<T>{

    private MyLinkedList<T> next;
    private T item;
    private boolean isHead;
    private boolean isTail;

    public MyLinkedList(){}

    public MyLinkedList(MyLinkedList<T> next){

        if(next == null){
            this.isHead = false;
            this.isTail = true;
        }else{
            this.isHead = true;
            this.isTail = false;            
            this.next = next;
        }

    }

    /* Link item as the first item. */
    public void linkFirst(MyLinkedList<T> item){

        if(next == null){
            this.isHead = false;
            this.isTail = true;
        }else{
            this.isHead = true;
            this.isTail = false;            
            
        }
    }




}