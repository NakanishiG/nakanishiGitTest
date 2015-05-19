package model;

import java.io.Serializable;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;

import java.math.BigDecimal;
import java.util.List;


/**
 * The persistent class for the onair database table.
 * 
 */
@Entity
@XmlRootElement
@NamedQuery(name="Onair.findAll", query="SELECT o FROM Onair o ORDER BY o.program.onairTimeStart ASC, o.weekdayCode ASC")
public class Onair implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="onair_id")
	private Integer onairId;

	@Column(name="weekday_code")
	private Integer weekdayCode;

	@Column(name="viewing_rate_pt")
	private BigDecimal viewingRatePt;

	@Column(name="viewing_rate_sb")
	private BigDecimal viewingRateSb;

	//bi-directional many-to-one association to Program
	@ManyToOne
	@JoinColumn(name="program_id")
	private Program program;

	//bi-directional many-to-one association to Frame
	@OneToMany(mappedBy="onair", fetch=FetchType.LAZY)
	@OrderBy("frame_type ASC")
	private List<Frame> frames;

	public Onair() {
	}

	public Integer getOnairId() {
		return this.onairId;
	}

	public void setOnairId(Integer onairId) {
		this.onairId = onairId;
	}

	public Integer getWeekdayCode() {
		return this.weekdayCode;
	}

	public void setWeekdayCode(Integer weekdayCode) {
		this.weekdayCode = weekdayCode;
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

	public Program getProgram() {
		return this.program;
	}

	public void setProgram(Program program) {
		this.program = program;
	}

	public List<Frame> getFrames() {
		return this.frames;
	}

	public void setFrames(List<Frame> frames) {
		this.frames = frames;
	}

	public Frame addFrame(Frame frame) {
		getFrames().add(frame);
		frame.setOnair(this);

		return frame;
	}

	public Frame removeFrame(Frame frame) {
		getFrames().remove(frame);
		frame.setOnair(null);

		return frame;
	}

}