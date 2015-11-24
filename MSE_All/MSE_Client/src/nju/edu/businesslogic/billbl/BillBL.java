package nju.edu.businesslogic.billbl;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;

import nju.edu.VO.AccountVO;
import nju.edu.VO.StartinfoVO;
import nju.edu.businesslogicservice.billblservice.BillBLService;

public class BillBL implements BillBLService {

	@Override
	public void addBill(String name, String account, String organization,
			String staff, String vehicle, String store) {
		
		ArrayList<String> list = new ArrayList<String>();
		File billfile = new File("DataBase/Startinfo.txt");
		try {
			BufferedReader reader = new BufferedReader(new FileReader(billfile));
			String line;
			while ((line = reader.readLine()) != null)
				list.add(line);

			reader.close();
			
			list.add(name+";"+account+";"+organization+";"+staff+";"+vehicle+";"+store);

			FileWriter writer = new FileWriter(billfile);
			for (String str : list) {
				writer.write(str + "\n");
			}
			writer.close();

		} catch (Exception ex) {
			ex.printStackTrace();
		}

	}

	@Override
	public ArrayList<StartinfoVO> checkBill() {
		ArrayList<StartinfoVO> billist = new ArrayList<>();

		// 读取Account.txt，并显示到表格中
		File billfile = new File("DataBase/Startinfo.txt");
		try {
			BufferedReader reader = new BufferedReader(new FileReader(billfile));
			String line;
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
