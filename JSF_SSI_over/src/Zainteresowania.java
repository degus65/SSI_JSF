package org.pk.ssi.managebeans;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;

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
