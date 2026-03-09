class GenericExample {
public static <T> void printArray(T[] arr) {
        for (T element : arr) {
            System.out.println(element);
        }
    }
public static void main(String[] args) {
        Integer[] numbers = {10, 20, 30, 40};
        String[] words = {"Java", "Python", "C++"};
        System.out.println("Integer Array:");
        printArray(numbers);
        System.out.println("String Array:");
        printArray(words);
    }
}