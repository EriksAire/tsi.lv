package Ex3;

public class OneDimensionalArray {

    public static void main(String[] Args){

        var oneDimensionalArray = new OneDimensionalArray();
        int[]array = oneDimensionalArray.CreateRandomArray(3);

        for (int i = 0; i <array.length; i++) {
                System.out.println(array[i]);
        }

        System.out.println("\nMin Value: "+oneDimensionalArray.GetMinValue(array));
        System.out.println("Average Value: "+oneDimensionalArray.GetArrayAverage(array));
        System.out.println("Max Value: "+oneDimensionalArray.GetMaxValue(array));

    }

    public int[] CreateRandomArray(int size){
        int MaxValueRange=100;
        int [] array = new int[size];

        for (int i = 0; i <size; i++) {
                array[i] = (int)(Math.random()* MaxValueRange);
        }

        return array;
    }

    public double GetArrayAverage(int[] array){
        int counter=0;
        int sum=0;
        double result;

        for (int i = 0; i < array.length; i++) {
                sum+=array[i];
                counter++;
        }

        result=sum/counter;
        return result;
    }

    public int GetMaxValue(int[] array) {
        int maxValue = array[0];
        for (int j = 0; j < array.length; j++) {
                if (array[j] > maxValue) {
                    maxValue = array[j];
                }
        }
        return maxValue;
    }

    public int GetMinValue(int[] array) {
        int minValue = array[0];
        for (int j = 0; j < array.length; j++) {
                if (array[j] < minValue ) {
                    minValue = array[j];
                }
        }
        return minValue ;
    }
}
