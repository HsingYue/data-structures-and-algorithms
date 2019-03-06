package ink.hsingyue.stack;

import ink.hsingyue.linked_list.LinkedList;

public class LinkedListStack<E> implements Stack<E> {
    private LinkedList<E> lk;

    public LinkedListStack() {
        lk = new LinkedList<>();
    }


    @Override
    public void push(E e) {
        lk.addFirst(e);
    }

    @Override
    public E pop() {
        return lk.removeFirst();
    }

    @Override
    public E peek() {
        return lk.getFirst();
    }

    @Override
    public int getSize() {
        return lk.getSize();
    }

    @Override
    public boolean isEmpty() {
        return lk.isEmpty();
    }

    @Override
    public String toString(){
        StringBuilder res = new StringBuilder();
        res.append("Stack: top ");
        res.append(lk);
        return res.toString();
    }

    public static void main(String[] args) {

        LinkedListStack<Integer> stack = new LinkedListStack<>();

        for(int i = 0 ; i < 5 ; i ++){
            stack.push(i);
            System.out.println(stack);
        }

        stack.pop();
        System.out.println(stack);
    }
}
