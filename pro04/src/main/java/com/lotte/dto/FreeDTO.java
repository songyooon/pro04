package com.lotte.dto;

public class FreeDTO {

	

private int bno;
private String title;
private String content;
private String nickname;
private String regdate;
private int visited;
private int rec;

public int getBno() {
	return bno;
}
public void setBno(int bno) {
	this.bno = bno;
}
public String getTitle() {
	return title;
}
public void setTitle(String title) {
	this.title = title;
}
public String getContent() {
	return content;
}
public void setContent(String content) {
	this.content = content;
}
public String getNickname() {
	return nickname;
}
public void setNickname(String nickname) {
	this.nickname = nickname;
}
public String getRegdate() {
	return regdate;
}
public void setRegdate(String regdate) {
	this.regdate = regdate;
}
public int getVisited() {
	return visited;
}
public void setVisited(int visited) {
	this.visited = visited;
}
public int getRec() {
	return rec;
}
public void setRec(int rec) {
	this.rec = rec;
}

@Override
public String toString() {
	return "FreeDTO [bno=" + bno + ", title=" + title + ", content=" + content + ", nickname=" + nickname + ", regdate="
			+ regdate + ", visited=" + visited + ", rec=" + rec + "]";
}



	
	
}
