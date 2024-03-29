package com.pet.model;

public class ReservationVO {
	
	private int num;
	private String username;
	private String pettype;
	private double petweight;
	private int petcount;
	private String petinfo;
	private String roomname;
	private String startdate;
	private String enddate;
	private String resdate;
	private int price;
	private int resnum;
	private int condition;
	private String businesscode;
	
	
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPettype() {
		return pettype;
	}
	public void setPettype(String pettype) {
		this.pettype = pettype;
	}
	public double getPetweight() {
		return petweight;
	}
	public void setPetweight(double petweight) {
		this.petweight = petweight;
	}
	public int getPetcount() {
		return petcount;
	}
	public void setPetcount(int petcount) {
		this.petcount = petcount;
	}
	public String getPetinfo() {
		return petinfo;
	}
	public void setPetinfo(String petinfo) {
		this.petinfo = petinfo;
	}
	public String getRoomname() {
		return roomname;
	}
	public void setRoomname(String roomname) {
		this.roomname = roomname;
	}
	public String getStartdate() {
		return startdate;
	}
	public void setStartdate(String startdate) {
		this.startdate = startdate;
	}
	public String getEnddate() {
		return enddate;
	}
	public void setEnddate(String enddate) {
		this.enddate = enddate;
	}
	public String getResdate() {
		return resdate;
	}
	public void setResdate(String resdate) {
		this.resdate = resdate;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getResnum() {
		return resnum;
	}
	public void setResnum(int resnum) {
		this.resnum = resnum;
	}
	public int getCondition() {
		return condition;
	}
	public void setCondition(int condition) {
		this.condition = condition;
	}
	public String getBusinesscode() {
		return businesscode;
	}
	public void setBusinesscode(String businesscode) {
		this.businesscode = businesscode;
	}
	
	@Override
	public String toString() {
		return "ReservationVO [num=" + num + ", username=" + username + ", pettype=" + pettype + ", petweight="
				+ petweight + ", petcount=" + petcount + ", petinfo=" + petinfo + ", roomname=" + roomname
				+ ", startdate=" + startdate + ", enddate=" + enddate + ", resdate=" + resdate + ", price=" + price
				+ ", resnum=" + resnum + ", condition=" + condition + ", businesscode=" + businesscode + "]";
	}
		
	

	
}
