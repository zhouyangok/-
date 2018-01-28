package list;

import java.util.Stack;

/**
 * Created by zhouyang
 * Date 2017/12/6.
 *
 * java集合实现栈
 */
public class StackTest {

    public static void main(String[] args) {
        int tmp = 0;
        Stack<Integer> astack = new Stack<>();
        astack.push(123);
        astack.push(223);
        astack.push(323);
        astack.push(423);

        tmp = astack.peek();
        System.out.println(tmp);

        astack.pop();
        System.out.println(astack.size());
        System.out.println(astack.peek());

        while (!astack.isEmpty()){
            System.out.println(astack.pop());
        }
    }
}
