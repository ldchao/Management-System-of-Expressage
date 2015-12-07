package ExcelWriter;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.JFileChooser;

public class ExcelWriter {

	// fileName是导出文件的名称，注意不加保存格式的后缀
	// list是要写入表格的内容，每列用逗号隔开
	public static void Writer(String fileName, ArrayList<String> list) {

		JFileChooser chooser = new JFileChooser();
		chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
		chooser.setApproveButtonText("保存");
		chooser.showSaveDialog(null);
		String path = chooser.getSelectedFile().getPath();

		// 写文件
		File file = new File(path + "/" + fileName + ".csv");
		try {
			FileWriter writer = new FileWriter(file);

			for (String line : list) {
				writer.write(line + "\n");
			}

			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
