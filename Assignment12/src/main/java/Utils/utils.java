package Utils;

public class utils {
	
	public static String URL() {
		
		String URL ="https://reqres.in";
		return URL;
	}
	
	public static String addBody(String name, String job) {
		String body ="{\r\n"
				+ "    \"name\": \""+name+"\",\r\n"
				+ "    \"job\": \""+job+"\"\r\n"
				+ "}";
		return body;
	}
}
