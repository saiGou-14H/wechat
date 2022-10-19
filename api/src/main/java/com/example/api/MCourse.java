package com.example.api;


public class MCourse {

  private long id;
  private String name;
  private long teaId;
  private String couType;
  private long integral;
  private String introduction;
  private long cataNum;
  private long collNum;
  private long recoNum;
  private long version;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public long getTeaId() {
    return teaId;
  }

  public void setTeaId(long teaId) {
    this.teaId = teaId;
  }


  public String getCouType() {
    return couType;
  }

  public void setCouType(String couType) {
    this.couType = couType;
  }


  public long getIntegral() {
    return integral;
  }

  public void setIntegral(long integral) {
    this.integral = integral;
  }


  public String getIntroduction() {
    return introduction;
  }

  public void setIntroduction(String introduction) {
    this.introduction = introduction;
  }


  public long getCataNum() {
    return cataNum;
  }

  public void setCataNum(long cataNum) {
    this.cataNum = cataNum;
  }


  public long getCollNum() {
    return collNum;
  }

  public void setCollNum(long collNum) {
    this.collNum = collNum;
  }


  public long getRecoNum() {
    return recoNum;
  }

  public void setRecoNum(long recoNum) {
    this.recoNum = recoNum;
  }


  public long getVersion() {
    return version;
  }

  public void setVersion(long version) {
    this.version = version;
  }

}
