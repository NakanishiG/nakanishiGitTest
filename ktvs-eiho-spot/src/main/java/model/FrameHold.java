package model;

import java.io.Serializable;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;

import java.util.Date;


/**
 * The persistent class for the frame_hold database table.
 * 
 */
@Entity
@XmlRootElement
@Table(name="frame_hold")
@NamedQuery(name="FrameHold.findAll", query="SELECT f FROM FrameHold f")
public class FrameHold implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="frame_hold_id")
	private Integer frameHoldId;

	@Column(name="hold_second")
	private Integer holdSecond;

	@Temporal(TemporalType.DATE)
	@Column(name="hold_date")
	private Date holdDate;

	//bi-directional many-to-one association to Frame
	@ManyToOne
	@JoinColumn(name="frame_id")
	private Frame frame;
/*
	//bi-directional many-to-one association to Contract
	@ManyToOne
	@JoinColumn(name="contract_no")
	private Contract contract;
*/
	public FrameHold() {
	}

	public Integer getFrameHoldId() {
		return this.frameHoldId;
	}

	public void setFrameHoldId(Integer frameHoldId) {
		this.frameHoldId = frameHoldId;
	}

	public Integer getHoldSecond() {
		return this.holdSecond;
	}

	public void setHoldSecond(Integer holdSecond) {
		this.holdSecond = holdSecond;
	}

	public Date getHoldDate() {
		return this.holdDate;
	}

	public void setHoldDate(Date holdDate) {
		this.holdDate = holdDate;
	}

	public Frame getFrame() {
		return this.frame;
	}

	public void setFrame(Frame frame) {
		this.frame = frame;
	}
/*
	public Contract getContract() {
		return this.contract;
	}

	public void setContract(Contract contract) {
		this.contract = contract;
	}
*/
}