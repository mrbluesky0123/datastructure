import java.util.*;

public class Ex05{

    public static void main(String[] args){

        int a = 788123;
        IntegerLinkedList intList = new IntegerLinkedList();
        List list = intList.integerToLinkedList(a);
        System.out.println(list.toString());
        int b = intList.linkedListToInteger(list);
        System.out.println(b);

    }

}

class IntegerLinkedList{

    public IntegerLinkedList(){}

    public List integerToLinkedList(int operand){

        List<String> list = new LinkedList<>();
        String operandStr = String.valueOf(operand);
        for(int i = operandStr.length(); i > 0; i-- ){

            list.add(String.valueOf(operandStr.charAt(i - 1)));

        }

        return list;

    }

    public int linkedListToInteger(List lst){

        List<String> list = (LinkedList)lst;
        String integer = "";
        int count = 0;
        ListIterator iterator = list.listIterator();
        while(iterator.hasNext()){

            iterator.next();
            count++;
            
        }
        for(int i = 0; i < count; i++){

            integer += iterator.previous();

        }
        System.out.println("integer = " + integer);

        return Integer.valueOf(integer);

    }



    // public List listAddList(List list1, List list2){

    //     String operand1 = "";
    //     String operand2 = "";



    // }

}

