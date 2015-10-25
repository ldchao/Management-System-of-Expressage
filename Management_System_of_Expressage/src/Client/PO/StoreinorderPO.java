import java.io.Serializable;
//StoreinorderPO（入库单）类包含快递编号、入库日期、目的地、区号、排号、架号、位号、审批状态。
public class StoreinorderPO implements Serializable {

	String order_number;
	String date;
	String offnum;
	int qu;
	int pai;
	int wei;
	int jia;
	int check_state;

	public StoreinorderPO(String order_number, String date, String offnum,
			int qu, int pai, int wei, int jia, int check_state) {
		super();
		this.order_number = order_number;
		this.date = date;
		this.offnum = offnum;
		this.qu = qu;
		this.pai = pai;
		this.wei = wei;
		this.jia = jia;
		this.check_state = check_state;
	}

	public String getOrder_number() {
		return order_number;
	}

	public void setOrder_number(String order_number) {
		this.order_number = order_number;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getOffnum() {
		return offnum;
	}

	public void setOffnum(String offnum) {
		this.offnum = offnum;
	}

	public int getQu() {
		return qu;
	}

	public void setQu(int qu) {
		this.qu = qu;
	}

	public int getPai() {
		return pai;
	}

	public void setPai(int pai) {
		this.pai = pai;
	}

	public int getWei() {
		return wei;
	}

	public void setWei(int wei) {
		this.wei = wei;
	}

	public int getJia() {
		return jia;
	}

	public void setJia(int jia) {
		this.jia = jia;
	}

	public int getCheck_state() {
		return check_state;
	}

	public void setCheck_state(int check_state) {
		this.check_state = check_state;
	}

}
