package nju.edu.businesslogicservice.transferblservice;

import java.util.ArrayList;

public interface StoreinInfo {

	//���ݿ�λ�õ���Ӧλ�õĶ������
	
	//�õ�����������ת���ĵĶ������
	public ArrayList<String> getId(String qu,int pai,int[] jia);
	
	//�õ���������Ӫҵ���Ķ������
	public ArrayList<String> getId(int jia,int[] wei);
}
