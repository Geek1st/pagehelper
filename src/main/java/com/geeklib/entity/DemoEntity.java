package com.geeklib.entity;

import java.util.Date;

import org.apache.ibatis.type.Alias;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Alias("f_userinfo")
public class DemoEntity {

	private String USERCODE;
	private String LOGINNAME;
	private String UserName;
	private String USERDESC;
	private String RegEmail;
	@JsonFormat(pattern = "yyyy-MM-dd")  
	private Date updateDate;

	public String getUSERCODE() {
		return USERCODE;
	}

	public void setUSERCODE(String uSERCODE) {
		USERCODE = uSERCODE;
	}

	public String getLOGINNAME() {
		return LOGINNAME;
	}

	public void setLOGINNAME(String lOGINNAME) {
		LOGINNAME = lOGINNAME;
	}

	public String getUserName() {
		return UserName;
	}

	public void setUserName(String userName) {
		UserName = userName;
	}

	public String getUSERDESC() {
		return USERDESC;
	}

	public void setUSERDESC(String uSERDESC) {
		USERDESC = uSERDESC;
	}

	public String getRegEmail() {
		return RegEmail;
	}

	public void setRegEmail(String regEmail) {
		RegEmail = regEmail;
	}

	public Date getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}

}
