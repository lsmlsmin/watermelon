package com.atit.app.vo;

public class UserVO {
	private long seqno;
	private String name;
	
	public long getSeqno() {
		return seqno;
	}
	public void setSeqno(long seqno) {
		this.seqno = seqno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "UserVO [seqno=" + seqno + ", name=" + name + "]";
	}

}
