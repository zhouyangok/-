package list;

import java.lang.reflect.Array;

/**
 * Created by zhouyang
 * Date 2017/12/6.
 * <p>
 * 数组实现的栈，能实现任意类型的数据
 */
public class GeneralArrayStack<T> {

    private static final int DEFAULT_SIZE = 12;
    private T[] mArray;
    private int count;

    public GeneralArrayStack(Class<T> type) {
        this(type, DEFAULT_SIZE);
    }

    public GeneralArrayStack(Class<T> type, int size) {
        // 不能直接使用mArray = new T[DEFAULT_SIZE];
        mArray = (T[]) Array.newInstance(type, size);
        count = 0;
    }

    //将val添加到栈中
    public void push(T val) {
        mArray[count++] = val;
    }

    //返回栈顶元素
    public T peek() {
        return mArray[count - 1];
    }

    //返回栈顶元素值，并删除栈顶元素
    public T pop() {
        T ret = mArray[count - 1];
        count--;
        return ret;
    }

    //返回栈的大小
    public int size() {
        return count;
    }

    //判断栈是否为空
    public boolean isEmpty() {
        return count == 0;
    }
    //打印栈
    public void printArrayStack(){
        if(isEmpty()){
            System.out.println("stack is empty");
        }
        System.out.println("stack.size ="+size());
        int i = size()-1;
        while (i>=0 ){
            System.out.println(mArray[i]);
            i--;
        }
    }

    public static void main(String[] args) {
        String tmp;
        GeneralArrayStack<String> astack = new GeneralArrayStack<String>(String.class);
        astack.push("123");
        astack.push("223");
        astack.push("323");
        astack.push("423");
        System.out.println(astack.size());
        System.out.println(astack.peek());
        astack.pop();
        System.out.println(astack.size());
        astack.printArrayStack();
    }

}
