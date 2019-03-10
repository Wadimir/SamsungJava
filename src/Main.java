public class Main {
    public static void main(String[] args) {
        Person myPerson = new Person.Builder()
                .withName("Nameless")
                .withDate(1240)
                .withHair(32)
                .withHeight(165)
                .withWeight(70)
                .withChildren(false)
                .build();

        ApiService apiService = ApiService.getInstance();
        System.out.println(myPerson.toString());
        System.out.println(apiService.toString());
    }
}
