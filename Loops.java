public class Loops {
    public void forLoop(){
        for(int i = 0; i < 10; i++){
            System.out.println("Hello World");
        }
    }
    public void doWhile(int counter){
        do {
            System.out.println("Doing While");
            counter--;
        }while(counter > 0);
    }

    public void whileLoop() {
        int i = 10;
        
        while( i > 0) {
            System.out.println(i);
            i--;
        }
    }
}
