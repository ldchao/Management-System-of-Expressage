package nju.edu.data.policydata;

import java.util.ArrayList;

import nju.edu.data.FileIO.fileWriter;

public class Temporary {
	public static void main(String[] args){
		String[] city={"南京鼓楼区","南京玄武区","南京建邺区","南京秦淮区","南京栖霞区","南京六合区","南京浦口区","南京江宁区","南京高淳区","南京溧水区",
				"北京宣武区","北京东城区","北京西城区","北京崇文区","北京朝阳区","北京石景山区","北京海淀区","北京丰台区","北京房山区","北京大兴区","北京通州区","北京门头沟区","北京昌平区","北京顺义区","北京怀柔区","北京密云县","北京平谷区","北京延庆县","北京大学城","北京中关村",
				"上海黄浦区","上海徐汇区","上海长宁区","上海静安区","上海普陀区","上海虹口区","上海杨浦区","上海闵行区","上海宝山区","上海嘉定区","上海浦东新区","上海金山区","上海松江区","上海青浦区","上海奉贤区","上海崇明县","上海工业区","上海开发区","上海外贸区","上海高新区",
				"广州越秀区","广州天河区","广州白云区","广州荔湾区","广州萝岗区","广州黄埔区","广州海珠区","广州番禺区","广州花都区","广州南沙区","广州从化市","广州增城市","广州东山区","广州开发区","广州高新区"};
		fileWriter fileWriter=new fileWriter();
		ArrayList<String> arrayList=new ArrayList<>();
		for(int i=0;i<city.length;i++){
			arrayList.add("");
			for(int j=0;j<city.length;j++){
				arrayList.set(i, arrayList.get(i)+"10"+","+"0.1"+";");
			}
		}
		fileWriter.Writer("Database/Constant.txt", arrayList, false);
	}
}
