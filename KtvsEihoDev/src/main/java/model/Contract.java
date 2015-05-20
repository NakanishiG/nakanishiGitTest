package model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the contract database table.
 * 
 */
@Entity
@NamedQuery(name="Contract.findAll", query="SELECT c FROM Contract c")
public class Contract implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="contract_no")
	private Integer contractNo;

	@Column(name="agency_name")
	private String agencyName;

	@Column(name="contract_amount")
	private Integer contractAmount;

	@Temporal(TemporalType.DATE)
	@Column(name="contract_date_end")
	private Date contractDateEnd;

	@Temporal(TemporalType.DATE)
	@Column(name="contract_date_start")
	private Date contractDateStart;

	@Column(name="item_name")
	private String itemName;

	@Column(name="sponsor_name")
	private String sponsorName;

	public Contract() {
	}

	public Integer getContractNo() {
		return this.contractNo;
	}

	public void setContractNo(Integer contractNo) {
		this.contractNo = contractNo;
	}

	public String getAgencyName() {
		return this.agencyName;
	}

	public void setAgencyName(String agencyName) {
		this.agencyName = agencyName;
	}

	public Integer getContractAmount() {
		return this.contractAmount;
	}

	public void setContractAmount(Integer contractAmount) {
		this.contractAmount = contractAmount;
	}

	public Date getContractDateEnd() {
		return this.contractDateEnd;
	}

	public void setContractDateEnd(Date contractDateEnd) {
		this.contractDateEnd = contractDateEnd;
	}

	public Date getContractDateStart() {
		return this.contractDateStart;
	}

	public void setContractDateStart(Date contractDateStart) {
		this.contractDateStart = contractDateStart;
	}

	public String getItemName() {
		return this.itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public String getSponsorName() {
		return this.sponsorName;
	}

	public void setSponsorName(String sponsorName) {
		this.sponsorName = sponsorName;
	}

}