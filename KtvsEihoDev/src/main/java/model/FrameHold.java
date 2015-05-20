package model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the frame_hold database table.
 * 
 */
@Entity
@Table(name="frame_hold")
@NamedQuery(name="FrameHold.findAll", query="SELECT f FROM FrameHold f")
public class FrameHold implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="frame_hold_id")
	private Integer frameHoldId;

	@Column(name="contract_no")
	private Integer contractNo;

	@Column(name="frame_id")
	private Integer frameId;

	@Temporal(TemporalType.DATE)
	@Column(name="hold_date")
	private Date holdDate;

	@Column(name="hold_second")
	private Integer holdSecond;

	public FrameHold() {
	}

	public Integer getFrameHoldId() {
		return this.frameHoldId;
	}

	public void setFrameHoldId(Integer frameHoldId) {
		this.frameHoldId = frameHoldId;
	}

	public Integer getContractNo() {
		return this.contractNo;
	}

	public void setContractNo(Integer contractNo) {
		this.contractNo = contractNo;
	}

	public Integer getFrameId() {
		return this.frameId;
	}

	public void setFrameId(Integer frameId) {
		this.frameId = frameId;
	}

	public Date getHoldDate() {
		return this.holdDate;
	}

	public void setHoldDate(Date holdDate) {
		this.holdDate = holdDate;
	}

	public Integer getHoldSecond() {
		return this.holdSecond;
	}

	public void setHoldSecond(Integer holdSecond) {
		this.holdSecond = holdSecond;
	}

}