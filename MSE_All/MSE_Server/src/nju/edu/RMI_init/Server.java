package nju.edu.RMI_init;


public class Server {

    public static void main(String[] args) {
        try {
            Logger.info("Try start server...");
            RMIHelper.init();
            Logger.info("Server is running now!");
        } catch (ServerInitException e) {
            Logger.error("Server starts fail!");
            Logger.error(e);
        }
    }
}
