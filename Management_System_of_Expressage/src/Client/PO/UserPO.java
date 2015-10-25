package Client.PO;
import java.io.Serializable;


public class UserPO implements Serializable {
	String userName;
	String userKey;
	String userLimit;
	
	public UserPO (String name,String key,String limit){
		userName = name;
		userKey = key;
		userLimit = limit;
	}
	
	public String getName(){
		return userName;
	}
	
	public String getKey(){
		return userKey;
	}
	
	public String getLimit(){
		return userLimit;
	}

}
