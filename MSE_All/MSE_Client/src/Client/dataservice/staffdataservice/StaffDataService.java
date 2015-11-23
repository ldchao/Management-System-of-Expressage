package Client.dataservice.staffdataservice;

import java.util.ArrayList;

import PO.StaffPO;

public interface StaffDataService {
	public ArrayList<StaffPO> gets();
	
	public StaffPO get(String name);
	
	public void insert(StaffPO po);
	
	public void delete(StaffPO po);
	
	public void update(StaffPO po);
	
}
