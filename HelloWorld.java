public class HelloWorld{
    public static void main(String[] args){
        System.out.println("Hello World");
        MyClass myClass = new MyClass();
        myClass.tryConsole("Hello Beautiful World");

        int summedNums = myClass.sumInts(9, 10);
        System.out.println(summedNums);

        System.out.println(myClass.divide(5,2));

        Person josh = new Person.Builder().age(33).name("Josh").build();
        System.out.println(josh.getName());
        System.out.println(josh.getAge());

        Loops loops = new Loops();
        loops.forLoop();
        loops.doWhile(5);
        loops.whileLoop();
    }
}