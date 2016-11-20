import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean(name="email")
@RequestScoped
public class Email {

	private String email;
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMessage() {
		if(getEmail()==null)
			return "";
		if(isValidEmailAddress(getEmail()))
			return "Poprawny email";
		else
			return "Niepoprawny email. Popraw";
	}
	
	public static boolean isValidEmailAddress(String email) {
		   for(int i=0; i<email.length(); i++)
		   {
			   if(email.charAt(i)=='@')
			   {
				   return true;
			   }
		   }
		   return false;
		}
	
	
}
