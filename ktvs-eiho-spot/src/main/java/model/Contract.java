package model;

import java.io.Serializable;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;

import java.util.Date;
import java.util.List;


/**
 * The persistent class for the contract database table.
 * 
 */
@Entity
@XmlRootElement
@NamedQuery(name="Contract.findAll", query="SELECT c FROM Contract c ORDER BY c.contractNo ASC")
public class Contract implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="contract_no")
	private Integer contractNo;

	@Column(name="sponsor_name")
	private String sponsorName;

	@Column(name="agency_name")
	private String agencyName;

	@Column(name="item_name")
	private String itemName;

	@Column(name="contract_amount")
	private Integer contractAmount;

	@Temporal(TemporalType.DATE)
	@Column(name="contract_date_start")
	private Date contractDateStart;

	@Temporal(TemporalType.DATE)
	@Column(name="contract_date_end")
	private Date contractDateEnd;
/*
	//bi-directional many-to-one association to FrameHold
	@OneToMany(mappedBy="contract", fetch=FetchType.EAGER)
	@OrderBy("hold_date ASC")
	private List<FrameHold> frameHolds;
*/
	//bi-directional one-to-one association to ValuationGrp
	@OneToOne
	@JoinColumn(name="contract_no")
	private ValuationGrp valuationGrp;

	//bi-directional many-to-one association to ValuationPeriod
	@OneToMany(mappedBy="contract", fetch=FetchType.EAGER)
	private List<ValuationPeriod> valuationPeriods;

	public Contract() {
	}

	public Integer getContractNo() {
		return this.contractNo;
	}

	public void setContractNo(Integer contractNo) {
		this.contractNo = contractNo;
	}

	public String getSponsorName() {
		return this.sponsorName;
	}

	public void setSponsorName(String sponsorName) {
		this.sponsorName = sponsorName;
	}

	public String getAgencyName() {
		return this.agencyName;
	}

	public void setAgencyName(String agencyName) {
		this.agencyName = agencyName;
	}

	public String getItemName() {
		return this.itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public Integer getContractAmount() {
		return this.contractAmount;
	}

	public void setContractAmount(Integer contractAmount) {
		this.contractAmount = contractAmount;
	}

	public Date getContractDateStart() {
		return this.contractDateStart;
	}

	public void setContractDateStart(Date contractDateStart) {
		this.contractDateStart = contractDateStart;
	}

	public Date getContractDateEnd() {
		return this.contractDateEnd;
	}

	public void setContractDateEnd(Date contractDateEnd) {
		this.contractDateEnd = contractDateEnd;
	}
/*
	public List<FrameHold> getFrameHolds() {
		return this.frameHolds;
	}

	public void setFrameHolds(List<FrameHold> frameHolds) {
		this.frameHolds = frameHolds;
	}

	public FrameHold addFrameHold(FrameHold frameHold) {
		getFrameHolds().add(frameHold);
		frameHold.setContract(this);

		return frameHold;
	}

	public FrameHold removeFrameHold(FrameHold frameHold) {
		getFrameHolds().remove(frameHold);
		frameHold.setContract(null);

		return frameHold;
	}
*/
	public ValuationGrp getValuationGrp() {
		return this.valuationGrp;
	}

	public void setValuationGrp(ValuationGrp valuationGrp) {
		this.valuationGrp = valuationGrp;
	}

	public List<ValuationPeriod> getValuationPeriods() {
		return this.valuationPeriods;
	}

	public void setValuationPeriods(List<ValuationPeriod> valuationPeriods) {
		this.valuationPeriods = valuationPeriods;
	}

	public ValuationPeriod addValuationPeriod(ValuationPeriod valuationPeriod) {
		getValuationPeriods().add(valuationPeriod);
		valuationPeriod.setContract(this);

		return valuationPeriod;
	}

	public ValuationPeriod removeValuationPeriod(ValuationPeriod valuationPeriod) {
		getValuationPeriods().remove(valuationPeriod);
		valuationPeriod.setContract(null);

		return valuationPeriod;
	}

}