package example4;

public class Example4 {
    public static void main(String[] args) {
        Comparable<A> comparable = (that) -> 0;
    }


    public void sort(int[] items) {
        for (int i = 0; i < items.length; i++) {
            for (int j = 0; j < items.length - i - 1; j++) {
                if (items[j] > items[j + 1]) {
                    swap(items, j);
                }
            }
        }
    }

    public <V extends Comparable<V>> void objectSort(V[] items) {
        for (int i = 0; i < items.length; i++) {
            for (int j = 0; j < items.length - i - 1; j++) {
                if (items[j].compareTo(items[j + 1]) > 0) {
                    swap(items, j);
                }
            }
        }
    }

    private void swap(int[] items, int j) {
        int temp = items[j];
        items[j] = items[j + 1];
        items[j + 1] = temp;
    }

    private <V> void swap(V[] items, int j) {
        V temp = items[j];
        items[j] = items[j + 1];
        items[j + 1] = temp;
    }
}


class A implements Comparable<A> {
    private final int value;

    A(int value) {
        this.value = value;
    }

    @Override
    public int compareTo(A that) {
        return this.value - that.value;
    }
}
