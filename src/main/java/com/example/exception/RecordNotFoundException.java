package com.example.exception;

public class RecordNotFoundException extends RuntimeException {
	public RecordNotFoundException(String s) {
		super(s);
	}
}