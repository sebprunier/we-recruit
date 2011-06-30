package com.podprogramming.jobs.werecruit.model;

import java.io.Serializable;

public class Jug implements Serializable {

	private static final long serialVersionUID = -144723763743858130L;

	private String name;

	private String logoUrl;

	private String webSiteUrl;

	private String xPosition;

	private String yPosition;

	public Jug() {
	}

	public Jug(String name, String logoUrl, String webSiteUrl,
			String xPosition, String yPosition) {
		this();
		this.name = name;
		this.logoUrl = logoUrl;
		this.webSiteUrl = webSiteUrl;
		this.xPosition = xPosition;
		this.yPosition = yPosition;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLogoUrl() {
		return logoUrl;
	}

	public void setLogoUrl(String logoUrl) {
		this.logoUrl = logoUrl;
	}

	public String getWebSiteUrl() {
		return webSiteUrl;
	}

	public void setWebSiteUrl(String webSiteUrl) {
		this.webSiteUrl = webSiteUrl;
	}

	public String getxPosition() {
		return xPosition;
	}

	public void setxPosition(String xPosition) {
		this.xPosition = xPosition;
	}

	public String getyPosition() {
		return yPosition;
	}

	public void setyPosition(String yPosition) {
		this.yPosition = yPosition;
	}

}
