package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the onair database table.
 * 
 */
@Entity
@NamedQuery(name="Onair.findAll", query="SELECT o FROM Onair o")
public class Onair implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="onair_id")
	private Integer onairId;

	@Column(name="program_id")
	private Integer programId;

	@Column(name="viewing_rate_pt")
	private BigDecimal viewingRatePt;

	@Column(name="viewing_rate_sb")
	private BigDecimal viewingRateSb;

	@Column(name="weekday_code")
	private Integer weekdayCode;

	public Onair() {
	}

	public Integer getOnairId() {
		return this.onairId;
	}

	public void setOnairId(Integer onairId) {
		this.onairId = onairId;
	}

	public Integer getProgramId() {
		return this.programId;
	}

	public void setProgramId(Integer programId) {
		this.programId = programId;
	}

	public BigDecimal getViewingRatePt() {
		return this.viewingRatePt;
	}

	public void setViewingRatePt(BigDecimal viewingRatePt) {
		this.viewingRatePt = viewingRatePt;
	}

	public BigDecimal getViewingRateSb() {
		return this.viewingRateSb;
	}

	public void setViewingRateSb(BigDecimal viewingRateSb) {
		this.viewingRateSb = viewingRateSb;
	}

	public Integer getWeekdayCode() {
		return this.weekdayCode;
	}

	public void setWeekdayCode(Integer weekdayCode) {
		this.weekdayCode = weekdayCode;
	}

}