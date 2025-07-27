package Miscellanous;

public class M5_GenericsImplementation {

    public static void main(String[] args) {

        Box<String> box = new Box<String>("Rajendra");
        System.out.println(box.getValue());
        System.out.println(box.container.getClass().getName());

        Box<Integer> box1 = new Box<Integer>(123);
        box1.container = 14323;
        System.out.println(box1.getValue());
        System.out.println(box1.container.getClass().getName());

        box1.performSmeTask();

    }
}
