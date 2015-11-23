package Client.businesslogic.financebl;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;

import Client.VO.PayeeorderVO;
import Client.VO.PayorderVO;
import Client.businesslogicservice.financeblservice.PayorderBLService;

public class PayorderBL implements PayorderBLService {

	@Override
	public void addPayorder(double paymoney, String date, String payname,
			String payaccount, String list, String comment) {

		ArrayList<String> arrayList = new ArrayList<String>();
		File payfile = new File("DataBase/Payorder.txt");
		try {
			BufferedReader reader = new BufferedReader(new FileReader(payfile));
			String line;
			while ((line = reader.readLine()) != null)
				arrayList.add(line);

			reader.close();

			arrayList.add(paymoney + ";" + date + ";" + payname + ";"
					+ payaccount + ";" + list + ";" + comment);

			FileWriter writer = new FileWriter(payfile);
			for (String str : arrayList) {
				writer.write(str + "\n");
			}
			writer.close();

		} catch (Exception ex) {
			ex.printStackTrace();
		}

	}

	@Override
	public ArrayList<PayorderVO> checkPayorder() {
		ArrayList<PayorderVO> payorderlist = new ArrayList<>();

		// ��ȡAccount.txt������ʾ��������
		File acfile = new File("DataBase/Payorder.txt");
		try {
			BufferedReader reader = new BufferedReader(new FileReader(acfile));
			String line;
			while ((line = reader.readLine()) != null) {
				String[] str = line.split(";");
				PayorderVO payorderVO = new PayorderVO(str[0],
						Double.parseDouble(str[1]), str[2], str[3], str[4],
						str[5]);
				payorderlist.add(payorderVO);
			}

			reader.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return payorderlist;
	}

	@Override
	public double[] profit(ArrayList<PayorderVO> pay,
			ArrayList<PayeeorderVO> payee) {
		double res[] = new double[3];

		double totalPay = 0;
		for (PayorderVO pv : pay) {
			totalPay += pv.getMoney();
		}

		double totalPayee = 0;
		for (PayeeorderVO pe : payee) {
			totalPayee += 0;
		}

		res[0] = totalPay;
		res[1] = totalPayee;
		res[2] = totalPay + totalPayee;

		return res;
	}

	@Override
	public void excel(String date, double income, double outcome, double benefit) {
		// TODO Auto-generated method stub

	}

}