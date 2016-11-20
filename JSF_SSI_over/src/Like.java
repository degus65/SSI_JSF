import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.event.ValueChangeEvent;

@ManagedBean(name="like")
@RequestScoped
public class Like {
	
	private String like;
	private String message;

	public String getLike() {
		return like;
	}

	public void setLike(String like) {
		this.like = like;
	}
	
	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public void check(ValueChangeEvent e){
		String txt=e.getNewValue().toString();
		if(txt.equals("Tak"))
			setMessage("Fajnie :) Dziekujemy za opinie");
		else if(txt.equals("Nie"))
			setMessage("Przykro nam :( Dziekujemy za opinie");
		else
			setMessage("");

	}
	
	

}
