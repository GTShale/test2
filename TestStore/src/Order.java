
public class Order {
	private long id;
	private boolean created;
	private int statusId;
	private int[] lastChanged;
	private int totalPrice;
	
	//ID
	public long getId() {
		return id;
	}
	public void setId(long newId) {
		this.id = newId;
	}
	
	//userId
	public void getUserId(User user) {
        long userId = user.getId();
	}
	
	//created
	public boolean getCreated() {
		return created;
	}
	public void setCreated(boolean newCreated) {
		this.created = newCreated;
	}
	
	//statusId
	public int getStatusId() {
		return statusId;
	}
	public void setStatusId(int newStatusId) {
		this.statusId = newStatusId;
	}
	
	//lastChanged
	public int[] getLastChanged() {
		return lastChanged;
	}
	public void setLastChanged(int[] newLastChanged) {
		this.lastChanged = newLastChanged;
	}
	
	//totalPrice
	public int getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(int newTotalPrice) {
		this.totalPrice = newTotalPrice;
	}
	
	//address
	public String getUserAddress(UserAddress userAddress) {
		String UserAddress = userAddress.getUserAddress();
		return UserAddress;
	}
	
	//phoneNumber
	public int getPhoneNumber(UserPhoneNumber userPhoneNumber) {	
            return userPhoneNumber.getPhoneNumber();
	}
	
}
