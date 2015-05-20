package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the view_target database table.
 * 
 */
@Entity
@Table(name="view_target")
@NamedQuery(name="ViewTarget.findAll", query="SELECT v FROM ViewTarget v")
public class ViewTarget implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="view_target_id")
	private Integer viewTargetId;

	@Column(name="view_rate")
	private BigDecimal viewRate;

	@Column(name="view_target_name")
	private String viewTargetName;

	public ViewTarget() {
	}

	public Integer getViewTargetId() {
		return this.viewTargetId;
	}

	public void setViewTargetId(Integer viewTargetId) {
		this.viewTargetId = viewTargetId;
	}

	public BigDecimal getViewRate() {
		return this.viewRate;
	}

	public void setViewRate(BigDecimal viewRate) {
		this.viewRate = viewRate;
	}

	public String getViewTargetName() {
		return this.viewTargetName;
	}

	public void setViewTargetName(String viewTargetName) {
		this.viewTargetName = viewTargetName;
	}

}