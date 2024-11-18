package ArrayADT;

public class ArrayADT {

    private int[] array; // Array to store data
    private int index;   // Current number of elements
    private int size;    // Capacity of the array

    public ArrayADT(int capacity) {
        this.size = capacity;
        this.array = new int[this.size];
        this.index = 0;
    }

    public void insert(int value) {
        if (index == this.size) {
            System.out.println("Array is full");
            return;
        }
        array[index] = value;
        index++;
    }

    public void delete(int deleteIndex) {
        if (deleteIndex < 0 || deleteIndex >= index) {
            System.out.println("Invalid index");
            return;
        }
        for (int i = deleteIndex; i < index - 1; i++) {
            array[i] = array[i + 1];
        }
        index--;
    }

    public int search(int value) {
        for (int i = 0; i < index; i++) {
            if (array[i] == value) {
                return i;
            }
        }
        return -1;
    }

    public int get(int getIndex) {
        if (getIndex < 0 || getIndex >= index) {
            System.out.println("Invalid index");
            return -1;
        }
        return array[getIndex];
    }

    public void traverse() {
        for (int i = 0; i < index; i++) {
            System.out.print(array[i] + "\t");
        }
        System.out.println();
    }

    public void update(int updateIndex, int value) {
        if (updateIndex < 0 || updateIndex >= index) {
            System.out.println("Invalid index");
            return;
        }
        array[updateIndex] = value;
    }

    public int getSize() {
        return this.index;
    }
}
