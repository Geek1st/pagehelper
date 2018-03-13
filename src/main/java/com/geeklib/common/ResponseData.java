package com.geeklib.common;

import com.github.pagehelper.PageInfo;

public class ResponseData<T> {

	protected int statusCode;
	protected int statusContent;
	protected PageInfo<T> pageInfo;

	public int getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}

	public int getStatusContent() {
		return statusContent;
	}

	public void setStatusContent(int statusContent) {
		this.statusContent = statusContent;
	}

	public PageInfo<T> getPageInfo() {
		return pageInfo;
	}

	public void setPageInfo(PageInfo<T> pageInfo) {
		this.pageInfo = pageInfo;
	}

}
