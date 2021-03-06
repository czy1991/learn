package com.czy.lib;

/**
 * @author Mark老师   享学课堂 https://enjoy.ke.qq.com
 * 往期课程咨询芊芊老师  QQ：2130753077 VIP课程咨询 依娜老师  QQ：2133576719
 * 类说明：简单选择排序（升序）
 */
public class ChoiceSort {
    public static int[] sort(int[] array) {
        if (array.length == 0)
            return array;
        for (int i = 0; i < array.length; i++) {
            int minIndex=i;/*最小数的下标，每个循环开始总是假设第一个数最小*/
            for (int j = i; j < array.length; j++) {
                if (array[j] < array[minIndex]) /*找到最小的数*/
                    minIndex = j; /*将最小数的索引保存*/
            }
            System.out.println("最小数为："+array[minIndex]);
            /*交换最小数和i当前所指的元素*/
            int temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
            PrintArray.print(array);
            System.out.println("---------------");
        }
        return array;
    }

    public static void main(String[] args) {
        PrintArray.print(PrintArray.SRC);
        System.out.println("============================================");
        int[] dest = ChoiceSort.sort(PrintArray.SRC);
        PrintArray.print(dest);
    }
}
