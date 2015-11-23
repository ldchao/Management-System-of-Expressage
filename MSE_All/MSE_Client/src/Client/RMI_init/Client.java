package Client.RMI_init;

import javax.swing.JOptionPane;


public class Client {

    public static void main(String[] args) {
        try {
            RMIHelper.init();
            System.out.println("‘À––¡À");
        } catch (ClientInitException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(
                    null,
                    "Client boots fail!\nCause: " + e.getMessage(),
                    "Fatal Error",
                    JOptionPane.ERROR_MESSAGE
            );
        }

    }
}
