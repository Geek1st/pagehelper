package com.geeklib.entity;

import java.util.Date;

import org.apache.ibatis.type.Alias;

@Alias("m_cultureact_gzl")
public class DemoEntity {
	private int msgCode;
	private String sender;
	private Date sendeDate;
	private String mstTitle;
	private String imgfilename;

	public int getMsgCode() {
		return msgCode;
	}

	public void setMsgCode(int msgCode) {
		this.msgCode = msgCode;
	}

	public String getSender() {
		return sender;
	}

	public void setSender(String sender) {
		this.sender = sender;
	}

	public Date getSendeDate() {
		return sendeDate;
	}

	public void setSendeDate(Date sendeDate) {
		this.sendeDate = sendeDate;
	}

	public String getMstTitle() {
		return mstTitle;
	}

	public void setMstTitle(String mstTitle) {
		this.mstTitle = mstTitle;
	}

	public String getImgfilename() {
		return imgfilename;
	}

	public void setImgfilename(String imgfilename) {
		this.imgfilename = imgfilename;
	}

}
