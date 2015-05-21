package model;

import java.io.Serializable;
import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;
import java.math.BigDecimal;
import java.util.List;


/**
 * The persistent class for the valuation_grp database table.
 * 
 */
@Entity
@XmlRootElement
@Table(name="valuation_grp")
@NamedQuery(name="ValuationGrp.findAll", query="SELECT v FROM ValuationGrp v")
public class ValuationGrp implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="contract_no")
	private Integer contractNo;

	@Column(name="goal_a")
	private Integer goalA;

	@Column(name="goal_all")
	private Integer goalAll;

	@Column(name="goal_b")
	private Integer goalB;

	@Column(name="goal_c")
	private Integer goalC;

	@Column(name="goal_grp")
	private BigDecimal goalGrp;

	@Column(name="goal_s")
	private Integer goalS;

	public ValuationGrp() {
	}

	public Integer getContractNo() {
		return this.contractNo;
	}

	public void setContractNo(Integer contractNo) {
		this.contractNo = contractNo;
	}

	public Integer getGoalA() {
		return this.goalA;
	}

	public void setGoalA(Integer goalA) {
		this.goalA = goalA;
	}

	public Integer getGoalAll() {
		return this.goalAll;
	}

	public void setGoalAll(Integer goalAll) {
		this.goalAll = goalAll;
	}

	public Integer getGoalB() {
		return this.goalB;
	}

	public void setGoalB(Integer goalB) {
		this.goalB = goalB;
	}

	public Integer getGoalC() {
		return this.goalC;
	}

	public void setGoalC(Integer goalC) {
		this.goalC = goalC;
	}

	public BigDecimal getGoalGrp() {
		return this.goalGrp;
	}

	public void setGoalGrp(BigDecimal goalGrp) {
		this.goalGrp = goalGrp;
	}

	public Integer getGoalS() {
		return this.goalS;
	}

	public void setGoalS(Integer goalS) {
		this.goalS = goalS;
	}

}