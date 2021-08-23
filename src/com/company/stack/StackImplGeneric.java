import java.util.ArrayList;

public class StackImplGeneric<T>{

    private ArrayList<T> data = new ArrayList<T>();
    int index = 0;
    public T pop() {
        if (index < 0)
        {
            System.out.println("Stack underflow");
            return null;
        }
        T re = data.get(index);
        data.remove(index);
        index--;
        return re;
    }

    public void push(T element) {
        if (index >= data.size())
        {
            System.out.println("Stack overflow");
        }
        else {
            data.add(index,element);
            index++;
        }
    }
}
