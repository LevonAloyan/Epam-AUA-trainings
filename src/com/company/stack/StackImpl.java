public class StackImpl implements Stack{
    int[] stack = new int[10];
    int index = 0;
    @Override
    public int pop() {
        if (index < 0)
        {
            System.out.println("Stack underflow");
            return 0;
        }
        int re = stack[index];
        stack[index] = 0;
        index--;
        return re;
    }

    @Override
    public void push(int element) {
        if (index >= stack.length)
        {
            System.out.println("Stack overflow");
        }
        else {
            stack[index] = element;
            index++;
        }
    }
}