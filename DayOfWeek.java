package org.json.simple.parser;

import java.util.Scanner;

class DayOfWeek
{
	public static void mDayOfWeek(int m,int d,int y)
	{
			//applay the formula.
		int y1=y-(14-m)/12;
		int x=y1+(y1/4)-(y1/100)+(y1/400);
		int m1=m+12*((14-m)/12)-2;
		int d1=(d+x+(31*m1)/12)%7;
			//array to store days.
		String days[]=new String[7];
		days[0]="sunday";
		days[1]="monday";
		days[2]="tuesday"; 
		days[3]="wednesday";
		days[4]="thursday";
		days[5]="friday";
		days[6]="saturday";
		System.out.println("the day on "+m+" "+d+" "+y+" is "+days[d1]+" .");
		//System.out.println(d1 +" ");
	}
	public static void main(String []args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the month in Integer format");
		int m=scan.nextInt();//collect month.
			//check if month is valid or not.
		if(m>0 && m<13)
		{
			System.out.println("Enter the day");
			int d=scan.nextInt();
				//collect the date and check if valid or not.
			if(m==1 ||m==3||m==5||m==7||m==8||m==10||m==12)
			{
				if(d<1 ||d>31)
				{
				 	System.out.println("invalid date");
					System.exit(0);
				}
			}
			if(m==4||m==6||m==9||m==11)
			{
				if(d<1 ||d>30)
				{
				 	System.out.println("invalid date");
					System.exit(0);
				}
			}		
			if(m==2)
			{
				if(d>29 || d<1)
				{
					System.out.println("Date is invalid");
					System.exit(0);
				}
			}	
			System.out.println("Enter the year");
			int y=scan.nextInt(); //collect year.
			if(m==2 && y%4!=0)
			{
					//check the invalid date in feb for a non leap year.
				if(d==29)
				{
					System.out.println("Date is invalid");
					System.exit(0);
				}
			}
			mDayOfWeek(m,d,y);//calculate the date by function call.
		}
		else
		{
			System.out.println("month is out of range");
		}
	}
}
