package 剑指offer;

public class q11 {
    public static int minArray2(int[] numbers){
        int low = 0;
        int high = numbers.length-1;
        while(low<high){
            int pivot = low + (high - low) / 2;
            if (numbers[pivot]< numbers[high]){
                high = pivot;
            }else if(numbers[pivot]>numbers[high]){
                low = pivot;
            }else {
                high--;
            }
        }
        return numbers[low];
    }

    public static int minArray(int[] numbers) {
        int low = 0;
        int high = numbers.length - 1;
        while(low < high){
            int pivot = low + (high - low)/2;
            if(numbers[pivot] < numbers[high]){
                high = pivot;
            }else if(numbers[pivot] > numbers[high]){
                low = pivot;
            }else{
                high--;
            }
        }
        return numbers[low];
    }
}
