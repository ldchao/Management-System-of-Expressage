package Client.businesslogic.billbl;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;

import Client.VO.AccountVO;
import Client.VO.StartinfoVO;
import Client.businesslogicservice.billblservice.BillBLService;

public class BillBL implements BillBLService {

	@Override
	public void addBill(String institution, String staff, String vehicle,
			String store, String account, String date, String creator) {
		// TODO Auto-generated method stub

	}

	@Override
	public ArrayList<StartinfoVO> checkBill() {
		ArrayList<StartinfoVO> billist = new ArrayList<>();

		// 读取Account.txt，并显示到表格中
		File billfile = new File("DataBase/Startinfo.txt");
		try {
			BufferedReader reader = new BufferedReader(new FileReader(billfile));
			String line;
			int i = 0;
			while ((line = reader.readLine()) != null) {
				String[] str = line.split(";");
				StartinfoVO startinfoVO = new StartinfoVO(str[0], str[1],
						str[2], str[3], str[4], str[5]);
				billist.add(startinfoVO);
			}

			reader.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return billist;
	}

}
