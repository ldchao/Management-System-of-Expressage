package PO;

import java.io.Serializable;
import java.util.ArrayList;

import StaticValue.StoreNum;

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

	public String[][][] getTrainToTC() {
		return trainToTC;
	}

	public String[][][] getCarToTC() {
		return carToTC;
	}

	public String[][] getCarToBH() {
		return carToBH;
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

	// 根据库位(精确到架)查找对应位置的订单编号
	public ArrayList<String> getId(String qu, int pai, int[] jia) {
		ArrayList<String> idList = new ArrayList<>();
		if (qu.equals("航运区")) {
			for (int i = 0; i < 20; i++) {
				if (jia[i] == 1) {
					for (int j = 0; j < 60; j++) {
						if (!airToTC[pai][i][j].equals("0"))
							idList.add(airToTC[pai][i][j]);
					}
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

	// 根据库位(精确到位)查找对应位置的订单编号
	public ArrayList<String> getId(int jia, int[] wei) {
		ArrayList<String> idList = new ArrayList<>();

		for (int i = 0; i < 60; i++) {
			if (!carToBH[jia][i].equals("0")) {
				idList.add(carToBH[jia][i]);
			}
		}
		return idList;
	}

	// 根据库位(精确到区)查找对应位置的订单编号
	public ArrayList<String> getId(String qu) {
		ArrayList<String> idList = new ArrayList<>();

		if (qu.equals("航运区")) {
			for (int i = 0; i < 3; i++) {
				for (int j = 0; j < 20; j++) {
					for (int j2 = 0; j2 < 60; j2++) {
						if (!airToTC[i][j][j2].equals("0"))
							idList.add(airToTC[i][j][j2]);
					}
				}
			}
		} else if (qu.equals("铁运区")) {
			for (int i = 0; i < 3; i++) {
				for (int j = 0; j < 20; j++) {
					for (int j2 = 0; j2 < 60; j2++) {
						if (!trainToTC[i][j][j2].equals("0"))
							idList.add(trainToTC[i][j][j2]);
					}
				}
			}
		} else {
			for (int i = 0; i < 3; i++) {
				for (int j = 0; j < 20; j++) {
					for (int j2 = 0; j2 < 60; j2++) {
						if (!carToTC[i][j][j2].equals("0"))
							idList.add(carToTC[i][j][j2]);
					}
				}
			}
			for (int i = 0; i < 20; i++) {
				for (int j = 0; j < 60; j++) {
					if (!carToBH[i][j].equals("0"))
						idList.add(carToBH[i][j]);
				}
			}
		}
		return idList;
	}

	// 得到各个库存位置的库存比例
	public String[][] getStoreRatio() {
		String[][] storeRatio = new String[9 + StoreNum.businessHall][3];
		for (int i = 0; i < remind_value.length; i++) {
			storeRatio[i][2] = remind_value[i];
		}
		for (int i = 0; i < 3; i++) {
			storeRatio[i][0] = "航运区" + (i + 1) + "排";
			int number = 0;
			for (int j = 0; j < 20; j++) {
				for (int j2 = 0; j2 < 60; j2++) {
					if (!airToTC[i][j][j2].equals("0")) {
						number++;
					}
				}
			}
			storeRatio[i][1] = number + "/" + 1200;
		}
		for (int i = 0; i < 3; i++) {
			storeRatio[i + 3][0] = "铁运区" + (i + 1) + "排";
			int number = 0;
			for (int j = 0; j < 20; j++) {
				for (int j2 = 0; j2 < 60; j2++) {
					if (!trainToTC[i][j][j2].equals("0")) {
						number++;
					}
				}
			}
			storeRatio[i + 3][1] = number + "/" + 1200;
		}
		for (int i = 0; i < 3; i++) {
			storeRatio[i + 6][0] = "汽运区" + (i + 1) + "排";
			int number = 0;
			for (int j = 0; j < 20; j++) {
				for (int j2 = 0; j2 < 60; j2++) {
					if (!carToTC[i][j][j2].equals("0")) {
						number++;
					}
				}
			}
			storeRatio[i + 6][1] = number + "/" + 1200;
		}
		for (int i = 0; i < StoreNum.businessHall; i++) {
			storeRatio[i + 9][0] = "汽运区4排" + (i + 1) + "架";
			int number = 0;
			for (int j = 0; j < 60; j++) {
				if (!carToBH[i][j].equals("0")) {
					number++;
				}
			}
			storeRatio[i + 9][1] = number + "/" + 60;
		}
		return storeRatio;
	}
}
