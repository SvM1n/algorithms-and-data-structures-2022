package practice.task4;

public abstract class Tester {
    public static void main(String[] args) {
        PC a = new PC("a1", "b1", 16, 1000);
        PC a1 = new PC("a11", "b1", 16, 10000);
        PC[] arr = new PC[1];
        arr[0] = a;
        Shop shop = new Shop(arr);
        shop.addPC(a);
        shop.searchforpc(a1);
        PC a2 = new PC("a1", "b1", 16, 10000);
        shop.searchforpc(a2);
    }
}
