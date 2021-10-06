import java.util.ArrayList;
import java.util.List;

// https://leetcode.com/problems/min-stack/
public class _0155_MinStack {

    private int currentIndex = -1;
    private final List<Integer> backingDS = new ArrayList<>();

    public static void main(String[] args) {
        final var subject = new _0155_MinStack();
        subject.push(1);
        subject.push(-1);
        System.out.println(subject.getMin());

    }

    public void push(int val) {
        currentIndex++;
        backingDS.add(currentIndex, val);
    }

    public void pop() {
        currentIndex--;
    }

    public int top() {
        return backingDS.get(currentIndex);
    }

    public int getMin() {
        var result = Integer.MAX_VALUE;

        for (int i = 0; i <= currentIndex; i++) {
            if (result > backingDS.get(i)) {
                result = backingDS.get(i);
            }
        }

        return result;
    }
}
