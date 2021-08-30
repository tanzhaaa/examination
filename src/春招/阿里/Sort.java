package 春招.阿里;

//评测题目: 无
//1、给定一个长度为n的无序数组，请采用希尔排序讲数组变成升序排列，并给出时间复杂度和空间复杂度。

import java.util.Arrays;

public class Sort{
    public static void main(String[] args){
        int[] arr = {3,2,5,7,1,4,34,45,6};
        shelSort(arr);
        System.out.print(Arrays.toString(arr));
    }

    static void shelSort(int [] arr){
        //此处一次循环是一趟排序，step是步长，逐渐变小
        for(int step = arr.length / 2; step > 0; step /= 2){

            //此处一次循环是：一个step内的起点进行比较
            for(int i = step; i < arr.length; i++){
                int value = arr[i];
                int j;

                //同一步长下，对某个具体元素进行比较
                for(j = i - step; j>= 0 && arr[j] > value; j-= step){

                    //j为右端点值，j + step为左端点
                    arr[j + step] = arr[j];
                }
                //[j+step]遍历为最左侧的端点，此时step<0
                arr[j + step] = value;
            }
        }
    }
}

