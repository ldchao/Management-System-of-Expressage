package nju.edu.businesslogicservice.storeblservice;

public interface StoreinUpdateInfo {
	//入库时，更新当前库存的信息
     public void storein_update(String qu,int pai,int jia,int wei,String orderNum);
}
