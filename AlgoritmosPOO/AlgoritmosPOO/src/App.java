import java.util.Scanner;

public class App {

    Scanner scanner = new Scanner(System.in);
    Counter counter = new Counter();
    private void exercise_1(){
        counter = new Counter(1, 10, 1);
        counter.count(value->System.out.println(value));
    }

    private int readInt(String message){
        System.out.println(message);
        int value = scanner.nextInt();
        return value;
    }
    private void exercise_2(){
        
        int x = readInt("Valor de x");
        int y = readInt("Valor de y");
        counter = new Counter(x, y, 1);
        counter.count(value->System.out.println(value));
    }

    private void exercise_3(){
        
        int x = readInt("Valor de x");
        int y = readInt("Valor de y");
        counter = new Counter(x, y, 2);
        counter.count(value->System.out.println(value));
    }

    private void exercise_4(){
        
        int x = readInt("Valor de x");
        int y = readInt("Valor de y");
        counter = new Counter(x, y, 3);
        counter.count(value->System.out.println(value));
    }

    private void exercise_5(){
        
        int x = readInt("Valor de x");
        int y = readInt("Valor de y");
        int s = readInt("Valor do passo");
        counter = new Counter(x, y, s);
        counter.count(value->System.out.println(value));
    }

    private void exercise_6(){
        
        int x = readInt("Valor de x");
        int y = readInt("Valor de y");
        counter = new Counter(x, y, 1);
        counter.countDown();
    }
    public static void main(String[] args) throws Exception {
        
        App app = new App();
        app.exercise_1();
        app.exercise_2();
        app.exercise_3();
        app.exercise_4();
        app.exercise_5();
        app.exercise_6();
    }
}
