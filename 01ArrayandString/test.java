import java.util.Random;
public class test{
	public static void main(String[] args){
		
		int a = 0;
		char[] x = new char[10];
		x[a++] = 'c';
		for(int i = 0; i < 10; i++){

			System.out.print(x[i] + ", ");			

		}

		String s = "qqq qqq";
		System.out.println("'" + s.charAt(3) + "'");

		System.out.println(min(23,22,5));

		Random r = new Random();
		int[][] matrix = new int[3][5];
		for(int i = 0; i < 3; i++){
			for(int j = 0; j < 3; j++){

				matrix[i][j] = r.nextInt(99);
			}
		}
		for(int i = 0; i < 3; i++){
			for(int j = 0; j < 5; j++){

				System.out.print(matrix[i][j] + " ");
				
			}
			System.out.println();

		}

		System.out.println(matrix.length);
		System.out.println(matrix[1].length);

		int[] ax = {1, 2, 3};

		String qw = "asd";
		String b = "111";
		System.out.println( Object.equals(qw, b));
		

	}
	
	public static int min(int a, int b, int c){
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
}
