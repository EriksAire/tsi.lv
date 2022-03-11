package Ex5;

public class TwoDimensionalArray {
    static int[][] CreateRandomArray(int size){
        int MaxRandomValue=100;
        int[][] arr = new int[size][size];

        for (int i = 0; i < size; i++){
            for (int j = 0; j < size; j++){
                arr[i][j] = (int)(Math.random()*MaxRandomValue);
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        return arr;
    }

    static void AverageColumn(int[][] array){
        float average = 0;
        int count = 0;

        for (int i = 0; i < array.length;i++) {
            for (int j = 0; j < array.length; j++) {
                average += array[j][i];
                count++;
            }
            average = average / count;
            System.out.println("Average value of the column " + i + " is: " + average);
            average = 0;
            count = 0;
        }
    }

    public static void main(String[] args){

        int[][] arrayInt = CreateRandomArray(3);
        AverageColumn(arrayInt);
    }
}
