package nju.edu.data.listindata;

import java.io.File;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;

import PO.OrderPO;
import State.ResultMessage;
import nju.edu.data.FileIO.fileReader;
import nju.edu.data.FileIO.fileWriter;
import nju.edu.dataservice.listindataservice.ListinDataService;

public class ListinData extends UnicastRemoteObject implements ListinDataService{

	public ListinData() throws RemoteException{
		// TODO Auto-generated constructor stub
	}
	@Override
	public void insert(OrderPO po) throws RemoteException {
		// TODO Auto-generated method stub
		fileWriter fileWriter=new fileWriter();
		ArrayList<String> arrayList=new ArrayList<String>();
		arrayList.add(po.getCourier());
		arrayList.add(po.getId());
		arrayList.add(po.getState()+"");
		arrayList.add(po.getSender());
		arrayList.add(po.getAddress1());
		arrayList.add(po.getPosition1());
		arrayList.add(po.getPhone1());
		arrayList.add(po.getCellphone1());
		arrayList.add(po.getReceiver());
		arrayList.add(po.getAddress2());
		arrayList.add(po.getPosition2());
		arrayList.add(po.getPhone2());
		arrayList.add(po.getCellphone2());
		arrayList.add(po.getItems());
		arrayList.add(po.getCount()+"");
		arrayList.add(po.getWeight()+"");
		arrayList.add(po.getLength()+"");
		arrayList.add(po.getWidth()+"");
		arrayList.add(po.getHeight()+"");
		arrayList.add(po.getExpress()+"");
		arrayList.add(po.getPack()+"");
		arrayList.add(po.getTime());
		arrayList.add(po.getTransformState());
		fileWriter.Writer("Database/Order.txt", arrayList, true);
	}

	@Override
	public double getPrice(String address1, String address2) throws RemoteException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public ResultMessage find(String number) throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public OrderPO getOrder(String id) throws RemoteException {
		return null;
		// TODO Auto-generated method stub
		
	}
	@Override
	public void update(String id, String message) throws RemoteException {
		// TODO Auto-generated method stub
		
	}
	@Override
	public double getWeigtht(String id) throws RemoteException {
		// TODO Auto-generated method stub
		return 0;
	}

}
