package nju.edu.data.FileIO;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class fileWriter {

	// �������Ϊ�ļ�·���� ��Ҫд��� arraylist��String,ע�⣡����Ϊfalse����������Ϊtrue
	
	//д�������Ϣ����arraylist
	public static void Writer(String path, ArrayList<String> list, boolean cover) {
		File file = new File(path);

		try {
			FileWriter writer = new FileWriter(file, cover);
			for (String str : list)
				writer.write(str + "\n");

			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	//д��һ����Ϣ��������String
	public static void Writer(String path, String order, boolean cover) {
		File file = new File(path);

		try {
			FileWriter writer = new FileWriter(file, cover);			
	        writer.write(order + "\n");
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
