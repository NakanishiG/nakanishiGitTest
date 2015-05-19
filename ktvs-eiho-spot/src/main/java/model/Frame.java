package model;

import java.io.Serializable;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;

import java.util.List;


/**
 * The persistent class for the frame database table.
 * 
 */
@Entity
@XmlRootElement
@NamedQuery(name="Frame.findAll", query="SELECT f FROM Frame f ORDER BY f.frameId ASC")
public class Frame implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="frame_id")
	private Integer frameId;

	@Column(name="frame_type")
	private Boolean frameType;

	@Column(name="frame_second")
	private Integer frameSecond;

	//bi-directional many-to-one association to Onair
	@ManyToOne
	@JoinColumn(name="onair_id")
	private Onair onair;

	//bi-directional many-to-one association to FrameHold
	@OneToMany(mappedBy="frame", fetch=FetchType.LAZY)
	@OrderBy("hold_date ASC")
	private List<FrameHold> frameHolds;

	public Frame() {
	}

	public Integer getFrameId() {
		return this.frameId;
	}

	public void setFrameId(Integer frameId) {
		this.frameId = frameId;
	}

	public Boolean getFrameType() {
		return this.frameType;
	}

	public void setFrameType(Boolean frameType) {
		this.frameType = frameType;
	}

	public Integer getFrameSecond() {
		return this.frameSecond;
	}

	public void setFrameSecond(Integer frameSecond) {
		this.frameSecond = frameSecond;
	}

	public Onair getOnair() {
		return this.onair;
	}

	public void setOnair(Onair onair) {
		this.onair = onair;
	}

	public List<FrameHold> getFrameHolds() {
		return this.frameHolds;
	}

	public void setFrameHolds(List<FrameHold> frameHolds) {
		this.frameHolds = frameHolds;
	}

	public FrameHold addFrameHold(FrameHold frameHold) {
		getFrameHolds().add(frameHold);
		frameHold.setFrame(this);

		return frameHold;
	}

	public FrameHold removeFrameHold(FrameHold frameHold) {
		getFrameHolds().remove(frameHold);
		frameHold.setFrame(null);

		return frameHold;
	}

}