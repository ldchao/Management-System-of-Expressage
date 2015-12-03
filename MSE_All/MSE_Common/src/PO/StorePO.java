package PO;

import java.io.Serializable;
import java.util.ArrayList;

//StorePO（仓库信息）类包含库存警戒值、提醒值、各位置库存信息。
public class StorePO implements Serializable {

	String warn_value; // 警戒值
	String[] remind_value; // 提醒值 共29个
	String[][][] airToTC; // 发往外市中转中心航空区库存信息 3*20*60
	String[][][] trainToTC; // 发往外市中转中心铁运区库存信息 3*20*60
	String[][][] carToTC; // 发往外市中转中心汽运区库存信息 3*20*60
	String[][] carToBH; // 发往本市营业厅库存信息 20*60

	public StorePO(String warn_value, String[] remind_value,
			String[][][] airToTC, String[][][] trainToTC, String[][][] carToTC,
			String[][] carToBH) {
		super();
		this.warn_value = warn_value;
		this.remind_value = remind_value;
		this.airToTC = airToTC;
		this.trainToTC = trainToTC;
		this.carToTC = carToTC;
		this.carToBH = carToBH;
	}

	public String getWarn_value() {
		return warn_value;
	}

	public void setWarn_value(String warn_value) {
		this.warn_value = warn_value;
	}

	public String[] getRemind_value() {
		return remind_value;
	}

	public void setRemind_value(String[] remind_value) {
		this.remind_value = remind_value;
	}

	public String[][][] getAirToTC() {
		return airToTC;
	}

	public void setAirToTC(String[][][] airToTC) {
		this.airToTC = airToTC;
	}

	public String[][][] getTrainToTC() {
		return trainToTC;
	}

	public void setTrainToTC(String[][][] trainToTC) {
		this.trainToTC = trainToTC;
	}

	public String[][][] getCarToTC() {
		return carToTC;
	}

	public void setCarToTC(String[][][] carToTC) {
		this.carToTC = carToTC;
	}

	public String[][] getCarToBH() {
		return carToBH;
	}

	public void setCarToBH(String[][] carToBH) {
		this.carToBH = carToBH;
	}

	public void update(String qu, int pai, int jia, int wei, String orderNum) {
		if (qu.equals("航运区")) {
			airToTC[pai][jia][wei] = orderNum;
		} else if (qu.equals("铁运区")) {
			trainToTC[pai][jia][wei] = orderNum;
		} else {
			if (pai == 3)
				carToBH[jia][wei] = orderNum;
			else
				carToTC[pai][jia][wei] = orderNum;
		}

	}

	// 根据库位查找对应位置的订单编号
	public ArrayList<String> getId(String qu, int pai, int[] jia) {
		ArrayList<String> idList = new ArrayList<>();
		if (qu.equals("航运区")) {
			for (int i = 0; i < 20; i++) {
				if (jia[i] == 1)
					for (int j = 0; j < 60; j++) {
						if (!airToTC[pai][i][j].equals("0"))
							idList.add(airToTC[pai][i][j]);
					}
			}

		} else if (qu.equals("铁运区")) {
			for (int i = 0; i < 20; i++) {
				if (jia[i] == 1)
					for (int j = 0; j < 60; j++) {
						if (!trainToTC[pai][i][j].equals("0"))
							idList.add(trainToTC[pai][i][j]);
					}
			}
		} else {
			for (int i = 0; i < 20; i++) {
				if (jia[i] == 1)
					for (int j = 0; j < 60; j++) {
						if (!carToTC[pai][i][j].equals("0"))
							idList.add(carToTC[pai][i][j]);
					}
			}
		}

		return idList;
	}

	// 根据库位查找对应位置的订单编号
	public ArrayList<String> getId(int jia, int[] wei) {
		ArrayList<String> idList = new ArrayList<>();

		for (int i = 0; i < 60; i++) {
			if (!carToBH[jia][i].equals("0")) {
				idList.add(carToBH[jia][i]);
			}
		}
		return idList;
	}

}
