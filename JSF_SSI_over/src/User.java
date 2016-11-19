import java.util.Arrays;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name="User")
@SessionScoped
public class User {
	
	private String login;
	private String haslo;
	private String plec;
	private String miasto;
	
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getHaslo() {
		return haslo;
	}
	public void setHaslo(String haslo) {
		this.haslo = haslo;
	}
	public String getPlec() {
		return plec;
	}
	public void setPlec(String plec) {
		this.plec = plec;
	}
	public String getMiasto() {
		return miasto;
	}
	public void setMiasto(String miasto) {
		this.miasto = miasto;
	}

}
