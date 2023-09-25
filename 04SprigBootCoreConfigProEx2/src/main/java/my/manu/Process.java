package my.manu;

import org.springframework.stereotype.Component;
@Component
public class Process
{
	private int id;
	private String code;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	@Override
	public String toString() {
		return "Process [id=" + id + ", code=" + code + "]";
	}
	
	
	
	

}
