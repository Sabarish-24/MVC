package Bean;

public class loginBean {
	private String n;
	private String r;
	int s1,s2,s3;
	public void setUsername(String n) {
		this.n=n;
	}
	public void setPassword(String r) {
		this.r=r;
	}
	public String getUsername() {
		return n;
	}
	public String getPassword() {
		return r;
	}
		public void sets1(int s1) {
		this.s1=s1;
	}
		public void sets2(int s2) {
		this.s2=s2;
	}
		public void sets3(int s3) {
		this.s3=s3;
	}
	public int gets1() {
		return s1;
	}
	public int gets2() {
		return s2;
	}	
	public int gets3() {
		return s3;
	}	
}