package nju.edu.data.listindata;

import java.io.File;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import PO.OrderPO;
import State.ApproveState;
import State.ExpressType;
import State.PackageType;
import State.ResultMessage;
import nju.edu.data.FileIO.fileReader;
import nju.edu.data.FileIO.fileWriter;
import nju.edu.dataservice.listindataservice.ListinDataService;

public class ListinData extends UnicastRemoteObject implements ListinDataService{

	public ListinData() throws RemoteException{
		// TODO Auto-generated constructor stub
	}
	//新建订单时用，加入文件中
	@Override
	public void insert(OrderPO po) throws RemoteException {
		// TODO Auto-generated method stub
		fileWriter fileWriter=new fileWriter();
		String temp="";
		temp+=po.getCourier()+";";
		temp+=po.getId()+";";
		temp+=po.getState()+";";
		temp+=po.getSender()+";";
		temp+=po.getAddress1()+";";
		temp+=po.getPhone1()+";";
		temp+=po.getCellphone1()+";";
		temp+=po.getPosition1()+";";
		temp+=po.getReceiver()+";";
		temp+=po.getAddress2()+";";
		temp+=po.getPhone2()+";";
		temp+=po.getCellphone2()+";";
		temp+=po.getPosition2()+";";
		temp+=po.getItems()+";";
		temp+=po.getCount()+";";
		temp+=po.getWeight()+";";
		temp+=po.getLength()+";";
		temp+=po.getWidth()+";";
		temp+=po.getHeight()+";";
		temp+=po.getExpress()+";";
		temp+=po.getPack()+";";
		temp+=po.getBill()+";";
		temp+=po.getTime()+";";
		temp+=po.getTransformState()+";";
		fileWriter.Writer("Database/UncheckOrder.txt", temp, true);
	}

	@Override
	public double getPrice(String address1, String address2) throws RemoteException {
		// TODO Auto-generated method stub
		return 0;
	}

	//根据订单号获得单据po
	@Override
	public OrderPO getOrder(String id) throws RemoteException {
		fileReader fileReader=new fileReader();
		String [] temp=null;
		boolean valid=false;
		ArrayList<String> arrayList=fileReader.Reader("Database/UnReceiveOrder.txt");
		for(int i=0;i<arrayList.size();i++){
			temp=arrayList.get(i).split(";");
			if(temp[1].equals(id)){
				valid=true;
				break;
			}
		}
		
		if(valid==true){
		String []statetype={"Valid","Invalid","NotApprove"};
		ApproveState state=null;
		if(temp[2].equals(statetype[0])){
			state=ApproveState.Valid;
		}else if(temp[2].equals(statetype[1])){
			state=ApproveState.Invalid;
		}else if(temp[2].equals(statetype[2])){
			state=ApproveState.NotApprove;
		}
		
		String [] expresstype={"Economy","Standard","Professional"};
		ExpressType express=null;
		if(temp[19].equals(expresstype[0])){
			express=ExpressType.Economy;
		}else if(temp[19].equals(expresstype[1])){
			express=ExpressType.Standard;
		}else if(temp[19].equals(expresstype[2])){
			express=ExpressType.Professional;
		}
		
		String [] packtype={"Carton","Wooden","bag"};
		PackageType pack=null;
		if(temp[20].equals(packtype[0])){
			pack=PackageType.Carton;
		}else if(temp[20].equals(packtype[1])){
			pack=PackageType.Wooden;
		}else if(temp[20].equals(packtype[2])){
			pack=PackageType.bag;
		}
		OrderPO po=new OrderPO(temp[0], temp[1], state, 
				temp[3], temp[4], temp[5], temp[6], temp[7], 
				temp[8], temp[9], temp[10], temp[11], temp[12], 
				temp[13], Double.parseDouble(temp[14]), Double.parseDouble(temp[15]), Double.parseDouble(temp[16]), Double.parseDouble(temp[17]), Double.parseDouble(temp[18]), 
				express, pack, Double.parseDouble(temp[21]), temp[22], temp[23]);
		return po;
		}else{
			return null;
		}
		// TODO Auto-generated method stub	
	}
	
	
	//输入id，更新运输信息
	@Override
	public void update(String id, String message) throws RemoteException {
		// TODO Auto-generated method stub
		fileReader fileReader=new fileReader();
		String [] temp=null;
		ArrayList<String> arrayList=fileReader.Reader("Database/UnReceiveOrder.txt");
		int a=-1;
		for(int i=0;i<arrayList.size();i++){
			temp=arrayList.get(i).split(";");
			if(temp[1].equals(id)){
				a=i;
				break;
			}
		}
		
		String t="";
		for(int j=0;j<temp.length-1;j++){
			t+=temp[j]+";";
		}
		Date date=new Date();
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String now = dateFormat.format(date); 
		t+=temp[temp.length-1]+","+now+" : "+message+";";
		if(a!=-1)
		arrayList.set(a, t);
		fileWriter fileWriter=new fileWriter();
		fileWriter.Writer("Database/UnReceiveOrder.txt", arrayList, false);
	}
	@Override
	public double getWeigtht(String id) throws RemoteException {
		// TODO Auto-generated method stub
		OrderPO orderPO=getOrder(id);
		double result=0;
		try {
			result=orderPO.getWeight();
		} catch (Exception e) {
			// TODO: handle exception
		}
		return result;
	}
	@Override
	public ArrayList<OrderPO> getAllOrders() throws RemoteException {
		// TODO Auto-generated method stub
		fileReader fileReader=new fileReader();
		ArrayList<String> arrayList=fileReader.Reader("Database/UncheckOrder.txt");
		ArrayList<OrderPO> orderPOs=new ArrayList<>();
		String []temp=null;
		for(int i=0;i<arrayList.size();i++){
			temp=arrayList.get(i).split(";");
			String []statetype={"Valid","Invalid","NotApprove"};
			ApproveState state=null;
			if(temp[2].equals(statetype[0])){
				state=ApproveState.Valid;
			}else if(temp[2].equals(statetype[1])){
				state=ApproveState.Invalid;
			}else if(temp[2].equals(statetype[2])){
				state=ApproveState.NotApprove;
			}
			
			String [] expresstype={"Economy","Standard","Professional"};
			ExpressType express=null;
			if(temp[19].equals(expresstype[0])){
				express=ExpressType.Economy;
			}else if(temp[19].equals(expresstype[1])){
				express=ExpressType.Standard;
			}else if(temp[19].equals(expresstype[2])){
				express=ExpressType.Professional;
			}
			
			String [] packtype={"Carton","Wooden","bag"};
			PackageType pack=null;
			if(temp[20].equals(packtype[0])){
				pack=PackageType.Carton;
			}else if(temp[20].equals(packtype[1])){
				pack=PackageType.Wooden;
			}else if(temp[20].equals(packtype[2])){
				pack=PackageType.bag;
			}
			OrderPO po=new OrderPO(temp[0], temp[1], state, 
					temp[3], temp[4], temp[5], temp[6], temp[7], 
					temp[8], temp[9], temp[10], temp[11], temp[12], 
					temp[13], Double.parseDouble(temp[14]), Double.parseDouble(temp[15]), Double.parseDouble(temp[16]), Double.parseDouble(temp[17]), Double.parseDouble(temp[18]), 
					express, pack, Double.parseDouble(temp[21]), temp[22], temp[23]);
			orderPOs.add(po);
		}
		return orderPOs;
	}
	
