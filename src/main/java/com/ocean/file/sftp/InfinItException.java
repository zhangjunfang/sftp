package com.ocean.file.sftp;

public class InfinItException extends Exception {

	private static final long serialVersionUID = -1411132007365140298L;

	public InfinItException() {
		super();
	}

	public InfinItException(String message) {
		super(message);
	}

	public InfinItException(String message, Throwable cause) {
		super(message, cause);
	}

	public InfinItException(Throwable cause) {
		super(cause);
	}
}