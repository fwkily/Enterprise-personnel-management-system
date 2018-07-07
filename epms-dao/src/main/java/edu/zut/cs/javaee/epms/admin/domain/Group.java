package edu.zut.cs.javaee.epms.admin.domain;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import edu.zut.cs.javaee.epms.base.domain.BaseTreeEntity;

@Table(name = "T_ADMIN_GROUP")
@Entity
@NamedQueries({ @NamedQuery(name = "Group.getRoot", query = "select g from Group g where g.parent is null") })
public class Group extends BaseTreeEntity<Group> {

	/**
	 * 
	 * 
	 * Group entity class
	 * @author lsz
	 */
	private static final long serialVersionUID = -1751952224371998469L;

	@Column(name = "NAME")
	//Group name
	String name;

	@OneToMany(mappedBy = "group", cascade = CascadeType.REMOVE, fetch = FetchType.EAGER)
	//OneToMany Group to Users
	Set<User> users;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
