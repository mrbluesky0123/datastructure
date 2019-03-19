public class Node{

    public static void main(String[] args){

        Integer a = 344;
        System.out.println(a);
        System.out.println(a.SIZE);
        System.out.println(pow(10, 2));

    }

    public static int pow(int base, int exponent){

        if (exponent == 0)
            return 1;
        return base * pow(base, exponent-1);

    }

}