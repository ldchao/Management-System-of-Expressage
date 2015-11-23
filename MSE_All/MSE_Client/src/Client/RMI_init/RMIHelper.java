package Client.RMI_init;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

import Client.dataservice.accountdataservice.AccountDataService;
import Client.dataservice.approvedataservice.ApproveDataService;
import Client.dataservice.billdataservice.BillDataService;
import Client.dataservice.checklistdataservice.ListinDataService;
import Client.dataservice.financedataservice.CalculateDataService;
import Client.dataservice.financedataservice.PayorderDataService;
import Client.dataservice.financedataservice.ReceiFormDataService;
import Client.dataservice.financedataservice.StatisticsDataService;
import Client.dataservice.listindataservice.ReceiverDataService;
import Client.dataservice.loaddataservice.LoadDataService;
import Client.dataservice.loaddataservice.ShippingDataService;
import Client.dataservice.policydataservice.ConstantDataSerivce;
import Client.dataservice.policydataservice.SalaryPolicyDataService;
import Client.dataservice.staffdataservice.StaffDataService;
import Client.dataservice.staffdataservice.UserDataService;
import Client.dataservice.storedataservice.Inventory_managementDataService;
import Client.dataservice.storedataservice.Warehouse_inDataService;
import Client.dataservice.storedataservice.Warehouse_outDataService;
import Client.dataservice.transferdataservice.ReceiveDataService;
import Client.dataservice.transferdataservice.SendFormDataService;
import Client.dataservice.transferdataservice.TransferDataService;
import Client.dataservice.vehicledataservice.DriverDataService;
import Client.dataservice.vehicledataservice.VehicleDataService;

public class RMIHelper {

    private static final String IP = "localhost"; //Can be read from config file

    private static boolean inited = false;

    private static AccountDataService AccountData;
    private static ApproveDataService ApproveData;
    private static BillDataService BillData;
//    private static ListinDataService ListinData;
    private static CalculateDataService CalculateData;
    private static PayorderDataService PayorderData;
//    private static ReceiFormDataService ReceiFormData;
    private static StatisticsDataService StatisticsData;
//    private static ListinDataService ListinData;
    private static ReceiverDataService ReceiverData;
    private static LoadDataService LoadData;
    private static ShippingDataService ShippingData;
    private static ConstantDataSerivce ConstantData;
    private static SalaryPolicyDataService SalaryPolicyData;
    private static StaffDataService StaffData;
    private static UserDataService UserData;
    private static Warehouse_inDataService Warehouse_inData;
    private static Warehouse_outDataService Warehouse_outData;
    private static Inventory_managementDataService Inventory_managementData;
//    private static ReceiFormDataService ReceiFormData;
    private static ReceiveDataService ReceiveData;
    private static SendFormDataService SendFormData;
    private static TransferDataService TransferData;
    private static DriverDataService DriverData;
    private static VehicleDataService VehicleData;

    

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
        AccountData=(AccountDataService)Naming.lookup(urlPrefix + "AccountData");
        ApproveData=(ApproveDataService)Naming.lookup(urlPrefix + "ApproveData");
        BillData=(BillDataService)Naming.lookup(urlPrefix + "BillData");
//        ListinData=(ListinDataService)Naming.lookup(urlPrefix + "ListinData");
        CalculateData=(CalculateDataService)Naming.lookup(urlPrefix + "CalculateData");
        PayorderData=(PayorderDataService)Naming.lookup(urlPrefix + "PayorderData");
//        ReceiFormData=(ReceiFormDataService)Naming.lookup(urlPrefix + "ReceiFormData");
        StatisticsData=(StatisticsDataService)Naming.lookup(urlPrefix + "StatisticsData");
//        ListinData=(ListinDataService)Naming.lookup(urlPrefix + "ListinData");
        ReceiverData=(ReceiverDataService)Naming.lookup(urlPrefix + "ReceiverData");
        LoadData=(LoadDataService)Naming.lookup(urlPrefix + "LoadData");
        ShippingData=(ShippingDataService)Naming.lookup(urlPrefix + "ShippingData");
        ConstantData=(ConstantDataSerivce)Naming.lookup(urlPrefix + "ConstantData");
        SalaryPolicyData=(SalaryPolicyDataService)Naming.lookup(urlPrefix + "SalaryPolicyData");
        StaffData=(StaffDataService)Naming.lookup(urlPrefix + "StaffData");
        UserData=(UserDataService)Naming.lookup(urlPrefix + "UserData");
        Warehouse_inData=(Warehouse_inDataService)Naming.lookup(urlPrefix + "Warehouse_inData");
        Warehouse_outData=(Warehouse_outDataService)Naming.lookup(urlPrefix + "Warehouse_outData");
        Inventory_managementData=(Inventory_managementDataService)Naming.lookup(urlPrefix + "Inventory_managementData");
//      ReceiFormData=(ReceiFormDataService)Naming.lookup(urlPrefix + "ReceiFormData");
        ReceiveData=(ReceiveDataService)Naming.lookup(urlPrefix + "ReceiveData");
        SendFormData=(SendFormDataService)Naming.lookup(urlPrefix + "SendFormData");
        TransferData=(TransferDataService)Naming.lookup(urlPrefix + "TransferData");
        DriverData=(DriverDataService)Naming.lookup(urlPrefix + "DriverDataData");
        VehicleData=(VehicleDataService)Naming.lookup(urlPrefix + "VehicleData");
    }

    public static AccountDataService getAccountData() {
        return AccountData;
    }
    public static ApproveDataService getApproveData() {
        return ApproveData;
    }
    public static BillDataService getBillData() {
        return BillData;
    }
//    public static ListinDataService getListinData() {
//        return ListinData;
//    }
    public static CalculateDataService getCalculateData() {
        return CalculateData;
    }
    public static PayorderDataService getPayorderData() {
        return PayorderData;
    }
//    public static ReceiFormDataService getReceiFormData() {
//        return ReceiFormData;
//    }
    public static StatisticsDataService getStatisticsData() {
        return StatisticsData;
    }
//  public static ListinDataService getListinData() {
//  return ListinData;
//}       
    public static ReceiverDataService getReceiverData() {
        return ReceiverData;
    }
    public static LoadDataService getLoadData() {
        return LoadData;
    }
    public static ShippingDataService getShippingData() {
        return ShippingData;
    }
    public static ConstantDataSerivce getConstantData() {
        return ConstantData;
    } 
    public static SalaryPolicyDataService getSalaryPolicyData() {
        return SalaryPolicyData;
    }
    public static StaffDataService getStaffData() {
        return StaffData;
    }
    public static UserDataService getUserData() {
        return UserData;
    }
    public static Warehouse_inDataService getWarehouse_inData() {
        return Warehouse_inData;
    }
    public static Warehouse_outDataService getWarehouse_outData() {
        return Warehouse_outData;
    }
    public static Inventory_managementDataService getInventory_managementData() {
        return Inventory_managementData;
    }
//  public static ReceiFormDataService getReceiFormData() {
//  return ReceiFormData;
//  }    
    public static ReceiveDataService getReceiveData() {
        return ReceiveData;
    }
    public static SendFormDataService getSendFormData() {
        return SendFormData;
    }
    public static TransferDataService getTransferData() {
        return TransferData;
    }
    public static DriverDataService getDriverData() {
        return DriverData;
    }
    public static VehicleDataService getVehicleData() {
        return VehicleData;
    }
}
