package ArrayADT;

public class Arrayoperstion {

    public static void main(String[] args) {
        ArrayADT array=new ArrayADT(10);
        array.insert(10);
        array.insert(20);
        array.insert(30);
        System.out.println("array size" + array.getSize());
        array.traverse();
    }
}
