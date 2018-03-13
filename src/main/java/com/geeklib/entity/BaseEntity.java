package com.geeklib.entity;

import java.awt.List;

public class BaseEntity extends List{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	protected int offset;
	protected int limit;
	protected long page;

	public int getOffset() {
		return offset;
	}

	public void setOffset(int offset) {
		this.offset = offset;
	}

	public int getLimit() {
		return limit;
	}

	public void setLimit(int limit) {
		this.limit = limit;
	}

	public  long getPage() {
		return page;
	}

	public void setPage(long page) {
		this.page = page;
	}

}
