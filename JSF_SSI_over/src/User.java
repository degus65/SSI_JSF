import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;
import javax.faces.event.ValueChangeEvent;

@ManagedBean(name="User")
@ApplicationScoped
public class User {
	
	private String login;
	private String haslo;
	private String plec;
	private String miasto;
	private String wojewodztwo;
	
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
	
	public String getWojewodztwo() {
		return wojewodztwo;
	}
	public void setWojewodztwo(String wojewodztwo) {
		this.wojewodztwo = wojewodztwo;
	}
	public void setState(ValueChangeEvent e){
		String city=e.getNewValue().toString();
		if(city.equals("Krakow"))
			setWojewodztwo("malopolskie");
		else if(city.equals("Warszawa"))
			setWojewodztwo("mazowieckie");
		else if(city.equals("Gdansk"))
			setWojewodztwo("pomorskie");
		else if(city.equals("Poznan"))
			setWojewodztwo("wielkopolskie");
	}

}
