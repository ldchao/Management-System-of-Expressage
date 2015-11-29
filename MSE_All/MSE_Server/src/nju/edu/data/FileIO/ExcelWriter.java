package nju.edu.data.FileIO;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.JFileChooser;

public class ExcelWriter {

	public static void Writer(String fileName, ArrayList<String> list) {

		JFileChooser chooser = new JFileChooser();
		chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
		chooser.setApproveButtonText("±£´æ");
		chooser.showSaveDialog(null);
		String path = chooser.getSelectedFile().getPath();

		// Ð´ÎÄ¼þ
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
