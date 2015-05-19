package model;

import java.io.Serializable;

import javax.persistence.*;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

import java.util.List;


/**
 * The persistent class for the program database table.
 * 
 */
@Entity
@XmlRootElement
@NamedQuery(name="Program.findAll", query="SELECT p FROM Program p ORDER BY p.onairTimeStart ASC")
public class Program implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="program_id")
	private Integer programId;

    @Size(max = 50)
	@Column(name="program_name")
	private String programName;

	@Column(name="onair_time_start")
	private String onairTimeStart;

	@Column(name="onair_time_end")
	private String onairTimeEnd;

	@Column(name="is_pt_frame")
	private Boolean isPtFrame;

	@Column(name="is_sb_frame")
	private Boolean isSbFrame;

	@OneToOne
	@JoinColumn(name="class_id", insertable=false, updatable=false)
	private ProgramClass programClass;

	//bi-directional many-to-one association to Onair
	@OneToMany(mappedBy="program", fetch=FetchType.LAZY)
	@OrderBy("weekday_code ASC")
	private List<Onair> onairs;

	public Program() {
	}

	public Integer getProgramId() {
		return this.programId;
	}

	public void setProgramId(Integer programId) {
		this.programId = programId;
	}

	public String getProgramName() {
		return this.programName;
	}

	public void setProgramName(String programName) {
		this.programName = programName;
	}

	public String getOnairTimeStart() {
		return this.onairTimeStart;
	}

	public void setOnairTimeStart(String onairTimeStart) {
		this.onairTimeStart = onairTimeStart;
	}

	public String getOnairTimeEnd() {
		return this.onairTimeEnd;
	}

	public void setOnairTimeEnd(String onairTimeEnd) {
		this.onairTimeEnd = onairTimeEnd;
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

	public ProgramClass getProgramClass() {
		return this.programClass;
	}

	public void setProgramClass(ProgramClass programClass) {
		this.programClass = programClass;
	}

	public List<Onair> getOnairs() {
		return this.onairs;
	}

	public void setOnairs(List<Onair> onairs) {
		this.onairs = onairs;
	}

	public Onair addOnair(Onair onair) {
		getOnairs().add(onair);
		onair.setProgram(this);

		return onair;
	}

	public Onair removeOnair(Onair onair) {
		getOnairs().remove(onair);
		onair.setProgram(null);

		return onair;
	}

}