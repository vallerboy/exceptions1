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
        }catch (WalletEmptyException e){
             e.printStackTrace();
        }
    }


    // API ///
    public int prepareDivide() throws WalletEmptyException {
        return divide(5,0);
    }

    private int divide(int a, int b) throws WalletEmptyException{
        if(b == 0){
            throw new WalletEmptyException("Do not divide by 0");
        }


        return a / b;
    }
}
