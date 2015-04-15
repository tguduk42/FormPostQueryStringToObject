package com.entity;

public class Person {
  String userName;
  String Id;
  String Password;
 
public String getUserName() {
	return userName;
}
public void setUserName(String userName) {
	this.userName = userName;
}
public String getId() {
	return Id;
}
public void setId(String id) {
	Id = id;
}
public String getPassword() {
	return Password;
}
public void setPassword(String password) {
	Password = password;
}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		String result="Password : "+getPassword()+" UserName : "+getUserName()+" Id : "+getId();
		return result;
	}

}
