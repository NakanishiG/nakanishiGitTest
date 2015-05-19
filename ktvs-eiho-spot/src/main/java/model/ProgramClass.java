package model;

import java.io.Serializable;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;

import java.util.List;


/**
 * The persistent class for the program_class database table.
 * 
 */
@Entity
@XmlRootElement
@Table(name="program_class")
@NamedQuery(name="ProgramClass.findAll", query="SELECT p FROM ProgramClass p ORDER BY p.classId ASC")
public class ProgramClass implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="class_id")
	private Integer classId;

	@Column(name="class_name")
	private String className;

	public ProgramClass() {
	}

	public Integer getClassId() {
		return this.classId;
	}

	public void setClassId(Integer classId) {
		this.classId = classId;
	}

	public String getClassName() {
		return this.className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

}