package nju.edu.VO;

public class StoreLocationVO {

	String qu;  
	int pai;
	int wei;
	int jia;
	
	public StoreLocationVO(String qu, int pai, int jia, int wei) {
		super();
		this.qu = qu;
		this.pai = pai;
		this.wei = wei;
		this.jia = jia;
	}

	public String getQu() {
		return qu;
	}

	public int getPai() {
		return pai;
	}

	public int getWei() {
		return wei;
	}

	public int getJia() {
		return jia;
	}

}
