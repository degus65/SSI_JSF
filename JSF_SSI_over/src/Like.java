import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.event.ValueChangeEvent;

@ManagedBean(name="like")
@RequestScoped
public class Like {
	
	private String like;
	private String message;
	private String opinion;

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
	
	public String getOpinion() {
		return opinion;
	}

	public void setOpinion(String opinion) {
		this.opinion = opinion;
	}
	
	public String getFeedback(){
		if(getOpinion()==null)
			return "";
		if(getOpinion().length()>50)
			return "Za duzo znakow (max. 50)";	
		else if(getOpinion().length()<20)
			return "Za malo znakow (min. 20)";
		else
			return "Dziekujemy za przeslanie opini";
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
