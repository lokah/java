package generic;

//<T> Type
//<E> Element
//<k> key
//<v> value

public class Emp<T> {

	private T empno;
	private String ename;

	public Emp() {
		
		
	}
	public Emp(T empno,String ename) {
		
		this.empno = empno;
		this.ename = ename;
	}
	public T getEmpno() {
		return empno;
	}
	public void setEmpno(T empno) {
		this.empno = empno;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	@Override
	public String toString() {
		return "Emp [empno=" + empno + ", ename=" + ename + "]";
	}
			
	
	
}
