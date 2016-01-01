package nju.edu.businesslogicservice.storeblservice;

public interface GetFreeLocationInfo {
    
	//得到发往外市中转中心的仓库空闲位置
	
	public int getWei(int jia);
	//得到发往本市营业厅的仓库空闲位置
	public int[] getJia_Wei(String qu,int pai);
	
}
