
public class Course {
	private String CID="";
	private String Name="";
	private String Teacher;
	private int Capacity;
	public Course() {}
    public Course(String _cid,String _name,String _teacher,int _capacity) {
    	this.CID=_cid;
    	this.Name=_name;
    	this.Teacher=_teacher;
    	this.Capacity=_capacity;
    }
    public static String toString(Course x) {
    	if(x.getCID()==null) {
    		System.out.println("Course does not exist.");
    		return null;
    	}
    	System.out.print("CID:"+x.getCID()+",");
    	System.out.print("Name:"+x.getName()+",");
    	/*System.out.print("[");
    	for(int i=0;i<_teacher.length-1;i++) {
    		System.out.print(_teacher[i]+",");
    	}
    	System.out.print(_teacher[_teacher.length-1]+"],");*/
    	System.out.print("Teacher:"+x.getTeacher()+",");
    	System.out.print("Capacity:"+x.getCapacity());
    	System.out.println();
    	return null;
    }
    public void setCID(String _cid) {
    	this.CID=_cid;
    }
    public String getCID() {
    	return CID;
    }
    public void setName(String _name) {
    	this.Name=_name;
    }
    public String getName() {
    	return Name;
    }
    public void setTeacher(String _teacher) {
    	this.Teacher=_teacher;
    }
    public String getTeacher() {
    	return Teacher;
    }
    public void setCapacity(int _capacity) {
    	this.Capacity=_capacity;
    }
    public int getCapacity() {
    	return Capacity;
    }
}
