package edu.zut.cs.javaee.epms.admin.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import edu.zut.cs.javaee.epms.base.domain.BaseEntity;

@Table(name = "T_ADMIN_ROLE")
@Entity
public class Role extends BaseEntity {

	/**
	 * 
	 * 
	 * Role entity class
	 * @author lsz
	 */
	private static final long serialVersionUID = 1L;

	@Column
	//Role name
	String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
