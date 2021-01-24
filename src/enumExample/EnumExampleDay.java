package enumExample;

public class EnumExampleDay {
	
	private static final String sunday = "Sunday";
	
	public static void main(String args[]){
		
		System.out.println(Day.FRIDAY);
		System.out.println(Day.FRIDAY.getDayNumber());
		
		for(Day day:Day.values()){
			System.out.println(day);
		}
		
		
	}

}
