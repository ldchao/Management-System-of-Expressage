package Client.VO;

public class ReceiverVO {

		//快递员及其电话和订单号
		String courier;
		String phoneOfcourier;
		String id;
		String time;
		
		//收件人信息
		String receiver;
		String address;
		String phone;
		String cellphone;
		String position;
		
		public ReceiverVO(String courier, String phoneOfcourier, String id, String time, String receiver, String address,
				String phone, String cellphone, String position) {
			super();
			this.courier = courier;
			this.phoneOfcourier = phoneOfcourier;
			this.id = id;
			this.time = time;
			this.receiver = receiver;
			this.address = address;
			this.phone = phone;
			this.cellphone = cellphone;
			this.position = position;
		}

		public String getCourier() {
			return courier;
		}

		public void setCourier(String courier) {
			this.courier = courier;
		}

		public String getPhoneOfcourier() {
			return phoneOfcourier;
		}

		public void setPhoneOfcourier(String phoneOfcourier) {
			this.phoneOfcourier = phoneOfcourier;
		}

		public String getId() {
			return id;
		}

		public void setId(String id) {
			this.id = id;
		}

		public String getTime() {
			return time;
		}

		public void setTime(String time) {
			this.time = time;
		}

		public String getReceiver() {
			return receiver;
		}

		public void setReceiver(String receiver) {
			this.receiver = receiver;
		}

		public String getAddress() {
			return address;
		}

		public void setAddress(String address) {
			this.address = address;
		}

		public String getPhone() {
			return phone;
		}

		public void setPhone(String phone) {
			this.phone = phone;
		}

		public String getCellphone() {
			return cellphone;
		}

		public void setCellphone(String cellphone) {
			this.cellphone = cellphone;
		}

		public String getPosition() {
			return position;
		}

		public void setPosition(String position) {
			this.position = position;
		}
}
