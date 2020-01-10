package com.search.to;

public class Team {
	private int tid;
	private String tname;
	
	public Team() {
		super();
	}
	public Team(int tid, String tname) {
		super();
		this.tid = tid;
		this.tname = tname;
	}
	
	public int getTid() {
		return tid;
	}
	public void setTid(int tid) {
		this.tid = tid;
	}
	public String getTname() {
		return tname;
	}
	public void setTname(String tname) {
		this.tname = tname;
	}
}
