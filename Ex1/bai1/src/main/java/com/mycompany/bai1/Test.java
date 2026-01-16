package com.mycompany.bai1;

class Test<T> {
    private T value;

    public void set(T t) {
        this.value = t;
    }

    public T get() {
        return value;
    }

    public static void main(String[] args) {
        Test<Integer> t1 = new Test<>();
        t1.set(100);
        System.out.println("số: " + t1.get());

        Test<String> t2 = new Test<>();
        t2.set("Hello");
        System.out.println("Chữ: " + t2.get());
    }
}
