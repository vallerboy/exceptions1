/**
 * Created by Lenovo on 18.08.2017.
 */
public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.divide(5, 0);
    }


    public int divide(int a, int b){
        if(b == 0){
            throw new IllegalArgumentException("Do not divide by 0");
        }

        return a / b;
    }
}
