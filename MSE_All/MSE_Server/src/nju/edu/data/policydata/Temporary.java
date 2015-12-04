package nju.edu.data.policydata;

import java.util.ArrayList;

import nju.edu.data.FileIO.fileWriter;

public class Temporary {
	public static void main(String[] args){
		String[] city={"南京鼓楼区营业厅","南京玄武区营业厅","南京建邺区营业厅","南京秦淮区营业厅","南京栖霞区营业厅","南京六合区营业厅","南京浦口区营业厅","南京江宁区营业厅","南京高淳区营业厅","南京溧水区营业厅",
				"北京宣武区营业厅","北京东城区营业厅","北京西城区营业厅","北京崇文区营业厅","北京朝阳区营业厅","北京石景山区营业厅","北京海淀区营业厅","北京丰台区营业厅","北京房山区营业厅","北京大兴区营业厅","北京通州区营业厅","北京门头沟区营业厅","北京昌平区营业厅","北京顺义区营业厅","北京怀柔区营业厅","北京密云县营业厅","北京平谷区营业厅","北京延庆县营业厅","北京大学城营业厅","北京中关村营业厅",
				"上海黄浦区营业厅","上海徐汇区营业厅","上海长宁区营业厅","上海静安区营业厅","上海普陀区营业厅","上海虹口区营业厅","上海杨浦区营业厅","上海闵行区营业厅","上海宝山区营业厅","上海嘉定区营业厅","上海浦东新区营业厅","上海金山区营业厅","上海松江区营业厅","上海青浦区营业厅","上海奉贤区营业厅","上海崇明县营业厅","上海工业区营业厅","上海开发区营业厅","上海外贸区营业厅","上海高新区营业厅",
				"广州越秀区营业厅","广州天河区营业厅","广州白云区营业厅","广州荔湾区营业厅","广州萝岗区营业厅","广州黄埔区营业厅","广州海珠区营业厅","广州番禺区营业厅","广州花都区营业厅","广州南沙区营业厅","广州从化市营业厅","广州增城市营业厅","广州东山区营业厅","广州开发区营业厅","广州高新区营业厅"};
		fileWriter fileWriter=new fileWriter();
		ArrayList<String> arrayList=new ArrayList<>();
		for(int i=0;i<city.length;i++){
			for(int j=0;j<city.length;j++){
				arrayList.add(city[i]);
				arrayList.add(city[j]);
					arrayList.add("10");
					arrayList.add("0.1");
			}
		}
		fileWriter.Writer("Database/Constant.txt", arrayList, false);
	}
}
