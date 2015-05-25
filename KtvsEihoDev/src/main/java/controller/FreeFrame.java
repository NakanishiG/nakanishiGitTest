package controller;

import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;

import java.io.Serializable;
import java.util.List;

import bean.*;
import model.*;

@SuppressWarnings("serial")
@Named
@SessionScoped
public class FreeFrame implements Serializable {

	public FreeFrame() {
		// TODO Auto-generated constructor stub
	}
	
	public String show(){
		return "PopupWeekSelect";
	}
}
