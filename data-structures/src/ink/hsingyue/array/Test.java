package ink.hsingyue.array;

public class Test {

    public static void main(String[] args) {
        Array<Integer> arr = new Array<>();
        /*for(int i = 0 ; i < 4 ; i ++)
            arr.addLast(i);
        System.out.println(arr);*/

        arr.addLast(100);
        System.out.println(arr);

        arr.addFirst(-1);
        System.out.println(arr);

        arr.addFirst(-1);
        System.out.println(arr);

        arr.removeLast();
        System.out.println(arr);

        arr.removeLast();
        System.out.println(arr);

        arr.removeLast();
        System.out.println(arr);

//        arr.removeLast();
//        System.out.println(arr);



    }
}
