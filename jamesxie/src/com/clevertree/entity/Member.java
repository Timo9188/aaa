package com.clevertree.entity;

import java.util.Date;

import org.apache.ibatis.type.Alias;
/**
 * 会员实体类
 * @author swl
 *
 */
@Alias("Member")
public class Member {
	private Integer id;//会员id
	private String memid;//会员号
	private String password;//密码
	private String name;//姓名
	private String address;//地址
	private String phone;//手机
	private String sex;//性别
	private String source;//信息来源
	private String guardian;//监护人
	private String clatype;//课程类型
	private String advisor;//课程顾问
	private Integer parcount;//亲子课程次数
	private Integer feacount;//特色课程次数
	private Date regdate;//注册日期
	private Integer swimcost;//游泳费用
	private Integer swimcount;//游泳次数
	private Integer pleasurecost;//游乐卡费用
	private Integer pleasurecount;//游乐卡次数
	private Date cladeadline;//课程截止期
	private String freezed;//冻结状态
	private Date freezedate;//冻结日期
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getMemid() {
		return memid;
	}
	public void setMemid(String memid) {
		this.memid = memid;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getGuardian() {
		return guardian;
	}
	public void setGuardian(String guardian) {
		this.guardian = guardian;
	}
	public String getClatype() {
		return clatype;
	}
	public void setClatype(String clatype) {
		this.clatype = clatype;
	}
	public String getAdvisor() {
		return advisor;
	}
	public void setAdvisor(String advisor) {
		this.advisor = advisor;
	}
	public Integer getParcount() {
		return parcount;
	}
	public void setParcount(Integer parcount) {
		this.parcount = parcount;
	}
	public Integer getFeacount() {
		return feacount;
	}
	public void setFeacount(Integer feacount) {
		this.feacount = feacount;
	}
	public Date getRegdate() {
		return regdate;
	}
	public void setRegdate(Date regdate) {
		this.regdate = regdate;
	}
	public Integer getSwimcost() {
		return swimcost;
	}
	public void setSwimcost(Integer swimcost) {
		this.swimcost = swimcost;
	}
	public Integer getSwimcount() {
		return swimcount;
	}
	public void setSwimcount(Integer swimcount) {
		this.swimcount = swimcount;
	}
	public Integer getPleasurecost() {
		return pleasurecost;
	}
	public void setPleasurecost(Integer pleasurecost) {
		this.pleasurecost = pleasurecost;
	}
	public Integer getPleasurecount() {
		return pleasurecount;
	}
	public void setPleasurecount(Integer pleasurecount) {
		this.pleasurecount = pleasurecount;
	}
	public Date getCladeadline() {
		return cladeadline;
	}
	public void setCladeadline(Date cladeadline) {
		this.cladeadline = cladeadline;
	}
	public String getFreezed() {
		return freezed;
	}
	public void setFreezed(String freezed) {
		this.freezed = freezed;
	}
	public Date getFreezedate() {
		return freezedate;
	}
	public void setFreezedate(Date freezedate) {
		this.freezedate = freezedate;
	}
	@Override
	public String toString() {
		return "Member [id=" + id + ", memid=" + memid + ", password=" + password + ", name=" + name + ", address="
				+ address + ", phone=" + phone + ", sex=" + sex + ", source=" + source + ", guardian=" + guardian
				+ ", clatype=" + clatype + ", advisor=" + advisor + ", parcount=" + parcount + ", feacount=" + feacount
				+ ", regdate=" + regdate + ", swimcost=" + swimcost + ", swimcount=" + swimcount + ", pleasurecost="
				+ pleasurecost + ", pleasurecount=" + pleasurecount + ", cladeadline=" + cladeadline + ", freezed="
				+ freezed + ", freezedate=" + freezedate + ", getId()=" + getId() + ", getMemid()=" + getMemid()
				+ ", getPassword()=" + getPassword() + ", getName()=" + getName() + ", getAddress()=" + getAddress()
				+ ", getPhone()=" + getPhone() + ", getSex()=" + getSex() + ", getSource()=" + getSource()
				+ ", getGuardian()=" + getGuardian() + ", getClatype()=" + getClatype() + ", getAdvisor()="
				+ getAdvisor() + ", getParcount()=" + getParcount() + ", getFeacount()=" + getFeacount()
				+ ", getRegdate()=" + getRegdate() + ", getSwimcost()=" + getSwimcost() + ", getSwimcount()="
				+ getSwimcount() + ", getPleasurecost()=" + getPleasurecost() + ", getPleasurecount()="
				+ getPleasurecount() + ", getCladeadline()=" + getCladeadline() + ", getFreezed()=" + getFreezed()
				+ ", getFreezedate()=" + getFreezedate() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	
}
