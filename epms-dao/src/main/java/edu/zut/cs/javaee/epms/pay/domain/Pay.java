package edu.zut.cs.javaee.epms.pay.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import edu.zut.cs.javaee.epms.base.domain.BaseTreeEntity;

@Entity
@Table(name = "T_Pay")
@NamedQueries({ @NamedQuery(name = "Pay.getRoot", query = "select m from Pay m where m.parent is null") })
public class Pay extends BaseTreeEntity<Pay> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1945866957570000331L;

	@Column(name = "NAME")
	String name;
	@Column(name = "WORK")
	String work;
	@Column(name = "TIME")
	String time;
	@Column(name = "MONEY")
	String money;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getWork() {
		return work;
	}
	public void setWork(String work) {
		this.work = work;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public String getMoney() {
		return money;
	}
	public void setMoney(String money) {
		this.money = money;
	}
	
}
