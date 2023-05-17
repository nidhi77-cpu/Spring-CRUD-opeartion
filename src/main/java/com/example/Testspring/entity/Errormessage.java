package com.example.Testspring.entity;

import org.springframework.http.HttpStatus;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor

public class Errormessage {

	public Errormessage(HttpStatus notFound, String message2) {
		// TODO Auto-generated constructor stub
	}
	private HttpStatus status;
	private String message;
}
