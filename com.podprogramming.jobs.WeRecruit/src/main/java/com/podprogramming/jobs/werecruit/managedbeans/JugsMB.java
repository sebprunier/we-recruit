package com.podprogramming.jobs.werecruit.managedbeans;

import java.io.Serializable;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import com.podprogramming.jobs.werecruit.model.Jug;
import com.podprogramming.jobs.werecruit.services.JugService;

@ManagedBean
@SessionScoped
public class JugsMB implements Serializable {

	private static final long serialVersionUID = 8458977273226149762L;

	private String selectedJugName = "Aucun JUG ici :-)";
	private String selectedJugWebSiteUrl = "http://fr.wikipedia.org/wiki/Pole_Nord";
	private String selectedJugXPosition = "83.638106";
	private String selectedJugYPosition = "-34.804687";

	public List<Jug> getJugs() {
		return new JugService().getJugs();
	}

	public String getSelectedJugName() {
		return selectedJugName;
	}

	public void setSelectedJugName(String selectedJugName) {
		this.selectedJugName = selectedJugName;
	}

	public String getSelectedJugWebSiteUrl() {
		return selectedJugWebSiteUrl;
	}

	public void setSelectedJugWebSiteUrl(String selectedJugWebSiteUrl) {
		this.selectedJugWebSiteUrl = selectedJugWebSiteUrl;
	}

	public String getSelectedJugXPosition() {
		return selectedJugXPosition;
	}

	public void setSelectedJugXPosition(String selectedJugXPosition) {
		this.selectedJugXPosition = selectedJugXPosition;
	}

	public String getSelectedJugYPosition() {
		return selectedJugYPosition;
	}

	public void setSelectedJugYPosition(String selectedJugYPosition) {
		this.selectedJugYPosition = selectedJugYPosition;
	}

}
