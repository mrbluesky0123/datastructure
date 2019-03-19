public class Ex09{

    public static void main(String[] args){

        RotaedString r = new RotaedString();
        System.out.println(r.isSubstring("kbsqweqssk", "sbs"));
        System.out.println();

        String str1 = "rbottlewate";
        String str2 = "waterbottle";
        System.out.println("Input = " + str2);
        System.out.println("Check target = " + str1);
        System.out.println(r.isRotatedString(str1, str2));

    }

}

class RotaedString{

    public RotaedString(){
    }

    public boolean isSubstring(String str1, String str2){

        int str1Length = str1.length();
        int str2Length = str2.length();
        
        if(str1Length < str2Length){
            return false;
        }

        int startIdx = -1;
        for(int i = 0; i < str1Length; i++){

            if(str2.charAt(0) == str1.charAt(i)){

                startIdx = i;

                // System.out.println("str1Length = " + str1Length);
                // System.out.println("str1.charAt(i) = " + str1.charAt(i));

                for(int j = 0; j < str2Length && startIdx < str1Length; j++){
                    // System.out.println("startIdx = " + startIdx);
                    if(str2.charAt(j) == str1.charAt(startIdx++))
                        continue;
                    else
                        break;
                }

                if(startIdx == i + str2Length)
                    return true;

            }else
                continue;

        }

        return false;

    }

    public boolean isRotatedString(String str1, String str2){

        String copyOfStr1 = str1 + str1;
        // System.out.println("str1 = " + str1);
        // System.out.println("str2 = " + str2);
        // System.out.println("copyOfStr1 = " + copyOfStr1);
        if(isSubstring(copyOfStr1, str2))
            return true;
        else 
            return false;

    }

}