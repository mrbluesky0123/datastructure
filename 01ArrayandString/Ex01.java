public class Ex01{

    public static void main(String[] args){

        DuplicateFinder d = new DuplicateFinder("awwefg");
        System.out.println(d.duplicateCharFinder());

    }

}

class DuplicateFinder{

    private String target;

    public DuplicateFinder(String target){

        this.target = target;

    }

    public boolean duplicateCharFinder(){

        boolean[] boolArray = new boolean[9999];
        for(int i = 0; i < this.target.length(); i++){

            if(boolArray[this.target.charAt(i)])
                return false;
            boolArray[this.target.charAt(i)] = true;

        }
        return true;

    }


}