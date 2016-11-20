

import java.util.ArrayList;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean(name="Zainteresowania")
@RequestScoped
public class Zainteresowania {
	
	private ArrayList zainteresowanie;

	public ArrayList getZainteresowanie() {
		return zainteresowanie;
	}

	public void setZainteresowanie(ArrayList zainteresowanie) {
		this.zainteresowanie = zainteresowanie;
	}

	
	
	
	
	
}
