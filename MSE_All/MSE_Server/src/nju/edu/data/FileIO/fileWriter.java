package nju.edu.data.FileIO;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class fileWriter {

	// 传入参数为文件路径和 需要写入的 arraylist,注意！覆盖为false，在最后插入为true
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

}
