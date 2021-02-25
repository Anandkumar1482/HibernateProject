package com.springjpa.JpaHibernate.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "ITTech")
public class Technology {

	@Id
	private int tid;
	private String tname;
	private String tversion;

	public Technology() {
	}

	public Technology(int tid, String tname, String tversion) {

		this.tid = tid;
		this.tname = tname;
		this.tversion = tversion;
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

	public String getTversion() {
		return tversion;
	}

	public void setTversion(String tversion) {
		this.tversion = tversion;
	}

	@Override
	public String toString() {
		return "Technology [tid=" + tid + ", tname=" + tname + ", tversion=" + tversion + "]";
	}

}
