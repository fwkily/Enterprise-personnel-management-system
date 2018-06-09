package edu.zut.cs.javaee.epms.ensure.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import edu.zut.cs.javaee.epms.base.domain.BaseTreeEntity;

@Entity
@Table(name = "T_Ensure")
@NamedQueries({ @NamedQuery(name = "Ensure.getRoot", query = "select m from Ensure m where m.parent is null") })
public class Ensure extends BaseTreeEntity<Ensure> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1945866957570000331L;
	@Column(name = "NAME")
	String name;
	@Column(name = "DATE")
	String date;
	@Column(name = "INFO")
	String info;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getInfo() {
		return info;
	}
	public void setInfo(String info) {
		this.info = info;
	}
}
