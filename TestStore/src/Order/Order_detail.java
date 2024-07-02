import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Order_detail {
	private long id;
	private int quantity;
	private int price;
	
	public long getOrderId(Order order) {
		return order.getId();
	}
	
	public long getGoodsId(Goods goods) {
		return goods.getId();
	}
	
}
