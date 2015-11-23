package Client.RMI_init;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

import Client.dataservice.storedataservice.Warehouse_inDataService;

public class RMIHelper {

    private static final String IP = "localhost"; //Can be read from config file

    private static boolean inited = false;

    private static Warehouse_inDataService warehouse_inData;

    public synchronized static void init() throws ClientInitException {
        if (inited) {
            return;
        }

        try {
            initObjects();
            inited = true;
        } catch (Exception e) {
            throw new ClientInitException(e);
        }
    }

    private static void initObjects() throws MalformedURLException, RemoteException, NotBoundException {
        String urlPrefix = "rmi://" + IP + "/";
        warehouse_inData = (Warehouse_inDataService) Naming.lookup(urlPrefix + "Warehouse_inData");
    }

    public static Warehouse_inDataService getWarehouse_inData() {
        return warehouse_inData;
    }
}
