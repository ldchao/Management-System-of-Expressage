package nju.edu.RMI_init;

import nju.edu.presentation.ServerUI;


public class Server {

    public static void main(String[] args) {
        try {
            Logger.info("Try start server...");
            RMIHelper.init();
            ServerUI server=new ServerUI();
            Logger.info("Server is running now!");
        } catch (ServerInitException e) {
            Logger.error("Server starts fail!");
            Logger.error(e);
        }
    }
}
