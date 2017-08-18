/**
 * Created by Lenovo on 18.08.2017.
 */
public class Main {

    // A TO KOD JAKIEGOS NASZEGO KLIENTA
    public static void main(String[] args) {
        Main main = new Main();

        try {
            main.divide(5, 0);
        }catch (IllegalArgumentException e){
            System.out.println("Witaj w mojej aplikacji opartej o API Oskara");
            System.out.println("nie mozesz tutaj dzielic przez 0");

        }
    }


    // API
    public int divide(int a, int b){
        if(b == 0){
            throw new IllegalArgumentException("Do not divide by 0");
        }


        return a / b;
    }
}
