//enum example in java
class Enum
{
	enum Weekdays
	{
		SUNDAY,		//CONSTANT VALUE = 0
		MONDAY,		//CONSTANT VALUE = 1
		TUESDAY,	//CONSTANT VALUE = 2
		WEDNESDAY,	//CONSTANT VALUE = 3
		THURSDAY,	//CONSTANT VALUE = 4
		FRIDAY,		//CONSTANT VALUE = 5
		SATURDAY	//CONSTANT VALUE = 6
	}
	public static void main(String[]args)
	{
		Weekdays today=Weekdays.SATURDAY;
		System.out.println("today is : "+today);
		
		for(Weekdays days:Weekdays.values())
		{
			System.out.println("weekdays is : "+days+" its ordinals : "+days.ordinal());
		}
	}
}