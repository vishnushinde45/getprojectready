//Demonstrate chain constructors

public class FootballPlayer2 {
	
	private String playerName="";
	private String college="";
	private double fortyYardDash=0.0;
	private int respBenchPress=0;
	private double sixtyYardDash=0.0;
	
	public String getPlayerName() {return playerName;}
	public String getCollege() {return college;}
	public double get40YdDash() {return fortyYardDash;}
	public int getRespBenchPress() {return respBenchPress;}
	public double get60YdDash() {return sixtyYardDash;}
	
	public FootballPlayer2(String playerName,String college,double fortyYardDash,int respBenchPress,double sixtyYardDash) {
		this.playerName=playerName;
		this.college=college;
		this.fortyYardDash=fortyYardDash;
		this.respBenchPress=respBenchPress;
		this.sixtyYardDash=sixtyYardDash;
	}
	
	public FootballPlayer2(String playerName,String college,double fortyYardDash,int respBenchPress) {
		this(playerName,college,fortyYardDash,respBenchPress,0.0);
	}
	
	public FootballPlayer2(String playerName,String college,double fortyYardDash,double sixtyYardDash) {
		this(playerName,college,fortyYardDash,0,sixtyYardDash);
	}
	
	public static void main(String[] args) {
		FootballPlayer2 jamellFleming=new FootballPlayer2("Jamell Flemming","Oklahoma",4.53,10.75);
		System.out.println(jamellFleming.getPlayerName());
		System.out.println(jamellFleming.getCollege());
		System.out.println(jamellFleming.get40YdDash());
		System.out.println(jamellFleming.getRespBenchPress());
		System.out.println(jamellFleming.get60YdDash());
		
	}
	
	
	

}
