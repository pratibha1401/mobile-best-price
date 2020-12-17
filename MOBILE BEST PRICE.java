import java.util.Scanner;
public class BestPrice {
	public static void main(String[] args) {
		System.out.println("Welcome to MOBILE BEST PRICE(MBP) ");
		System.out.println("\nFind The Fair Market Price Of Any Used Mobile Phone For Buying Or Selling");
		
		int x;
		System.out.println("\nSelect Company from the list: ");
		System.out.println(" 1. Samsung \n 2. Apple \n 3. Xiaomi \n 4. Oppo ");
		Scanner brand = new Scanner(System.in);
		x = brand.nextInt();
		System.out.println(+x);
		
		if(x == 1)
		{
			System.out.println("\nSelect Model: \n 1. Galaxy A6 Plus \n 2. Galaxy A7(2018) \n 3. Galaxy A9 \n 4. Galaxy S8 Plus \n 5. Galaxy S7 \n 6. Galaxy J7 Prime \n 7. Galaxy J6 \n 8. Galaxy Note 8 ");
		}
		else if (x == 2)
		{
			System.out.println("\nSelect Model: \n 1. iPhone 6 \n 2. iPhone 6 Plus \n 3. iPhone 7 \n 4. iPhone 7 Plus \n 5. iPhone 8 \n 6. iPhone 8 Plus \n 7. iPhone SE \n 8. iPhone X ");
		}
		else if(x == 3)
		{
			System.out.println("\nSelect Model: \n 1. Xiaomi Mi Max2 \n 2. Xiaomi Mi A2 \n 3. Redmi 3S \n 4. Redmi Note 3  ");
		}
		else if(x == 4)
		{
			System.out.println("\nSelect Model: \n 1. OPPO Reno \n 2. OPPO K1 \n 3. OPPO F9 Pro \n 4. OPPO F11  ");
		}
		
		int y = brand.nextInt();
		System.out.println(+y);
		
		System.out.println("Select age of Mobile Phone \n 1. 0 t0 6 months \n 2. 6 to 12 months \n 3. more than 12 months ");
		
		int z = brand.nextInt();
		System.out.println(+z); 
		;
		 if (x == 1 && y== 1)
		 {
		int P = 25990;
		if(z == 1)
			
		{
			int price1 , price2 ;
			price1 = P * 9/20;
			price2 = P / 2 ;
			System.out.println("PRICE OF THE MOBILE PHONE IS: Rs "+price1 + "-" + price2);
		}
	    else if(z == 2)
		{
	    	System.out.println("Condition of the MOBILE PHONE: 1.EXCELLENT \n 2.GOOD \n  3.FAIR \n 4.Bad");
	        int C;
	        C = brand.nextInt();
	        if(C == 1)
	        {
			int p3 , p4;
			p3 = P * 7/20;
			p4 = P * 2/5;
			System.out.println("PRICE OF THE MOBILE PHONE IS: Rs "+p3 + "-" + p4);
	        }
	        else if(C == 2)
	        {
	        	int p3,p4;
	        	p3 = P*3/10;
	        	p4 = P*33/100;
	        	System.out.println("PRICE OF THE MOBILE PHONE IS: Rs "+p3 + "-" + p4);
	        }
	        else if(C == 3)
	        {
	        	int p3,p4;
	        	p3 = P*1/5;
	        	p4 = P*13/50;
	        	System.out.println("PRICE OF THE MOBILE PHONE IS: Rs "+p3 + "-" + p4);
		    }
	        else if(C==4)
	        {
	        	System.out.println("MBP do not calculate price for phones in bad condition");
	        }
		}
	    else if(z == 3)
	    {
	    	System.out.println("Condition of the MOBILE PHONE: 1.EXCELLENT  2.GOOD  3.FAIR  4.Bad");
	        int C;
	        C = brand.nextInt();
	        if(C == 1)
	        {
			int p3 , p4;
			p3 = P * 3/10;
			p4 = P * 33/100;
			System.out.println("PRICE OF THE MOBILE PHONE IS: Rs "+p3 + "-" + p4);
	        }
	        else if(C == 2)
	        {
	        	int p3,p4;
	        	p3 = P*1/5;
	        	p4 = P*14/50;
	        	System.out.println("PRICE OF THE MOBILE PHONE IS: Rs "+p3 + "-" + p4);
	        }
	        else if(C == 3)
	        {
	        	int p3,p4;
	        	p3 = P*9/50;
	        	p4 = P*23/100;
	        	System.out.println("PRICE OF THE MOBILE PHONE IS: Rs "+p3 + "-" + p4);
		    }
	        else if(C==4)
	        {
	        	System.out.println("MBP do not calculate price for phones in bad condition");
	        }
	    }
		
	}	
		 else if(x==1 && y == 2)
		 {
			 int P = 25600;
				if(z == 1)
					
				{
					int price1 , price2 ;
					price1 = P * 9/20;
					price2 = P / 2 ;
					System.out.println("PRICE OF THE MOBILE PHONE IS: Rs "+price1 + "-" + price2);
				}
			    else if(z == 2)
				{
			    	System.out.println("Condition of the MOBILE PHONE: 1.EXCELLENT  2.GOOD  3.FAIR  4.Bad");
			        int C;
			        C = brand.nextInt();
			        if(C == 1)
			        {
					int p3 , p4;
					p3 = P * 7/20;
					p4 = P * 2/5;
					System.out.println("PRICE OF THE MOBILE PHONE IS: Rs "+p3 + "-" + p4);
			        }
			        else if(C == 2)
			        {
			        	int p3,p4;
			        	p3 = P*3/10;
			        	p4 = P*33/100;
			        	System.out.println("PRICE OF THE MOBILE PHONE IS: Rs "+p3 + "-" + p4);
			        }
			        else if(C == 3)
			        {
			        	int p3,p4;
			        	p3 = P*1/5;
			        	p4 = P*13/50;
			        	System.out.println("PRICE OF THE MOBILE PHONE IS: Rs "+p3 + "-" + p4);
				    }
			        else if(C==4)
			        {
			        	System.out.println("MBP do not calculate price for phones in bad condition");
			        }
				}
			    else if(z == 3)
			    {
			    	System.out.println("Condition of the MOBILE PHONE: 1.EXCELLENT  2.GOOD  3.FAIR  4.Bad");
			        int C;
			        C = brand.nextInt();
			        if(C == 1)
			        {
					int p3 , p4;
					p3 = P * 3/10;
					p4 = P * 33/100;
					System.out.println("PRICE OF THE MOBILE PHONE IS: Rs "+p3 + "-" + p4);
			        }
			        else if(C == 2)
			        {
			        	int p3,p4;
			        	p3 = P*1/5;
			        	p4 = P*14/50;
			        	System.out.println("PRICE OF THE MOBILE PHONE IS: Rs "+p3 + "-" + p4);
			        }
			        else if(C == 3)
			        {
			        	int p3,p4;
			        	p3 = P*9/50;
			        	p4 = P*23/100;
			        	System.out.println("PRICE OF THE MOBILE PHONE IS: Rs "+p3 + "-" + p4);
				    }
			        else if(C==4)
			        {
			        	System.out.println("MBP do not calculate price for phones in bad condition");
			        }
			    }
		 }
		 else if(x == 1 && y == 3)
		 {
			 int P = 31990;
				if(z == 1)
					
				{
					int price1 , price2 ;
					price1 = P * 9/20;
					price2 = P / 2 ;
					System.out.println("PRICE OF THE MOBILE PHONE IS: Rs "+price1 + "-" + price2);
				}
			    else if(z == 2)
				{
			    	System.out.println("Condition of the MOBILE PHONE: 1.EXCELLENT  2.GOOD  3.FAIR  4.Bad");
			        int C;
			        C = brand.nextInt();
			        if(C == 1)
			        {
					int p3 , p4;
					p3 = P * 7/20;
					p4 = P * 2/5;
					System.out.println("PRICE OF THE MOBILE PHONE IS: Rs "+p3 + "-" + p4);
			        }
			        else if(C == 2)
			        {
			        	int p3,p4;
			        	p3 = P*3/10;
			        	p4 = P*33/100;
			        	System.out.println("PRICE OF THE MOBILE PHONE IS: Rs "+p3 + "-" + p4);
			        }
			        else if(C == 3)
			        {
			        	int p3,p4;
			        	p3 = P*1/5;
			        	p4 = P*13/50;
			        	System.out.println("PRICE OF THE MOBILE PHONE IS: Rs "+p3 + "-" + p4);
				    }
			        else if(C==4)
			        {
			        	System.out.println("MBP do not calculate price for phones in bad condition");
			        }
				}
			    else if(z == 3)
			    {
			    	System.out.println("Condition of the MOBILE PHONE: 1.EXCELLENT  2.GOOD  3.FAIR  4.Bad");
			        int C;
			        C = brand.nextInt();
			        if(C == 1)
			        {
					int p3 , p4;
					p3 = P * 3/10;
					p4 = P * 33/100;
					System.out.println("PRICE OF THE MOBILE PHONE IS: Rs "+p3 + "-" + p4);
			        }
			        else if(C == 2)
			        {
			        	int p3,p4;
			        	p3 = P*1/5;
			        	p4 = P*14/50;
			        	System.out.println("PRICE OF THE MOBILE PHONE IS: Rs "+p3 + "-" + p4);
			        }
			        else if(C == 3)
			        {
			        	int p3,p4;
			        	p3 = P*9/10;
			        	p4 = P*23/100;
			        	System.out.println("PRICE OF THE MOBILE PHONE IS: Rs "+p3 + "-" + p4);
				    }
			        else if(C==4)
			        {
			        	System.out.println("MBP do not calculate price for phones in bad condition");
			        }
			    }
		 }
		 else if(x == 1 && y == 4)
		 {
			 int P = 64900;
				if(z == 1)
					
				{
					int price1 , price2 ;
					price1 = P * 9/20;
					price2 = P / 2 ;
					System.out.println("PRICE OF THE MOBILE PHONE IS: Rs "+price1 + "-" + price2);
				}
			    else if(z == 2)
				{
			    	System.out.println("Condition of the MOBILE PHONE: 1.EXCELLENT  2.GOOD  3.FAIR  4.Bad");
			        int C;
			        C = brand.nextInt();
			        if(C == 1)
			        {
					int p3 , p4;
					p3 = P * 7/20;
					p4 = P * 2/5;
					System.out.println("PRICE OF THE MOBILE PHONE IS: Rs "+p3 + "-" + p4);
			        }
			        else if(C == 2)
			        {
			        	int p3,p4;
			        	p3 = P*3/10;
			        	p4 = P*33/100;
			        	System.out.println("PRICE OF THE MOBILE PHONE IS: Rs "+p3 + "-" + p4);
			        }
			        else if(C == 3)
			        {
			        	int p3,p4;
			        	p3 = P*1/5;
			        	p4 = P*13/50;
			        	System.out.println("PRICE OF THE MOBILE PHONE IS: Rs "+p3 + "-" + p4);
				    }
			        else if(C==4)
			        {
			        	System.out.println("MBP do not calculate price for phones in bad condition");
			        }
				}
			    else if(z == 3)
			    {
			    	System.out.println("Condition of the MOBILE PHONE: 1.EXCELLENT  2.GOOD  3.FAIR  4.Bad");
			        int C;
			        C = brand.nextInt();
			        if(C == 1)
			        {
					int p3 , p4;
					p3 = P * 3/10;
					p4 = P * 33/100;
					System.out.println("PRICE OF THE MOBILE PHONE IS: Rs "+p3 + "-" + p4);
			        }
			        else if(C == 2)
			        {
			        	int p3,p4;
			        	p3 = P*1/5;
			        	p4 = P*14/50;
			        	System.out.println("PRICE OF THE MOBILE PHONE IS: Rs "+p3 + "-" + p4);
			        }
			        else if(C == 3)
			        {
			        	int p3,p4;
			        	p3 = P*9/50;
			        	p4 = P*23/100;
			        	System.out.println("PRICE OF THE MOBILE PHONE IS: Rs "+p3 + "-" + p4);
				    }
			        else if(C==4)
			        {
			        	System.out.println("MBP do not calculate price for phones in bad condition");
			        }
			    }
		 }
		 else if(x==1 && y==5)
		 {
			 int P = 22999;
				if(z == 1)
					
				{
					int price1 , price2 ;
					price1 = P * 9/20;
					price2 = P / 2 ;
					System.out.println("PRICE OF THE MOBILE PHONE IS: Rs "+price1 + "-" + price2);
				}
			    else if(z == 2)
				{
			    	System.out.println("Condition of the MOBILE PHONE: 1.EXCELLENT  2.GOOD  3.FAIR  4.Bad");
			        int C;
			        C = brand.nextInt();
			        if(C == 1)
			        {
					int p3 , p4;
					p3 = P * 7/20;
					p4 = P * 2/5;
					System.out.println("PRICE OF THE MOBILE PHONE IS: Rs "+p3 + "-" + p4);
			        }
			        else if(C == 2)
			        {
			        	int p3,p4;
			        	p3 = P*3/10;
			        	p4 = P*33/100;
			        	System.out.println("PRICE OF THE MOBILE PHONE IS: Rs "+p3 + "-" + p4);
			        }
			        else if(C == 3)
			        {
			        	int p3,p4;
			        	p3 = P*1/5;
			        	p4 = P*13/50;
			        	System.out.println("PRICE OF THE MOBILE PHONE IS: Rs "+p3 + "-" + p4);
				    }
			        else if(C==4)
			        {
			        	System.out.println("MBP do not calculate price for phones in bad condition");
			        }
				}
			    else if(z == 3)
			    {
			    	System.out.println("Condition of the MOBILE PHONE: 1.EXCELLENT  2.GOOD  3.FAIR  4.Bad");
			        int C;
			        C = brand.nextInt();
			        if(C == 1)
			        {
					int p3 , p4;
					p3 = P * 3/10;
					p4 = P * 33/100;
					System.out.println("PRICE OF THE MOBILE PHONE IS: Rs "+p3 + "-" + p4);
			        }
			        else if(C == 2)
			        {
			        	int p3,p4;
			        	p3 = P*1/5;
			        	p4 = P*14/50;
			        	System.out.println("PRICE OF THE MOBILE PHONE IS: Rs "+p3 + "-" + p4);
			        }
			        else if(C == 3)
			        {
			        	int p3,p4;
			        	p3 = P*9/50;
			        	p4 = P*23/100;
			        	System.out.println("PRICE OF THE MOBILE PHONE IS: Rs "+p3 + "-" + p4);
				    }
			        else if(C==4)
			        {
			        	System.out.println("MBP do not calculate price for phones in bad condition");
			        }
			    }
		 }
		 else if(x==1 && y==6)
		 {
			 int P = 18328;
				if(z == 1)
					
				{
					int price1 , price2 ;
					price1 = P * 9/20;
					price2 = P / 2 ;
					System.out.println("PRICE OF THE MOBILE PHONE IS: Rs "+price1 + "-" + price2);
				}
			    else if(z == 2)
				{
			    	System.out.println("Condition of the MOBILE PHONE: 1.EXCELLENT  2.GOOD  3.FAIR  4.Bad");
			        int C;
			        C = brand.nextInt();
			        if(C == 1)
			        {
					int p3 , p4;
					p3 = P * 7/20;
					p4 = P * 2/5;
					System.out.println("PRICE OF THE MOBILE PHONE IS: Rs "+p3 + "-" + p4);
			        }
			        else if(C == 2)
			        {
			        	int p3,p4;
			        	p3 = P*3/10;
			        	p4 = P*33/100;
			        	System.out.println("PRICE OF THE MOBILE PHONE IS: Rs "+p3 + "-" + p4);
			        }
			        else if(C == 3)
			        {
			        	int p3,p4;
			        	p3 = P*1/5;
			        	p4 = P*13/50;
			        	System.out.println("PRICE OF THE MOBILE PHONE IS: Rs "+p3 + "-" + p4);
				    }
			        else if(C==4)
			        {
			        	System.out.println("MBP do not calculate price for phones in bad condition");
			        }
				}
			    else if(z == 3)
			    {
			    	System.out.println("Condition of the MOBILE PHONE: 1.EXCELLENT  2.GOOD  3.FAIR  4.Bad");
			        int C;
			        C = brand.nextInt();
			        if(C == 1)
			        {
					int p3 , p4;
					p3 = P * 3/10;
					p4 = P * 33/100;
					System.out.println("PRICE OF THE MOBILE PHONE IS: Rs "+p3 + "-" + p4);
			        }
			        else if(C == 2)
			        {
			        	int p3,p4;
			        	p3 = P*1/5;
			        	p4 = P*14/50;
			        	System.out.println("PRICE OF THE MOBILE PHONE IS: Rs "+p3 + "-" + p4);
			        }
			        else if(C == 3)
			        {
			        	int p3,p4;
			        	p3 = P*9/50;
			        	p4 = P*23/100;
			        	System.out.println("PRICE OF THE MOBILE PHONE IS: Rs "+p3 + "-" + p4);
				    }
			        else if(C==4)
			        {
			        	System.out.println("MBP do not calculate price for phones in bad condition");
			        }
			    }
		 }
		 else if(x==1 && y==7)
		 {
			 int P = 8994;
				if(z == 1)
					
				{
					int price1 , price2 ;
					price1 = P * 9/20;
					price2 = P / 2 ;
					System.out.println("PRICE OF THE MOBILE PHONE IS: Rs "+price1 + "-" + price2);
				}
			    else if(z == 2)
				{
			    	System.out.println("Condition of the MOBILE PHONE: 1.EXCELLENT  2.GOOD  3.FAIR  4.Bad");
			        int C;
			        C = brand.nextInt();
			        if(C == 1)
			        {
					int p3 , p4;
					p3 = P * 7/20;
					p4 = P * 2/5;
					System.out.println("PRICE OF THE MOBILE PHONE IS: Rs "+p3 + "-" + p4);
			        }
			        else if(C == 2)
			        {
			        	int p3,p4;
			        	p3 = P*3/10;
			        	p4 = P*33/100;
			        	System.out.println("PRICE OF THE MOBILE PHONE IS: Rs "+p3 + "-" + p4);
			        }
			        else if(C == 3)
			        {
			        	int p3,p4;
			        	p3 = P*1/5;
			        	p4 = P*13/50;
			        	System.out.println("PRICE OF THE MOBILE PHONE IS: Rs "+p3 + "-" + p4);
				    }
			        else if(C==4)
			        {
			        	System.out.println("MBP do not calculate price for phones in bad condition");
			        }
				}
			    else if(z == 3)
			    {
			    	System.out.println("Condition of the MOBILE PHONE: 1.EXCELLENT  2.GOOD  3.FAIR  4.Bad");
			        int C;
			        C = brand.nextInt();
			        if(C == 1)
			        {
					int p3 , p4;
					p3 = P * 3/10;
					p4 = P * 33/100;
					System.out.println("PRICE OF THE MOBILE PHONE IS: Rs "+p3 + "-" + p4);
			        }
			        else if(C == 2)
			        {
			        	int p3,p4;
			        	p3 = P*1/5;
			        	p4 = P*14/50;
			        	System.out.println("PRICE OF THE MOBILE PHONE IS: Rs "+p3 + "-" + p4);
			        }
			        else if(C == 3)
			        {
			        	int p3,p4;
			        	p3 = P*9/50;
			        	p4 = P*23/100;
			        	System.out.println("PRICE OF THE MOBILE PHONE IS: Rs "+p3 + "-" + p4);
				    }
			        else if(C==4)
			        {
			        	System.out.println("MBP do not calculate price for phones in bad condition");
			        }
			    }
		 }
		 else if(x==1 && y==8)
		 {
			 int P = 67900;
				if(z == 1)
					
				{
					int price1 , price2 ;
					price1 = P * 9/20;
					price2 = P / 2 ;
					System.out.println("PRICE OF THE MOBILE PHONE IS: Rs "+price1 + "-" + price2);
				}
			    else if(z == 2)
				{
			    	System.out.println("Condition of the MOBILE PHONE: 1.EXCELLENT  2.GOOD  3.FAIR  4.Bad");
			        int C;
			        C = brand.nextInt();
			        if(C == 1)
			        {
					int p3 , p4;
					p3 = P * 7/20;
					p4 = P * 2/5;
					System.out.println("PRICE OF THE MOBILE PHONE IS: Rs "+p3 + "-" + p4);
			        }
			        else if(C == 2)
			        {
			        	int p3,p4;
			        	p3 = P*3/10;
			        	p4 = P*33/100;
			        	System.out.println("PRICE OF THE MOBILE PHONE IS: Rs "+p3 + "-" + p4);
			        }
			        else if(C == 3)
			        {
			        	int p3,p4;
			        	p3 = P*1/5;
			        	p4 = P*13/50;
			        	System.out.println("PRICE OF THE MOBILE PHONE IS: Rs "+p3 + "-" + p4);
				    }
			        else if(C==4)
			        {
			        	System.out.println("MBP do not calculate price for phones in bad condition");
			        }
				}
			    else if(z == 3)
			    {
			    	System.out.println("Condition of the MOBILE PHONE: 1.EXCELLENT  2.GOOD  3.FAIR  4.Bad");
			        int C;
			        C = brand.nextInt();
			        if(C == 1)
			        {
					int p3 , p4;
					p3 = P * 3/10;
					p4 = P * 33/100;
					System.out.println("PRICE OF THE MOBILE PHONE IS: Rs "+p3 + "-" + p4);
			        }
			        else if(C == 2)
			        {
			        	int p3,p4;
			        	p3 = P*1/5;
			        	p4 = P*14/50;
			        	System.out.println("PRICE OF THE MOBILE PHONE IS: Rs "+p3 + "-" + p4);
			        }
			        else if(C == 3)
			        {
			        	int p3,p4;
			        	p3 = P*9/50;
			        	p4 = P*23/100;
			        	System.out.println("PRICE OF THE MOBILE PHONE IS: Rs "+p3 + "-" + p4);
				    }
			        else if(C==4)
			        {
			        	System.out.println("MBP do not calculate price for phones in bad condition");
			        }
			    }
		 }
		 else if(x==2 && y==1)
		 {
			 int P = 26999;
				if(z == 1)
					
				{
					int price1 , price2 ;
					price1 = P * 9/20;
					price2 = P / 2 ;
					System.out.println("PRICE OF THE MOBILE PHONE IS: Rs "+price1 + "-" + price2);
				}
			    else if(z == 2)
				{
			    	System.out.println("Condition of the MOBILE PHONE: 1.EXCELLENT  2.GOOD  3.FAIR  4.Bad");
			        int C;
			        C = brand.nextInt();
			        if(C == 1)
			        {
					int p3 , p4;
					p3 = P * 7/20;
					p4 = P * 2/5;
					System.out.println("PRICE OF THE MOBILE PHONE IS: Rs "+p3 + "-" + p4);
			        }
			        else if(C == 2)
			        {
			        	int p3,p4;
			        	p3 = P*3/10;
			        	p4 = P*33/100;
			        	System.out.println("PRICE OF THE MOBILE PHONE IS: Rs "+p3 + "-" + p4);
			        }
			        else if(C == 3)
			        {
			        	int p3,p4;
			        	p3 = P*1/5;
			        	p4 = P*13/50;
			        	System.out.println("PRICE OF THE MOBILE PHONE IS: Rs "+p3 + "-" + p4);
				    }
			        else if(C==4)
			        {
			        	System.out.println("MBP do not calculate price for phones in bad condition");
			        }
				}
			    else if(z == 3)
			    {
			    	System.out.println("Condition of the MOBILE PHONE: 1.EXCELLENT  2.GOOD  3.FAIR  4.Bad");
			        int C;
			        C = brand.nextInt();
			        if(C == 1)
			        {
					int p3 , p4;
					p3 = P * 3/10;
					p4 = P * 33/100;
					System.out.println("PRICE OF THE MOBILE PHONE IS: Rs "+p3 + "-" + p4);
			        }
			        else if(C == 2)
			        {
			        	int p3,p4;
			        	p3 = P*1/5;
			        	p4 = P*14/50;
			        	System.out.println("PRICE OF THE MOBILE PHONE IS: Rs "+p3 + "-" + p4);
			        }
			        else if(C == 3)
			        {
			        	int p3,p4;
			        	p3 = P*9/50;
			        	p4 = P*23/100;
			        	System.out.println("PRICE OF THE MOBILE PHONE IS: Rs "+p3 + "-" + p4);
				    }
			        else if(C==4)
			        {
			        	System.out.println("MBP do not calculate price for phones in bad condition");
			        }
			    }
		 }
		 if(x == 2 && y==2)
		 {
			 int P = 34449;
				if(z == 1)
					
				{
					int price1 , price2 ;
					price1 = P * 9/20;
					price2 = P / 2 ;
					System.out.println("PRICE OF THE MOBILE PHONE IS: Rs "+price1 + "-" + price2);
				}
			    else if(z == 2)
				{
			    	System.out.println("Condition of the MOBILE PHONE: 1.EXCELLENT  2.GOOD  3.FAIR  4.Bad");
			        int C;
			        C = brand.nextInt();
			        if(C == 1)
			        {
					int p3 , p4;
					p3 = P * 7/20;
					p4 = P * 2/5;
					System.out.println("PRICE OF THE MOBILE PHONE IS: Rs "+p3 + "-" + p4);
			        }
			        else if(C == 2)
			        {
			        	int p3,p4;
			        	p3 = P*3/10;
			        	p4 = P*33/100;
			        	System.out.println("PRICE OF THE MOBILE PHONE IS: Rs "+p3 + "-" + p4);
			        }
			        else if(C == 3)
			        {
			        	int p3,p4;
			        	p3 = P*1/5;
			        	p4 = P*13/50;
			        	System.out.println("PRICE OF THE MOBILE PHONE IS: Rs "+p3 + "-" + p4);
				    }
			        else if(C==4)
			        {
			        	System.out.println("MBP do not calculate price for phones in bad condition");
			        }
				}
			    else if(z == 3)
			    {
			    	System.out.println("Condition of the MOBILE PHONE: 1.EXCELLENT  2.GOOD  3.FAIR  4.Bad");
			        int C;
			        C = brand.nextInt();
			        if(C == 1)
			        {
					int p3 , p4;
					p3 = P * 3/10;
					p4 = P * 33/100;
					System.out.println("PRICE OF THE MOBILE PHONE IS: Rs "+p3 + "-" + p4);
			        }
			        else if(C == 2)
			        {
			        	int p3,p4;
			        	p3 = P*1/5;
			        	p4 = P*14/50;
			        	System.out.println("PRICE OF THE MOBILE PHONE IS: Rs "+p3 + "-" + p4);
			        }
			        else if(C == 3)
			        {
			        	int p3,p4;
			        	p3 = P*9/50;
			        	p4 = P*23/100;
			        	System.out.println("PRICE OF THE MOBILE PHONE IS: Rs "+p3 + "-" + p4);
				    }
			        else if(C==4)
			        {
			        	System.out.println("MBP do not calculate price for phones in bad condition");
			        }
			    }
		 }
		 else if(x == 2 && y == 3)
		 {
			 int P = 52370;
				if(z == 1)
					
				{
					int price1 , price2 ;
					price1 = P * 9/20;
					price2 = P / 2 ;
					System.out.println("PRICE OF THE MOBILE PHONE IS: Rs "+price1 + "-" + price2);
				}
			    else if(z == 2)
				{
			    	System.out.println("Condition of the MOBILE PHONE: 1.EXCELLENT  2.GOOD  3.FAIR  4.Bad");
			        int C;
			        C = brand.nextInt();
			        if(C == 1)
			        {
					int p3 , p4;
					p3 = P * 7/20;
					p4 = P * 2/5;
					System.out.println("PRICE OF THE MOBILE PHONE IS: Rs "+p3 + "-" + p4);
			        }
			        else if(C == 2)
			        {
			        	int p3,p4;
			        	p3 = P*3/10;
			        	p4 = P*33/100;
			        	System.out.println("PRICE OF THE MOBILE PHONE IS: Rs "+p3 + "-" + p4);
			        }
			        else if(C == 3)
			        {
			        	int p3,p4;
			        	p3 = P*1/5;
			        	p4 = P*13/50;
			        	System.out.println("PRICE OF THE MOBILE PHONE IS: Rs "+p3 + "-" + p4);
				    }
			        else if(C==4)
			        {
			        	System.out.println("MBP do not calculate price for phones in bad condition");
			        }
				}
			    else if(z == 3)
			    {
			    	System.out.println("Condition of the MOBILE PHONE: 1.EXCELLENT  2.GOOD  3.FAIR  4.Bad");
			        int C;
			        C = brand.nextInt();
			        if(C == 1)
			        {
					int p3 , p4;
					p3 = P * 3/10;
					p4 = P * 33/100;
					System.out.println("PRICE OF THE MOBILE PHONE IS: Rs "+p3 + "-" + p4);
			        }
			        else if(C == 2)
			        {
			        	int p3,p4;
			        	p3 = P*1/5;
			        	p4 = P*14/50;
			        	System.out.println("PRICE OF THE MOBILE PHONE IS: Rs "+p3 + "-" + p4);
			        }
			        else if(C == 3)
			        {
			        	int p3,p4;
			        	p3 = P*9/50;
			        	p4 = P*23/100;
			        	System.out.println("PRICE OF THE MOBILE PHONE IS: Rs "+p3 + "-" + p4);
				    }
			        else if(C==4)
			        {
			        	System.out.println("MBP do not calculate price for phones in bad condition");
			        }
			    }
		 }
		 else if(x==2 && y==4)
		 {
			 int P = 59900;
				if(z == 1)
					
				{
					int price1 , price2 ;
					price1 = P * 9/20;
					price2 = P / 2 ;
					System.out.println("PRICE OF THE MOBILE PHONE IS: Rs "+price1 + "-" + price2);
				}
			    else if(z == 2)
				{
			    	System.out.println("Condition of the MOBILE PHONE: 1.EXCELLENT  2.GOOD  3.FAIR  4.Bad");
			        int C;
			        C = brand.nextInt();
			        if(C == 1)
			        {
					int p3 , p4;
					p3 = P * 7/20;
					p4 = P * 2/5;
					System.out.println("PRICE OF THE MOBILE PHONE IS: Rs "+p3 + "-" + p4);
			        }
			        else if(C == 2)
			        {
			        	int p3,p4;
			        	p3 = P*3/10;
			        	p4 = P*33/100;
			        	System.out.println("PRICE OF THE MOBILE PHONE IS: Rs "+p3 + "-" + p4);
			        }
			        else if(C == 3)
			        {
			        	int p3,p4;
			        	p3 = P*1/5;
			        	p4 = P*13/50;
			        	System.out.println("PRICE OF THE MOBILE PHONE IS: Rs "+p3 + "-" + p4);
				    }
			        else if(C==4)
			        {
			        	System.out.println("MBP do not calculate price for phones in bad condition");
			        }
				}
			    else if(z == 3)
			    {
			    	System.out.println("Condition of the MOBILE PHONE: 1.EXCELLENT  2.GOOD  3.FAIR  4.Bad");
			        int C;
			        C = brand.nextInt();
			        if(C == 1)
			        {
					int p3 , p4;
					p3 = P * 3/10;
					p4 = P * 33/100;
					System.out.println("PRICE OF THE MOBILE PHONE IS: Rs "+p3 + "-" + p4);
			        }
			        else if(C == 2)
			        {
			        	int p3,p4;
			        	p3 = P*1/5;
			        	p4 = P*14/50;
			        	System.out.println("PRICE OF THE MOBILE PHONE IS: Rs "+p3 + "-" + p4);
			        }
			        else if(C == 3)
			        {
			        	int p3,p4;
			        	p3 = P*9/50;
			        	p4 = P*23/100;
			        	System.out.println("PRICE OF THE MOBILE PHONE IS: Rs "+p3 + "-" + p4);
				    }
			        else if(C==4)
			        {
			        	System.out.println("MBP do not calculate price for phones in bad condition");
			        }
			    }
		 }
		 else if(x==2 && y==5)
		 {
			 int P = 57499;
				if(z == 1)
					
				{
					int price1 , price2 ;
					price1 = P * 9/20;
					price2 = P / 2 ;
					System.out.println("PRICE OF THE MOBILE PHONE IS: Rs "+price1 + "-" + price2);
				}
			    else if(z == 2)
				{
			    	System.out.println("Condition of the MOBILE PHONE: 1.EXCELLENT  2.GOOD  3.FAIR  4.Bad");
			        int C;
			        C = brand.nextInt();
			        if(C == 1)
			        {
					int p3 , p4;
					p3 = P * 7/20;
					p4 = P * 2/5;
					System.out.println("PRICE OF THE MOBILE PHONE IS: Rs "+p3 + "-" + p4);
			        }
			        else if(C == 2)
			        {
			        	int p3,p4;
			        	p3 = P*3/10;
			        	p4 = P*33/100;
			        	System.out.println("PRICE OF THE MOBILE PHONE IS: Rs "+p3 + "-" + p4);
			        }
			        else if(C == 3)
			        {
			        	int p3,p4;
			        	p3 = P*1/5;
			        	p4 = P*13/50;
			        	System.out.println("PRICE OF THE MOBILE PHONE IS: Rs "+p3 + "-" + p4);
				    }
			        else if(C==4)
			        {
			        	System.out.println("MBP do not calculate price for phones in bad condition");
			        }
				}
			    else if(z == 3)
			    {
			    	System.out.println("Condition of the MOBILE PHONE: 1.EXCELLENT  2.GOOD  3.FAIR  4.Bad");
			        int C;
			        C = brand.nextInt();
			        if(C == 1)
			        {
					int p3 , p4;
					p3 = P * 3/10;
					p4 = P * 33/100;
					System.out.println("PRICE OF THE MOBILE PHONE IS: Rs "+p3 + "-" + p4);
			        }
			        else if(C == 2)
			        {
			        	int p3,p4;
			        	p3 = P*1/5;
			        	p4 = P*14/50;
			        	System.out.println("PRICE OF THE MOBILE PHONE IS: Rs "+p3 + "-" + p4);
			        }
			        else if(C == 3)
			        {
			        	int p3,p4;
			        	p3 = P*9/50;
			        	p4 = P*23/100;
			        	System.out.println("PRICE OF THE MOBILE PHONE IS: Rs "+p3 + "-" + p4);
				    }
			        else if(C==4)
			        {
			        	System.out.println("MBP do not calculate price for phones in bad condition");
			        }
			    }
		 }
		 else if(x==2 && y==6)
		 {
			 int P = 67990;
				if(z == 1)
					
				{
					int price1 , price2 ;
					price1 = P * 9/20;
					price2 = P / 2 ;
					System.out.println("PRICE OF THE MOBILE PHONE IS: Rs "+price1 + "-" + price2);
				}
			    else if(z == 2)
				{
			    	System.out.println("Condition of the MOBILE PHONE: 1.EXCELLENT  2.GOOD  3.FAIR  4.Bad");
			        int C;
			        C = brand.nextInt();
			        if(C == 1)
			        {
					int p3 , p4;
					p3 = P * 7/20;
					p4 = P * 2/5;
					System.out.println("PRICE OF THE MOBILE PHONE IS: Rs "+p3 + "-" + p4);
			        }
			        else if(C == 2)
			        {
			        	int p3,p4;
			        	p3 = P*3/10;
			        	p4 = P*33/100;
			        	System.out.println("PRICE OF THE MOBILE PHONE IS: Rs "+p3 + "-" + p4);
			        }
			        else if(C == 3)
			        {
			        	int p3,p4;
			        	p3 = P*1/5;
			        	p4 = P*13/50;
			        	System.out.println("PRICE OF THE MOBILE PHONE IS: Rs "+p3 + "-" + p4);
				    }
			        else if(C==4)
			        {
			        	System.out.println("MBP do not calculate price for phones in bad condition");
			        }
				}
			    else if(z == 3)
			    {
			    	System.out.println("Condition of the MOBILE PHONE: 1.EXCELLENT  2.GOOD  3.FAIR  4.Bad");
			        int C;
			        C = brand.nextInt();
			        if(C == 1)
			        {
					int p3 , p4;
					p3 = P * 3/10;
					p4 = P * 33/100;
					System.out.println("PRICE OF THE MOBILE PHONE IS: Rs "+p3 + "-" + p4);
			        }
			        else if(C == 2)
			        {
			        	int p3,p4;
			        	p3 = P*1/5;
			        	p4 = P*14/50;
			        	System.out.println("PRICE OF THE MOBILE PHONE IS: Rs "+p3 + "-" + p4);
			        }
			        else if(C == 3)
			        {
			        	int p3,p4;
			        	p3 = P*9/50;
			        	p4 = P*23/100;
			        	System.out.println("PRICE OF THE MOBILE PHONE IS: Rs "+p3 + "-" + p4);
				    }
			        else if(C==4)
			        {
			        	System.out.println("MBP do not calculate price for phones in bad condition");
			        }
			    }
		 }
		 else if(x==2 && y==7)
		 {
			 int P = 33999;
				if(z == 1)
					
				{
					int price1 , price2 ;
					price1 = P * 9/20;
					price2 = P / 2 ;
					System.out.println("PRICE OF THE MOBILE PHONE IS: Rs "+price1 + "-" + price2);
				}
			    else if(z == 2)
				{
			    	System.out.println("Condition of the MOBILE PHONE: 1.EXCELLENT  2.GOOD  3.FAIR  4.Bad");
			        int C;
			        C = brand.nextInt();
			        if(C == 1)
			        {
					int p3 , p4;
					p3 = P * 7/20;
					p4 = P * 2/5;
					System.out.println("PRICE OF THE MOBILE PHONE IS: Rs "+p3 + "-" + p4);
			        }
			        else if(C == 2)
			        {
			        	int p3,p4;
			        	p3 = P*3/10;
			        	p4 = P*33/100;
			        	System.out.println("PRICE OF THE MOBILE PHONE IS: Rs "+p3 + "-" + p4);
			        }
			        else if(C == 3)
			        {
			        	int p3,p4;
			        	p3 = P*1/5;
			        	p4 = P*13/50;
			        	System.out.println("PRICE OF THE MOBILE PHONE IS: Rs "+p3 + "-" + p4);
				    }
			        else if(C==4)
			        {
			        	System.out.println("MBP do not calculate price for phones in bad condition");
			        }
				}
			    else if(z == 3)
			    {
			    	System.out.println("Condition of the MOBILE PHONE: 1.EXCELLENT  2.GOOD  3.FAIR  4.Bad");
			        int C;
			        C = brand.nextInt();
			        if(C == 1)
			        {
					int p3 , p4;
					p3 = P * 3/10;
					p4 = P * 33/100;
					System.out.println("PRICE OF THE MOBILE PHONE IS: Rs "+p3 + "-" + p4);
			        }
			        else if(C == 2)
			        {
			        	int p3,p4;
			        	p3 = P*1/5;
			        	p4 = P*14/50;
			        	System.out.println("PRICE OF THE MOBILE PHONE IS: Rs "+p3 + "-" + p4);
			        }
			        else if(C == 3)
			        {
			        	int p3,p4;
			        	p3 = P*9/50;
			        	p4 = P*23/100;
			        	System.out.println("PRICE OF THE MOBILE PHONE IS: Rs "+p3 + "-" + p4);
				    }
			        else if(C==4)
			        {
			        	System.out.println("MBP do not calculate price for phones in bad condition");
			        }
			    }
		 }
		 else if(x==2 && y==8)
		 {
			 int P = 70849;
				if(z == 1)
					
				{
					int price1 , price2 ;
					price1 = P * 9/20;
					price2 = P / 2 ;
					System.out.println("PRICE OF THE MOBILE PHONE IS: Rs "+price1 + "-" + price2);
				}
			    else if(z == 2)
				{
			    	System.out.println("Condition of the MOBILE PHONE: 1.EXCELLENT  2.GOOD  3.FAIR  4.Bad");
			        int C;
			        C = brand.nextInt();
			        if(C == 1)
			        {
					int p3 , p4;
					p3 = P * 7/20;
					p4 = P * 2/5;
					System.out.println("PRICE OF THE MOBILE PHONE IS: Rs "+p3 + "-" + p4);
			        }
			        else if(C == 2)
			        {
			        	int p3,p4;
			        	p3 = P*3/10;
			        	p4 = P*33/100;
			        	System.out.println("PRICE OF THE MOBILE PHONE IS: Rs "+p3 + "-" + p4);
			        }
			        else if(C == 3)
			        {
			        	int p3,p4;
			        	p3 = P*1/5;
			        	p4 = P*13/50;
			        	System.out.println("PRICE OF THE MOBILE PHONE IS: Rs "+p3 + "-" + p4);
				    }
			        else if(C==4)
			        {
			        	System.out.println("MBP do not calculate price for phones in bad condition");
			        }
				}
			    else if(z == 3)
			    {
			    	System.out.println("Condition of the MOBILE PHONE: 1.EXCELLENT  2.GOOD  3.FAIR  4.Bad");
			        int C;
			        C = brand.nextInt();
			        if(C == 1)
			        {
					int p3 , p4;
					p3 = P * 3/10;
					p4 = P * 33/100;
					System.out.println("PRICE OF THE MOBILE PHONE IS: Rs "+p3 + "-" + p4);
			        }
			        else if(C == 2)
			        {
			        	int p3,p4;
			        	p3 = P*1/5;
			        	p4 = P*14/50;
			        	System.out.println("PRICE OF THE MOBILE PHONE IS: Rs "+p3 + "-" + p4);
			        }
			        else if(C == 3)
			        {
			        	int p3,p4;
			        	p3 = P*9/50;
			        	p4 = P*23/100;
			        	System.out.println("PRICE OF THE MOBILE PHONE IS: Rs "+p3 + "-" + p4);
				    }
			        else if(C==4)
			        {
			        	System.out.println("MBP do not calculate price for phones in bad condition");
			        }
			    }
		 }
		 else if (x==3 && y==1)
		 {
			 int P = 16999;
				if(z == 1)
					
				{
					int price1 , price2 ;
					price1 = P * 9/20;
					price2 = P / 2 ;
					System.out.println("PRICE OF THE MOBILE PHONE IS: Rs "+price1 + "-" + price2);
				}
			    else if(z == 2)
				{
			    	System.out.println("Condition of the MOBILE PHONE: 1.EXCELLENT  2.GOOD  3.FAIR  4.Bad");
			        int C;
			        C = brand.nextInt();
			        if(C == 1)
			        {
					int p3 , p4;
					p3 = P * 7/20;
					p4 = P * 2/5;
					System.out.println("PRICE OF THE MOBILE PHONE IS: Rs "+p3 + "-" + p4);
			        }
			        else if(C == 2)
			        {
			        	int p3,p4;
			        	p3 = P*3/10;
			        	p4 = P*33/100;
			        	System.out.println("PRICE OF THE MOBILE PHONE IS: Rs "+p3 + "-" + p4);
			        }
			        else if(C == 3)
			        {
			        	int p3,p4;
			        	p3 = P*1/5;
			        	p4 = P*13/50;
			        	System.out.println("PRICE OF THE MOBILE PHONE IS: Rs "+p3 + "-" + p4);
				    }
			        else if(C==4)
			        {
			        	System.out.println("MBP do not calculate price for phones in bad condition");
			        }
				}
			    else if(z == 3)
			    {
			    	System.out.println("Condition of the MOBILE PHONE: 1.EXCELLENT  2.GOOD  3.FAIR  4.Bad");
			        int C;
			        C = brand.nextInt();
			        if(C == 1)
			        {
					int p3 , p4;
					p3 = P * 3/10;
					p4 = P * 33/100;
					System.out.println("PRICE OF THE MOBILE PHONE IS: Rs "+p3 + "-" + p4);
			        }
			        else if(C == 2)
			        {
			        	int p3,p4;
			        	p3 = P*1/5;
			        	p4 = P*14/50;
			        	System.out.println("PRICE OF THE MOBILE PHONE IS: Rs "+p3 + "-" + p4);
			        }
			        else if(C == 3)
			        {
			        	int p3,p4;
			        	p3 = P*9/50;
			        	p4 = P*23/100;
			        	System.out.println("PRICE OF THE MOBILE PHONE IS: Rs "+p3 + "-" + p4);
				    }
			        else if(C==4)
			        {
			        	System.out.println("MBP do not calculate price for phones in bad condition");
			        }
			    }
		 }
		 else if(x==3&&y==2)
		 {
			 int P = 9999;
				if(z == 1)
					
				{
					int price1 , price2 ;
					price1 = P * 9/20;
					price2 = P / 2 ;
					System.out.println("PRICE OF THE MOBILE PHONE IS: Rs "+price1 + "-" + price2);
				}
			    else if(z == 2)
				{
			    	System.out.println("Condition of the MOBILE PHONE: 1.EXCELLENT  2.GOOD  3.FAIR  4.Bad");
			        int C;
			        C = brand.nextInt();
			        if(C == 1)
			        {
					int p3 , p4;
					p3 = P * 7/20;
					p4 = P * 2/5;
					System.out.println("PRICE OF THE MOBILE PHONE IS: Rs "+p3 + "-" + p4);
			        }
			        else if(C == 2)
			        {
			        	int p3,p4;
			        	p3 = P*3/10;
			        	p4 = P*33/100;
			        	System.out.println("PRICE OF THE MOBILE PHONE IS: Rs "+p3 + "-" + p4);
			        }
			        else if(C == 3)
			        {
			        	int p3,p4;
			        	p3 = P*1/5;
			        	p4 = P*13/50;
			        	System.out.println("PRICE OF THE MOBILE PHONE IS: Rs "+p3 + "-" + p4);
				    }
			        else if(C==4)
			        {
			        	System.out.println("MBP do not calculate price for phones in bad condition");
			        }
				}
			    else if(z == 3)
			    {
			    	System.out.println("Condition of the MOBILE PHONE: 1.EXCELLENT  2.GOOD  3.FAIR  4.Bad");
			        int C;
			        C = brand.nextInt();
			        if(C == 1)
			        {
					int p3 , p4;
					p3 = P * 3/10;
					p4 = P * 33/100;
					System.out.println("PRICE OF THE MOBILE PHONE IS: Rs "+p3 + "-" + p4);
			        }
			        else if(C == 2)
			        {
			        	int p3,p4;
			        	p3 = P*1/5;
			        	p4 = P*14/50;
			        	System.out.println("PRICE OF THE MOBILE PHONE IS: Rs "+p3 + "-" + p4);
			        }
			        else if(C == 3)
			        {
			        	int p3,p4;
			        	p3 = P*9/50;
			        	p4 = P*23/100;
			        	System.out.println("PRICE OF THE MOBILE PHONE IS: Rs "+p3 + "-" + p4);
				    }
			        else if(C==4)
			        {
			        	System.out.println("MBP do not calculate price for phones in bad condition");
			        }
			    }
		 }
		  else if(x==3&&y==3)
		 {
			 int P = 9200;
				if(z == 1)
					
				{
					int price1 , price2 ;
					price1 = P * 9/20;
					price2 = P / 2 ;
					System.out.println("PRICE OF THE MOBILE PHONE IS: Rs "+price1 + "-" + price2);
				}
			    else if(z == 2)
				{
			    	System.out.println("Condition of the MOBILE PHONE: 1.EXCELLENT  2.GOOD  3.FAIR  4.Bad");
			        int C;
			        C = brand.nextInt();
			        if(C == 1)
			        {
					int p3 , p4;
					p3 = P * 7/20;
					p4 = P * 2/5;
					System.out.println("PRICE OF THE MOBILE PHONE IS: Rs "+p3 + "-" + p4);
			        }
			        else if(C == 2)
			        {
			        	int p3,p4;
			        	p3 = P*3/10;
			        	p4 = P*33/100;
			        	System.out.println("PRICE OF THE MOBILE PHONE IS: Rs "+p3 + "-" + p4);
			        }
			        else if(C == 3)
			        {
			        	int p3,p4;
			        	p3 = P*1/5;
			        	p4 = P*13/50;
			        	System.out.println("PRICE OF THE MOBILE PHONE IS: Rs "+p3 + "-" + p4);
				    }
			        else if(C==4)
			        {
			        	System.out.println("MBP do not calculate price for phones in bad condition");
			        }
				}
			    else if(z == 3)
			    {
			    	System.out.println("Condition of the MOBILE PHONE: 1.EXCELLENT  2.GOOD  3.FAIR  4.Bad");
			        int C;
			        C = brand.nextInt();
			        if(C == 1)
			        {
					int p3 , p4;
					p3 = P * 3/10;
					p4 = P * 33/100;
					System.out.println("PRICE OF THE MOBILE PHONE IS: Rs "+p3 + "-" + p4);
			        }
			        else if(C == 2)
			        {
			        	int p3,p4;
			        	p3 = P*1/5;
			        	p4 = P*14/50;
			        	System.out.println("PRICE OF THE MOBILE PHONE IS: Rs "+p3 + "-" + p4);
			        }
			        else if(C == 3)
			        {
			        	int p3,p4;
			        	p3 = P*9/50;
			        	p4 = P*23/100;
			        	System.out.println("PRICE OF THE MOBILE PHONE IS: Rs "+p3 + "-" + p4);
				    }
			        else if(C==4)
			        {
			        	System.out.println("MBP do not calculate price for phones in bad condition");
			        }
			    }
		 }
		 else if(x==3 && y==4)
		 {
			 int P = 15266;
				if(z == 1)
					
				{
					int price1 , price2 ;
					price1 = P * 9/20;
					price2 = P / 2 ;
					System.out.println("PRICE OF THE MOBILE PHONE IS: Rs "+price1 + "-" + price2);
				}
			    else if(z == 2)
				{
			    	System.out.println("Condition of the MOBILE PHONE: 1.EXCELLENT  2.GOOD  3.FAIR  4.Bad");
			        int C;
			        C = brand.nextInt();
			        if(C == 1)
			        {
					int p3 , p4;
					p3 = P * 7/20;
					p4 = P * 2/5;
					System.out.println("PRICE OF THE MOBILE PHONE IS: Rs "+p3 + "-" + p4);
			        }
			        else if(C == 2)
			        {
			        	int p3,p4;
			        	p3 = P*3/10;
			        	p4 = P*33/100;
			        	System.out.println("PRICE OF THE MOBILE PHONE IS: Rs "+p3 + "-" + p4);
			        }
			        else if(C == 3)
			        {
			        	int p3,p4;
			        	p3 = P*1/5;
			        	p4 = P*13/50;
			        	System.out.println("PRICE OF THE MOBILE PHONE IS: Rs "+p3 + "-" + p4);
				    }
			        else if(C==4)
			        {
			        	System.out.println("MBP do not calculate price for phones in bad condition");
			        }
				}
			    else if(z == 3)
			    {
			    	System.out.println("Condition of the MOBILE PHONE: 1.EXCELLENT  2.GOOD  3.FAIR  4.Bad");
			        int C;
			        C = brand.nextInt();
			        if(C == 1)
			        {
					int p3 , p4;
					p3 = P * 3/10;
					p4 = P * 33/100;
					System.out.println("PRICE OF THE MOBILE PHONE IS: Rs "+p3 + "-" + p4);
			        }
			        else if(C == 2)
			        {
			        	int p3,p4;
			        	p3 = P*1/5;
			        	p4 = P*14/50;
			        	System.out.println("PRICE OF THE MOBILE PHONE IS: Rs "+p3 + "-" + p4);
			        }
			        else if(C == 3)
			        {
			        	int p3,p4;
			        	p3 = P*9/50;
			        	p4 = P*23/100;
			        	System.out.println("PRICE OF THE MOBILE PHONE IS: Rs "+p3 + "-" + p4);
				    }
			        else if(C==4)
			        {
			        	System.out.println("MBP do not calculate price for phones in bad condition");
			        }
			    }
		 }
		 else if(x==4 && y==1)
		 {
			 int P = 32990;
				if(z == 1)
					
				{
					int price1 , price2 ;
					price1 = P * 9/20;
					price2 = P / 2 ;
					System.out.println("PRICE OF THE MOBILE PHONE IS: Rs "+price1 + "-" + price2);
				}
			    else if(z == 2)
				{
			    	System.out.println("Condition of the MOBILE PHONE: 1.EXCELLENT  2.GOOD  3.FAIR  4.Bad");
			        int C;
			        C = brand.nextInt();
			        if(C == 1)
			        {
					int p3 , p4;
					p3 = P * 7/20;
					p4 = P * 2/5;
					System.out.println("PRICE OF THE MOBILE PHONE IS: Rs "+p3 + "-" + p4);
			        }
			        else if(C == 2)
			        {
			        	int p3,p4;
			        	p3 = P*3/10;
			        	p4 = P*33/100;
			        	System.out.println("PRICE OF THE MOBILE PHONE IS: Rs "+p3 + "-" + p4);
			        }
			        else if(C == 3)
			        {
			        	int p3,p4;
			        	p3 = P*1/5;
			        	p4 = P*13/50;
			        	System.out.println("PRICE OF THE MOBILE PHONE IS: Rs "+p3 + "-" + p4);
				    }
			        else if(C==4)
			        {
			        	System.out.println("MBP do not calculate price for phones in bad condition");
			        }
				}
			    else if(z == 3)
			    {
			    	System.out.println("Condition of the MOBILE PHONE: 1.EXCELLENT  2.GOOD  3.FAIR  4.Bad");
			        int C;
			        C = brand.nextInt();
			        if(C == 1)
			        {
					int p3 , p4;
					p3 = P * 3/10;
					p4 = P * 33/100;
					System.out.println("PRICE OF THE MOBILE PHONE IS: Rs "+p3 + "-" + p4);
			        }
			        else if(C == 2)
			        {
			        	int p3,p4;
			        	p3 = P*1/5;
			        	p4 = P*14/50;
			        	System.out.println("PRICE OF THE MOBILE PHONE IS: Rs "+p3 + "-" + p4);
			        }
			        else if(C == 3)
			        {
			        	int p3,p4;
			        	p3 = P*9/50;
			        	p4 = P*23/100;
			        	System.out.println("PRICE OF THE MOBILE PHONE IS: Rs "+p3 + "-" + p4);
				    }
			        else if(C==4)
			        {
			        	System.out.println("MBP do not calculate price for phones in bad condition");
			        }
			    }
		 }
		 else if(x==4 && y==2)
		 {
			 int P = 16999;
				if(z == 1)
					
				{
					int price1 , price2 ;
					price1 = P * 9/20;
					price2 = P / 2 ;
					System.out.println("PRICE OF THE MOBILE PHONE IS: Rs "+price1 + "-" + price2);
				}
			    else if(z == 2)
				{
			    	System.out.println("Condition of the MOBILE PHONE: 1.EXCELLENT  2.GOOD  3.FAIR  4.Bad");
			        int C;
			        C = brand.nextInt();
			        if(C == 1)
			        {
					int p3 , p4;
					p3 = P * 7/20;
					p4 = P * 2/5;
					System.out.println("PRICE OF THE MOBILE PHONE IS: Rs "+p3 + "-" + p4);
			        }
			        else if(C == 2)
			        {
			        	int p3,p4;
			        	p3 = P*3/10;
			        	p4 = P*33/100;
			        	System.out.println("PRICE OF THE MOBILE PHONE IS: Rs "+p3 + "-" + p4);
			        }
			        else if(C == 3)
			        {
			        	int p3,p4;
			        	p3 = P*1/5;
			        	p4 = P*13/50;
			        	System.out.println("PRICE OF THE MOBILE PHONE IS: Rs "+p3 + "-" + p4);
				    }
			        else if(C==4)
			        {
			        	System.out.println("MBP do not calculate price for phones in bad condition");
			        }
				}
			    else if(z == 3)
			    {
			    	System.out.println("Condition of the MOBILE PHONE: 1.EXCELLENT  2.GOOD  3.FAIR  4.Bad");
			        int C;
			        C = brand.nextInt();
			        if(C == 1)
			        {
					int p3 , p4;
					p3 = P * 3/10;
					p4 = P * 33/100;
					System.out.println("PRICE OF THE MOBILE PHONE IS: Rs "+p3 + "-" + p4);
			        }
			        else if(C == 2)
			        {
			        	int p3,p4;
			        	p3 = P*1/5;
			        	p4 = P*14/50;
			        	System.out.println("PRICE OF THE MOBILE PHONE IS: Rs "+p3 + "-" + p4);
			        }
			        else if(C == 3)
			        {
			        	int p3,p4;
			        	p3 = P*9/50;
			        	p4 = P*23/100;
			        	System.out.println("PRICE OF THE MOBILE PHONE IS: Rs "+p3 + "-" + p4);
				    }
			        else if(C==4)
			        {
			        	System.out.println("MBP do not calculate price for phones in bad condition");
			        }
			    }
		 }
		 else if(x==4 && y==3)
		 {
			 int P = 19181;
				if(z == 1)
					
				{
					int price1 , price2 ;
					price1 = P * 9/20;
					price2 = P / 2 ;
					System.out.println("PRICE OF THE MOBILE PHONE IS: Rs "+price1 + "-" + price2);
				}
			    else if(z == 2)
				{
			    	System.out.println("Condition of the MOBILE PHONE: 1.EXCELLENT  2.GOOD  3.FAIR  4.Bad");
			        int C;
			        C = brand.nextInt();
			        if(C == 1)
			        {
					int p3 , p4;
					p3 = P * 7/20;
					p4 = P * 2/5;
					System.out.println("PRICE OF THE MOBILE PHONE IS: Rs "+p3 + "-" + p4);
			        }
			        else if(C == 2)
			        {
			        	int p3,p4;
			        	p3 = P*3/10;
			        	p4 = P*33/100;
			        	System.out.println("PRICE OF THE MOBILE PHONE IS: Rs "+p3 + "-" + p4);
			        }
			        else if(C == 3)
			        {
			        	int p3,p4;
			        	p3 = P*1/5;
			        	p4 = P*13/50;
			        	System.out.println("PRICE OF THE MOBILE PHONE IS: Rs "+p3 + "-" + p4);
				    }
			        else if(C==4)
			        {
			        	System.out.println("MBP do not calculate price for phones in bad condition");
			        }
				}
			    else if(z == 3)
			    {
			    	System.out.println("Condition of the MOBILE PHONE: 1.EXCELLENT  2.GOOD  3.FAIR  4.Bad");
			        int C;
			        C = brand.nextInt();
			        if(C == 1)
			        {
					int p3 , p4;
					p3 = P * 3/10;
					p4 = P * 33/100;
					System.out.println("PRICE OF THE MOBILE PHONE IS: Rs "+p3 + "-" + p4);
			        }
			        else if(C == 2)
			        {
			        	int p3,p4;
			        	p3 = P*1/5;
			        	p4 = P*14/50;
			        	System.out.println("PRICE OF THE MOBILE PHONE IS: Rs "+p3 + "-" + p4);
			        }
			        else if(C == 3)
			        {
			        	int p3,p4;
			        	p3 = P*9/50;
			        	p4 = P*23/100;
			        	System.out.println("PRICE OF THE MOBILE PHONE IS: Rs "+p3 + "-" + p4);
				    }
			        else if(C==4)
			        {
			        	System.out.println("MBP do not calculate price for phones in bad condition");
			        }
			    }
		 }
		 else if(x==4 &&  y==4)
		 {
			 int P = 17990;
				if(z == 1)
					
				{
					int price1 , price2 ;
					price1 = P * 9/20;
					price2 = P / 2 ;
					System.out.println("PRICE OF THE MOBILE PHONE IS: Rs "+price1 + "-" + price2);
				}
			    else if(z == 2)
				{
			    	System.out.println("Condition of the MOBILE PHONE: 1.EXCELLENT  2.GOOD  3.FAIR  4.Bad");
			        int C;
			        C = brand.nextInt();
			        if(C == 1)
			        {
					int p3 , p4;
					p3 = P * 7/20;
					p4 = P * 2/5;
					System.out.println("PRICE OF THE MOBILE PHONE IS: Rs "+p3 + "-" + p4);
			        }
			        else if(C == 2)
			        {
			        	int p3,p4;
			        	p3 = P*3/10;
			        	p4 = P*33/100;
			        	System.out.println("PRICE OF THE MOBILE PHONE IS: Rs "+p3 + "-" + p4);
			        }
			        else if(C == 3)
			        {
			        	int p3,p4;
			        	p3 = P*1/5;
			        	p4 = P*13/50;
			        	System.out.println("PRICE OF THE MOBILE PHONE IS: Rs "+p3 + "-" + p4);
				    }
			        else if(C==4)
			        {
			        	System.out.println("MBP do not calculate price for phones in bad condition");
			        }
				}
			    else if(z == 3)
			    {
			    	System.out.println("Condition of the MOBILE PHONE: 1.EXCELLENT  2.GOOD  3.FAIR  4.Bad");
			        int C;
			        C = brand.nextInt();
			        if(C == 1)
			        {
					int p3 , p4;
					p3 = P * 3/10;
					p4 = P * 33/100;
					System.out.println("PRICE OF THE MOBILE PHONE IS: Rs "+p3 + "-" + p4);
			        }
			        else if(C == 2)
			        {
			        	int p3,p4;
			        	p3 = P*1/5;
			        	p4 = P*14/50;
			        	System.out.println("PRICE OF THE MOBILE PHONE IS: Rs "+p3 + "-" + p4);
			        }
			        else if(C == 3)
			        {
			        	int p3,p4;
			        	p3 = P*9/50;
			        	p4 = P*23/100;
			        	System.out.println("PRICE OF THE MOBILE PHONE IS: Rs "+p3 + "-" + p4);
				    }
			        else if(C==4)
			        {
			        	System.out.println("MBP do not calculate price for phones in bad condition");
			        }
			    }
		 }
}
}