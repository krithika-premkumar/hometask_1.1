package sixthtask;

public class Main {
public static void main(String[]args)
{
	Vehicle number_1 = new ICEV();
	Vehicle number_2 = new ICEV();
	Vehicle number_3 = new BEV();
	Vehicle number_4 = new BEV();
	Vehicle number_5 = new HybridV();
	Vehicle number_6 = new HybridV();
	
	Vehicle [] vehicle_details = {number_1,number_2,number_3,number_4,number_5,number_6};
	for(int i=0;i<vehicle_details.length;i++)
	{
	   vehicle_details[i].showCharacteristics();
	}
}
}