	@Override
	public void changestate(OrderPO po) throws RemoteException {
		// TODO Auto-generated method stub
		fileReader fileReader=new fileReader();
		String [] t=null;
		ArrayList<String> arrayList=fileReader.Reader("Database/UncheckOrder.txt");
		int a=-1;
		for(int i=0;i<arrayList.size();i++){
			t=arrayList.get(i).split(";");
			if(t[1].equals(po.getId())){
				a=i;
				break;
			}
		}
		arrayList.remove(a);
		fileWriter fileWriter=new fileWriter();
		fileWriter.Writer("Database/UncheckOrder.txt", arrayList, false);
		//存到UnReceiveOrder里
		String temp="";
		temp+=po.getCourier()+";";
		temp+=po.getId()+";";
		temp+=po.getState()+";";
		temp+=po.getSender()+";";
		temp+=po.getAddress1()+";";
		temp+=po.getPhone1()+";";
		temp+=po.getCellphone1()+";";
		temp+=po.getPosition1()+";";
		temp+=po.getReceiver()+";";
		temp+=po.getAddress2()+";";
		temp+=po.getPhone2()+";";
		temp+=po.getCellphone2()+";";
		temp+=po.getPosition2()+";";
		temp+=po.getItems()+";";
		temp+=po.getCount()+";";
		temp+=po.getWeight()+";";
		temp+=po.getLength()+";";
		temp+=po.getWidth()+";";
		temp+=po.getHeight()+";";
		temp+=po.getExpress()+";";
		temp+=po.getPack()+";";
		temp+=po.getBill()+";";
		temp+=po.getTime()+";";
		temp+=po.getTransformState()+";";
		fileWriter.Writer("Database/UnReceiveOrder.txt", temp, true);
	}
	@Override
	public boolean checkOrder(String id) throws RemoteException {
		// TODO Auto-generated method stub
		fileReader fileReader=new fileReader();
		String [] temp=null;
		boolean result=false;
		ArrayList<String> arrayList=fileReader.Reader("Database/UncheckOrder.txt");
		for(int i=0;i<arrayList.size();i++){
			temp=arrayList.get(i).split(";");
			if(temp[1].equals(id)){
				result=true;
				break;
			}
		}
		arrayList=fileReader.Reader("Database/UnReceiveOrder.txt");
		for(int i=0;i<arrayList.size();i++){
			temp=arrayList.get(i).split(";");
			if(temp[1].equals(id)){
				result=true;
				break;
			}
		}
		return result;
	}

	
}
