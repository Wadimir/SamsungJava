public class Person {

    private String name;
    private int date_of_birth;
    private int hair_colour;
    private int height;
    private int weight;
    private boolean children;

    private Person (String name, int date_of_birth, int hair_colour, int height, int weight, boolean children) {
        this.name = name;
        this.date_of_birth = date_of_birth;
        this.hair_colour = hair_colour;
        this.height = height;
        this.weight = weight;
        this.children = children;
    }

    public Person() {

    }

    public String getName() {
        return name;
    }

    public int getDate_of_birth() {
        return date_of_birth;
    }

    public int getHair_colour() {
        return hair_colour;
    }

    public int getHeight() {
        return height;
    }

    public int getWeight() {
        return weight;
    }

    public boolean isChildren() {
        return children;
    }

    public static class Builder {
        private Person newPerson;

        public Builder() {
            newPerson = new Person();
        }

        public Builder withName(String name){
            newPerson.name = name;
            return this;
        }

        public Builder withDate(int date_of_birth){
            newPerson.date_of_birth = date_of_birth;
            return this;
        }

        public Builder withHair(int hair_colour){
            newPerson.hair_colour = hair_colour;
            return this;
        }

        public Builder withHeight(int height){
            newPerson.height = height;
            return this;
        }

        public Builder withWeight(int weight){
            newPerson.weight = weight;
            return this;
        }

        public Builder withChildren(boolean children){
            newPerson.children = children;
            return this;
        }

        public Person build(){
            return newPerson;
        }

    }

}