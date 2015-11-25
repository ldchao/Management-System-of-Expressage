package nju.edu.businesslogic.listinbl;

import nju.edu.VO.OrderVO;
import nju.edu.businesslogicservice.listinblservice.ListinBLService;
import nju.edu.businesslogic.checklistbl.ListinInfo;
import State.ExpressType;
import State.PackageType;

public class Listinbl implements ListinBLService,nju.edu.businesslogic.checklistbl.ListinInfo{

	@Override
	public void addOrder(OrderVO vo) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public double getTotalMoney(String address1, String address2, String text, String text2, String text3, ExpressType express,
			PackageType pack) {
		// TODO Auto-generated method stub
		double result=0;
		return result;
	}

	protected double PackPrice(int pack) {
		// TODO Auto-generated method stub
		if(pack==1){
			return 5;
		}else if(pack==2){
			return 10;
		}else{
			return 15;
		}
	}

	protected double ExpressPrice(int express) {
		// TODO Auto-generated method stub
		if(express==1){
			return 5;
		}else if(express==2){
			return 15;
		}else{
			return 30;
		}

	}

	protected double WeightPrice(int length, int width, int height) {
		// TODO Auto-generated method stub
		if(length*width*height>50000){
			return length*width*height/5000;
		}else{
			return 10;
		}
	}

	@Override
	public String getTotalTime(String address1, String address2, ExpressType express) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void endAddOrder() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public OrderVO getOrder(String id) {
		// TODO Auto-generated method stub
		return null;
	}

}
