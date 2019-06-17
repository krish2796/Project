package com.wisdom.primefaces.bean;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpServletRequest;

import com.wisdom.primefaces.model.Student;
import com.wisdom.primefaces.service.StudentService;

@ManagedBean(name = "studentBean")
@ViewScoped
public class StudentBean {

	private Student student = new Student();
	private List<Student> students = new ArrayList<Student>(0);
	private List<Student> selectedStudents = new ArrayList<Student>(0);

	@PostConstruct
	public void init() {
		HttpServletRequest request = (HttpServletRequest) FacesContext.getCurrentInstance().getExternalContext()
				.getRequest();
		String reqParam = request.getParameter("param");
		if (!reqParam.equalsIgnoreCase("create")) {
			StudentService sc = new StudentService();
			students = sc.getStudents();
		}
	}

	public void create() {
		System.out.println("Execute Submit Operation");
		try {
			System.out.println(student);

			StudentService sc = new StudentService();
			boolean state = sc.insertRecode(getStudent());

			if (state) {
				reset();
				FacesContext.getCurrentInstance().addMessage(null,
						new FacesMessage(FacesMessage.SEVERITY_INFO, "", "Create Success..."));
			} else {
				FacesContext.getCurrentInstance().addMessage(null,

						new FacesMessage(FacesMessage.SEVERITY_ERROR, "", "Create Fail..."));
			}
		} catch (Exception e) {
			FacesContext.getCurrentInstance().addMessage(null,
					new FacesMessage(FacesMessage.SEVERITY_ERROR, "", "Create Fail..."));
		}
	}

	private void reset() {
		student = new Student();
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public List<Student> getStudents() {
		return students;
	}

	public void setStudents(List<Student> students) {
		this.students = students;
	}

	public List<Student> getSelectedStudents() {
		return selectedStudents;
	}

	public void setSelectedStudents(List<Student> selectedStudents) {
		this.selectedStudents = selectedStudents;
	}

}
