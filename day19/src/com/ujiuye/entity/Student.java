package com.ujiuye.entity;

public class Student {

  private int sid;
  private String sname;
  private String gender;
  private String sbir;
  private String hobby;
  private String file;


  public int getSid() {
    return sid;
  }

  public void setSid(int sid) {
    this.sid = sid;
  }


  public String getSname() {
    return sname;
  }

  public void setSname(String sname) {
    this.sname = sname;
  }


  public String getGender() {
    return gender;
  }

  public void setGender(String gender) {
    this.gender = gender;
  }


  public String getSbir() {
    return sbir;
  }

  public void setSbir(String sbir) {
    this.sbir = sbir;
  }


  public String getHobby() {
    return hobby;
  }

  public void setHobby(String hobby) {
    this.hobby = hobby;
  }


  public String getFile() {
    return file;
  }

  public void setFile(String file) {
    this.file = file;
  }

  public Student() {
  }

  public Student(int sid, String sname, String gender, String sbir, String hobby, String file) {
    this.sid = sid;
    this.sname = sname;
    this.gender = gender;
    this.sbir = sbir;
    this.hobby = hobby;
    this.file = file;
  }
}
