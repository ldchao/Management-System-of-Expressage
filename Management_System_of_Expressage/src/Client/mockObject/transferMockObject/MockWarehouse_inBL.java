package Client.mockObject.transferMockObject;

import java.util.ArrayList;

import javax.swing.text.StyledEditorKit.ForegroundAction;

import Client.businesslogic.storebl.Warehouse_inBL;

public class MockWarehouse_inBL extends Warehouse_inBL{
	
	
	String[][][][] id;
	ArrayList<String> Idlist;
	
	MockWarehouse_inBL(){	
		id=new String[3][4][3][5];
		for(int i=0;i<3;i++){
			for (int j = 0; j < 4; j++) {
				for (int j2 = 0; j2 <3; j2++) {
					for (int k = 0; k < 5; k++) {
						id[i][j][j2][k]="0000000000";
					}
				}
			}						
		}
	}

	public ArrayList<String> getId(int[][][][] location){
		
        Idlist=new ArrayList<String> ();
		
		for(int i=0;i<3;i++){
			for (int j = 0; j < 4; j++) {
				for (int j2 = 0; j2 <3; j2++) {
					for (int k = 0; k < 5; k++) {
						if(location[i][j][j2][k]==1)
						Idlist.add(id[i][j][j2][k]);
					}
				}
			}						
		}
		return Idlist;
		
	}
}
