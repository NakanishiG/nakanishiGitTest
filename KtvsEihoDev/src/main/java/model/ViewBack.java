package model;

import java.io.Serializable;
import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;
import java.math.BigDecimal;


/**
 * The persistent class for the view_back database table.
 * 
 */
@Entity
@XmlRootElement
@Table(name="view_back")
@NamedQuery(name="ViewBack.findAll", query="SELECT v FROM ViewBack v ORDER BY v.viewBackId ASC")
public class ViewBack implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="view_back_id")
	private Integer viewBackId;

	@Column(name="view_back_name")
	private String viewBackName;

	@Column(name="view_rate")
	private BigDecimal viewRate;

	public ViewBack() {
	}

	public Integer getViewBackId() {
		return this.viewBackId;
	}

	public void setViewBackId(Integer viewBackId) {
		this.viewBackId = viewBackId;
	}

	public String getViewBackName() {
		return this.viewBackName;
	}

	public void setViewBackName(String viewBackName) {
		this.viewBackName = viewBackName;
	}

	public BigDecimal getViewRate() {
		return this.viewRate;
	}

	public void setViewRate(BigDecimal viewRate) {
		this.viewRate = viewRate;
	}

}