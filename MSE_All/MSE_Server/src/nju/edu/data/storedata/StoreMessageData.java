package nju.edu.data.storedata;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;

import PO.StorePO;
import nju.edu.data.FileIO.fileReader;
import nju.edu.data.FileIO.fileWriter;
import nju.edu.dataservice.storedataservice.StoreMessageDataService;

public class StoreMessageData extends UnicastRemoteObject implements
		StoreMessageDataService {

	public StoreMessageData() throws RemoteException {
		super();
	}

	// ���ļ��ж�ȡ��ǰ���µĿ����Ϣ������ֵ������ֵ������λ�����浥�ݣ�
	@Override
	public StorePO getStoreMessage() throws RemoteException {
		ArrayList<String> messagelist = fileReader.Reader("DataBase/Store.txt");
		int index = 0;
		String warnNum = messagelist.get(index);
		index++;

		String allRemindNum = messagelist.get(index);
		String[] remindNum = allRemindNum.split(";");
		index++;

		String[][][] airToTC = new String[3][20][60]; // ����������ת���ĺ����������Ϣ 3*20*60
		String[][][] trainToTC = new String[3][20][60];// ����������ת���������������Ϣ 3*20*60
		String[][][] carToTC = new String[3][20][60];// ����������ת���������������Ϣ 3*20*60
		String[][] carToBH = new String[20][60];// ��������Ӫҵ�������Ϣ 20*60

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < carToBH.length; j++) {
				airToTC[i][j] = messagelist.get(index).split(";");
				index++;
			}
		}
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < carToBH.length; j++) {
				trainToTC[i][j] = messagelist.get(index).split(";");
				index++;
			}
		}
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < carToBH.length; j++) {
				carToTC[i][j] = messagelist.get(index).split(";");
				index++;
			}
		}
		for (int i = 0; i < 20; i++) {
			carToBH[i] = messagelist.get(index).split(";");
			index++;
		}

		StorePO sp = new StorePO(warnNum, remindNum, airToTC, trainToTC,
				carToTC, carToBH);
		return sp;
	}

	// �ڲֿ������Ա�˳�ʱ����ǰ��Ϣ�洢���ļ���
	@Override
	public void saveStoreMessage(StorePO sp) throws RemoteException {
		ArrayList<String> storeMessage = new ArrayList<>();
		String warn_value = sp.getWarn_value();
		String[] remind_value = sp.getRemind_value(); // 29
		String[][][] airToTC = sp.getAirToTC(); // 3*20*60
		String[][][] trainToTC = sp.getTrainToTC(); // 3*20*60
		String[][][] carToTC = sp.getCarToTC(); // 3*20*60
		String[][] carToBH = sp.getCarToBH(); // 20*60

		storeMessage.add(warn_value);
		String s = "";
		for (int i = 0; i < remind_value.length; i++) {
			s += (remind_value[1] + ";");
		}
		storeMessage.add(s);
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 20; j++) {
				s = "";
				for (int j2 = 0; j2 < 60; j2++) {
					s += (airToTC[i][j][j2] + ";");
				}
				storeMessage.add(s);
			}
		}
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 20; j++) {
				s = "";
				for (int j2 = 0; j2 < 60; j2++) {
					s += (trainToTC[i][j][j2] + ";");
				}
				storeMessage.add(s);
			}
		}
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 20; j++) {
				s = "";
				for (int j2 = 0; j2 < 60; j2++) {
					s += (carToTC[i][j][j2] + ";");
				}
				storeMessage.add(s);
			}
		}
		for (int i = 0; i < 20; i++) {

			s = "";
			for (int j = 0; j < 60; j++) {
				s += (carToBH[i][j] + ";");
			}
			storeMessage.add(s);
		}
		fileWriter.Writer("DataBase/Store.txt", storeMessage, false);

	}

}
