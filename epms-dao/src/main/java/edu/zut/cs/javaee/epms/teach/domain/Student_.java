package edu.zut.cs.javaee.epms.teach.domain;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2018-07-03T22:19:50.769+0800")
@StaticMetamodel(Student.class)
public class Student_ {
	public static volatile SingularAttribute<Student, String> address;
	public static volatile SingularAttribute<Student, String> clazz;
	public static volatile SingularAttribute<Student, String> code;
	public static volatile SingularAttribute<Student, String> fullName;
	public static volatile SingularAttribute<Student, Gender> gender;
	public static volatile SingularAttribute<Student, String> grade;
	public static volatile SingularAttribute<Student, String> major;
}
