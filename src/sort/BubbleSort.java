package sort;

import Array.GenerateRandomArray;

/**
 * Created by zhouyang
 * Date 2017/12/7.
 *
 * 冒泡排序(Bubble Sort)，又被称为气泡排序或泡沫排序。
 *它是一种较简单的排序算法。它会遍历若干次要排序的数列，每次遍历时，它都会从前往后依次的比较相邻两个数的大小；
 *如果前者比后者大，则交换它们的位置。这样，一次遍历之后，最大的元素就在数列的末尾！
 *采用相同的方法再次遍历时，第二大的元素就被排列在最大元素之前。重复此操作，直到整个数列都有序为止！
 */
public class BubbleSort {

    /**
     * 冒泡排序
     * <p>
     * 参数说明：
     * a -- 待排序的数组
     * n -- 数组的长度
     */
    public static void bubbleSort1(int a[], int n) {
        int i, j;
        for (i = n - 1; i > 0; i--) {
            for (j = 0; j < i; j++) {
                int tmp;
                if (a[j + 1] < a[j]) {
                    tmp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = tmp;
                }
            }
        }
    }

    /**
     * 冒泡排序(改进版)
     * <p>
     * 参数说明：
     * a -- 待排序的数组
     * n -- 数组的长度
     */
    public static void bubbleSort2(int a[], int n) {
        int i, j;
        boolean flag;//增加标记
        for (i = n - 1; i > 0; i--) {
            flag = false;
            for (j = 0; j < i; j++) {
                int tmp;
                if (a[j + 1] < a[j]) {
                    tmp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = tmp;
                    flag = true;
                }
            }
            if (!flag)//如果标记为false,则说明排序已经完成，后续无需重复排序
                break;
        }

    }
    /*
     * 冒泡排序(改进版)
     *
     * 参数说明：
     *     a -- 待排序的数组
     *     n -- 数组的长度
     */
    public static void bubbleSort3(int[] a, int n) {
        int i,j;
        int flag;                 // 标记

        for (i=n-1; i>0; i--) {

            flag = 0;            // 初始化标记为0
            // 将a[0...i]中最大的数据放在末尾
            for (j=0; j<i; j++) {
                if (a[j] > a[j+1]) {
                    // 交换a[j]和a[j+1]
                    int tmp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = tmp;

                    flag = 1;    // 若发生交换，则设标记为1
                }
            }

            if (flag==0)
                break;            // 若没发生交换，则说明数列已有序。
        }
    }

    public static void main(String[] args) {

        int b[] = new GenerateRandomArray().getrandomarray(100000);
        int c[] = new GenerateRandomArray().getrandomarray(100000);

        System.out.println();
        for (int j = 0; j < b.length; j++) {
            System.out.print(b[j] + " ");
        }
        System.out.println();
        long s1 = System.currentTimeMillis();
        bubbleSort1(b, b.length);//耗时18160
        long s2 = System.currentTimeMillis();
//        long s3 = System.currentTimeMillis();
        bubbleSort3(c, c.length);//耗时1269
        long s4 = System.currentTimeMillis();

        System.out.println(s2 - s1 + ">>>>>");//耗时18160
        System.out.println(s4 - s2);//耗时19456

    }
}
