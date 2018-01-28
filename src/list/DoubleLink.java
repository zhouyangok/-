package list;

/**
 * Created by zhouyang
 * Date 2017/12/6.
 *
 * java实现双向链表
 */
public class DoubleLink<T> {

    //表头
    private DNode<T> mhead;
    //节点个数
    private int mcount;

    //双向链表节点对应结构体
    private class DNode<T>{

        public DNode prev;
        public DNode next;
        public T value;

        public DNode(T value,DNode prev, DNode next) {
            this.prev = prev;
            this.next = next;
            this.value = value;
        }
    }

    //构造函数
    public DoubleLink() {
        //创建表头，注意表头没有存储数据
        mhead = new DNode<>(null,null,null);
        mhead.prev = mhead.next =mhead;
        //初始化节点个数
        mcount = 0;
    }
    //返回节点个数
    public int size(){
        return mcount;
    }
    //返回链表是否为空
    public boolean isEmpty(){
        return mcount == 0;
    }

    //获取第index位置的节点
    private DNode<T> getNode(int index){
        if(index<0 || index>=mcount){
            throw new IndexOutOfBoundsException();
        }
        //正向查找
        if(index<=mcount/2){
            DNode<T> node = mhead.next;
            for(int i = 0;i<index;i++){
                node = node.next;
            }
            return node;
        }
        //反向查找
        DNode<T> rnode = mhead.prev;
        int rIndex = mcount - index - 1;
        for(int j = 0;j<rIndex;j++){
            rnode = rnode.prev;
        }
        return rnode;
    }
    //获取第index位置的节点的值
    public T getIndex(int index){
        return getNode(index).value;
    }
    //获取第一个节点的值
    public T getFirst(){
        return getNode(0).value;
    }
    //获取最后一个节点的值
    public T getLast(){
        return getNode(mcount-1).value;
    }

    //将节点插入到第index节点之前
    public void insert(int index,T t){
        if(index == 0){
            DNode<T> node = new DNode<T>(t,mhead,mhead.next);
            mhead.next.prev = node;
            mhead.next = node;
            mcount++;
            return;
        }
        DNode<T> inode = getNode(index);
        DNode<T> tnode = new DNode<T>(t,inode.prev,inode);
        inode.prev.next = tnode;
        inode.prev = tnode;
        mcount++;
        return;
    }

    //将节点插入到第一个节点
    public void insertFirst(T t){
        insert(0,t);
    }

    //将节点追加到链表的末尾
    public void appendLast(T t){
        DNode<T> node = new DNode<>(t,mhead.prev,mhead);
        mhead.prev.next = node;
        mhead.prev = node;
        mcount++;
    }

    //删除index位置的节点
    public void delete(int index){
        DNode node = getNode(index);
        node.prev.next = node.next;
        node.next.prev = node.prev;
        node = null;
        mcount--;
    }
    //删除第一个节点
    public void  deleteFirst(){
        delete(0);
    }

    //删除最后一个节点
    public void deleteLast(){
        delete(mcount-1);
    }
}
