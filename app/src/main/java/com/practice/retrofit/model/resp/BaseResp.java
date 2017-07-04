package com.practice.retrofit.model.resp;

public class BaseResp<T> {
	private int errno = -1;
	private String error;
	private String dataType;
	private String dataStruct;

	public boolean isSuccess()
	{
		return errno == 0;
	}
	private T data;

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}


	public int getErrno() {
		return errno;
	}

	public void setErrno(int errno) {
		this.errno = errno;
	}

	public String getError() {
		return error;
	}

	public void setError(String error) {
		this.error = error;
	}

	public String getDataType() {
		return dataType;
	}

	public void setDataType(String dataType) {
		this.dataType = dataType;
	}

	public String getDataStruct() {
		return dataStruct;
	}

	public void setDataStruct(String dataStruct) {
		this.dataStruct = dataStruct;
	}


}
