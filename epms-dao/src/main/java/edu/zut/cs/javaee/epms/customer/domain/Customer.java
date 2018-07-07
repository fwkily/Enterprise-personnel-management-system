package edu.zut.cs.javaee.epms.customer.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import edu.zut.cs.javaee.epms.base.domain.BaseEntity;
import edu.zut.cs.javaee.epms.base.domain.BaseTreeEntity;
import edu.zut.cs.javaee.epms.pay.domain.Pay;

@Table(name = "T_CUSTOMER")
@Entity
@NamedQueries({ @NamedQuery(name = "Customer.getRoot", query = "select m from Customer m where m.parent is null") })
public class Customer extends BaseTreeEntity<Customer> {
	/** 
	 * Customer entity class
	 */
	private static final long serialVersionUID = -6172780675713487492L;
	
	@Column(name = "ADDRESS")
	String address;
//	customer address

	@Column(name = "POSTCODE")
	String postcode;
//  customer postcode
	public String getAddress() {
		return address;
	}

	public String getPostcode() {
		return postcode;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setPostcode(String postcode) {
		this.postcode = postcode;
	}
}
