package nju.edu.businesslogic.storebl;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.rmi.RemoteException;
import java.util.ArrayList;

import javax.swing.event.TreeWillExpandListener;

import nju.edu.RMI_init.RMIHelper;
import nju.edu.businesslogicservice.storeblservice.Inventory_managementInfo;
import nju.edu.businesslogicservice.storeblservice.StoreinUpdateInfo;
import nju.edu.businesslogicservice.transferblservice.StoreinInfo;
import nju.edu.dataservice.storedataservice.StoreMessageDataService;
import PO.StorePO;
import PO.StoreinorderPO;
import StaticValue.StoreNum;

public class StoreMessageBL implements StoreinUpdateInfo, StoreinInfo,
		 Inventory_managementInfo, Runnable {

	private static StoreMessageBL store_message = null;
	private StorePO sp;
	private double Strorage_time; // 间隔时间（min）
	private String num;  //仓库所在中转中心编号

	private StoreMessageBL(String transferNum) {
		init(transferNum);
	}
	private StoreMessageBL() {
		init(num);
	}
	public static StoreMessageBL getInstance() {
        
		if (store_message == null) {
			store_message = new StoreMessageBL();

		}
		return store_message;
	}
	
	public static StoreMessageBL getInstance(String transferNum) {
          
		if (store_message == null) {
			store_message = new StoreMessageBL(transferNum);

		}
		return store_message;
	}

	private void init(String transferNum) {
		StoreMessageDataService smd = RMIHelper.getStoreMessageData();
		try {
			sp = smd.getStoreMessage(transferNum);
		} catch (RemoteException e) {
			sp = null;
			e.printStackTrace();
		}
		num=transferNum;
		Strorage_time = getFromFile();
		Thread t = new Thread(this);
		t.start();
	}

	// 将最新的库存信息存入文件中保存
	public void save() {
		StoreMessageDataService smd = RMIHelper.getStoreMessageData();
		try {
			smd.saveStoreMessage(sp,num);
		} catch (RemoteException e) {
			e.printStackTrace();
		}

	}

	// 从文件中读取间隔时间
	private double getFromFile() {
		String time = new String();
		File file = new File("clientFile/storageTime.txt");
		try {
			BufferedReader reader = new BufferedReader(new FileReader(file));
			time = reader.readLine();
			reader.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return Double.parseDouble(time);
	}

	// 更新文件中的间隔时间
	private void setToFile(double new_time) {
		String s = "" + new_time;
		try {
			FileWriter writer = new FileWriter(new File(
					"clientFile/storageTime.txt"));
			writer.write(s);
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	// 入库时更新库存信息

	@Override
	public void storein_update(String qu, int pai, int jia, int wei,
			String orderNum) {
		sp.update(qu, pai - 1, jia - 1, wei - 1, orderNum);
	}

	// 根据库位查找对应位置的订单编号
	@Override
	public ArrayList<String> getId(String qu, int pai, int[] jia) {
		return sp.getId(qu, pai - 1, jia);
	}

	// 根据库位查找对应位置的订单编号
	@Override
	public ArrayList<String> getId(int jia, int[] wei) {
		return sp.getId(jia - 1, wei);
	}

	// 得到各个库存位置的库存比例
	@Override
	public String[][] getStoreRatio() {
		return sp.getStoreRatio();
	}

	// 得到当前警戒值
	@Override
	public String getWarnData() {
		return sp.getWarn_value();
	}

	// 设置警戒值
	@Override
	public void setWarnData(String warnData) {
		sp.setWarn_value(warnData);

	}

	// 得到指定区域的提醒值
	@Override
	public String getRemindData(int area) {
		String[] remindData = sp.getRemind_value();
		return remindData[area];
	}

	// 设置指定区域的提醒值
	@Override
	public void setRemindData(int area, String RemindData) {
		String[] remindData = sp.getRemind_value();
		remindData[area] = RemindData;
		sp.setRemind_value(remindData);
	}

	// 根据区域得到所有订单号
	@Override
	public ArrayList<String> getOrderList(String qu) {
		return sp.getId(qu);
	}

	// 得到存储的间隔时间
	public double getIntervalTime() {
		return Strorage_time;
	}

	// 更新存储的间隔时间
	public void setIntervalTime(double new_time) {
		this.Strorage_time = new_time;
		setToFile(new_time);

	}

	//得到不同区域对应的到达地
	public String[][] getArriveAddress(){
		String[] name=StoreNum.getStoreName(num);
		int length=name.length;
		String[][] message=new String[length][2];
        String[] qu={"航运区","铁运区","汽运区"};
		
		for (int i = 0; i < length; i++) {
              message[i][0]=(i/3)>2?("汽运区4排"+(i-8)+"架"):(qu[i/3]+(i%3+1)+"排");
              message[i][1]=name[i];

		}		
		return message;
	}
	
	@Override
	public void run() {
		while (store_message != null) {
			try {
				Thread.sleep((long) Strorage_time * 60 * 1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			save();
			System.out.println("库存信息自动更新完毕！");
		}

	}

}
