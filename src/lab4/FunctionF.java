package lab4;

/**
 *
 * @author Wsl_F
 */
public class FunctionF implements Runnable {

    @Override
    public void run() {
        MainJFrame.resultF= (int) Math.pow(MainJFrame.x,0.5);
    }

}
