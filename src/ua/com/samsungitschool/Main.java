package ua.com.samsungitschool;

class Main {
    public static void main(String[] args) {
    }

    public static IListDeleteByFilter<Integer> createListExtension() {
        return new ListExtension();
    }
}
