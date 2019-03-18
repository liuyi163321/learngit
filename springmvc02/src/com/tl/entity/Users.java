package com.tl.entity;


public class Users {

  private long id;
  private String uname;
  private String uage;
  private java.sql.Date ubirth;
  private String usex;
  private String upass;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public String getUname() {
    return uname;
  }

  public void setUname(String uname) {
    this.uname = uname;
  }


  public String getUage() {
    return uage;
  }

  public void setUage(String uage) {
    this.uage = uage;
  }


  public java.sql.Date getUbirth() {
    return ubirth;
  }

  public void setUbirth(java.sql.Date ubirth) {
    this.ubirth = ubirth;
  }


  public String getUsex() {
    return usex;
  }

  public void setUsex(String usex) {
    this.usex = usex;
  }


  public String getUpass() {
    return upass;
  }

  public void setUpass(String upass) {
    this.upass = upass;
  }

}
