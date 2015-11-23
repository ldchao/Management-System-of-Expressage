package PO;
import java.io.Serializable;

//StorePO���ֿ���Ϣ���������澯��ֵ������ֵ����λ�ÿ����Ϣ��
public class StorePO implements Serializable {

	double warn_value;
	double remind_value;
	int[][][][] location;

	public StorePO(double warn_value, double remind_value, int[][][][] location) {
		super();
		this.warn_value = warn_value;
		this.remind_value = remind_value;
		this.location = location;
	}

	public double getWarn_value() {
		return warn_value;
	}

	public void setWarn_value(double warn_value) {
		this.warn_value = warn_value;
	}

	public double getRemind_value() {
		return remind_value;
	}

	public void setRemind_value(double remind_value) {
		this.remind_value = remind_value;
	}

	public int[][][][] getLocation() {
		return location;
	}

	public void setLocation(int[][][][] location) {
		this.location = location;
	}

}
