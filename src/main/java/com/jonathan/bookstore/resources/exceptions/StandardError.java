package com.jonathan.bookstore.resources.exceptions;

import lombok.Data;

@Data
public class StandardError {

	private Long timestamp;
	private Integer status;
	private String error;

	public StandardError() {
		super();
	}

	public StandardError(Long timestamp, Integer status, String error) {
		super();
		this.timestamp = timestamp;
		this.status = status;
		this.error = error;
	}

}
