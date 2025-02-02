package DatabaseConnection.SpringORM.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.orm.hibernate5.HibernateTemplate;

import DatabaseConnection.SpringORM.entities.Student;

public class StudentDao {

	
	private HibernateTemplate hibernateTemplate;
	 
	@Transactional
	public int insert(Student student) {
	 
	  Integer i=(Integer)hibernateTemplate.save(student);
	  return i;
	}
	
	//GET 	data
	public Student getStudent(int studentId)
	{
		Student student = this.hibernateTemplate.get(Student.class,studentId);
		return student;
	}
	
	//Get all student;
	public List<Student> getAllStudent()
	{
		List<Student> students = this.hibernateTemplate.loadAll(Student.class);
	    return students;
	}
	
	//Delete student data..
	@Transactional
	public void deleteStudent(int studentId)
	{
		Student student = this.hibernateTemplate.get(Student.class, studentId);
		this.hibernateTemplate.delete(student);
	}
	
	@Transactional
	public void updatrStudent(Student student)
	{
		this.hibernateTemplate.update(student);
	}

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
	
}
