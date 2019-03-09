public class Ex05{

    public static void main(String[] args){

        EditDistance e = new EditDistance("palexx", "ple");
        System.out.println(e.editDistance());

    }

}

/* edit distance algorithm */
class EditDistance{

    private String str1;
    private String str2;

    public EditDistance(String str1, String str2){

        this.str1 = str1;
        this.str2 = str2;

    }

    public int min(int a, int b, int c){
        int min = 9999999;
        if( a == b && b == c)
            return a;
        if(a < b){
            min = a;
            if(min < c){
                return min;
            }else{
                min = c;
                return min;
            }
        }else{
            min = b;
            if(min < c){
                return min;
            }else{
                min = c;
                return min;
            }
        }

    }

    public boolean editDistance(){

        char[] str1Array = (" " + this.str1).toCharArray();
        char[] str2Array = (" " + this.str2).toCharArray();

        int[][] distance = new int[str1Array.length][str2Array.length];

        for(int i = 0; i < str1Array.length; i++){
            distance[i][0] = i;
        }
        for(int j = 0; j < str2Array.length; j++){
            distance[0][j] = j;
        }

        for(int i = 1; i < str1Array.length; i++){
            for(int j = 1; j < str2Array.length; j++){

                if(str1Array[i] == str2Array[j])
                    distance[i][j] = distance[i - 1][j - 1];
                else
                    distance[i][j] = 1 + this.min(distance[i - 1][j], distance[i][j - 1], distance[i - 1][j - 1]);
                // System.out.print(distance[i][j] + " ");

            }
            // System.out.println();
        }

        return (distance[str1Array.length - 1][str2Array.length - 1] <= 1);

    }
}