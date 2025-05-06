public class Box<T> {
    private final T object;
    public Box(T object) {
        this.object = object;

    }
    public T getObject() {
     return object;
    }

    public static void main(String[] args) {
        Box<Integer> integgerBox = new Box<>(290);
        Box<Double> doubleBox = new Box<>(51.0);
        Box<String> stringBox = new Box<>("Hello From there");
        System.out.println("Integer Object: " + integgerBox.getObject());
        System.out.println("Double Object: " + doubleBox.getObject());
        System.out.println("String Object: " + stringBox.getObject());

    }
}
