package com.app.scopes;

import java.io.Serializable;

import org.springframework.stereotype.Component;
@Component
public class OwnerBean implements Serializable {

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
