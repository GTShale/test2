import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Status {
	private long id;
	private String title;
	
	public long getLanguageId(Language language) {
		return language.getId();
	}

	
}
