package reports;

public interface reportsInterface {
	
	abstract  void pass(String Msg);
	abstract  void fail(String Msg);
	abstract  void info(String Msg);
	abstract  void warning(String Msg);

}
