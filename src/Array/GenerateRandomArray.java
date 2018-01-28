package Array;

/**
 * Created by zhouyang
 * Date 2017/12/7.
 */
public class GenerateRandomArray {

    //得到数组内容从0到log-1的随机数组
    public int[] getrandomarray(int log){
        int[] result = new int[log];
        for (int i = 0; i < log; i++) {
            result[i] = i;
        }
        for (int i = 0; i < log; i++) {
            int random = (int) (log * Math.random());
            int temp = result[i];
            result[i] = result[random];
            result[random] = temp;
        }
        return result;
    }
}
