package seu.vCampus.common;
import java.io.Serializable;
public class Course {
	private static final long serialVersionID = 1L;
	private String courseID;//���ſ�ID
	private String courseName;//���ſ�����
	private String courseTeacher;//���ſ��ڿ���ʦ
	private String coursePlace;//���ſ��Ͽεص�
	private String courseTime;//���ſ��Ͽε�ʱ��
	private double courseCredit;//��ô�εĳɼ�
	private boolean courseStatus;//true���ſα�ѡ��false���ſ�δ��ѡ
	int courseMaxNum;//���ſ���ѡ���������
	public Course(String courseID,String courseName,String courseTeacher,String coursePlace,String courseTime,double courseCredit,boolean courseStatus,int courseMaxNum){
		setCourseID(courseID);
		setCourseName(courseName);
		setCourseTeacher(courseTeacher);
		setCoursePlace(coursePlace);
		setCourseTime(courseTime);
		setCourseCredit(courseCredit);
		setCourseStatus(courseStatus);
		setCourseMaxNum(courseMaxNum);	
	}
	public String getCourseID() {
		return courseID;
	}
	public void setCourseID(String courseID) {
		this.courseID = courseID;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public String getCoureseTeacher() {
		return courseTeacher;
	}
	public void setCourseTeacher(String coureseTeacher) {
		this.courseTeacher = coureseTeacher;
	}
	public String getCoursePlace() {
		return coursePlace;
	}
	public void setCoursePlace(String coursePlace) {
		this.coursePlace = coursePlace;
	}
	public String getCourseTime() {
		return courseTime;
	}
	public void setCourseTime(String courseTime) {
		this.courseTime = courseTime;
	}
	public double getCourseCredit() {
		return courseCredit;
	}
	public void setCourseCredit(double courseCredit) {
		this.courseCredit = courseCredit;
	}
	public boolean isCourseStatus() {
		return courseStatus;
	}
	public void setCourseStatus(boolean courseStatus) {
		this.courseStatus = courseStatus;
	}
	public int getCourseMaxNum() {
		return courseMaxNum;
	}
	public void setCourseMaxNum(int courseMaxNum) {
		this.courseMaxNum = courseMaxNum;
	}
	
	
	
	
	
}
