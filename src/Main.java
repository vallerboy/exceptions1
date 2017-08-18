import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

import java.io.IOException;

/**
 * Created by Lenovo on 18.08.2017.
 */
public class Main {

    // A TO KOD JAKIEGOS NASZEGO KLIENTA
    public static void main(String[] args) {
        Main main = new Main();

        try {
            main.prepareDivide();
        }catch (IOException ebbobuoiibbbcfxfdxfcjjk){
            System.out.println("Witaj w mojej aplikacji opartej o API Oskara");
            System.out.println("nie mozesz tutaj dzielic przez 0");

        }
    }


    // API ///
    public int prepareDivide() throws IOException {
        return divide(5,0);
    }

    private int divide(int a, int b) throws IOException{
        if(b == 0){
            throw new IOException("Do not divide by 0");
        }


        return a / b;
    }
}
