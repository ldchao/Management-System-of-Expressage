package PO;

import java.io.Serializable;
import java.util.ArrayList;

//StorePO���ֿ���Ϣ���������澯��ֵ������ֵ����λ�ÿ����Ϣ��
public class StorePO implements Serializable {

	String warn_value; // ����ֵ
	String[] remind_value; // ����ֵ ��29��
	String[][][] airToTC; // ����������ת���ĺ����������Ϣ 3*20*60
	String[][][] trainToTC; // ����������ת���������������Ϣ 3*20*60
	String[][][] carToTC; // ����������ת���������������Ϣ 3*20*60
	String[][] carToBH; // ��������Ӫҵ�������Ϣ 20*60

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
		if (qu.equals("������")) {
			airToTC[pai][jia][wei] = orderNum;
		} else if (qu.equals("������")) {
			trainToTC[pai][jia][wei] = orderNum;
		} else {
			if (pai == 3)
				carToBH[jia][wei] = orderNum;
			else
				carToTC[pai][jia][wei] = orderNum;
		}

	}

	// ���ݿ�λ���Ҷ�Ӧλ�õĶ������
	public ArrayList<String> getId(String qu, int pai, int[] jia) {
		ArrayList<String> idList = new ArrayList<>();
		if (qu.equals("������")) {
			for (int i = 0; i < 20; i++) {
				if (jia[i] == 1)
					for (int j = 0; j < 60; j++) {
						if (!airToTC[pai][i][j].equals("0"))
							idList.add(airToTC[pai][i][j]);
					}
			}

		} else if (qu.equals("������")) {
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

	// ���ݿ�λ���Ҷ�Ӧλ�õĶ������
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
