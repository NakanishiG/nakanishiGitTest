package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the program database table.
 * 
 */
@Entity
@NamedQuery(name="Program.findAll", query="SELECT p FROM Program p")
public class Program implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="program_id")
	private Integer programId;

	@Column(name="class_id")
	private Integer classId;

	@Column(name="is_pt_frame")
	private Boolean isPtFrame;

	@Column(name="is_sb_frame")
	private Boolean isSbFrame;

	@Column(name="onair_time_end")
	private String onairTimeEnd;

	@Column(name="onair_time_start")
	private String onairTimeStart;

	@Column(name="program_name")
	private String programName;

	public Program() {
	}

	public Integer getProgramId() {
		return this.programId;
	}

	public void setProgramId(Integer programId) {
		this.programId = programId;
	}

	public Integer getClassId() {
		return this.classId;
	}

	public void setClassId(Integer classId) {
		this.classId = classId;
	}

	public Boolean getIsPtFrame() {
		return this.isPtFrame;
	}

	public void setIsPtFrame(Boolean isPtFrame) {
		this.isPtFrame = isPtFrame;
	}

	public Boolean getIsSbFrame() {
		return this.isSbFrame;
	}

	public void setIsSbFrame(Boolean isSbFrame) {
		this.isSbFrame = isSbFrame;
	}

	public String getOnairTimeEnd() {
		return this.onairTimeEnd;
	}

	public void setOnairTimeEnd(String onairTimeEnd) {
		this.onairTimeEnd = onairTimeEnd;
	}

	public String getOnairTimeStart() {
		return this.onairTimeStart;
	}

	public void setOnairTimeStart(String onairTimeStart) {
		this.onairTimeStart = onairTimeStart;
	}

	public String getProgramName() {
		return this.programName;
	}

	public void setProgramName(String programName) {
		this.programName = programName;
	}

}