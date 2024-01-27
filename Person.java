public class Person {
    private final String name;
    private final int age;

    private Person(Builder builder){
        this.name = builder.name;
        this.age = builder.age;
    }

    public static class Builder{
        private String name;
        private int age;

        public Builder name(String name){this.name = name;return this;}
        public Builder age(int age){this.age = age;return this;}

        public Person build(){
            return new Person(this);
        }
    }

    public String getName(){
        return this.name;
    }
    public int getAge(){
        return this.age;
    }
}


