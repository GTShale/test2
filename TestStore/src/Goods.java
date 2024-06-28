import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Goods {
	private long id;
	private String name;
	private String discription;
	private int count;
	private int price;
	private long categoryId;
	private boolean isDeleted;
}
