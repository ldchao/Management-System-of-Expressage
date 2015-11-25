package nju.edu.data.FileIO;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;

public class fileReader {

	// 传入参数为文件路径，返回 arraylist
	public static ArrayList<String> Reader(String path) {
		
		ArrayList<String> list = new ArrayList<>();
		File file = new File(path);
		try {
			BufferedReader reader = new BufferedReader(new FileReader(file));
			String line;
			while ((line = reader.readLine()) != null)
				list.add(line);

			reader.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return list;
	}
}
