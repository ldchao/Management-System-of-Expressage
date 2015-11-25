package PO;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class OrganizationNumPO {

	private Map<String, String> OrganizationNum_MAP = new HashMap<>();
	
	public OrganizationNumPO(){
		
		OrganizationNum_MAP.put("025", "南京中转中心");
		OrganizationNum_MAP.put("025001", "南京鼓楼区营业厅");
		OrganizationNum_MAP.put("025002", "南京玄武区营业厅");
		OrganizationNum_MAP.put("025003", "南京建邺区营业厅");
		OrganizationNum_MAP.put("025004", "南京秦淮区营业厅");
		OrganizationNum_MAP.put("025005", "南京栖霞区营业厅");
		OrganizationNum_MAP.put("025006", "南京六合区营业厅");
		OrganizationNum_MAP.put("025007", "南京浦口区营业厅");
		OrganizationNum_MAP.put("025008", "南京江宁区营业厅");
		OrganizationNum_MAP.put("025009", "南京高淳区营业厅");
		OrganizationNum_MAP.put("025010", "南京溧水区营业厅");
		OrganizationNum_MAP.put("010", "北京中转中心");
		OrganizationNum_MAP.put("010001", "北京宣武区营业厅");
		OrganizationNum_MAP.put("010002", "北京东城区营业厅");
		OrganizationNum_MAP.put("010003", "北京西城区营业厅");
		OrganizationNum_MAP.put("010004", "北京崇文区营业厅");
		OrganizationNum_MAP.put("010005", "北京朝阳区营业厅");
		OrganizationNum_MAP.put("010006", "北京石景山区营业厅");
		OrganizationNum_MAP.put("010007", "北京海淀区营业厅");
		OrganizationNum_MAP.put("010008", "北京丰台区营业厅");
		OrganizationNum_MAP.put("010009", "北京房山区营业厅");
		OrganizationNum_MAP.put("010010", "北京大兴区营业厅");
		OrganizationNum_MAP.put("010011", "北京通州区营业厅");
		OrganizationNum_MAP.put("010012", "北京门头沟区营业厅");
		OrganizationNum_MAP.put("010013", "北京昌平区营业厅");
		OrganizationNum_MAP.put("010014", "北京顺义区营业厅");
		OrganizationNum_MAP.put("010015", "北京怀柔区营业厅");
		OrganizationNum_MAP.put("010016", "北京密云县营业厅");
		OrganizationNum_MAP.put("010017", "北京平谷区营业厅");
		OrganizationNum_MAP.put("010018", "北京延庆县营业厅");
		OrganizationNum_MAP.put("010019", "北京大学城营业厅");
		OrganizationNum_MAP.put("010020", "北京中关村营业厅");
		OrganizationNum_MAP.put("021", "上海中转中心");
		OrganizationNum_MAP.put("021001", "上海黄浦区营业厅");
		OrganizationNum_MAP.put("021002", "上海徐汇区营业厅");		
		OrganizationNum_MAP.put("021003", "上海长宁区营业厅");		
		OrganizationNum_MAP.put("021004", "上海静安区营业厅");
		OrganizationNum_MAP.put("021005", "上海普陀区营业厅");
		OrganizationNum_MAP.put("021006", "上海虹口区营业厅");
		OrganizationNum_MAP.put("021007", "上海杨浦区营业厅");
		OrganizationNum_MAP.put("021008", "上海闵行区营业厅");
		OrganizationNum_MAP.put("021009", "上海宝山区营业厅");
		OrganizationNum_MAP.put("021010", "上海嘉定区营业厅");
		OrganizationNum_MAP.put("021011", "上海浦东新区营业厅");
		OrganizationNum_MAP.put("021012", "上海金山区营业厅");
		OrganizationNum_MAP.put("021013", "上海松江区营业厅");
		OrganizationNum_MAP.put("021014", "上海青浦区营业厅");
		OrganizationNum_MAP.put("021015", "上海奉贤区营业厅");
		OrganizationNum_MAP.put("021016", "上海崇明县营业厅");
		OrganizationNum_MAP.put("021017", "上海黄浦区第二营业厅");
		OrganizationNum_MAP.put("021018", "上海闵行区第二营业厅");
		OrganizationNum_MAP.put("021019", "上海静安区第二营业厅");
		OrganizationNum_MAP.put("021020", "上海徐汇区第二营业厅");
		OrganizationNum_MAP.put("020", "广州中转中心");
		OrganizationNum_MAP.put("020001", "广州越秀区营业厅");
		OrganizationNum_MAP.put("020002", "广州天河区营业厅");
		OrganizationNum_MAP.put("020003", "广州白云区营业厅");
		OrganizationNum_MAP.put("020004", "广州荔湾区营业厅");
		OrganizationNum_MAP.put("020005", "广州萝岗区营业厅");
		OrganizationNum_MAP.put("020006", "广州黄埔区营业厅");
		OrganizationNum_MAP.put("020007", "广州海珠区营业厅");
		OrganizationNum_MAP.put("020008", "广州番禺区营业厅");
		OrganizationNum_MAP.put("020009", "广州花都区营业厅");
		OrganizationNum_MAP.put("020010", "广州南沙区营业厅");
		OrganizationNum_MAP.put("020011", "广州从化市营业厅");
		OrganizationNum_MAP.put("020012", "广州增城市营业厅");
		OrganizationNum_MAP.put("020013", "广州东山区营业厅");
		OrganizationNum_MAP.put("020014", "广州越秀区第二营业厅");
		OrganizationNum_MAP.put("020015", "广州海珠区第二营业厅");
		
	}
	
	public String getName(String num){
		String result=null;
		for (Entry<String, String> entry : OrganizationNum_MAP.entrySet()) {
			String name = entry.getKey();
			if(num.equals(name))
			   result = entry.getValue();
		}
		return result;
	} 
}
