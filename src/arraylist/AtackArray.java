package arraylist;
public class AtackArray {
    private    Object[] elements;
    private int index;
    //无参构造
    public AtackArray() {
        //默认数组初始化容量为10
        this.elements=new Object[10];
        this.index=-1;
    }
    //压栈
    public void push(Object obj){
        if(index>=this.elements.length - 1){
            System.out.println("栈已经满了，压栈失败");
         return;
        }
        //栈中每加一个一个元素栈帧向上移动一个位置
        index++;
        elements[index]=obj;
        System.out.println("压栈成功，栈帧指向"+index);
    }
    //弹栈,从数组中往外取元素，每取一个元素栈帧向下移动
    public void pop(){
        if (index<0){
            System.out.println("栈已经空了，弹栈失败");
            return ;
        }
        index--;
        System.out.println("弹栈成功，栈帧指向"+index);
    }
    public Object[] getElements() {
        return elements;
    }
    public void setElements(Object[] elements) {
        this.elements = elements;
    }
    public int getIndex() {
        return index;
    }
    public void setIndex(int index) {
        this.index = index;
    }
}
