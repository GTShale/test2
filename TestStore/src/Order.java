import lombok.Getter;
import lombok.Setter;

public class Order {
	@Getter @Setter private long id;
	@Getter @Setter private boolean created;
	@Getter @Setter private int statusId;
	@Getter @Setter private int[] lastChanged;
	@Getter @Setter private int totalPrice;
}
