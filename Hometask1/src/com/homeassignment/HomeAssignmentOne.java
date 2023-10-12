package com.homeassignment;

public class HomeAssignmentOne {

	public static void main(String[]args)
	{
		long SunDiameter,EarthDiameter;
		double Sunresult, Earthresult,SunRadius,EarthRadius;
		SunDiameter = 865000;
		EarthDiameter = 7600;
		
		SunRadius =  SunDiameter/2.0;
		EarthRadius = EarthDiameter/ 2.0;
		Sunresult =  (4.0*(Math.PI*Math.pow(SunRadius, 3)));
		Earthresult =  (4.0*(Math.PI*Math.pow(EarthRadius, 3)));
		
		System.out.println("The volume of the Sun is approx "+String.format("%.2f", Sunresult)+ " cubic miles");
		System.out.println("The volume of the Earth is approx "+String.format("%.2f", Earthresult)+ " cubic miles");
		System.out.println("The ratio of the volume of Sun to that of Earth is " + Math.ceilDiv(Math.round(Sunresult),Math.round(Earthresult)));
		
	}
}
