package playtika;

// implement an integer stack that will have the normal stack methods plus max() method that will allow you to find the max in the stack in O(1) time complexity


import java.util.ArrayList;
import java.util.List;

class MyIntStack  {

    List<Integer> intStack = new ArrayList<>();
    List<Integer> maxStack = new ArrayList<>();

    public int push(int item) {

        if(maxStack.size() == 0) {
            maxStack.add(item);
        } else if(maxStack.get(maxStack.size() - 1) < item) {
            maxStack.add(item);
        }

        intStack.add(item);
        return 0;
    }

    public int pop() {

        int lastIndex = intStack.size() - 1;

        int last = intStack.get(lastIndex);
        intStack.remove(lastIndex);

        return last;

    }

    public int peek() {
        return intStack.get(intStack.size() - 1);
    }

    public int max() {
        return maxStack.get(maxStack.size() - 1);
    }
}


public class Main {
    public static void main(String[] args) {
        MyIntStack stack = new MyIntStack();
        stack.push(1);
        stack.push(8);
        stack.push(3);
        stack.push(5);
        System.out.println(stack.max());
    }
}
