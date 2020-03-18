package exception;

public class WikipediaNoArcticleException extends Exception {

	private static final long serialVersionUID = 1L;
	static int numExcepetions=0;
	private String cityName;
	
	public WikipediaNoArcticleException(String in_cityName) {
		numExcepetions++;
		this.cityName=in_cityName;
	}
	
	public String getMessage() {
		
		return "There is not any wikipedia article with title "+cityName+".";
	}
}
