package com.manab.springdatacouchbase.core.exception;

/**
 * Api exception
 * 
 */
public class ApiException extends BaseRuntimeException {

	private static final long serialVersionUID = 1L;

	private ErrorType errorType;

	public ApiException(ErrorType errorStatus) {
		super(errorStatus.getMessage());
		this.errorType = errorStatus;
	}

	@Override
	public Integer getCode() {
		return this.errorType.getCode();
	}

}
