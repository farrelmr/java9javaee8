package com.javabullets.javaee8;

import java.time.LocalDateTime;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named
@RequestScoped
public class HomeController {

	private static final long serialVersionUID = 1L;

	private LocalDateTime todayDateTime;

	@PostConstruct
	public void init() {
		todayDateTime = LocalDateTime.now();
	}

	public LocalDateTime getTodayDateTime() {
		return todayDateTime;
	}

	public void setTodayDateTime(LocalDateTime todayDateTime) {
		this.todayDateTime = todayDateTime;
	}

}
