public class MyLinkedList<T>{

    private MyLinkedList<T> next;
    private boolean isHead;
    private boolean isTail;

    public MyLinkedList(){}

    public MyLinkedList(MyLinkedList<T> next){

        if(next == null){
            this.isHead = false;
            this.isTail = true;
        }else{


            
        }

    }


}