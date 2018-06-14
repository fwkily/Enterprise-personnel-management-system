package edu.zut.cs.javaee.epms.admin.domain;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2018-05-25T14:38:12.467+0800")
@StaticMetamodel(User.class)
public class User_ {
	public static volatile SingularAttribute<User, String> username;
	public static volatile SingularAttribute<User, String> password;
	public static volatile SingularAttribute<User, String> email;
	public static volatile SingularAttribute<User, Group> group;
}
