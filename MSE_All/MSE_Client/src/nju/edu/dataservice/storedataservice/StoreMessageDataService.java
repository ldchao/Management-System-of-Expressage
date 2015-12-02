package nju.edu.dataservice.storedataservice;

import java.rmi.Remote;
import java.rmi.RemoteException;

import PO.StorePO;

public interface StoreMessageDataService extends Remote{
	    //���ļ��ж�ȡ��ǰ���µĿ����Ϣ������ֵ������ֵ������λ�����浥�ݣ�
        public StorePO getStoreMessage()throws RemoteException;
        //�ڲֿ������Ա�˳�ʱ����ǰ��Ϣ�洢���ļ���
        public void saveStoreMessage(StorePO sp)throws RemoteException;
}
