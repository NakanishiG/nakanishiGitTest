package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the frame database table.
 * 
 */
@Entity
@NamedQuery(name="Frame.findAll", query="SELECT f FROM Frame f")
public class Frame implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="frame_id")
	private Integer frameId;

	@Column(name="frame_second")
	private Integer frameSecond;

	@Column(name="frame_type")
	private Boolean frameType;

	@Column(name="onair_id")
	private Integer onairId;

	public Frame() {
	}

	public Integer getFrameId() {
		return this.frameId;
	}

	public void setFrameId(Integer frameId) {
		this.frameId = frameId;
	}

	public Integer getFrameSecond() {
		return this.frameSecond;
	}

	public void setFrameSecond(Integer frameSecond) {
		this.frameSecond = frameSecond;
	}

	public Boolean getFrameType() {
		return this.frameType;
	}

	public void setFrameType(Boolean frameType) {
		this.frameType = frameType;
	}

	public Integer getOnairId() {
		return this.onairId;
	}

	public void setOnairId(Integer onairId) {
		this.onairId = onairId;
	}

}