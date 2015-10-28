package Client.BL_Driver.approveBLService_Driver;

import Client.businesslogicservice.approveblservice.ApproveBLService;

public class ApproveBLService_Driver {

	public void drive(ApproveBLService approveBLService){
		String type = "Approveorder";
		approveBLService.checkList(type);
		//approveBLService.editList(t);
		approveBLService.endApprove();
		approveBLService.showList(1, type);
	}
}
