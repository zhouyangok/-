package list;

/**
 * Created by zhouyang
 * Date 2017/12/6.
 *
 * 数组实现的队列，能存储任意形式的数据
 */
public class ArrayQueue<T> {

    private int[] mArray;
    private int mCount;

    public ArrayQueue(int sz){
        mArray = new int[sz];
        mCount = 0;
    }

    //将元素添加到队列的末尾
    public void add(int val){
        mArray[mCount++] = val;
    }

    //返回队列开头元素
    public int front(){
        return mArray[0];
    }
    //返回队列末尾元素
    public int last(){
        return mArray[mCount-1];
    }

    //返回栈顶元素值，并删除栈顶
    public int pop(){
        int ret = mArray[0];
        mCount--;
        for(int i =1;i<=mCount;i++){
            mArray[i-1]=mArray[i];
        }
        return ret;
    }

    //返回栈的大小
    public int size(){
        return mCount;
    }
    //判断栈是否为空
    public boolean isEmpty(){
        return 0 == size();
    }

    public static void main(String[] args) {
        int tmp = 0;
        ArrayQueue astack = new ArrayQueue(12);
        astack.add(1);
        astack.add(3);
        astack.add(5);
        astack.add(7);

        tmp = astack.pop();
        System.out.println(tmp);

        tmp = astack.front();
        System.out.println(tmp);

        astack.add(12);

        System.out.println(astack.isEmpty());
        System.out.println(astack.size());
        while (!astack.isEmpty()){
            System.out.print(astack.pop()+",");
        }
    }


}
