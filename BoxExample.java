class Box<T> {
T value;
    Box(T value) {
        this.value = value;
    }
    void display() {
        System.out.println(value);
    }
}

public class BoxExample {
    public static void main(String[] args) {
        Box<Integer> intBox = new Box<>(100);
        Box<String> strBox = new Box<>("Java Programming");
        System.out.println("Integer value:");
        intBox.display();
        System.out.println("String value:");
        strBox.display();
    }
}