import java.util.Random;

public class Ex07{

    public static void main(String[] args){

        Random r = new Random();
        int dimension = 4;
        int[][] matrix = new int[dimension][dimension];
		for(int i = 0; i < dimension; i++){
			for(int j = 0; j < dimension; j++){

				matrix[i][j] = r.nextInt(99);
			}
        }
        
        RotateMatrix rm = new RotateMatrix(matrix);
        rm.rotateMatrix();
        rm.printInputAndResult();

    }

}

class RotateMatrix{
    private int[][] matrix;
    private int[][] rotatedMatrix;
    private int[] diffX;
    private int[] diffY;
    private int lenX;
    private int lenY;

    public RotateMatrix(int[][] matrix){

        this.matrix = matrix;

    }

    public void rotateMatrix(){

        this.lenX = matrix.length;
        this.lenY = matrix[0].length;

        this.rotatedMatrix = new int[lenX][lenY];

        this.diffX = new int[lenX];
        this.diffY = new int[lenY];

        int startX = 0;
        int startY = lenY - 1;
    
        int diffIdx = 0;
        
        for(int i = 0; i < lenX; i++){

            diffX[i] = startX;
            startX += 1;

        }
        for(int j = 0; j < lenY; j++){

            diffY[j] = startY;
            startY -= 1;
            
        }
        for(int i = 0; i < lenX; i++){

            for(int j = 0; j < lenY; j++){

                rotatedMatrix[i][j] = matrix[i + diffX[diffIdx]][j + diffY[diffIdx]];
                diffIdx += 1;

            }

            diffIdx = 0;
            this.nextDiff();

        }

    }

    private void nextDiff(){

        for(int i = 0; i < lenX; i++){

            diffX[i] -= 1;

        }

        for(int i = 0; i < lenY; i++){

            diffY[i] -= 1;

        }

    }

    public void printInputAndResult(){

        System.out.println("<< INPUT MATRIX >>");
        for(int i = 0; i < lenX; i++){
			for(int j = 0; j < lenY; j++){

				System.out.print(matrix[i][j] + ", ");
				
			}
			System.out.println();

        }
        System.out.println();
        System.out.println("<< RESULT MATRIX >>");
        for(int i = 0; i < lenX; i++){
			for(int j = 0; j < lenY; j++){

				System.out.print(this.rotatedMatrix[i][j] + ", ");
				
			}
			System.out.println();

        }


    }

}