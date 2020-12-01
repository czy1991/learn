package com.czy.lib;

/**
 * @author Mark老师   享学课堂 https://enjoy.ke.qq.com
 * 往期课程咨询芊芊老师  QQ：2130753077 VIP课程咨询 依娜老师  QQ：2133576719
 * 类说明：冒泡算法（升序）
 */
public class BubbleSort {
    public static int[] sort(int[] array) {
        if (array.length == 0)
            return array;
        /*循环数组长度的次数*/
        for (int i = 0; i < array.length; i++){

            /*从第0个元素开始，依次和后面的元素进行比较
             * j < array.length - 1 - i表示第[array.length - 1 - i]
             * 个元素已经冒泡到了合适的位置，无需进行比较，可以减少比较次数*/
            for (int j = 0; j < array.length - 1 - i; j++){
                /*如果第j个元素比后面的第j+1元素大，交换两者的位置*/
                if (array[j + 1] < array[j]) {
                    int temp = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = temp;
                }
                PrintArray.print(array);
            }
            System.out.println("---------------");
            //PrintArray.print(array);
        }

        return array;
    }
    public static int binary(int[] array,int a) {
        int start =0;
        int end = array.length-1;
        while (start<=end) {
            int mid = start+end/2;
            if (a > array[mid]) {
                start = mid + 1;
            } else if (a < array[mid]) {
                end = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
    public static int[] choice(int[] array) {
        if (array.length == 0)
            return array;

        for (int i = 0; i <array.length ; i++) {
            int minIndex = i;
            for (int j = i; j <array.length ; j++) {
                if (array[j]<array[minIndex]){
                   minIndex =j;
                }
            }
            int temp = array[minIndex];
            array[minIndex] =array[i];
            array[i] =temp;
        }
        PrintArray.print(array);
        return array;
    }
    public static int[] sort2(int[] array) {
        if (array.length == 0)
            return array;

        for (int i = 0; i <array.length ; i++) {
            for (int j = 0; j <array.length-i-1 ; j++) {
                if (array[j]>array[j+1]){
                    int temp =array[j+1];
                    array[j+1]=array[j];
                    array[j]=temp;

                }
            }
        }
        return array;
    }
    public static void main(String[] args) {
        PrintArray.print(PrintArray.SRC);
        System.out.println("============================================");
        int[] dest = BubbleSort.choice (PrintArray.SRC);
        PrintArray.print(dest);
        System.out.println("==================="+BubbleSort.binary (dest,77));
    }
}
