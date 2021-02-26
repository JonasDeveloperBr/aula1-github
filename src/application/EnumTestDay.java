package application;

import entities.enums.EnumDay;

public class EnumTestDay {

	EnumDay day;
	
	public EnumTestDay(EnumDay day) {
		this.day = day;
	}
	
	public void tellItLikeItIs() {
		switch (day) {
		case MONDAY:
			System.out.println("Mondays are bad.");
			break;
			
		case FRIDAY:
			System.out.println("Friday are better.");
			break;
			
		case SATURDAY: case SUNDAY:
			System.out.println("Weekends are best");
			break;
			
		default:
			System.out.println("Midweek days are so-so.");
			break;
		}
	}

	public static void main(String[] args) {
		EnumTestDay firstDay = new EnumTestDay(EnumDay.MONDAY);
		firstDay.tellItLikeItIs();
		EnumTestDay thirdDay = new EnumTestDay(EnumDay.WEDNESDAY);
		thirdDay.tellItLikeItIs();
		EnumTestDay fifthDay = new EnumTestDay(EnumDay.FRIDAY);
		fifthDay.tellItLikeItIs();
		EnumTestDay sixthDay = new EnumTestDay(EnumDay.SATURDAY);
		sixthDay.tellItLikeItIs();
		EnumTestDay seventhDay = new EnumTestDay(EnumDay.SUNDAY);
		seventhDay.tellItLikeItIs();
	}

}
