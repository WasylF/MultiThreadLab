package lab4;

/**
 *
 * @author Wsl_F
 */
public class FunctionG implements Runnable {

    @Override
    public void run() {
       MainJFrame.resultG= calcFibonacciSlove(MainJFrame.x);
    }
    
    private int calcFibonacciSlove(int n) {
        if (n==0) return 0;
        if (n==1) return 1;
        return calcFibonacciSlove(n-1)+calcFibonacciSlove(n-2);
    }

}
