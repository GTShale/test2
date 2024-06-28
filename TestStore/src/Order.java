import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Order {
	 private long id;
	 private boolean created;
	 private int statusId;
	 private int[] lastChanged;
	 private int totalPrice;
	
	public String getUserAddress(UserAddress userAddress) {
		String UserAddress = userAddress.getAddress();
		return UserAddress;
	}
	
	public String getPhoneNumber(UserPhoneNumber userPhoneNumber) {	
        return userPhoneNumber.getPhoneNumber();
	} 
}
