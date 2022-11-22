package bddexample;

public class DoxyOrder {

	private String condition;
	
	public void setCondition(String condition) {
		this.condition = condition;
	}
	
	public String getPrescribeMessage() {
		if (condition.equals("HIV")) {
			return "Cannot prescribe";
		}
		
		return "Can prescribe";
	}
}
