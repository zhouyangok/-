package imooc.util;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by zhouyang
 * Date 2017/12/12.
 */
public class GenerateArray {

    public int[] generate(int arrayLength) {
        int a[] = new int[arrayLength];
        Random random = new Random();
        for(int i = 0;i<arrayLength;i++){
            a[i] = random.nextInt(arrayLength);
        }
        return a;

//        System.out.println(random.nextInt(arrayLength));//产生一个1~9的随机数
//
//
//        System.out.println("------------------------------------");
//
//
//        Random random1 = new Random();
//
//        for (int i = 0; i < 50; i++) {
//            System.out.println(random1.nextInt(41) + 10);//产生一个10~50的随机数（方法1）
//        }
//
//        System.out.println("------------------------------------");
//
//        for (int j = 0; j < 50; j++) {
//
//            double result = Math.random();
//            result *= 41;
//            int result1 = (int) result;
//            result1 += 10;
//
//            System.out.println(result1);
//        }
    }

    public static void main(String[] args) {
        List list = new ArrayList();
        Integer a = 1;
        list.add(a);
        Integer b = a;
        a = 3;
        System.out.println(a);
        System.out.println(b);

    }
}
