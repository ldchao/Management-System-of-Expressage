package Client.VO;

import java.io.Serializable;

public class AccountVO implements Serializable {

	private String name;
	private String money;
	private String date;
	private String creator;
	
	public AccountVO(String name,String money,String date,String creator){
		super();
		this.name = name;
		this.money = money;
		this.date = date;
		this.creator = creator;
	}
	
	public String getAcName(){
		return this.name;
	}
	
	public String getMoney(){
		return this.money;
	}
	
	public String getDate(){
		return this.date;
	}
	
	public String getCreator(){
		return this.creator;
	}
	
	public void setAcName(String name){
		this.name = name;
	}
	
	public void setMoney(String money){
		this.money = money;
	}
	
	public void setDate(String date){
		this.date = date;
	}
	
	public void setCreator(String creator){
		this.creator = creator;
	}
}
