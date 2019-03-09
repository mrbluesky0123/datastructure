import java.util.ArrayList;
import java.util.List;
public class Ex03{

    public static void main(String[] args){

        EmptyChanger e = new EmptyChanger();
        System.out.println(e.emptyChanger1("Hello darkness, my old friend", 29));
        System.out.println(e.emptyChanger2("Hello darkness, my old friend", 29));

    }

}


class EmptyChanger{

    public EmptyChanger(){}

    /* O(n) */
    public String emptyChanger1(String source, int length){

        char[] sourceArray = source.toCharArray();
        char[] resultArray = new char[9999];
        String toInsert = "%20";
        int next = 0;
        for(int i = 0; i < length; i++){
            if(sourceArray[i] == ' '){

                for(int j = 0; j < 3; j++){

                    resultArray[next++] = toInsert.charAt(j);

                }

            }else{

                resultArray[next++] = sourceArray[i];

            }

        }

        return String.copyValueOf(resultArray);

    }

    /* O(n) */
    public String emptyChanger2(String source, int length){

        String result = "";
        String [] splittedSource = source.split(" ");
        for(int i = 0; i < splittedSource.length; i++){

            if(i == splittedSource.length - 1){
                result += splittedSource[i];
            }else
                result += splittedSource[i] + "%20";

        }
        // resultArray.remove(resultArray.size()-1);
        return result;
    }

}