package model;

import java.io.Serializable;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;

import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the valuation_period database table.
 * 
 */
@Entity
@Table(name="valuation_period")
@NamedQuery(name="ValuationPeriod.findAll", query="SELECT v FROM ValuationPeriod v")
public class ValuationPeriod implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private ValuationPeriodPK id;

	@Temporal(TemporalType.DATE)
	@Column(name="period_date_start")
	private Date periodDateStart;

	@Temporal(TemporalType.DATE)
	@Column(name="period_date_end")
	private Date periodDateEnd;

	@Column(name="goal_rate")
	private BigDecimal goalRate;

	//bi-directional many-to-one association to Contract
	@ManyToOne
	@JoinColumn(name="contract_no", insertable=false, updatable=false)
	private Contract contract;

	public ValuationPeriod() {
	}

	public ValuationPeriodPK getId() {
		return this.id;
	}

	public void setId(ValuationPeriodPK id) {
		this.id = id;
	}

	public Date getPeriodDateStart() {
		return this.periodDateStart;
	}

	public void setPeriodDateStart(Date periodDateStart) {
		this.periodDateStart = periodDateStart;
	}

	public Date getPeriodDateEnd() {
		return this.periodDateEnd;
	}

	public void setPeriodDateEnd(Date periodDateEnd) {
		this.periodDateEnd = periodDateEnd;
	}

	public BigDecimal getGoalRate() {
		return this.goalRate;
	}

	public void setGoalRate(BigDecimal goalRate) {
		this.goalRate = goalRate;
	}

	public Contract getContract() {
		return this.contract;
	}

	public void setContract(Contract contract) {
		this.contract = contract;
	}

}