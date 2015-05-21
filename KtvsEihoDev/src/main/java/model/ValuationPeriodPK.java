package model;

import java.io.Serializable;
import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

/**
 * The primary key class for the valuation_period database table.
 * 
 */
@Embeddable
public class ValuationPeriodPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="contract_no")
	private Integer contractNo;

	@Column(name="detail_no")
	private Integer detailNo;

	public ValuationPeriodPK() {
	}
	public Integer getContractNo() {
		return this.contractNo;
	}
	public void setContractNo(Integer contractNo) {
		this.contractNo = contractNo;
	}
	public Integer getDetailNo() {
		return this.detailNo;
	}
	public void setDetailNo(Integer detailNo) {
		this.detailNo = detailNo;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof ValuationPeriodPK)) {
			return false;
		}
		ValuationPeriodPK castOther = (ValuationPeriodPK)other;
		return 
			this.contractNo.equals(castOther.contractNo)
			&& this.detailNo.equals(castOther.detailNo);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.contractNo.hashCode();
		hash = hash * prime + this.detailNo.hashCode();
		
		return hash;
	}
}