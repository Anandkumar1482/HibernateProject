package com.hibernate.HibernateProject.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "tech")
public class Techi {

	@Id
	private int tid;
	private String tname;
	private String course;

	public Techi() {

	}

	public Techi(int tid, String tname, String course) {
		this.tid = tid;
		this.tname = tname;
		this.course = course;
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

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	@Override
	public String toString() {
		return "Techi [tid=" + tid + ", tname=" + tname + ", course=" + course + "]";
	}

}
