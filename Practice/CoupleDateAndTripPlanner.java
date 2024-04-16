import java.util.Scanner;
import java.util.Random;
class Login
{
	String ur1="Admin";
	String pass1 = "Admin";

	public boolean Validate(String ur,String pass)
	{
		
		if(ur.equals("Admin"))
		{
			if (pass.equals("Admin"))
			{
				System.out.println("Sucessfully Logged in");
				return true;
			}
			else 
			{
				System.out.println("PassWord is Wrong");
				return false;
			}
		}
		else
		{
			System.out.println("Username is wrong");
			return false;
		}
	}
}
class User_couple
{
}
class Location
{
	//--------------------------------------All Picnic date Location--------------------------------------------------------
	String[] All_Mumbai = {"Elephanta Caves","Vasai Fort","Mathern","Alibaug","Kamala Nehru Park","Hanging Garden","Adlabs Imagica","Karnala","Manori","Karjat","Kelva Beach"};
    String[] All_Thane = {"Jawhar","Maishej Ghat","Bhandardara","Lonavala","Pawna lake"};
	String[] All_Kalyan = { "Shahi Bawdi","Ammu Water Park","Kala Talao Lake","Durgadi Fort","Kali Masjid","Malanggad","Parsi Fire Temple/ Tower of silence","Birla Mandir","Load Caves and Shiva Temple","Ganesh Ghat"};
	String[] All_Mulund = {"Yogi Hills","Kanheri Caves","Sambhaji Park","Johnson & Johnson Garden","Mahakavi Kalidas Natyam","Priyadarshini Indira Gandhi Sports Complex"}; 
	//--------------------------------------All Walk Date LOcation---------------------------------------------------------  
	String[] All_Mumbai_walk = {"Jogger’s Park","Nirvana Park","Priyadarshini Park","Five Gardens","Shivaji Park","Worli Sea Face","Marine Drive"};
	String[] All_Thane_walk = {"Kelva Beach","Naneghat Hills","Tansa Wildlife Sanctuary","Jai Vilas Palace","Mahuli Fort","Upvan Lake","Thane Creek"};
	String[] All_Kalyan_walk = {"Durgadi Fort","Malanggad Fort","Marleshwar Temple","Japani Bazaar","Shiv Temple"};
	String[] All_Mulund_walk = {"Coastal & Marine Biodiverscity park","Mind Santuary"};
	//---------------------------------------All Elegnat Date LOcation--------------------------------------------------
	String[] All_Mumbai_elegant = {"Heng Bok Restaurant","Pizza By the Bay","Theobroma Patiserrie","Blue Tokai Roasters","Kofuku","Britannia & Co","The Bombay Canteen"};
	String[] All_Thane_elegant = {"Kangan","180 Degrees","Prego","Seasonals Tastes","Hitchki","Royale MasterChef Findine","Bomb'ar"};
    String[] All_Kalyan_elegant = {"Natural Ice cream","Big Town Burgers","Cake Innings","The Belgian Waffle Co.","Sharwarmaji","Nh1 Bowls"};
	String[] All_Mulund_elegant = {"The Food Studio","Mansion Bar & Lounge","Cream Centre","The Laughter Chapter","Amantran Fine Dine","Love & Latte Mulund","Tea & Conversations"};
    //--------------------------------------------All Movie Date Location------------------------------------------------
	String[] All_Mumbai_movie = {"Metro INOX Cinemas","INOX R-City","Carnival Cinemas IMAX, Wadala","PVR, Phoenix Marketcity","PVR Icon, Oberoi Mall","PVR, Infiniti Mall","Regal Cinema"};
    String[] All_Kalyan_movie = {"Bhanu Gold Cinema","Carnival SM5 Cinema","Chhaya Cinema","Cinemax Kalyan","Innox Cinemas Metro Mall","Joker Cinema","Sagar Cinema"};
    String[] All_Thane_movie = {"INOX Korum Mall","Cinepolis- Viviana Mall","Cinema Star Thane","Anand Cinema Thane","Ashok Cinema","Cineplolis Neptune Magnet Mall","Gold Cinema Thane"};
    String[] All_Mulund_movie = {"Carnival Cinemas RMall Mulund West","Jai Ganesh Cinema","Mehul Cinema Mulund West","NY Cinemas Mulund","PVR Cinemas Nirmal LifeStyle"};
    //================================================All_Domestic_trip_loc-----------------------------------------------------------
	String[] All_Delhi_trip = {"Gurudwara bangla Sahib","India Gate","Qutb Minar","Jama Masjid","Humayun's Tomb","Red Fort","Raj Ghat"};
    String[] All_goa_trip ={"Baga Beach","ButterFly Beach","Aguada Fort","Se Cathedral","Cotigoa Wild Sanctuary","Mapusa market"};
    String[] All_Utharakhand_trip={"Dehradun And Mussoorie","Nainital And Ranikhet","Jim Corbett","Rishikesh And Haridwar","Almora – Famous Offbeat Places","Auli – Ski Enthusiasts"};
    String[] All_Kerala_trip={"Alleppey","Kochi","Thekkady","Munnar","Thrissur","Kovalam","Thiruvananthapuram"};
    String[] All_Jammu_karshmir={"Yusmarg","Gulmarg","Pahalgam","Gurez Valley","Verinag","Srinagar"};
    String[] All_West_Bengal={"Kolkata","Darjeeling","The Sundarbans","Mandarmani","Bankura","Kalimpong"};
    String[] All_Gujarat_trip={"Ahmedabad","Gir Forest national park","Somanth Temple","Rann of Kutch","Dwarka","Saputara","Vadodara"};
    //===============================================All_International_Trips_loc==============================================
	String[] All_Italy_trip = {"Rome","Venice","Florence","Amalfi Coast","Cinque Terre","Tuscany","Pompeli"};
    String[] All_Japan_trip = {"Tokyo","Kyoto","Horishima","Osaka","Hokkaido","Nara","Okinawa"};
    String[] All_france_trip = {"Paris","Provence","French Riveria","Loire Valley","Normandy","Bordeaux","Alsace"};
    String[] All_Australia_trip = {"Syndey","Melbourne","Great Barrier Reef","Uluru-Kata Tjuta National Park","Tasmania","Brisbane","Adelaide"};
    String[] All_Peru_trip = {"Machu Picchu","Cusco","Lima","Sacred Valley","Lake Titicaca","Amazon Rainforest","Nazca Lines"};
    String[] All_Thiland_trip = {"Bangkok","Chiang Mai","Phuket","Ayutthaya","Krabi Province","Pai","Sukhothai"};
    String[] All_South_africa_trip = {"Cape Town","Johannesburg","Kruger National Park","Robben Island","Garden Route","Durban","Drakensberg Mountains"};

	
	public void sub_loc(String loc,String Date_type)
	   {
         String location = loc.toLowerCase();
		 if (location.equals("mumbai") && Date_type.equals("Picnic Date"))
		 {
			System.out.println("These are the spots that are suitable for "+Date_type);
			for (int i=0;i<All_Mumbai.length;i++)
			{
				if (i!=0 && i%4==0)
				{
                    System.out.println((i+1)+". "+All_Mumbai[i]+" ");
				}
				else{
					System.out.print((i+1)+". "+All_Mumbai[i]+"  ");
				}
				
			}

		 } 
		else if (location.equals("thane") && Date_type.equals("Picnic Date"))
		 {
			System.out.println("These are the spots that are suitable for "+Date_type);
			for (int i=0;i<All_Thane.length;i++)
			{
				if (i!=0 && i%4==0)
				{
                    System.out.println((i+1)+". "+All_Thane[i]+" ");
				}
				else{
					System.out.print((i+1)+". "+All_Thane[i]+"  ");
				}
				
			}

		 }
		else if (location.equals("kalyan") && Date_type.equals("Picnic Date"))
		 {
			System.out.println("These are the spots that are suitable for "+Date_type);
			for (int i=0;i<All_Kalyan.length;i++)
			{
				if (i!=0 && i%4==0)
				{
                    System.out.println((i+1)+". "+All_Kalyan[i]+" ");
				}
				else{
					System.out.print((i+1)+". "+All_Kalyan[i]+"  ");
				}
				
			}

		 }
		else if (location.equals("mulund") && Date_type.equals("Picnic Date"))
		 {
			System.out.println("These are the spots that are suitable for "+Date_type);
			for (int i=0;i<All_Mulund.length;i++)
			{
				if (i!=0 && i%4==0)
				{
                    System.out.println((i+1)+". "+All_Mulund[i]+" ");
				}
				else{
					System.out.print((i+1)+". "+All_Mulund[i]+"  ");
				}
				
			}

		 } 
		 else if (location.equals("mumbai") && Date_type.equals("Walk Date"))
		 {
			System.out.println("These are the spots that are suitable for "+Date_type);
			for (int i=0;i<All_Mumbai_walk.length;i++)
			{
				if (i!=0 && i%4==0)
				{
                    System.out.println((i+1)+". "+All_Mumbai_walk[i]+" ");
				}
				else{
					System.out.print((i+1)+". "+All_Mumbai_walk[i]+"  ");
				}
				
			}

		 }
		 else if (location.equals("thane") && Date_type.equals("Walk Date"))
		 {
			System.out.println("These are the spots that are suitable for "+Date_type);
			for (int i=0;i<All_Thane_walk.length;i++)
			{
				if (i!=0 && i%4==0)
				{
                    System.out.println((i+1)+". "+All_Thane_walk[i]+" ");
				}
				else{
					System.out.print((i+1)+". "+All_Thane_walk[i]+"  ");
				}
				
			}

		 }    
		 else if (location.equals("kalyan") && Date_type.equals("Walk Date"))
		 {
			System.out.println("These are the spots that are suitable for "+Date_type);
			for (int i=0;i<All_Kalyan_walk.length;i++)
			{
				if (i!=0 && i%4==0)
				{
                    System.out.println((i+1)+". "+All_Kalyan_walk[i]+" ");
				}
				else{
					System.out.print((i+1)+". "+All_Kalyan_walk[i]+"  ");
				}
				
			}

		 }
		 else if (location.equals("mulund") && Date_type.equals("Walk Date"))
		 {
			System.out.println("These are the spots that are suitable for "+Date_type);
			for (int i=0;i<All_Mulund_walk.length;i++)
			{
				if (i!=0 && i%4==0)
				{
                    System.out.println((i+1)+". "+All_Mulund_walk[i]+" ");
				}
				else{
					System.out.print((i+1)+". "+All_Mulund_walk[i]+"  ");
				}
				
			}

		 }
		 else if (location.equals("mumbai") && Date_type.equals("Elegant Date"))
		 {
			System.out.println("These are the spots that are suitable for "+Date_type);
			for (int i=0;i<All_Mumbai_elegant.length;i++)
			{
				if (i!=0 && i%4==0)
				{
                    System.out.println((i+1)+". "+All_Mumbai_elegant[i]+" ");
				}
				else{
					System.out.print((i+1)+". "+All_Mumbai_elegant[i]+"  ");
				}
				
			}

		 }
		 else if (location.equals("thane") && Date_type.equals("Elegant Date"))
		 {
			System.out.println("These are the spots that are suitable for "+Date_type);
			for (int i=0;i<All_Thane_elegant.length;i++)
			{
				if (i!=0 && i%4==0)
				{
                    System.out.println((i+1)+". "+All_Thane_elegant[i]+" ");
				}
				else{
					System.out.print((i+1)+". "+All_Thane_elegant[i]+"  ");
				}
				
			}

		 }    
		 else if (location.equals("kalyan") && Date_type.equals("Elegant Date"))
		 {
			System.out.println("These are the spots that are suitable for "+Date_type);
			for (int i=0;i<All_Kalyan_elegant.length;i++)
			{
				if (i!=0 && i%4==0)
				{
                    System.out.println((i+1)+". "+All_Kalyan_elegant[i]+" ");
				}
				else{
					System.out.print((i+1)+". "+All_Kalyan_elegant[i]+"  ");
				}
				
			}

		 }
		 else if (location.equals("mulund") && Date_type.equals("Elegant Date"))
		 {
			System.out.println("These are the spots that are suitable for "+Date_type);
			for (int i=0;i<All_Mulund_elegant.length;i++)
			{
				if (i!=0 && i%4==0)
				{
                    System.out.println((i+1)+". "+All_Mulund_elegant[i]+" ");
				}
				else{
					System.out.print((i+1)+". "+All_Mulund_elegant[i]+"  ");
				}
				
			}

		 }
         else if (location.equals("mumbai") && Date_type.equals("Movie Date"))
		 {
			System.out.println("These are the spots that are suitable for "+Date_type);
			for (int i=0;i<All_Mumbai_elegant.length;i++)
			{
				if (i!=0 && i%4==0)
				{
                    System.out.println((i+1)+". "+All_Mumbai_movie[i]+" ");
				}
				else{
					System.out.print((i+1)+". "+All_Mumbai_movie[i]+"  ");
				}
				
			}

		 }
         else if (location.equals("thane") && Date_type.equals("Movie Date"))
		 {
			System.out.println("These are the spots that are suitable for "+Date_type);
			for (int i=0;i<All_Thane_movie.length;i++)
			{
				if (i!=0 && i%4==0)
				{
                    System.out.println((i+1)+". "+All_Thane_movie[i]+" ");
				}
				else{
					System.out.print((i+1)+". "+All_Thane_movie[i]+"  ");
				}
				
			}

		 }    
		 else if (location.equals("kalyan") && Date_type.equals("Movie Date"))
		 {
			System.out.println("These are the spots that are suitable for "+Date_type);
			for (int i=0;i<All_Kalyan_movie.length;i++)
			{
				if (i!=0 && i%4==0)
				{
                    System.out.println((i+1)+". "+All_Kalyan_movie[i]+" ");
				}
				else{
					System.out.print((i+1)+". "+All_Kalyan_movie[i]+"  ");
				}
				
			}

		 }
		 else if (location.equals("mulund") && Date_type.equals("Movie Date"))
		 {
			System.out.println("These are the spots that are suitable for "+Date_type);
			for (int i=0;i<All_Mulund_movie.length;i++)
			{
				if (i!=0 && i%4==0)
				{
                    System.out.println((i+1)+". "+All_Mulund_movie[i]+" ");
				}
				else{
					System.out.print((i+1)+". "+All_Mulund_movie[i]+"  ");
				}
				
			}

		 }
		 else if (location.equals("delhi") && Date_type.equals("Domestic"))
		 {
			System.out.println("These are the spots that are suitable for "+Date_type);
			for (int i=0;i<All_Delhi_trip.length;i++)
			{
				if (i!=0 && i%4==0)
				{
                    System.out.println((i+1)+". "+All_Delhi_trip[i]+" ");
				}
				else{
					System.out.print((i+1)+". "+All_Delhi_trip[i]+"  ");
				}
				
			}

		 }
		 else if (location.equals("goa") && Date_type.equals("Domestic"))
		 {
			System.out.println("These are the spots that are suitable for "+Date_type);
			for (int i=0;i<All_goa_trip.length;i++)
			{
				if (i!=0 && i%4==0)
				{
                    System.out.println((i+1)+". "+All_goa_trip[i]+" ");
				}
				else{
					System.out.print((i+1)+". "+All_goa_trip[i]+"  ");
				}
				
			}

		 }
		 else if (location.equals("utharakhand") && Date_type.equals("Domestic"))
		 {
			System.out.println("These are the spots that are suitable for "+Date_type);
			for (int i=0;i<All_Utharakhand_trip.length;i++)
			{
				if (i!=0 && i%4==0)
				{
                    System.out.println((i+1)+". "+All_Utharakhand_trip[i]+" ");
				}
				else{
					System.out.print((i+1)+". "+All_Utharakhand_trip[i]+"  ");
				}
				
			}

		 }
		 else if (location.equals("kerala") && Date_type.equals("Domestic"))
		 {
			System.out.println("These are the spots that are suitable for "+Date_type);
			for (int i=0;i<All_Kerala_trip.length;i++)
			{
				if (i!=0 && i%4==0)
				{
                    System.out.println((i+1)+". "+All_Kerala_trip[i]+" ");
				}
				else{
					System.out.print((i+1)+". "+All_Kerala_trip[i]+"  ");
				}
				
			}

		 }
		 else if (location.equals("jammu") && Date_type.equals("Domestic"))
		 {
			System.out.println("These are the spots that are suitable for "+Date_type);
			for (int i=0;i<All_Jammu_karshmir.length;i++)
			{
				if (i!=0 && i%4==0)
				{
                    System.out.println((i+1)+". "+All_Jammu_karshmir[i]+" ");
				}
				else{
					System.out.print((i+1)+". "+All_Jammu_karshmir[i]+"  ");
				}
				
			}

		 }
		 else if (location.equals("bengal") && Date_type.equals("Domestic"))
		 {
			System.out.println("These are the spots that are suitable for "+Date_type);
			for (int i=0;i<All_West_Bengal.length;i++)
			{
				if (i!=0 && i%4==0)
				{
                    System.out.println((i+1)+". "+All_West_Bengal[i]+" ");
				}
				else{
					System.out.print((i+1)+". "+All_West_Bengal[i]+"  ");
				}
				
			}

		 }
		 else if (location.equals("gujarat") && Date_type.equals("Domestic"))
		 {
			System.out.println("These are the spots that are suitable for "+Date_type);
			for (int i=0;i<All_Gujarat_trip.length;i++)
			{
				if (i!=0 && i%4==0)
				{
                    System.out.println((i+1)+". "+All_Gujarat_trip[i]+" ");
				}
				else{
					System.out.print((i+1)+". "+All_Gujarat_trip[i]+"  ");
				}
				
			}

		 }
		 else if (location.equals("italy") && Date_type.equals("International"))
		 {
			System.out.println("These are the spots that are suitable for "+Date_type);
			for (int i=0;i<All_Italy_trip.length;i++)
			{
				if (i!=0 && i%4==0)
				{
                    System.out.println((i+1)+". "+All_Italy_trip[i]+" ");
				}
				else{
					System.out.print((i+1)+". "+All_Italy_trip[i]+"  ");
				}
				
			}

		 }
         else if (location.equals("japan") && Date_type.equals("International"))
		 {
			System.out.println("These are the spots that are suitable for "+Date_type);
			for (int i=0;i<All_Japan_trip.length;i++)
			{
				if (i!=0 && i%4==0)
				{
                    System.out.println((i+1)+". "+All_Japan_trip[i]+" ");
				}
				else{
					System.out.print((i+1)+". "+All_Japan_trip[i]+"  ");
				}
				
			}

		 }
		 else if (location.equals("france") && Date_type.equals("International"))
		 {
			System.out.println("These are the spots that are suitable for "+Date_type);
			for (int i=0;i<All_france_trip.length;i++)
			{
				if (i!=0 && i%4==0)
				{
                    System.out.println((i+1)+". "+All_france_trip[i]+" ");
				}
				else{
					System.out.print((i+1)+". "+All_france_trip[i]+"  ");
				}
				
			}

		 }
		 else if (location.equals("australia") && Date_type.equals("International"))
		 {
			System.out.println("These are the spots that are suitable for "+Date_type);
			for (int i=0;i<All_Australia_trip.length;i++)
			{
				if (i!=0 && i%4==0)
				{
                    System.out.println((i+1)+". "+All_Australia_trip[i]+" ");
				}
				else{
					System.out.print((i+1)+". "+All_Australia_trip[i]+"  ");
				}
				
			}

		 }
		 else if (location.equals("peru") && Date_type.equals("International"))
		 {
			System.out.println("These are the spots that are suitable for "+Date_type);
			for (int i=0;i<All_Peru_trip.length;i++)
			{
				if (i!=0 && i%4==0)
				{
                    System.out.println((i+1)+". "+All_Peru_trip[i]+" ");
				}
				else{
					System.out.print((i+1)+". "+All_Peru_trip[i]+"  ");
				}
				
			}

		 }
		 else if (location.equals("thiland") && Date_type.equals("International"))
		 {
			System.out.println("These are the spots that are suitable for "+Date_type);
			for (int i=0;i<All_Thiland_trip.length;i++)
			{
				if (i!=0 && i%4==0)
				{
                    System.out.println((i+1)+". "+All_Thiland_trip[i]+" ");
				}
				else{
					System.out.print((i+1)+". "+All_Thiland_trip[i]+"  ");
				}
				
			}

		 }
		 else if (location.equals("africa") && Date_type.equals("International"))
		 {
			System.out.println("These are the spots that are suitable for "+Date_type);
			for (int i=0;i<All_South_africa_trip.length;i++)
			{
				if (i!=0 && i%4==0)
				{
                    System.out.println((i+1)+". "+All_South_africa_trip[i]+" ");
				}
				else{
					System.out.print((i+1)+". "+All_South_africa_trip[i]+"  ");
				}
				
			}

		 }






		 else
		{
			System.out.println("The location that you have choosen does not have any suitable option ");
		}
	   }
}
class Budget extends Location
{
	public void Date_budget(double budget,String Date_Type,String loc)
	{
        if (budget>=500 && budget<=15000 && Date_Type.equals("Picnic Date") && loc.equals("mumbai"))
	    {
           if(budget>=500 && budget<=1000)
		   {
			  System.out.println("Based on your budget of Rs."+budget);
			  System.out.println("These are the suitable locations");
			  for(int i=0;i<4;i++)
			  {
				System.out.println((i+1)+". "+ All_Mumbai[i]);
			  }
		   }else if(budget>=1001 && budget<=7000)
		   {
			  System.out.println("Based on your budget of Rs."+budget);
			  System.out.println("These are the suitable locations");
			  for(int i=4;i<8;i++)
			  {
				System.out.println((i+1)+". "+ All_Mumbai[i]);
			  }
		   }else if(budget>=7001 && budget<=15000)
		   {
			  System.out.println("Based on your budget of Rs."+budget);
			  System.out.println("These are the suitable locations");
			  for(int i=8;i<11;i++)
			  {
				System.out.println((i+1)+". "+ All_Mumbai[i]);
			  }
		   }
		   else
		   {
			System.out.println("Please enter the adequate amount");
		   }
		}
		else if (budget>=500 && budget<=15000 && Date_Type.equals("Picnic Date") && loc.equals("thane"))
	    {
           if(budget>=500 && budget<=1000)
		   {
			  System.out.println("Based on your budget of Rs."+budget);
			  System.out.println("These are the suitable locations");
			  for(int i=0;i<2;i++)
			  {
				System.out.println((i+1)+". "+ All_Thane[i]);
			  }
		   }else if(budget>=1001 && budget<=7000)
		   {
			  System.out.println("Based on your budget of Rs."+budget);
			  System.out.println("These are the suitable locations");
			  for(int i=2;i<4;i++)
			  {
				System.out.println((i+1)+". "+ All_Thane[i]);
			  }
		   }else if(budget>=7001 && budget<=15000)
		   {
			  System.out.println("Based on your budget of Rs."+budget);
			  System.out.println("These are the suitable locations");
			  for(int i=4;i<5;i++)
			  {
				System.out.println((i+1)+". "+ All_Thane[i]);
			  }
		   }
		   else
		   {
			System.out.println("Please enter the adequate amount");
		   }
		}
		else if (budget>=500 && budget<=15000 && Date_Type.equals("Picnic Date") && loc.equals("kalyan"))
	    {
           if(budget>=500 && budget<=1000)
		   {
			  System.out.println("Based on your budget of Rs."+budget);
			  System.out.println("These are the suitable locations");
			  for(int i=0;i<4;i++)
			  {
				System.out.println((i+1)+". "+ All_Kalyan[i]);
			  }
		   }else if(budget>=1001 && budget<=7000)
		   {
			  System.out.println("Based on your budget of Rs."+budget);
			  System.out.println("These are the suitable locations");
			  for(int i=4;i<8;i++)
			  {
				System.out.println((i+1)+". "+ All_Kalyan[i]);
			  }
		   }else if(budget>=7001 && budget<=15000)
		   {
			  System.out.println("Based on your budget of Rs."+budget);
			  System.out.println("These are the suitable locations");
			  for(int i=8;i<10;i++)
			  {
				System.out.println((i+1)+". "+ All_Kalyan[i]);
			  }
		   }
		   else
		   {
			System.out.println("Please enter the adequate amount");
		   }
		} 
		else if (budget>=500 && budget<=15000 && Date_Type.equals("Picnic Date") && loc.equals("mulund"))
		{
           if(budget>=500 && budget<=1000)
		   {
			  System.out.println("Based on your budget of Rs."+budget);
			  System.out.println("These are the suitable locations");
			  for(int i=0;i<2;i++)
			  {
				System.out.println((i+1)+". "+ All_Mulund[i]);
			  }
		   }else if(budget>=1001 && budget<=7000)
		   {
			  System.out.println("Based on your budget of Rs."+budget);
			  System.out.println("These are the suitable locations");
			  for(int i=2;i<4;i++)
			  {
				System.out.println((i+1)+". "+ All_Mulund[i]);
			  }
		   }else if(budget>=7001 && budget<=15000)
		   {
			  System.out.println("Based on your budget of Rs."+budget);
			  System.out.println("These are the suitable locations");
			  for(int i=4;i<10;i++)
			  {
				System.out.println((i+1)+". "+ All_Mulund[i]);
			  }
		   }
		   else
		   {
			System.out.println("Please enter the adequate amount");
		   }
		}
        else if (budget>=500 && budget<=15000 && Date_Type.equals("Walk Date") && loc.equals("mumbai"))
		{
           if(budget>=500 && budget<=1000)
		   {
			  System.out.println("Based on your budget of Rs."+budget);
			  System.out.println("These are the suitable locations");
			  for(int i=0;i<2;i++)
			  {
				System.out.println((i+1)+". "+ All_Mumbai_walk[i]);
			  }
		   }else if(budget>=1001 && budget<=7000)
		   {
			  System.out.println("Based on your budget of Rs."+budget);
			  System.out.println("These are the suitable locations");
			  for(int i=2;i<4;i++)
			  {
				System.out.println((i+1)+". "+ All_Mumbai_walk[i]);
			  }
		   }else if(budget>=7001 && budget<=15000)
		   {
			  System.out.println("Based on your budget of Rs."+budget);
			  System.out.println("These are the suitable locations");
			  for(int i=4;i<7;i++)
			  {
				System.out.println((i+1)+". "+ All_Mumbai_walk[i]);
			  }
		   }
		   else
		   {
			System.out.println("Please enter the adequate amount");
		   }
		}
		else if (budget>=500 && budget<=15000 && Date_Type.equals("Walk Date") && loc.equals("thane"))
		{
           if(budget>=500 && budget<=1000)
		   {
			  System.out.println("Based on your budget of Rs."+budget);
			  System.out.println("These are the suitable locations");
			  for(int i=0;i<2;i++)
			  {
				System.out.println((i+1)+". "+ All_Thane_walk[i]);
			  }
		   }else if(budget>=1001 && budget<=7000)
		   {
			  System.out.println("Based on your budget of Rs."+budget);
			  System.out.println("These are the suitable locations");
			  for(int i=2;i<4;i++)
			  {
				System.out.println((i+1)+". "+ All_Thane_walk[i]);
			  }
		   }else if(budget>=7001 && budget<=15000)
		   {
			  System.out.println("Based on your budget of Rs."+budget);
			  System.out.println("These are the suitable locations");
			  for(int i=4;i<7;i++)
			  {
				System.out.println((i+1)+". "+ All_Thane_walk[i]);
			  }
		   }
		   else
		   {
			System.out.println("Please enter the adequate amount");
		   }
		}
        else if (budget>=500 && budget<=15000 && Date_Type.equals("Walk Date") && loc.equals("kalyan"))
		{
           if(budget>=500 && budget<=1000)
		   {
			  System.out.println("Based on your budget of Rs."+budget);
			  System.out.println("These are the suitable locations");
			  for(int i=0;i<2;i++)
			  {
				System.out.println((i+1)+". "+ All_Kalyan_walk[i]);
			  }
		   }else if(budget>=1001 && budget<=7000)
		   {
			  System.out.println("Based on your budget of Rs."+budget);
			  System.out.println("These are the suitable locations");
			  for(int i=2;i<4;i++)
			  {
				System.out.println((i+1)+". "+ All_Kalyan_walk[i]);
			  }
		   }else if(budget>=7001 && budget<=15000)
		   {
			  System.out.println("Based on your budget of Rs."+budget);
			  System.out.println("These are the suitable locations");
			  for(int i=4;i<10;i++)
			  {
				System.out.println((i+1)+". "+ All_Kalyan_walk[i]);
			  }
		   }
		   else
		   {
			System.out.println("Please enter the adequate amount");
		   }
		}
		else if (budget>=500 && budget<=15000 && Date_Type.equals("Walk Date") && loc.equals("mulund"))
		{
           if(budget>=500 && budget<=1000)
		   {
			  System.out.println("Based on your budget of Rs."+budget);
			  System.out.println("These are the suitable locations");
			  for(int i=0;i<2;i++)
			  {
				System.out.println((i+1)+". "+ All_Mulund_walk[i]);
			  }
		   }else if(budget>=1001 && budget<=7000)
		   {
			  System.out.println("Based on your budget of Rs."+budget);
			  System.out.println("These are the suitable locations");
			  for(int i=0;i<2;i++)
			  {
				System.out.println((i+1)+". "+ All_Mulund_walk[i]);
			  }
		   }else if(budget>=7001 && budget<=15000)
		   {
			  System.out.println("Based on your budget of Rs."+budget);
			  System.out.println("These are the suitable locations");
			  for(int i=0;i<2;i++)
			  {
				System.out.println((i+1)+". "+ All_Mulund_walk[i]);
			  }
		   }
		   else
		   {
			System.out.println("Please enter the adequate amount");
		   }
		}
        else if (budget>=2000 && budget<=20000 && Date_Type.equals("Elegant Date") && loc.equals("mumbai"))
		{
           if(budget>=2000 && budget<=6000)
		   {
			  System.out.println("Based on your budget of Rs."+budget);
			  System.out.println("These are the suitable locations");
			  for(int i=0;i<2;i++)
			  {
				System.out.println((i+1)+". "+ All_Mumbai_elegant[i]);
			  }
		   }else if(budget>=6001 && budget<=12000)
		   {
			  System.out.println("Based on your budget of Rs."+budget);
			  System.out.println("These are the suitable locations");
			  for(int i=2;i<4;i++)
			  {
				System.out.println((i+1)+". "+ All_Mumbai_elegant[i]);
			  }
		   }else if(budget>=12001 && budget<=20000)
		   {
			  System.out.println("Based on your budget of Rs."+budget);
			  System.out.println("These are the suitable locations");
			  for(int i=4;i<7;i++)
			  {
				System.out.println((i+1)+". "+ All_Mumbai_elegant[i]);
			  }
		   }
		   else
		   {
			System.out.println("Please enter the adequate amount");
		   }
		}
		else if (budget>=2000 && budget<=20000 && Date_Type.equals("Elegant Date") && loc.equals("thane"))
		{
           if(budget>=2000 && budget<=6000)
		   {
			  System.out.println("Based on your budget of Rs."+budget);
			  System.out.println("These are the suitable locations");
			  for(int i=0;i<2;i++)
			  {
				System.out.println((i+1)+". "+ All_Thane_elegant[i]);
			  }
		   }else if(budget>=6001 && budget<=12000)
		   {
			  System.out.println("Based on your budget of Rs."+budget);
			  System.out.println("These are the suitable locations");
			  for(int i=2;i<4;i++)
			  {
				System.out.println((i+1)+". "+ All_Thane_elegant[i]);
			  }
		   }else if(budget>=12001 && budget<=20000)
		   {
			  System.out.println("Based on your budget of Rs."+budget);
			  System.out.println("These are the suitable locations");
			  for(int i=4;i<7;i++)
			  {
				System.out.println((i+1)+". "+ All_Thane_elegant[i]);
			  }
		   }
		   else
		   {
			System.out.println("Please enter the adequate amount");
		   }
		}
		else if (budget>=2000 && budget<=20000 && Date_Type.equals("Elegant Date") && loc.equals("kalyan"))
		{
           if(budget>=2000 && budget<=6000)
		   {
			  System.out.println("Based on your budget of Rs."+budget);
			  System.out.println("These are the suitable locations");
			  for(int i=0;i<2;i++)
			  {
				System.out.println((i+1)+". "+ All_Kalyan_elegant[i]);
			  }
		   }else if(budget>=6001 && budget<=12000)
		   {
			  System.out.println("Based on your budget of Rs."+budget);
			  System.out.println("These are the suitable locations");
			  for(int i=2;i<4;i++)
			  {
				System.out.println((i+1)+". "+ All_Kalyan_elegant[i]);
			  }
		   }else if(budget>=12001 && budget<=20000)
		   {
			  System.out.println("Based on your budget of Rs."+budget);
			  System.out.println("These are the suitable locations");
			  for(int i=4;i<6;i++)
			  {
				System.out.println((i+1)+". "+ All_Kalyan_elegant[i]);
			  }
		   }
		   else
		   {
			System.out.println("Please enter the adequate amount");
		   }
		}
        else if (budget>=2000 && budget<=20000 && Date_Type.equals("Elegant Date") && loc.equals("mulund"))
		{
           if(budget>=2000 && budget<=6000)
		   {
			  System.out.println("Based on your budget of Rs."+budget);
			  System.out.println("These are the suitable locations");
			  for(int i=0;i<2;i++)
			  {
				System.out.println((i+1)+". "+ All_Mulund_elegant[i]);
			  }
		   }else if(budget>=6001 && budget<=12000)
		   {
			  System.out.println("Based on your budget of Rs."+budget);
			  System.out.println("These are the suitable locations");
			  for(int i=2;i<4;i++)
			  {
				System.out.println((i+1)+". "+ All_Mulund_elegant[i]);
			  }
		   }else if(budget>=12001 && budget<=20000)
		   {
			  System.out.println("Based on your budget of Rs."+budget);
			  System.out.println("These are the suitable locations");
			  for(int i=4;i<7;i++)
			  {
				System.out.println((i+1)+". "+ All_Mulund_elegant[i]);
			  }
		   }
		   else
		   {
			System.out.println("Please enter the adequate amount");
		   }
		}
		else if (budget>=500 && budget<=2000 && Date_Type.equals("Movie Date") && loc.equals("mumbai"))
		{
           if(budget>=500 && budget<=2000)
		   {
			  System.out.println("Based on your budget of Rs."+budget);
			  System.out.println("These are the suitable locations");
			  for(int i=0;i<2;i++)
			  {
				System.out.println((i+1)+". "+ All_Mumbai_movie[i]);
			  }
		   }else if(budget>=1001 && budget<=1500)
		   {
			  System.out.println("Based on your budget of Rs."+budget);
			  System.out.println("These are the suitable locations");
			  for(int i=2;i<4;i++)
			  {
				System.out.println((i+1)+". "+ All_Mumbai_movie[i]);
			  }
		   }else if(budget>=1501 && budget<=2000)
		   {
			  System.out.println("Based on your budget of Rs."+budget);
			  System.out.println("These are the suitable locations");
			  for(int i=4;i<7;i++)
			  {
				System.out.println((i+1)+". "+ All_Mumbai_movie[i]);
			  }
		   }
		   else
		   {
			System.out.println("Please enter the adequate amount");
		   }
		}
        else if (budget>=500 && budget<=2000 && Date_Type.equals("Movie Date") && loc.equals("thane"))
		{
           if(budget>=500 && budget<=2000)
		   {
			  System.out.println("Based on your budget of Rs."+budget);
			  System.out.println("These are the suitable locations");
			  for(int i=0;i<2;i++)
			  {
				System.out.println((i+1)+". "+ All_Thane_movie[i]);
			  }
		   }else if(budget>=1001 && budget<=1500)
		   {
			  System.out.println("Based on your budget of Rs."+budget);
			  System.out.println("These are the suitable locations");
			  for(int i=2;i<4;i++)
			  {
				System.out.println((i+1)+". "+ All_Thane_movie[i]);
			  }
		   }else if(budget>=1501 && budget<=2000)
		   {
			  System.out.println("Based on your budget of Rs."+budget);
			  System.out.println("These are the suitable locations");
			  for(int i=4;i<7;i++)
			  {
				System.out.println((i+1)+". "+ All_Thane_movie[i]);
			  }
		   }
		   else
		   {
			System.out.println("Please enter the adequate amount");
		   }
		}
		else if (budget>=500 && budget<=2000 && Date_Type.equals("Movie Date") && loc.equals("kalyan"))
		{
           if(budget>=500 && budget<=2000)
		   {
			  System.out.println("Based on your budget of Rs."+budget);
			  System.out.println("These are the suitable locations");
			  for(int i=0;i<2;i++)
			  {
				System.out.println((i+1)+". "+ All_Kalyan_movie[i]);
			  }
		   }else if(budget>=1001 && budget<=1500)
		   {
			  System.out.println("Based on your budget of Rs."+budget);
			  System.out.println("These are the suitable locations");
			  for(int i=2;i<4;i++)
			  {
				System.out.println((i+1)+". "+ All_Kalyan_movie[i]);
			  }
		   }else if(budget>=1501 && budget<=2000)
		   {
			  System.out.println("Based on your budget of Rs."+budget);
			  System.out.println("These are the suitable locations");
			  for(int i=4;i<7;i++)
			  {
				System.out.println((i+1)+". "+ All_Kalyan_movie[i]);
			  }
		   }
		   else
		   {
			System.out.println("Please enter the adequate amount");
		   }
		}
        else if (budget>=500 && budget<=2000 && Date_Type.equals("Movie Date") && loc.equals("mulund"))
		{
           if(budget>=500 && budget<=2000)
		   {
			  System.out.println("Based on your budget of Rs."+budget);
			  System.out.println("These are the suitable locations");
			  for(int i=0;i<2;i++)
			  {
				System.out.println((i+1)+". "+ All_Mulund_movie[i]);
			  }
		   }else if(budget>=1001 && budget<=1500)
		   {
			  System.out.println("Based on your budget of Rs."+budget);
			  System.out.println("These are the suitable locations");
			  for(int i=2;i<4;i++)
			  {
				System.out.println((i+1)+". "+ All_Mulund_movie[i]);
			  }
		   }else if(budget>=1501 && budget<=2000)
		   {
			  System.out.println("Based on your budget of Rs."+budget);
			  System.out.println("These are the suitable locations");
			  for(int i=4;i<5;i++)
			  {
				System.out.println((i+1)+". "+ All_Mulund_movie[i]);
			  }
		   }
		   else
		   {
			System.out.println("Please enter the adequate amount");
		   }
		}
        else if (budget>=10000 && budget<=25000 && Date_Type.equals("Domestic") && loc.equals("delhi"))
	    {
           if(budget>=10000 && budget<=15000)
		   {
			  System.out.println("Based on your budget of Rs."+budget);
			  System.out.println("These are the suitable locations");
			  for(int i=0;i<2;i++)
			  {
				System.out.println((i+1)+". "+ All_Delhi_trip[i]);
			  }
		   }else if(budget>=15001 && budget<=20000)
		   {
			  System.out.println("Based on your budget of Rs."+budget);
			  System.out.println("These are the suitable locations");
			  for(int i=2;i<4;i++)
			  {
				System.out.println((i+1)+". "+ All_Delhi_trip[i]);
			  }
		   }else if(budget>=20001 && budget<=25000)
		   {
			  System.out.println("Based on your budget of Rs."+budget);
			  System.out.println("These are the suitable locations");
			  for(int i=4;i<7;i++)
			  {
				System.out.println((i+1)+". "+ All_Delhi_trip[i]);
			  }
		   }
		   else
		   {
			System.out.println("Please enter the adequate amount");
		   }
		}
        else if (budget>=10000 && budget<=25000 && Date_Type.equals("Domestic") && loc.equals("goa"))
	    {
           if(budget>=10000 && budget<=15000)
		   {
			  System.out.println("Based on your budget of Rs."+budget);
			  System.out.println("These are the suitable locations");
			  for(int i=0;i<2;i++)
			  {
				System.out.println((i+1)+". "+ All_goa_trip[i]);
			  }
		   }else if(budget>=15001 && budget<=20000)
		   {
			  System.out.println("Based on your budget of Rs."+budget);
			  System.out.println("These are the suitable locations");
			  for(int i=2;i<4;i++)
			  {
				System.out.println((i+1)+". "+ All_goa_trip[i]);
			  }
		   }else if(budget>=20001 && budget<=25000)
		   {
			  System.out.println("Based on your budget of Rs."+budget);
			  System.out.println("These are the suitable locations");
			  for(int i=4;i<6;i++)
			  {
				System.out.println((i+1)+". "+ All_goa_trip[i]);
			  }
		   }
		   else
		   {
			System.out.println("Please enter the adequate amount");
		   }
		}
        else if (budget>=10000 && budget<=25000 && Date_Type.equals("Domestic") && loc.equals("utharakhand"))
	    {
           if(budget>=10000 && budget<=15000)
		   {
			  System.out.println("Based on your budget of Rs."+budget);
			  System.out.println("These are the suitable locations");
			  for(int i=0;i<2;i++)
			  {
				System.out.println((i+1)+". "+ All_Utharakhand_trip[i]);
			  }
		   }else if(budget>=15001 && budget<=20000)
		   {
			  System.out.println("Based on your budget of Rs."+budget);
			  System.out.println("These are the suitable locations");
			  for(int i=2;i<4;i++)
			  {
				System.out.println((i+1)+". "+ All_Utharakhand_trip[i]);
			  }
		   }else if(budget>=20001 && budget<=25000)
		   {
			  System.out.println("Based on your budget of Rs."+budget);
			  System.out.println("These are the suitable locations");
			  for(int i=4;i<6;i++)
			  {
				System.out.println((i+1)+". "+ All_Utharakhand_trip[i]);
			  }
		   }
		   else
		   {
			System.out.println("Please enter the adequate amount");
		   }
		}
        else if (budget>=10000 && budget<=25000 && Date_Type.equals("Domestic") && loc.equals("kerala"))
	    {
           if(budget>=10000 && budget<=15000)
		   {
			  System.out.println("Based on your budget of Rs."+budget);
			  System.out.println("These are the suitable locations");
			  for(int i=0;i<2;i++)
			  {
				System.out.println((i+1)+". "+ All_Kerala_trip[i]);
			  }
		   }else if(budget>=15001 && budget<=20000)
		   {
			  System.out.println("Based on your budget of Rs."+budget);
			  System.out.println("These are the suitable locations");
			  for(int i=2;i<4;i++)
			  {
				System.out.println((i+1)+". "+ All_Kerala_trip[i]);
			  }
		   }else if(budget>=20001 && budget<=25000)
		   {
			  System.out.println("Based on your budget of Rs."+budget);
			  System.out.println("These are the suitable locations");
			  for(int i=4;i<7;i++)
			  {
				System.out.println((i+1)+". "+ All_Kerala_trip[i]);
			  }
		   }
		   else
		   {
			System.out.println("Please enter the adequate amount");
		   }
		}
        else if (budget>=10000 && budget<=25000 && Date_Type.equals("Domestic") && loc.equals("jammu"))
	    {
           if(budget>=10000 && budget<=15000)
		   {
			  System.out.println("Based on your budget of Rs."+budget);
			  System.out.println("These are the suitable locations");
			  for(int i=0;i<2;i++)
			  {
				System.out.println((i+1)+". "+ All_Jammu_karshmir[i]);
			  }
		   }else if(budget>=15001 && budget<=20000)
		   {
			  System.out.println("Based on your budget of Rs."+budget);
			  System.out.println("These are the suitable locations");
			  for(int i=2;i<4;i++)
			  {
				System.out.println((i+1)+". "+ All_Jammu_karshmir[i]);
			  }
		   }else if(budget>=20001 && budget<=25000)
		   {
			  System.out.println("Based on your budget of Rs."+budget);
			  System.out.println("These are the suitable locations");
			  for(int i=4;i<6;i++)
			  {
				System.out.println((i+1)+". "+ All_Jammu_karshmir[i]);
			  }
		   }
		   else
		   {
			System.out.println("Please enter the adequate amount");
		   }
		}
        else if (budget>=10000 && budget<=25000 && Date_Type.equals("Domestic") && loc.equals("bengal"))
	    {
           if(budget>=10000 && budget<=15000)
		   {
			  System.out.println("Based on your budget of Rs."+budget);
			  System.out.println("These are the suitable locations");
			  for(int i=0;i<2;i++)
			  {
				System.out.println((i+1)+". "+ All_West_Bengal[i]);
			  }
		   }else if(budget>=15001 && budget<=20000)
		   {
			  System.out.println("Based on your budget of Rs."+budget);
			  System.out.println("These are the suitable locations");
			  for(int i=2;i<4;i++)
			  {
				System.out.println((i+1)+". "+ All_West_Bengal[i]);
			  }
		   }else if(budget>=20001 && budget<=25000)
		   {
			  System.out.println("Based on your budget of Rs."+budget);
			  System.out.println("These are the suitable locations");
			  for(int i=4;i<6;i++)
			  {
				System.out.println((i+1)+". "+ All_West_Bengal[i]);
			  }
		   }
		   else
		   {
			System.out.println("Please enter the adequate amount");
		   }
		}
        else if (budget>=10000 && budget<=25000 && Date_Type.equals("Domestic") && loc.equals("gujarat"))
	    {
           if(budget>=10000 && budget<=15000)
		   {
			  System.out.println("Based on your budget of Rs."+budget);
			  System.out.println("These are the suitable locations");
			  for(int i=0;i<2;i++)
			  {
				System.out.println((i+1)+". "+ All_Gujarat_trip[i]);
			  }
		   }else if(budget>=15001 && budget<=20000)
		   {
			  System.out.println("Based on your budget of Rs."+budget);
			  System.out.println("These are the suitable locations");
			  for(int i=2;i<4;i++)
			  {
				System.out.println((i+1)+". "+ All_Gujarat_trip[i]);
			  }
		   }else if(budget>=20001 && budget<=25000)
		   {
			  System.out.println("Based on your budget of Rs."+budget);
			  System.out.println("These are the suitable locations");
			  for(int i=4;i<6;i++)
			  {
				System.out.println((i+1)+". "+ All_Gujarat_trip[i]);
			  }
		   }
		   else
		   {
			System.out.println("Please enter the adequate amount");
		   }
		}
        else if (budget>=10000 && budget<=25000 && Date_Type.equals("International") && loc.equals("italy"))
	    {
           if(budget>=10000 && budget<=15000)
		   {
			  System.out.println("Based on your budget of Rs."+budget);
			  System.out.println("These are the suitable locations");
			  for(int i=0;i<2;i++)
			  {
				System.out.println((i+1)+". "+ All_Italy_trip[i]);
			  }
		   }else if(budget>=15001 && budget<=20000)
		   {
			  System.out.println("Based on your budget of Rs."+budget);
			  System.out.println("These are the suitable locations");
			  for(int i=2;i<4;i++)
			  {
				System.out.println((i+1)+". "+ All_Italy_trip[i]);
			  }
		   }else if(budget>=20001 && budget<=25000)
		   {
			  System.out.println("Based on your budget of Rs."+budget);
			  System.out.println("These are the suitable locations");
			  for(int i=4;i<7;i++)
			  {
				System.out.println((i+1)+". "+ All_Italy_trip[i]);
			  }
		   }
		   else
		   {
			System.out.println("Please enter the adequate amount");
		   }
		}
        else if (budget>=10000 && budget<=25000 && Date_Type.equals("International") && loc.equals("japan"))
	    {
           if(budget>=10000 && budget<=15000)
		   {
			  System.out.println("Based on your budget of Rs."+budget);
			  System.out.println("These are the suitable locations");
			  for(int i=0;i<2;i++)
			  {
				System.out.println((i+1)+". "+ All_Japan_trip[i]);
			  }
		   }else if(budget>=15001 && budget<=20000)
		   {
			  System.out.println("Based on your budget of Rs."+budget);
			  System.out.println("These are the suitable locations");
			  for(int i=2;i<4;i++)
			  {
				System.out.println((i+1)+". "+ All_Japan_trip[i]);
			  }
		   }else if(budget>=20001 && budget<=25000)
		   {
			  System.out.println("Based on your budget of Rs."+budget);
			  System.out.println("These are the suitable locations");
			  for(int i=4;i<7;i++)
			  {
				System.out.println((i+1)+". "+ All_Japan_trip[i]);
			  }
		   }
		   else
		   {
			System.out.println("Please enter the adequate amount");
		   }
		}
        else if (budget>=10000 && budget<=25000 && Date_Type.equals("International") && loc.equals("france"))
	    {
           if(budget>=10000 && budget<=15000)
		   {
			  System.out.println("Based on your budget of Rs."+budget);
			  System.out.println("These are the suitable locations");
			  for(int i=0;i<2;i++)
			  {
				System.out.println((i+1)+". "+ All_france_trip[i]);
			  }
		   }else if(budget>=15001 && budget<=20000)
		   {
			  System.out.println("Based on your budget of Rs."+budget);
			  System.out.println("These are the suitable locations");
			  for(int i=2;i<4;i++)
			  {
				System.out.println((i+1)+". "+ All_france_trip[i]);
			  }
		   }else if(budget>=20001 && budget<=25000)
		   {
			  System.out.println("Based on your budget of Rs."+budget);
			  System.out.println("These are the suitable locations");
			  for(int i=4;i<7;i++)
			  {
				System.out.println((i+1)+". "+ All_france_trip[i]);
			  }
		   }
		   else
		   {
			System.out.println("Please enter the adequate amount");
		   }
		}
        else if (budget>=10000 && budget<=25000 && Date_Type.equals("International") && loc.equals("australia"))
	    {
           if(budget>=10000 && budget<=15000)
		   {
			  System.out.println("Based on your budget of Rs."+budget);
			  System.out.println("These are the suitable locations");
			  for(int i=0;i<2;i++)
			  {
				System.out.println((i+1)+". "+ All_Australia_trip[i]);
			  }
		   }else if(budget>=15001 && budget<=20000)
		   {
			  System.out.println("Based on your budget of Rs."+budget);
			  System.out.println("These are the suitable locations");
			  for(int i=2;i<4;i++)
			  {
				System.out.println((i+1)+". "+ All_Australia_trip[i]);
			  }
		   }else if(budget>=20001 && budget<=25000)
		   {
			  System.out.println("Based on your budget of Rs."+budget);
			  System.out.println("These are the suitable locations");
			  for(int i=4;i<7;i++)
			  {
				System.out.println((i+1)+". "+ All_Australia_trip[i]);
			  }
		   }
		   else
		   {
			System.out.println("Please enter the adequate amount");
		   }
		}
        else if (budget>=10000 && budget<=25000 && Date_Type.equals("International") && loc.equals("peru"))
	    {
           if(budget>=10000 && budget<=15000)
		   {
			  System.out.println("Based on your budget of Rs."+budget);
			  System.out.println("These are the suitable locations");
			  for(int i=0;i<2;i++)
			  {
				System.out.println((i+1)+". "+ All_Peru_trip[i]);
			  }
		   }else if(budget>=15001 && budget<=20000)
		   {
			  System.out.println("Based on your budget of Rs."+budget);
			  System.out.println("These are the suitable locations");
			  for(int i=2;i<4;i++)
			  {
				System.out.println((i+1)+". "+ All_Peru_trip[i]);
			  }
		   }else if(budget>=20001 && budget<=25000)
		   {
			  System.out.println("Based on your budget of Rs."+budget);
			  System.out.println("These are the suitable locations");
			  for(int i=4;i<7;i++)
			  {
				System.out.println((i+1)+". "+ All_Peru_trip[i]);
			  }
		   }
		   else
		   {
			System.out.println("Please enter the adequate amount");
		   }
		}
        else if (budget>=10000 && budget<=25000 && Date_Type.equals("International") && loc.equals("thiland"))
	    {
           if(budget>=10000 && budget<=15000)
		   {
			  System.out.println("Based on your budget of Rs."+budget);
			  System.out.println("These are the suitable locations");
			  for(int i=0;i<2;i++)
			  {
				System.out.println((i+1)+". "+ All_Thiland_trip[i]);
			  }
		   }else if(budget>=15001 && budget<=20000)
		   {
			  System.out.println("Based on your budget of Rs."+budget);
			  System.out.println("These are the suitable locations");
			  for(int i=2;i<4;i++)
			  {
				System.out.println((i+1)+". "+ All_Thiland_trip[i]);
			  }
		   }else if(budget>=20001 && budget<=25000)
		   {
			  System.out.println("Based on your budget of Rs."+budget);
			  System.out.println("These are the suitable locations");
			  for(int i=4;i<7;i++)
			  {
				System.out.println((i+1)+". "+ All_Thiland_trip[i]);
			  }
		   }
		   else
		   {
			System.out.println("Please enter the adequate amount");
		   }
		}
        else if (budget>=10000 && budget<=25000 && Date_Type.equals("International") && loc.equals("africa"))
	    {
           if(budget>=10000 && budget<=15000)
		   {
			  System.out.println("Based on your budget of Rs."+budget);
			  System.out.println("These are the suitable locations");
			  for(int i=0;i<2;i++)
			  {
				System.out.println((i+1)+". "+ All_South_africa_trip[i]);
			  }
		   }else if(budget>=15001 && budget<=20000)
		   {
			  System.out.println("Based on your budget of Rs."+budget);
			  System.out.println("These are the suitable locations");
			  for(int i=2;i<4;i++)
			  {
				System.out.println((i+1)+". "+ All_South_africa_trip[i]);
			  }
		   }else if(budget>=20001 && budget<=25000)
		   {
			  System.out.println("Based on your budget of Rs."+budget);
			  System.out.println("These are the suitable locations");
			  for(int i=4;i<7;i++)
			  {
				System.out.println((i+1)+". "+ All_South_africa_trip[i]);
			  }
		   }
		   else
		   {
			System.out.println("Please enter the adequate amount");
		   }
		}

		else
		{
			System.out.println("The budget is not suitable");
		}
				
	}
}

class Wheather extends Budget
{
	public void check_weather(int loc_choice,int x,String loc,String Date_Type)
	{
		if(Date_Type.equals("Picnic Date"))
		{
			if (loc.equals("mumbai"))
			{
			if (x==1)
			{
				System.out.println("The weather of "+All_Mumbai[loc_choice-1]+" is good enjoy");
			}
			else{
				System.out.println("The weather of "+All_Mumbai[loc_choice-1]+" is not pleasant");
			}
			}
			else if (loc.equals("thane"))
			{
				if (x==1)
			{
				System.out.println("The weather of "+All_Thane[loc_choice-1]+" is good enjoy");
			}
			else{
				System.out.println("The weather of "+All_Thane[loc_choice-1]+" is not pleasant");
			}
			}
			else if (loc.equals("kalyan"))
			{
				if (x==1)
			{
				System.out.println("The weather of "+All_Kalyan[loc_choice-1]+" is good enjoy");
			}
			else{
				System.out.println("The weather of "+All_Kalyan[loc_choice-1]+" is not pleasant");
			}
			}
			else if (loc.equals("mulund"))
			{
				if (x==1)
			{
				System.out.println("The weather of "+All_Mulund[loc_choice-1]+" is good enjoy");
			}
			else{
				System.out.println("The weather of "+All_Mulund[loc_choice-1]+" is not pleasant");
			}
			} 
	    }
		else if(Date_Type.equals("Walk Date"))
		{
			if (loc.equals("mumbai"))
			{
			if (x==1)
			{
				System.out.println("The weather of "+All_Mumbai_walk[loc_choice-1]+" is good enjoy");
			}
			else{
				System.out.println("The weather of "+All_Mumbai_walk[loc_choice-1]+" is not pleasant");
			}
			}
			else if (loc.equals("thane"))
			{
				if (x==1)
			{
				System.out.println("The weather of "+All_Thane_walk[loc_choice-1]+" is good enjoy");
			}
			else{
				System.out.println("The weather of "+All_Thane_walk[loc_choice-1]+" is not pleasant");
			}
			}
			else if (loc.equals("kalyan"))
			{
				if (x==1)
			{
				System.out.println("The weather of "+All_Kalyan_walk[loc_choice-1]+" is good enjoy");
			}
			else{
				System.out.println("The weather of "+All_Kalyan_walk[loc_choice-1]+" is not pleasant");
			}
			}
			else if (loc.equals("mulund"))
			{
				if (x==1)
			{
				System.out.println("The weather of "+All_Mulund_walk[loc_choice-1]+" is good enjoy");
			}
			else{
				System.out.println("The weather of "+All_Mulund_walk[loc_choice-1]+" is not pleasant");
			}
			} 
	    }
        else if(Date_Type.equals("Elegant Date"))
		{
			if (loc.equals("mumbai"))
			{
			if (x==1)
			{
				System.out.println("The weather of "+All_Mumbai_elegant[loc_choice-1]+" is good enjoy");
			}
			else{
				System.out.println("The weather of "+All_Mumbai_elegant[loc_choice-1]+" is not pleasant");
			}
			}
			else if (loc.equals("thane"))
			{
				if (x==1)
			{
				System.out.println("The weather of "+All_Thane_elegant[loc_choice-1]+" is good enjoy");
			}
			else{
				System.out.println("The weather of "+All_Thane_elegant[loc_choice-1]+" is not pleasant");
			}
			}
			else if (loc.equals("kalyan"))
			{
				if (x==1)
			{
				System.out.println("The weather of "+All_Kalyan_elegant[loc_choice-1]+" is good enjoy");
			}
			else{
				System.out.println("The weather of "+All_Kalyan_elegant[loc_choice-1]+" is not pleasant");
			}
			}
			else if (loc.equals("mulund"))
			{
				if (x==1)
			{
				System.out.println("The weather of "+All_Mulund_elegant[loc_choice-1]+" is good enjoy");
			}
			else{
				System.out.println("The weather of "+All_Mulund_elegant[loc_choice-1]+" is not pleasant");
			}
			} 
	    }
        else if(Date_Type.equals("Movie Date"))
		{
			if (loc.equals("mumbai"))
			{
			if (x==1)
			{
				System.out.println("The weather of "+All_Mumbai_movie[loc_choice-1]+" is good enjoy");
			}
			else{
				System.out.println("The weather of "+All_Mumbai_movie[loc_choice-1]+" is not pleasant");
			}
			}
			else if (loc.equals("thane"))
			{
				if (x==1)
			{
				System.out.println("The weather of "+All_Thane_movie[loc_choice-1]+" is good enjoy");
			}
			else{
				System.out.println("The weather of "+All_Thane_movie[loc_choice-1]+" is not pleasant");
			}
			}
			else if (loc.equals("kalyan"))
			{
				if (x==1)
			{
				System.out.println("The weather of "+All_Kalyan_movie[loc_choice-1]+" is good enjoy");
			}
			else{
				System.out.println("The weather of "+All_Kalyan_movie[loc_choice-1]+" is not pleasant");
			}
			}
			else if (loc.equals("mulund"))
			{
				if (x==1)
			{
				System.out.println("The weather of "+All_Mulund_movie[loc_choice-1]+" is good enjoy");
			}
			else{
				System.out.println("The weather of "+All_Mulund_movie[loc_choice-1]+" is not pleasant");
			}
			} 
	    }
        else if(Date_Type.equals("Domestic"))
		{
			if (loc.equals("delhi"))
			{
				if (x==1)
				{
					System.out.println("The weather of "+All_Delhi_trip[loc_choice-1]+" is good enjoy");
				}
				else{
					System.out.println("The weather of "+All_Delhi_trip[loc_choice-1]+" is not pleasant");
				}
			}
			else if (loc.equals("goa"))
			{
				if (x==1)
				{
					System.out.println("The weather of "+All_goa_trip[loc_choice-1]+" is good enjoy");
				}
				else{
					System.out.println("The weather of "+All_goa_trip[loc_choice-1]+" is not pleasant");
				}
			}
			else if (loc.equals("utharakhand"))
			{
				if (x==1)
				{
					System.out.println("The weather of "+All_Utharakhand_trip[loc_choice-1]+" is good enjoy");
				}
				else{
					System.out.println("The weather of "+All_Utharakhand_trip[loc_choice-1]+" is not pleasant");
				}
			}
			else if (loc.equals("kerala"))
			{
				if (x==1)
				{
					System.out.println("The weather of "+All_Kerala_trip[loc_choice-1]+" is good enjoy");
				}
				else{
					System.out.println("The weather of "+All_Kerala_trip[loc_choice-1]+" is not pleasant");
				}
			}
			else if (loc.equals("jammu"))
			{
				if (x==1)
				{
					System.out.println("The weather of "+All_Jammu_karshmir[loc_choice-1]+" is good enjoy");
				}
				else{
					System.out.println("The weather of "+All_Jammu_karshmir[loc_choice-1]+" is not pleasant");
				}
			}
			else if (loc.equals("bengal"))
			{
				if (x==1)
				{
					System.out.println("The weather of "+All_West_Bengal[loc_choice-1]+" is good enjoy");
				}
				else{
					System.out.println("The weather of "+All_West_Bengal[loc_choice-1]+" is not pleasant");
				}
			}
			else if (loc.equals("gujarat"))
			{
				if (x==1)
				{
					System.out.println("The weather of "+All_Gujarat_trip[loc_choice-1]+" is good enjoy");
				}
				else{
					System.out.println("The weather of "+All_Gujarat_trip[loc_choice-1]+" is not pleasant");
				}
			}
		} 
        else if(Date_Type.equals("International"))
		{
			if (loc.equals("italy"))
			{
				if (x==1)
				{
					System.out.println("The weather of "+All_Italy_trip[loc_choice-1]+" is good enjoy");
				}
				else{
					System.out.println("The weather of "+All_Italy_trip[loc_choice-1]+" is not pleasant");
				}
			}
			else if (loc.equals("japan"))
			{
				if (x==1)
				{
					System.out.println("The weather of "+All_Japan_trip[loc_choice-1]+" is good enjoy");
				}
				else{
					System.out.println("The weather of "+All_Japan_trip[loc_choice-1]+" is not pleasant");
				}
			}
			else if (loc.equals("australia"))
			{
				if (x==1)
				{
					System.out.println("The weather of "+All_Australia_trip[loc_choice-1]+" is good enjoy");
				}
				else{
					System.out.println("The weather of "+All_Australia_trip[loc_choice-1]+" is not pleasant");
				}
			}
			else if (loc.equals("Peru"))
			{
				if (x==1)
				{
					System.out.println("The weather of "+All_Peru_trip[loc_choice-1]+" is good enjoy");
				}
				else{
					System.out.println("The weather of "+All_Peru_trip[loc_choice-1]+" is not pleasant");
				}
			}
			else if (loc.equals("france"))
			{
				if (x==1)
				{
					System.out.println("The weather of "+All_france_trip[loc_choice-1]+" is good enjoy");
				}
				else{
					System.out.println("The weather of "+All_france_trip[loc_choice-1]+" is not pleasant");
				}
			}
			else if (loc.equals("thiland"))
			{
				if (x==1)
				{
					System.out.println("The weather of "+All_Thiland_trip[loc_choice-1]+" is good enjoy");
				}
				else{
					System.out.println("The weather of "+All_Thiland_trip[loc_choice-1]+" is not pleasant");
				}
			}
			else if (loc.equals("africa"))
			{
				if (x==1)
				{
					System.out.println("The weather of "+All_South_africa_trip[loc_choice-1]+" is good enjoy");
				}
				else{
					System.out.println("The weather of "+All_South_africa_trip[loc_choice-1]+" is not pleasant");
				}
			}
		} 

	}

}

class Picnic_dates extends Wheather
{
	public void picnic_loc(int loc_choice,String loc)
	{
		if (loc.equals("mumbai"))
		{  
			switch(loc_choice)
			{
				case 1:
				System.out.println(All_Mumbai[loc_choice-1]+":");
				System.out.println("TThe Elephanta Caves are a collection of cave temples predominantly dedicated to the Hindu god Shiva, which have been designated a UNESCO World Heritage Site.[1][2][3] They are on Elephanta Island, or Gharapuri , in Mumbai Harbour, 10 kilometres (6.2 mi) east of Mumbai in the Indian state of Maharashtra. The island, about 2 kilometres (1.2 mi) west of the Jawaharlal Nehru Port, consists of five Hindu caves, a few Buddhist stupa mounds that date back to the 2nd century BCE, and two Buddhist caves with water tanks.");
				break;
				case 2:
				System.out.println(All_Mumbai[loc_choice-1]+":");
				System.out.println("Vasai, situated about 48 km north of Mumbai across the Ulhas River, was the seat of the Northern Court, capital of the Portuguese possessions extending from Chaul-Revdanda to the south of Mumbai, to Oman in the Persian Gulf. Though the fort is now in ruins, it still speaks of the grandeur of the era. Vasai was also called Bassein. Bassein is the English version of Portuguese Ba\u00E7aim. Vasai rose to prominence when the ancient harbor of Sopara (now Nalla Sopara) became unfit for use. ");
				break;
				case 3:
				System.out.println(All_Mumbai[loc_choice-1]+":");
				System.out.println("Located near Mumbai, Matheran is a small hill station in Maharashtra\u2019s Raigad district that is an ideal place to get away when you want a break from the hustle bustle of the big city. It is especially beautiful in monsoon when the waterfalls nearby are at their roaring best and the deep forests are green and lush. With so much to offer, there are many fun and exciting things to do in Matheran, especially if you are a nature and adventure lover. Read on to get all the deets!");
				break;
				case 4:
				System.out.println(All_Mumbai[loc_choice-1]+":");
				System.out.println("Alibaug is a coastal town in Raigad, Maharashtra. Its beaches are very popular and Alibaug is a popular getaway from Mumbai since it\u2019s located just about 100 kms from Mumbai. Alibaug is well-connected with Mumbai by road, rail and ferry.");
				break;
				case 5:
				System.out.println(All_Mumbai[loc_choice-1]+":");
				System.out.println("This park is also known as the Shoe Park because it has this huge old woman\u2019s shoe located inside it. Very popular with children who love to climb on the shoe!\r\n");
				break;
				case 6:
				System.out.println(All_Mumbai[loc_choice-1]+":");
				System.out.println("The Hanging Gardens are also known as Pherozeshah Mehta Gardens. They are located in Malabar Hill, opposite the Kamala Nehru Park (known for the huge shoe built within the garden) and are very popular with children!");
				break;
				case 7:
				System.out.println(All_Mumbai[loc_choice-1]+":");
				System.out.println("Visit one of India's most spectacular theme parks, Imagica, with this family-friendly experience, complete with unlimited access to rides. You'll have the choice of a regular entry ticket or a combo ticket, which includes an hour's access to the adjacent Snow Park, complete with slopes for sledding. Attractions range from scaled-down kids' rides, as well as a few thrilling roller coasters that aren't for the faint of heart.");
				break;
				case 8:
				System.out.println(All_Mumbai[loc_choice-1]+":");
				System.out.println(" A good initiative started there to reduce plastic waste that the number of plastic items you carry to the top must be returned with you otherwise they will take fine. One more thing is that you should carry sufficient amounf of water as you won't find it anywhere through the climbing. Overall a very good experience");
				break;
				case 9:
				System.out.println("9");
				break;
				default:
				System.out.println("The value enterd is not valid");
			}
		}
		else if (loc.equals("thane"))
		{
			switch(loc_choice)
			{
				case 1:
				System.out.println(All_Thane[loc_choice-1]+":");
				break;
				case 2:
				System.out.println(All_Thane[loc_choice-1]+":");
				break;
				case 3:
				System.out.println(All_Thane[loc_choice-1]+":");
				break;
				case 4:
				System.out.println(All_Thane[loc_choice-1]+":");
				break;
				case 5:
				System.out.println(All_Thane[loc_choice-1]+":");
				break;
			}
		}
		else if (loc.equals("kalyan"))
		{
			switch(loc_choice)
			{
				case 1:
				System.out.println(All_Kalyan[loc_choice-1]+":");
				break;
				case 2:
				System.out.println(All_Kalyan[loc_choice-1]+":");
				break;
				case 3:
				System.out.println(All_Kalyan[loc_choice-1]+":");
				break;
				case 4:
				System.out.println(All_Kalyan[loc_choice-1]+":");
				break;
				case 5:
				System.out.println(All_Kalyan[loc_choice-1]+":");
				break;
				case 6:
				System.out.println(All_Kalyan[loc_choice-1]+":");
				break;
				case 7:
				System.out.println(All_Kalyan[loc_choice-1]+":");
				break;
				case 8:
				System.out.println(All_Kalyan[loc_choice-1]+":");
				break;
				case 9:
				System.out.println(All_Kalyan[loc_choice-1]+":");
				break;
				case 10:
				System.out.println(All_Kalyan[loc_choice-1]+":");
				break;
			}
		}
		else if (loc.equals("mulund"))
		{
			switch(loc_choice)
			{
				case 1:
				System.out.println(All_Mulund[loc_choice-1]+":");
				break;
				case 2:
				System.out.println(All_Mulund[loc_choice-1]+":");
				break;
				case 3:
				System.out.println(All_Mulund[loc_choice-1]+":");
				break;
				case 4:
				System.out.println(All_Mulund[loc_choice-1]+":");
				break;
				case 5:
				System.out.println(All_Mulund[loc_choice-1]+":");
				break;
				case 6:
				System.out.println(All_Mulund[loc_choice-1]+":");
				break;
				default:
				System.out.println("Please enter a valid Input");

			}
		}
	}
	
}
class Walk_dates extends Wheather 
{
	public void walk_loc(int loc_choice,String loc)
	{
		if (loc.equals("mumbai"))
		{  
			switch(loc_choice)
			{
				case 1:
				System.out.println(All_Mumbai_walk[loc_choice-1]+":");
				System.out.println("Have a brisk morning or evening walk at The Joggers\u2019 Park situated in Lokhandwala, Andheri. The park is almost 30 years old and considered to be the best place to walk in the suburbs. This 16,600 acres long park is a famous hub for networking. As the park is situated near the mangrove area, the climate remains cool and pleasant (relatively). There is another Joggers\u2019 park at Bandra. The Bandra Park provides a seaside view off Carter Road.");
				break;
				case 2:
				System.out.println(All_Mumbai_walk[loc_choice-1]+":");
				System.out.println("Nirvana Park is an attractive and large park in Powai. It has an oriental theme with fish ponds, Asian lanterns etc. and a sizeable place to relax. The garden is true to its name due as it is surrounded by lush flora and various fauna \u2013 a perfect place for kids. This 4 acres land is well maintained for walks.");
				break;
				case 3:
				System.out.println(All_Mumbai_walk[loc_choice-1]+":");
				System.out.println("The Priyadarshini Park is a 20-acre historical landmark situated in South Mumbai. The park holds many activities like Tennis court, Yoga, and Aerobatics which has dedicated sections. Since its foundation in 1970, the park has grown as a place for nature and sports to thrive. In recent times, Priyadarshini Park also called as PDP is growing from strength to strength with the latest sea walk and sports excellence.");
				break;
				case 4:
				System.out.println(All_Mumbai_walk[loc_choice-1]+":");
				System.out.println("Mancherji Joshi Gardens famously known as Five Gardens is situated at Dadar. It is an open garden park with five gardens between residential areas. It is a child-friendly park equipped with slides and merry go rounds. Very well maintained and spacious, it is a great place to stroll or spend time with your family. The garden areas are well maintained for regular walkers.");
				break;
				case 5:
				System.out.println(All_Mumbai_walk[loc_choice-1]+":");
				System.out.println("The largest park in Mumbai, the Shivaji Park at Dadar is one of the most famous parks for youths. The 112,937 square metres park is famous for presenting many renowned cricketers of Indian cricket. Apart from Cricket, Tennis, Mallakhamba; the park is also an area for a good walk. The large area of the park has proper lighting and a well-constructed road for a walk.");
				break;
				case 6:
				System.out.println(All_Mumbai_walk[loc_choice-1]+":");
				System.out.println("The Worli Sea Face is a popular landmark for walks, kids and family time. There are wide footpaths and picturesque surroundings to admire during a walk. During the monsoon season you can enjoy the giant waves which attracts locals and tourists throughout the year.");
				break;
				case 7:
				System.out.println(All_Mumbai_walk[loc_choice-1]+":");
				System.out.println("Marine Drive famously known as the Queen 2019s Necklace is the famous spot in South Mumbai. Marine Drive enchants tourists throughout the year. The 6.3 km long promenade is one of the famous places for walking and enjoying the amazing scenic view of the sunrise and sunset.");
				break;
				default:
				System.out.println("The value enterd is not valid");
			}
		}
		else if (loc.equals("thane"))
		{
			switch(loc_choice)
			{
				case 1:
				System.out.println(All_Thane_walk[loc_choice-1]+":");
                System.out.println("There are several beaches near Thane but this beautiful one is a must-visit beach in the district. The state of Maharashtra is known for its shimmering coastline, and Thane is a charmer when it comes to beautiful beaches of which, the Kelva beach is one of the largest beaches in Maharashtra and is a popular tourist spot in Thane. This beach stretches for about 7 km along the Arabian Sea, and the best part about this beach is the shoreline that is lined with Suru trees. Just beside the beach is the Kelva fort and Sheetla Devi temple that makes it one of the best places to visit in Thane.");
				break;
				case 2:
				System.out.println(All_Thane_walk[loc_choice-1]+":");
				System.out.println("The Naneghat hills is a popular tourist spot and are one of the best places to visit near Thane in the monsoon. Set at an altitude of 838 meters above sea level, these hills are known for their mountain pass that stretches from Ghatmatha to the Konkan region. The caves found in these hills have inscriptions carved in Brahmi language on stone and the travellers can reach atop the hills by trekking as well as by road.");
				break;
				case 3:
				System.out.println(All_Thane_walk[loc_choice-1]+":");
				System.out.println("It is a must for all wildlife enthusiasts to witness the charm of the beautiful Tansa Wildlife Sanctuary. Spread over an area of 320 square km, this sanctuary accommodates rare species of flora and fauna. Home to several endangered species of animals, there are nearly 200 species of birds found here. For tourists who want to stay close to nature, can find suitable places to stay in Thane in one of the lodges and resorts near Thane that offer the best facilities to visitors.");
				break;
				case 4:
				System.out.println(All_Thane_walk[loc_choice-1]+":");
				System.out.println("Considered to be one of the top places to visit in Thane, the Jai Vilas Palace must definitely be included in your travel itinerary. Built by the tribal king \u201CYashvanrao Mukane\u201D, this palace was also known as Raj Bari. Popular for its unique architectural beauty, the whole palace is covered with lush green forests on all sides. While the palace is beautiful inside out, make sure you do not miss out on exploring this palace.");
				break;
				case 5:
				System.out.println(All_Thane_walk[loc_choice-1]+":");
				System.out.println("Located at a distance of 52 Km from Thane, Mahuli Fort is located amidst of the lush Mahuli mountains and is one of the popular historical monuments in Thane. The cool air, the green jungles, mist-covered peaks, and awesome views will leave you absolutely speechless. One can trek to the fort that belongs to Shahaji\u2019s and Shivaji\u2019s dynasty at an elevation of 2815 ft. If you\u2019re a shutterbug and enjoys hikes and treks, you\u2019re surely going to enjoy this visit.");
				break;
				case 6:
				System.out.println(All_Thane_walk[loc_choice-1]+":");
				System.out.println("One of the most well-known tourist places in Thane, Upvan Lake is a man-made, eco-friendly lake in Thane and was built in the 1880s by the Thane Municipal Corporation but it was reconstructed by a factory owner named JK Singhania to serve as a source of water supply to Raymond Factory.");
				break;
				case 7:
				System.out.println(All_Thane_walk[loc_choice-1]+":");
				System.out.println("One of the renowned nature tourist places in Thane is Thane Creek which is popular and yet not exploited? Well, then visit Thane Creek and indulge in birdwatching. Known to be an important site for bird spotting due to it being home to many migratory bird species, Thane Creek is not to be missed. Avocets, Grey Heron, Egrets, Sandpiper, and Whimbler are some of the birds you can spot.");
				break;
			}
		}
		else if (loc.equals("kalyan"))
		{
			switch(loc_choice)
			{
				case 1:
				System.out.println(All_Kalyan_walk[loc_choice-1]+":");
				System.out.println("This historical fort is located in Kalyan\u2019s west and it was the famous Maratha King Shivaji who had constructed this fort. Kalyan is not just a busy junction, but also a major town from the ancient times. This fort marked the beginning point of the Maratha Navy. It is located near the current Mumbai-Agra Road, near the creek on a small hill. There is no sign of the fort\u2019s main entrance, however you will still be able to see the bastions. The entrance is called Ganesh Darwaja, and there is also an idol of Lord Ganesha here. You can visit the Goddess Durga\u2019s temple inside this fort, which was revived by Ramji Mahadev Bivalkar during the rule of the Peshwa. You will also find a few remnants of the fort and 2 more bastions on the creek\u2019s side.\r\n");
				break;
				case 2:
				System.out.println(All_Kalyan_walk[loc_choice-1]+":");
				System.out.println("This hill fort is also referred to as Baba Malang and is situated in Maharashtra\u2019s Raigad District. The fort is located at a height of 789 m (2,588 feet) above the sea level. One of the unique features of this fort is that it is constructed on 3 different levels. The Malanggad Fort is quite distinct from Maharashtra\u2019s other forts. While the other forts in this state have multiple watchtowers and many gates, Malanggad does not have any kind of fortification and bears walls with no machicolation for shooting attacking foes. This is one of those very rare forts that depended on its natural traits to defend itself.\r\n");
				break;
				case 3:
				System.out.println(All_Kalyan_walk[loc_choice-1]+":");
				System.out.println("This is an important temple, which is a favorite with tourists for its natural beauty and devotion. It is a cave temple and is surrounded by the picturesque Sahyadri Mountain ranges. Marleshwar Temple is situated near Sangameshwar at the Maral village in the district of Ratnagiri. The temple is dedicated to Lord Shiva and is perched on a hilltop. Visitors need to climb about 400 steps to reach the top. According to the local residents, it was Lord Parshuram who was the founder of this temple. It will indeed be a gratifying experience when you visit this temple with your family. You can also view the huge precipice of Sahyadri as well as the river from this temple.\r\n");
				break;
				case 4:
				System.out.println(All_Kalyan_walk[loc_choice-1]+":");
				System.out.println("Japani Bazaar in Kalyan is a great place to spend some time with your loved ones. Extraordinary architecture, world standards, and well-thought execution make it a highly popular tourist site. Do take your camera along to capture some special moments out there. Japani Bazaar is a great place to refresh and unwind after a hectic week. Explore the beautiful designs, merchandise, props, ambient music, amusing characters, colorful landscapes and interesting themes in the stores set up in the Japani Bazaar.\r\n");
				break;
				case 5:
				System.out.println(All_Kalyan_walk[loc_choice-1]+":");
				System.out.println("This temple is also known as Ambreshwar Shiva Temple. It was constructed in 1060 AD and is located about 2 km(1.2 mi) from Ambernath railway station. Some say that it was King Chhittaraja who had originally built it, but later, it was rebuilt by Mummuni. This temple is located on the bank of a River Vadavan or Waldhuni, and is charmingly carved from stone. Once you reach the temple, you need to climb down 20 steps to reach the main room, which is known as Gabhara. You can see a shivling right in the middle of the room. On the auspicious occasion of Mahadhivratri, a fair is held here that continues for a period of three to four days. The fair begins 2 days prior to the date of Mahadhivratri and lasts till a day after Mahadhivratri ends. During Mahashivratri, the temple gets crowded with devotees in large numbers from various parts of Maharashtra.\r\n");
				break;
				
			}
		}
		else if (loc.equals("mulund"))
		{
			switch(loc_choice)
			{
				case 1:
				System.out.println(All_Mulund_walk[loc_choice-1]+":");
				break;
				case 2:
				System.out.println(All_Mulund_walk[loc_choice-1]+":");
				break;
				default:
				System.out.println("Please enter a valid Input");

			}
		}
	}
}
class Elegant_dates extends Wheather
{
	public void elegant_loc(int loc_choice,String loc)
	{
		if (loc.equals("mumbai"))
		{  
			switch(loc_choice)
			{
				case 1:
				System.out.println(All_Mumbai_elegant[loc_choice-1]+":");
				System.out.println("If you are looking for an authentic Korean meal experience, then head to Heng Bok for some S(e)our food! At Heng Bok, you'll find traditional low seating, wooden furniture and cushioned floor seating making it very cosy and romantic. What else do you want from a date place.Their specialities include dishes like chicken Bulgogi, Belgium pork belly, octopus, and mixed vegetable platter. There's also soup, Kimbap, sushi, appetizer, noodles, Korean hot pot and desserts on the menu. You will love everything about this place. If you and your special one are true Koreaboos and are craving some traditional Korean food, then Heng Bok is your place.\r\n");
				break;
				case 2:
				System.out.println(All_Mumbai_elegant[loc_choice-1]+":");
				System.out.println("Very clearly indicated in the name, Pizza By The Bay is a beautiful restaurant specializing in Pizzas and desserts. With that, they also serve delicious Pasta dishes and Italian Appetisers that are made with perfection. This small and cosy caf\u00E9 overlooks the gorgeous queen's necklace Aka. Marine Drive has a very modern and contemporary monochromatic ambience. The interiors are full of aesthetic corners, making it a perfect date place for all the pizza lovers out there!");
				break;
				case 3:
				System.out.println(All_Mumbai_elegant[loc_choice-1]+":");
				System.out.println("Known as one of the finest French patisseries of the country, Theobroma has to be amongst the top in our list of best hot chocolate in Mumbai. Started by chef Kainaz Messman, this was once a small outlet that has now spread its legacy across various cities in the country. Theobroma is loved by people of all ages, from kids to old everyone enjoys their sinfully amazing desserts.With an ambience that's everything pastel and cute, theobroma offers beautiful desserts at economical prices and the freshest of ingredients. This makes it a perfect date place for someone who has a sweet tooth. Delectable desserts and mouthwatering food from Theobroma over some sweet conversations, a killer combination indeed!");
				break;
				case 4:
				System.out.println(All_Mumbai_elegant[loc_choice-1]+":");
				System.out.println("Located around seven different locations in Mumbai, Blue Tokai has its fans all across the city. From aesthetic interiors, good food and of course, good coffee, this romantic restaurant has been winning hearts ever since it has opened. They have various options ranging from cold brews, pour-overs and even a small tasting menu too. We don't think any place would be better if you and your date are both die-hard coffee people. Good coffee, good vibes and good music, there's nothing better than a couple can ask for!.Blue Tokai is known for selling 100% Arabica single-estate coffee that is also available online. So if you are craving some really good coffee and can't go out, visit their online portal and order your coffee! Tip: if you are not well-aware of how to use different coffee and equipment, they have a dedicated section on their website which tells you how to make your artisanal coffee with suitable equipment!\r\n");
				break;
				case 5:
				System.out.println(All_Mumbai_elegant[loc_choice-1]+":");
				System.out.println("Indeed one of the best spots for Japanese and Korean cuisines in Bandra, Kofuku offers an authentic Japanese experience to all of the guests. From typical wooden tables, separate traditional Japanese-style low seating with tatami mats, and even a Sake bar, you are going to fall in love with this place.Kofuku is well-known for its range of Sushi and Bento box meals. With all the delicious savoury items which also include some Korean delicacies, Kofuku has a signature dessert, Mochi ice- cream which is a must-have!\r\n");
				break;
				case 6:
				System.out.println(All_Mumbai_elegant[loc_choice-1]+":");
				System.out.println("Well this place doesn't need an introduction, does it? Britannia & Co. has been glorifying the charm of Irani cuisine through its beautiful and delicious food for almost 100 years now. Opened its doors in the year 1923, this caf\u00E9 is one of the oldest restaurants in Mumbai. What makes it the best among all the Parsi Cafes in Mumbai is its legendary status and consistently delicious food served in all these years.With the simple stone walls with photo frames and understated simple d\u00E9cor, this place has subtle energy to it that makes it a perfect place for a good date if you and your special one are both old souls! The perfect time to visit is in the mornings or evening, from 6 pm.\r\n");
				break;
				case 7:
				System.out.println(All_Mumbai_elegant[loc_choice-1]+":");
				System.out.println("Probably one of the most iconic standalone restaurants in the city, The Bombay Canteen has set a milestone for modern Indian cuisine in Mumbai. The menu is curated by the well-known chef Thomas Zacharias aka. Chef TZac. He is highly inspired by food from the different parts of the country and some of his grandma's recipes, and the menu reflects the unique perspective with which Chef TZac looks at food. The vibes of this place are immaculate and cool, even the servers have their T-shirts with \"bro\" written on them. So if you and your date enjoy vibrant places and energetic ambience, this might be the perfect place for you.\r\n");
				break;
				default:
				System.out.println("The value enterd is not valid");
			}
		}
		else if (loc.equals("thane"))
		{
			switch(loc_choice)
			{
				case 1:
				System.out.println(All_Thane_elegant[loc_choice-1]+":");
                System.out.println("There are several beaches near Thane but this beautiful one is a must-visit beach in the district. The state of Maharashtra is known for its shimmering coastline, and Thane is a charmer when it comes to beautiful beaches of which, the Kelva beach is one of the largest beaches in Maharashtra and is a popular tourist spot in Thane. This beach stretches for about 7 km along the Arabian Sea, and the best part about this beach is the shoreline that is lined with Suru trees. Just beside the beach is the Kelva fort and Sheetla Devi temple that makes it one of the best places to visit in Thane.");
				break;
				case 2:
				System.out.println(All_Thane_elegant[loc_choice-1]+":");
				System.out.println("The Naneghat hills is a popular tourist spot and are one of the best places to visit near Thane in the monsoon. Set at an altitude of 838 meters above sea level, these hills are known for their mountain pass that stretches from Ghatmatha to the Konkan region. The caves found in these hills have inscriptions carved in Brahmi language on stone and the travellers can reach atop the hills by trekking as well as by road.");
				break;
				case 3:
				System.out.println(All_Thane_elegant[loc_choice-1]+":");
				System.out.println("It is a must for all wildlife enthusiasts to witness the charm of the beautiful Tansa Wildlife Sanctuary. Spread over an area of 320 square km, this sanctuary accommodates rare species of flora and fauna. Home to several endangered species of animals, there are nearly 200 species of birds found here. For tourists who want to stay close to nature, can find suitable places to stay in Thane in one of the lodges and resorts near Thane that offer the best facilities to visitors.");
				break;
				case 4:
				System.out.println(All_Thane_elegant[loc_choice-1]+":");
				System.out.println("Considered to be one of the top places to visit in Thane, the Jai Vilas Palace must definitely be included in your travel itinerary. Built by the tribal king \u201CYashvanrao Mukane\u201D, this palace was also known as Raj Bari. Popular for its unique architectural beauty, the whole palace is covered with lush green forests on all sides. While the palace is beautiful inside out, make sure you do not miss out on exploring this palace.");
				break;
				case 5:
				System.out.println(All_Thane_elegant[loc_choice-1]+":");
				System.out.println("Located at a distance of 52 Km from Thane, Mahuli Fort is located amidst of the lush Mahuli mountains and is one of the popular historical monuments in Thane. The cool air, the green jungles, mist-covered peaks, and awesome views will leave you absolutely speechless. One can trek to the fort that belongs to Shahaji\u2019s and Shivaji\u2019s dynasty at an elevation of 2815 ft. If you\u2019re a shutterbug and enjoys hikes and treks, you\u2019re surely going to enjoy this visit.");
				break;
				case 6:
				System.out.println(All_Thane_elegant[loc_choice-1]+":");
				System.out.println("One of the most well-known tourist places in Thane, Upvan Lake is a man-made, eco-friendly lake in Thane and was built in the 1880s by the Thane Municipal Corporation but it was reconstructed by a factory owner named JK Singhania to serve as a source of water supply to Raymond Factory.");
				break;
				case 7:
				System.out.println(All_Thane_elegant[loc_choice-1]+":");
				System.out.println("One of the renowned nature tourist places in Thane is Thane Creek which is popular and yet not exploited? Well, then visit Thane Creek and indulge in birdwatching. Known to be an important site for bird spotting due to it being home to many migratory bird species, Thane Creek is not to be missed. Avocets, Grey Heron, Egrets, Sandpiper, and Whimbler are some of the birds you can spot.");
				break;
			}
		}
		else if (loc.equals("kalyan"))
		{
			switch(loc_choice)
			{
				case 1:
				System.out.println(All_Kalyan_elegant[loc_choice-1]+":");
				System.out.println("This historical fort is located in Kalyan\u2019s west and it was the famous Maratha King Shivaji who had constructed this fort. Kalyan is not just a busy junction, but also a major town from the ancient times. This fort marked the beginning point of the Maratha Navy. It is located near the current Mumbai-Agra Road, near the creek on a small hill. There is no sign of the fort\u2019s main entrance, however you will still be able to see the bastions. The entrance is called Ganesh Darwaja, and there is also an idol of Lord Ganesha here. You can visit the Goddess Durga\u2019s temple inside this fort, which was revived by Ramji Mahadev Bivalkar during the rule of the Peshwa. You will also find a few remnants of the fort and 2 more bastions on the creek\u2019s side.\r\n");
				break;
				case 2:
				System.out.println(All_Kalyan_elegant[loc_choice-1]+":");
				System.out.println("This hill fort is also referred to as Baba Malang and is situated in Maharashtra\u2019s Raigad District. The fort is located at a height of 789 m (2,588 feet) above the sea level. One of the unique features of this fort is that it is constructed on 3 different levels. The Malanggad Fort is quite distinct from Maharashtra\u2019s other forts. While the other forts in this state have multiple watchtowers and many gates, Malanggad does not have any kind of fortification and bears walls with no machicolation for shooting attacking foes. This is one of those very rare forts that depended on its natural traits to defend itself.\r\n");
				break;
				case 3:
				System.out.println(All_Kalyan_elegant[loc_choice-1]+":");
				System.out.println("This is an important temple, which is a favorite with tourists for its natural beauty and devotion. It is a cave temple and is surrounded by the picturesque Sahyadri Mountain ranges. Marleshwar Temple is situated near Sangameshwar at the Maral village in the district of Ratnagiri. The temple is dedicated to Lord Shiva and is perched on a hilltop. Visitors need to climb about 400 steps to reach the top. According to the local residents, it was Lord Parshuram who was the founder of this temple. It will indeed be a gratifying experience when you visit this temple with your family. You can also view the huge precipice of Sahyadri as well as the river from this temple.\r\n");
				break;
				case 4:
				System.out.println(All_Kalyan_elegant[loc_choice-1]+":");
				System.out.println("Japani Bazaar in Kalyan is a great place to spend some time with your loved ones. Extraordinary architecture, world standards, and well-thought execution make it a highly popular tourist site. Do take your camera along to capture some special moments out there. Japani Bazaar is a great place to refresh and unwind after a hectic week. Explore the beautiful designs, merchandise, props, ambient music, amusing characters, colorful landscapes and interesting themes in the stores set up in the Japani Bazaar.\r\n");
				break;
				case 5:
				System.out.println(All_Kalyan_elegant[loc_choice-1]+":");
				System.out.println("This temple is also known as Ambreshwar Shiva Temple. It was constructed in 1060 AD and is located about 2 km(1.2 mi) from Ambernath railway station. Some say that it was King Chhittaraja who had originally built it, but later, it was rebuilt by Mummuni. This temple is located on the bank of a River Vadavan or Waldhuni, and is charmingly carved from stone. Once you reach the temple, you need to climb down 20 steps to reach the main room, which is known as Gabhara. You can see a shivling right in the middle of the room. On the auspicious occasion of Mahadhivratri, a fair is held here that continues for a period of three to four days. The fair begins 2 days prior to the date of Mahadhivratri and lasts till a day after Mahadhivratri ends. During Mahashivratri, the temple gets crowded with devotees in large numbers from various parts of Maharashtra.\r\n");
				break;
				case 6:
				System.out.println(All_Kalyan_elegant[loc_choice-1]+":");
				System.out.println("This temple is also known as Ambreshwar Shiva Temple. It was constructed in 1060 AD and is located about 2 km(1.2 mi) from Ambernath railway station. Some say that it was King Chhittaraja who had originally built it, but later, it was rebuilt by Mummuni. This temple is located on the bank of a River Vadavan or Waldhuni, and is charmingly carved from stone. Once you reach the temple, you need to climb down 20 steps to reach the main room, which is known as Gabhara. You can see a shivling right in the middle of the room. On the auspicious occasion of Mahadhivratri, a fair is held here that continues for a period of three to four days. The fair begins 2 days prior to the date of Mahadhivratri and lasts till a day after Mahadhivratri ends. During Mahashivratri, the temple gets crowded with devotees in large numbers from various parts of Maharashtra.\r\n");
				break;
				
			}
		}
		else if (loc.equals("mulund"))
		{
			switch(loc_choice)
			{
				case 1:
				System.out.println(All_Mulund_elegant[loc_choice-1]+":");
				break;
				case 2:
				System.out.println(All_Mulund_elegant[loc_choice-1]+":");
				break;
				case 3:
				System.out.println(All_Mulund_elegant[loc_choice-1]+":");
				break;
				case 4:
				System.out.println(All_Mulund_elegant[loc_choice-1]+":");
				break;
				case 5:
				System.out.println(All_Mulund_elegant[loc_choice-1]+":");
				break;
				case 6:
				System.out.println(All_Mulund_elegant[loc_choice-1]+":");
				break;
				case 7:
				System.out.println(All_Mulund_elegant[loc_choice-1]+":");
				break;
				default:
				System.out.println("Please enter a valid Input");

			}
		}
	}
}
class Movie_dates extends Wheather
{
	public void movie_loc(int loc_choice,String loc)
	{
		if (loc.equals("mumbai"))
		{  
			switch(loc_choice)
			{
				case 1:
				System.out.println(All_Mumbai_movie[loc_choice-1]+":");
				System.out.println("If you are looking for an authentic Korean meal experience, then head to Heng Bok for some S(e)our food! At Heng Bok, you'll find traditional low seating, wooden furniture and cushioned floor seating making it very cosy and romantic. What else do you want from a date place.Their specialities include dishes like chicken Bulgogi, Belgium pork belly, octopus, and mixed vegetable platter. There's also soup, Kimbap, sushi, appetizer, noodles, Korean hot pot and desserts on the menu. You will love everything about this place. If you and your special one are true Koreaboos and are craving some traditional Korean food, then Heng Bok is your place.\r\n");
				break;
				case 2:
				System.out.println(All_Mumbai_movie[loc_choice-1]+":");
				System.out.println("Very clearly indicated in the name, Pizza By The Bay is a beautiful restaurant specializing in Pizzas and desserts. With that, they also serve delicious Pasta dishes and Italian Appetisers that are made with perfection. This small and cosy caf\u00E9 overlooks the gorgeous queen's necklace Aka. Marine Drive has a very modern and contemporary monochromatic ambience. The interiors are full of aesthetic corners, making it a perfect date place for all the pizza lovers out there!");
				break;
				case 3:
				System.out.println(All_Mumbai_movie[loc_choice-1]+":");
				System.out.println("Known as one of the finest French patisseries of the country, Theobroma has to be amongst the top in our list of best hot chocolate in Mumbai. Started by chef Kainaz Messman, this was once a small outlet that has now spread its legacy across various cities in the country. Theobroma is loved by people of all ages, from kids to old everyone enjoys their sinfully amazing desserts.With an ambience that's everything pastel and cute, theobroma offers beautiful desserts at economical prices and the freshest of ingredients. This makes it a perfect date place for someone who has a sweet tooth. Delectable desserts and mouthwatering food from Theobroma over some sweet conversations, a killer combination indeed!");
				break;
				case 4:
				System.out.println(All_Mumbai_movie[loc_choice-1]+":");
				System.out.println("Located around seven different locations in Mumbai, Blue Tokai has its fans all across the city. From aesthetic interiors, good food and of course, good coffee, this romantic restaurant has been winning hearts ever since it has opened. They have various options ranging from cold brews, pour-overs and even a small tasting menu too. We don't think any place would be better if you and your date are both die-hard coffee people. Good coffee, good vibes and good music, there's nothing better than a couple can ask for!.Blue Tokai is known for selling 100% Arabica single-estate coffee that is also available online. So if you are craving some really good coffee and can't go out, visit their online portal and order your coffee! Tip: if you are not well-aware of how to use different coffee and equipment, they have a dedicated section on their website which tells you how to make your artisanal coffee with suitable equipment!\r\n");
				break;
				case 5:
				System.out.println(All_Mumbai_movie[loc_choice-1]+":");
				System.out.println("Indeed one of the best spots for Japanese and Korean cuisines in Bandra, Kofuku offers an authentic Japanese experience to all of the guests. From typical wooden tables, separate traditional Japanese-style low seating with tatami mats, and even a Sake bar, you are going to fall in love with this place.Kofuku is well-known for its range of Sushi and Bento box meals. With all the delicious savoury items which also include some Korean delicacies, Kofuku has a signature dessert, Mochi ice- cream which is a must-have!\r\n");
				break;
				case 6:
				System.out.println(All_Mumbai_movie[loc_choice-1]+":");
				System.out.println("Well this place doesn't need an introduction, does it? Britannia & Co. has been glorifying the charm of Irani cuisine through its beautiful and delicious food for almost 100 years now. Opened its doors in the year 1923, this caf\u00E9 is one of the oldest restaurants in Mumbai. What makes it the best among all the Parsi Cafes in Mumbai is its legendary status and consistently delicious food served in all these years.With the simple stone walls with photo frames and understated simple d\u00E9cor, this place has subtle energy to it that makes it a perfect place for a good date if you and your special one are both old souls! The perfect time to visit is in the mornings or evening, from 6 pm.\r\n");
				break;
				case 7:
				System.out.println(All_Mumbai_movie[loc_choice-1]+":");
				System.out.println("Probably one of the most iconic standalone restaurants in the city, The Bombay Canteen has set a milestone for modern Indian cuisine in Mumbai. The menu is curated by the well-known chef Thomas Zacharias aka. Chef TZac. He is highly inspired by food from the different parts of the country and some of his grandma's recipes, and the menu reflects the unique perspective with which Chef TZac looks at food. The vibes of this place are immaculate and cool, even the servers have their T-shirts with \"bro\" written on them. So if you and your date enjoy vibrant places and energetic ambience, this might be the perfect place for you.\r\n");
				break;
				default:
				System.out.println("The value enterd is not valid");
			}
		}
		else if (loc.equals("thane"))
		{
			switch(loc_choice)
			{
				case 1:
				System.out.println(All_Thane_movie[loc_choice-1]+":");
				break;
				case 2:
				System.out.println(All_Thane_movie[loc_choice-1]+":");
				break;
				case 3:
				System.out.println(All_Thane_movie[loc_choice-1]+":");
				break;
				case 4:
				System.out.println(All_Thane_movie[loc_choice-1]+":");
				break;
				case 5:
				System.out.println(All_Thane_elegant[loc_choice-1]+":");
				break;
				case 6:
				System.out.println(All_Thane_movie[loc_choice-1]+":");
				break;
				case 7:
				System.out.println(All_Thane_movie[loc_choice-1]+":");
				break;
				default:
				System.out.println("Please enter a valid Input");

			}
		}
		else if (loc.equals("kalyan"))
		{
			switch(loc_choice)
			{
				case 1:
				System.out.println(All_Kalyan_movie[loc_choice-1]+":");
				break;
				case 2:
				System.out.println(All_Kalyan_movie[loc_choice-1]+":");
				break;
				case 3:
				System.out.println(All_Kalyan_movie[loc_choice-1]+":");
				break;
				case 4:
				System.out.println(All_Kalyan_movie[loc_choice-1]+":");
				break;
				case 5:
				System.out.println(All_Kalyan_movie[loc_choice-1]+":");
				break;
				case 6:
				System.out.println(All_Kalyan_movie[loc_choice-1]+":");
				break;
				case 7:
				System.out.println(All_Kalyan_movie[loc_choice-1]+":");
				break;
				default:
				System.out.println("Please enter a valid Input");

			}
		}
		else if (loc.equals("mulund"))
		{
			switch(loc_choice)
			{
				case 1:
				System.out.println(All_Mulund_movie[loc_choice-1]+":");
				break;
				case 2:
				System.out.println(All_Mulund_movie[loc_choice-1]+":");
				break;
				case 3:
				System.out.println(All_Mulund_movie[loc_choice-1]+":");
				break;
				case 4:
				System.out.println(All_Mulund_movie[loc_choice-1]+":");
				break;
				case 5:
				System.out.println(All_Mulund_movie[loc_choice-1]+":");
				break;
				default:
				System.out.println("Please enter a valid Input");

			}
		}
	}

}



class Couple_dates 
{
	public String[] All_dates()
	{   
		String[] All_dates = {"Picnic Date","Walk Date","Elegant Date","Movie Date"};
		for(int i=0;i<All_dates.length;i++)
		{
			System.out.println((i+1)+". "+All_dates[i]);
		}
		return All_dates;
	}
}

class Domestic_trips extends Wheather
{
	public void Domestic_loc(int loc_choice,String loc)
	{
      if (loc.equals("delhi"))
		{  
			switch(loc_choice)
			{
				case 1:
				System.out.println(All_Delhi_trip[loc_choice-1]+":");
								break;
				case 2:
				System.out.println(All_Delhi_trip[loc_choice-1]+":");
								break;
				case 3:
				System.out.println(All_Delhi_trip[loc_choice-1]+":");
				break;
				case 4:
				System.out.println(All_Delhi_trip[loc_choice-1]+":");
				break;
				case 5:
				System.out.println(All_Delhi_trip[loc_choice-1]+":");
				break;
				case 6:
				System.out.println(All_Delhi_trip[loc_choice-1]+":");
				break;
				case 7:
				System.out.println(All_Delhi_trip[loc_choice-1]+":");
				break;
				default:
				System.out.println("The value enterd is not valid");
			}
		}
      else if (loc.equals("goa"))
		{  
			switch(loc_choice)
			{
				case 1:
				System.out.println(All_goa_trip[loc_choice-1]+":");
				break;
				case 2:
				System.out.println(All_goa_trip[loc_choice-1]+":");
				break;
				case 3:
				System.out.println(All_goa_trip[loc_choice-1]+":");
				break;
				case 4:
				System.out.println(All_goa_trip[loc_choice-1]+":");
				break;
				case 5:
				System.out.println(All_goa_trip[loc_choice-1]+":");
				break;
				case 6:
				System.out.println(All_goa_trip[loc_choice-1]+":");
				break;
				default:
				System.out.println("The value enterd is not valid");
			}
		}
      else if (loc.equals("utharakhand"))
		{  
			switch(loc_choice)
			{
				case 1:
				System.out.println(All_Utharakhand_trip[loc_choice-1]+":");
								break;
				case 2:
				System.out.println(All_Utharakhand_trip[loc_choice-1]+":");
								break;
				case 3:
				System.out.println(All_Utharakhand_trip[loc_choice-1]+":");
				break;
				case 4:
				System.out.println(All_Utharakhand_trip[loc_choice-1]+":");
				break;
				case 5:
				System.out.println(All_Utharakhand_trip[loc_choice-1]+":");
				break;
				case 6:
				System.out.println(All_Utharakhand_trip[loc_choice-1]+":");
				break;
				case 7:
				System.out.println(All_Utharakhand_trip[loc_choice-1]+":");
				break;
				default:
				System.out.println("The value enterd is not valid");
			}
		}
      else if (loc.equals("kerala"))
		{  
			switch(loc_choice)
			{
				case 1:
				System.out.println(All_Kerala_trip[loc_choice-1]+":");
								break;
				case 2:
				System.out.println(All_Kerala_trip[loc_choice-1]+":");
								break;
				case 3:
				System.out.println(All_Kerala_trip[loc_choice-1]+":");
				break;
				case 4:
				System.out.println(All_Kerala_trip[loc_choice-1]+":");
				break;
				case 5:
				System.out.println(All_Kerala_trip[loc_choice-1]+":");
				break;
				case 6:
				System.out.println(All_Kerala_trip[loc_choice-1]+":");
				break;
				case 7:
				System.out.println(All_Kerala_trip[loc_choice-1]+":");
				break;
				default:
				System.out.println("The value enterd is not valid");
			}
		}
      else if (loc.equals("jammu"))
		{  
			switch(loc_choice)
			{
				case 1:
				System.out.println(All_Jammu_karshmir[loc_choice-1]+":");
				
				break;
				case 2:
				System.out.println(All_Jammu_karshmir[loc_choice-1]+":");
								break;
				case 3:
				System.out.println(All_Jammu_karshmir[loc_choice-1]+":");
				break;
				case 4:
				System.out.println(All_Jammu_karshmir[loc_choice-1]+":");
				break;
				case 5:
				System.out.println(All_Jammu_karshmir[loc_choice-1]+":");
				break;
				case 6:
				System.out.println(All_Jammu_karshmir[loc_choice-1]+":");
				break;
				default:
				System.out.println("The value enterd is not valid");
			}
		}
      else if (loc.equals("bengal"))
		{  
			switch(loc_choice)
			{
				case 1:
				System.out.println(All_West_Bengal[loc_choice-1]+":");
				System.out.println("Kolkata is India’s second-largest city and the face of West Bengal. It is an interminably progressing celebration of human existence. This dynamic 350-year-old city situated on India’s Eastern Coast is the capital of West Bengal. It flourishes as the aesthetic, social, and intellectual capital of India. Also known as the ‘City of Joy’, Kolkata is overflowing with liveliness. One can expect to be charmed by the cheap cost of things, the hand-pulled-rickshaws, wandering avenues, and a countless assortment of desserts. Some highlights of this breathtaking city are The Victoria Memorial, Howrah Bridge, Fort William, Eden Gardens, and Jorasanko Thakur Bari – the ancestral home of Nobel Laureate Rabindranath Tagore. Brimming with various exciting things to do, make sure to add this city to your bucket list! This is one of the best places to visit in West Bengal for 2 days.");
				break;
				case 2:
				System.out.println(All_West_Bengal[loc_choice-1]+":");
				System.out.println("If one wants to witness the stunning snow pinnacles of Kanchenjunga, the wonderful tea cultivations, the sweet-smelling orchids, the greenery of the pines, and the adorable Himalayan toy train making its way through the dazzling mountains, head to the city of Darjeeling. This hill station is a gem known for its old-world charm combined with modernity. For a well-needed break from the blistering and moist summers of India, this city is one of the best tourist places in West Bengal. It offers a potent blend of stunning mountain views, waterfalls, sightseeing tours, Buddhist monasteries, museums, shopping, and scrumptious Tibetan food. Undoubtedly, with its lush green environs and captivating hills, this place is one of the best places to visit in West Bengal in June.");
				break;
				case 3:
				System.out.println(All_West_Bengal[loc_choice-1]+":");
				System.out.println("This UNESCO World Heritage Site is the biggest mangrove eco-arrangement in the world. Home to one of India’s most notorious untamed life species, the Royal Bengal Tiger, it is also the world’s biggest estuarine woods befuddled by many streams and tributaries, converged by a system of tidal conduits and a maze of little mangrove islands. This interconnectedness makes The Sundarbans one of the most appealing and charming spots on earth. At present this extraordinary land is home to 250 tigers and an assortment of birds, reptiles, and various invertebrates including crocodiles. This natural heaven is situated about 110 km from Kolkata.");
				break;
				case 4:
				System.out.println(All_West_Bengal[loc_choice-1]+":");
				System.out.println("The seaside village of Mandarmani in East Medinipur locale is situated at the northern end of the Bay of Bengal. It is one of the biggest and quickly developing resort villages of West Bengal and is located about 180 km from Kolkata. It is contended to be the longest drive-in seashore in India. One can relax, swim, and appreciate each moment of their stay at this majestic seashore. The minute one gets worn out, they can chill off with green coconut water. There are very few visitors around and that is the best part of this seashore. One can spend their time sunbathing and watching the birds and waves.");
				break;
				case 5:
				System.out.println(All_West_Bengal[loc_choice-1]+":");
				System.out.println("Bankura is situated in Eastern Chota Nagpur Plateau and is adorned by mother nature with brown slopes, babbling brooks and antiquated temples. The town has numerous temples such as the Madan Mohan temple, Shyam Roy temple, and Sarada Devi temple. Bankura is a great picnic spot as it offers opportunities for trekking and exploring too. Also make sure to visit the Biharinath hill, Susunia hill, and Koko hill during your travel to this beautiful temple city of West Bengal. This is one of the best places to visit in West Bengal for 1 day.");
				break;
				case 6:
				System.out.println(All_West_Bengal[loc_choice-1]+":");
				System.out.println("This melting pot of cultures from the Indians, British, Nepalese, and Tibetans is situated 3 hours away from Darjeeling. Its flowering gardens, Buddhist monasteries, historic churches, and sacred temples make it a renowned tourist destination. Offering panoramic views of the Himalayan range, this hill station is at an altitude of 4100 ft. Make sure to participate in the various activities available here such as the great hill walks, bird watching, and shopping at the Kalimpong Market Square.");
				break;
				default:
				System.out.println("The value enterd is not valid");
			}
		}
      else if (loc.equals("gujarat"))
		{  
			switch(loc_choice)
			{
				case 1:
				System.out.println(All_Gujarat_trip[loc_choice-1]+":");
				System.out.println("Ahmedabad, the largest city in Gujarat, is a vibrant blend of modernity and tradition. It's famous for its textile industry, delicious street food, and a rich history associated with Mahatma Gandhi. Key attractions include the Sabarmati Ashram, Jama Masjid, Adalaj Stepwell, and the Calico Museum of Textiles.");
				break;
				case 2:
				System.out.println(All_Gujarat_trip[loc_choice-1]+":");
				System.out.println("This is the only place in the world where you can spot the Asiatic lion in the wild. Gir Forest National Park is a haven for wildlife enthusiasts and nature lovers. Along with the lions, you can also see leopards, antelopes, and various bird species.");
				break;
				case 3:
				System.out.println(All_Gujarat_trip[loc_choice-1]+":");
				System.out.println("Located on the Arabian Sea coast, the Somnath Temple is one of the 12 Jyotirlinga shrines dedicated to Lord Shiva. The temple's architecture is stunning, and the religious significance draws pilgrims from all over India.");
				break;
				case 4:
				System.out.println(All_Gujarat_trip[loc_choice-1]+":");
				System.out.println("The Rann of Kutch is a vast salt marsh that transforms into a mesmerizing white desert during the dry season. The annual Rann Utsav is a cultural extravaganza featuring folk dances, music, and craft exhibitions. It's a unique experience to witness the white desert's surreal beauty under the moonlight.");
				break;
				case 5:
				System.out.println(All_Gujarat_trip[loc_choice-1]+":");
				System.out.println("Dwarka is one of the holiest cities for Hindus and is believed to be Lord Krishna's ancient kingdom. The Dwarkadhish Temple is the main attraction, and you can also visit places like Nageshwar Jyotirlinga Temple, Bet Dwarka, and the Rukmini Devi Temple.");
				break;
				case 6:
				System.out.println(All_Gujarat_trip[loc_choice-1]+":");
				System.out.println("Situated in the Western Ghats, Saputara is a picturesque hill station and a perfect retreat for nature lovers. You can enjoy boating in Saputara Lake, trekking in the lush forests, and visit the tribal villages to experience the local culture.");
				break;
				case 7:
				System.out.println(All_Gujarat_trip[loc_choice-1]+":");
				System.out.println("Vadodara is known for its historical and architectural heritage. The Laxmi Vilas Palace, the grand residence of the Gaekwad dynasty, is a must-visit. Other attractions include the Sayaji Garden, Champaner-Pavagadh Archaeological Park (a UNESCO World Heritage Site), and the Maharaja Fateh Singh Museum.");
				break;
				default:
				System.out.println("The value enterd is not valid");
			}
		}

	}
}
class International_trips extends Wheather
{
	public void International_loc(int loc_choice,String loc)
	{
      if (loc.equals("italy"))
		{  
			switch(loc_choice)
			{
				case 1:
				System.out.println(All_Italy_trip[loc_choice-1]+":");
				System.out.println("Rome, the capital of Italy, is a city steeped in history. You can explore the ancient Colosseum, the Roman Forum, and the Pantheon. Don't miss the Vatican City, home to St. Peter's Basilica and the Sistine Chapel.");
				break;
				case 2:
				System.out.println(All_Italy_trip[loc_choice-1]+":");
				System.out.println("Venice is a romantic city built on canals. Take a gondola ride, visit St. Mark's Square and Basilica, and explore the Doge's Palace. Venice is also known for its vibrant Carnival.\r\n");				
				break;
				case 3:
				System.out.println(All_Italy_trip[loc_choice-1]+":");
				System.out.println("Florence is a cultural treasure trove with Renaissance art and architecture. Admire Michelangelo's David at the Accademia Gallery, visit the Uffizi Gallery, and explore the stunning Florence Cathedral.");
				break;
				case 4:
				System.out.println(All_Italy_trip[loc_choice-1]+":");
				System.out.println("This picturesque coastal region is known for its stunning views and charming villages like Positano, Amalfi, and Ravello. Enjoy the scenic drive along the winding roads overlooking the Mediterranean Sea.\r\n");
				break;
				case 5:
				System.out.println(All_Italy_trip[loc_choice-1]+":");
				System.out.println("Cinque Terre is a collection of colorful cliffside villages along the Italian Riviera. Hike the scenic trails connecting the villages and savor fresh seafood.");
				break;
				case 6:
				System.out.println(All_Italy_trip[loc_choice-1]+":");
				System.out.println("Tuscany is renowned for its rolling hills, vineyards, and charming towns like Siena and Pisa. Taste world-class wines and enjoy the beautiful countryside.\r\n");
				break;
				case 7:
				System.out.println(All_Italy_trip[loc_choice-1]+":");
				System.out.println("Pompeii is an ancient Roman city buried by the eruption of Mount Vesuvius in 79 AD. Explore the remarkably preserved ruins, including temples, homes, and streets.\r\n");
				break;
				default:
				System.out.println("The value enterd is not valid");
			}
		}
      else if (loc.equals("japan"))
		{  
			switch(loc_choice)
			{
				case 1:
				System.out.println(All_Japan_trip[loc_choice-1]+":");
				System.out.println("Tokyo is a bustling metropolis with a mix of modern and traditional. Visit the Tokyo Skytree, Meiji Shrine, and the historic district of Asakusa.");
				break;
				case 2:
				System.out.println(All_Japan_trip[loc_choice-1]+":");
				System.out.println("Kyoto is known for its well-preserved temples, traditional tea houses, and stunning gardens. Must-visit sites include Kinkaku-ji (Golden Pavilion) and Fushimi Inari Shrine.\r\n");
				break;
				case 3:
				System.out.println(All_Japan_trip[loc_choice-1]+":");
				System.out.println("Hiroshima is a city with a poignant history due to the atomic bombing during World War II. Visit the Peace Memorial Park and Museum to learn about its history.\r\n");
				break;
				case 4:
				System.out.println(All_Japan_trip[loc_choice-1]+":");
				System.out.println("Osaka is known for its vibrant street food scene, nightlife, and attractions like Osaka Castle and Universal Studios Japan.");
				break;
				case 5:
				System.out.println(All_Japan_trip[loc_choice-1]+":");
				System.out.println("Japan's northernmost island offers natural beauty, including national parks like Daisetsuzan and Shiretoko, as well as ski resorts in the winter.");
				break;
				case 6:
				System.out.println(All_Japan_trip[loc_choice-1]+":");
				System.out.println("Nara is famous for its friendly deer population and historical temples like Todai-ji, which houses a giant bronze Buddha statue.\r\n");
				break;
				case 7:
				System.out.println(All_Japan_trip[loc_choice-1]+":");
				System.out.println("Okinawa's islands offer stunning beaches, coral reefs for snorkeling, and a unique blend of Japanese and indigenous culture.\r\n");
				break;

				default:
				System.out.println("The value enterd is not valid");
			}
		}
      else if (loc.equals("france"))
		{  
			switch(loc_choice)
			{
				case 1:
				System.out.println(All_france_trip[loc_choice-1]+":");
				System.out.println("The capital of France is known as the \"City of Love.\" Explore iconic landmarks such as the Eiffel Tower, Notre-Dame Cathedral, and the Louvre Museum, home to the famous Mona Lisa.\r\n");
				break;
				case 2:
				System.out.println(All_france_trip[loc_choice-1]+":");
				System.out.println("Provence is a region known for its lavender fields, picturesque villages like Gordes, and historic towns such as Avignon and Arles, where you can explore Roman ruins.\r\n");
				break;
				case 3:
				System.out.println(All_france_trip[loc_choice-1]+":");
				System.out.println("The glamorous French Riviera, or C\u00F4te d'Azur, is famous for its stunning Mediterranean coastline. Visit Nice, Cannes, and Monaco for beautiful beaches, luxury resorts, and vibrant nightlife.\r\n");
				break;
				case 4:
				System.out.println(All_france_trip[loc_choice-1]+":");
				System.out.println("The Loire Valley is a UNESCO World Heritage Site with numerous châteaux (castles) like Château de Chambord and Château de Chenonceau, offering a glimpse into French Renaissance architecture.");
				break;
				case 5:
				System.out.println(All_france_trip[loc_choice-1]+":");
				System.out.println("Normandy is known for its D-Day beaches, where you can explore historic sites like Omaha Beach and Utah Beach. Don't miss Mont Saint-Michel, a picturesque island abbey.\r\n");
				break;
				case 6:
				System.out.println(All_france_trip[loc_choice-1]+":");
				System.out.println("Bordeaux is a renowned wine region. Tour vineyards, taste exquisite wines, and explore the city's beautiful architecture, including Place de la Bourse.");
				break;
				case 7:
				System.out.println(All_france_trip[loc_choice-1]+":");
				System.out.println("Located on the border with Germany, Alsace offers a unique blend of French and German culture. Visit Strasbourg with its stunning cathedral and charming half-timbered houses.");
				break;
				default:
				System.out.println("The value enterd is not valid");
			}
		}
      else if (loc.equals("peru"))
		{  
			switch(loc_choice)
			{
				case 1:
				System.out.println(All_Peru_trip[loc_choice-1]+":");
								break;
				case 2:
				System.out.println(All_Peru_trip[loc_choice-1]+":");
								break;
				case 3:
				System.out.println(All_Peru_trip[loc_choice-1]+":");
				break;
				case 4:
				System.out.println(All_Peru_trip[loc_choice-1]+":");
				break;
				case 5:
				System.out.println(All_Peru_trip[loc_choice-1]+":");
				break;
				case 6:
				System.out.println(All_Peru_trip[loc_choice-1]+":");
				break;
				case 7:
				System.out.println(All_Peru_trip[loc_choice-1]+":");
				break;
				default:
				System.out.println("The value enterd is not valid");
			}
		}
      else if (loc.equals("australia"))
		{  
			switch(loc_choice)
			{
				case 1:
				System.out.println(All_Australia_trip[loc_choice-1]+":");
				
				break;
				case 2:
				System.out.println(All_Australia_trip[loc_choice-1]+":");
								break;
				case 3:
				System.out.println(All_Australia_trip[loc_choice-1]+":");
				break;
				case 4:
				System.out.println(All_Australia_trip[loc_choice-1]+":");
				break;
				case 5:
				System.out.println(All_Australia_trip[loc_choice-1]+":");
				break;
				case 6:
				System.out.println(All_Australia_trip[loc_choice-1]+":");
				break;
				case 7:
				System.out.println(All_Australia_trip[loc_choice-1]+":");
				break;
				default:
				System.out.println("The value enterd is not valid");
			}
		}
      else if (loc.equals("thiland"))
		{  
			switch(loc_choice)
			{
				case 1:
				System.out.println(All_Thiland_trip[loc_choice-1]+":");
				//System.out.println("Kolkata is India’s second-largest city and the face of West Bengal. It is an interminably progressing celebration of human existence. This dynamic 350-year-old city situated on India’s Eastern Coast is the capital of West Bengal. It flourishes as the aesthetic, social, and intellectual capital of India. Also known as the ‘City of Joy’, Kolkata is overflowing with liveliness. One can expect to be charmed by the cheap cost of things, the hand-pulled-rickshaws, wandering avenues, and a countless assortment of desserts. Some highlights of this breathtaking city are The Victoria Memorial, Howrah Bridge, Fort William, Eden Gardens, and Jorasanko Thakur Bari – the ancestral home of Nobel Laureate Rabindranath Tagore. Brimming with various exciting things to do, make sure to add this city to your bucket list! This is one of the best places to visit in West Bengal for 2 days.");
				break;
				case 2:
				System.out.println(All_Thiland_trip[loc_choice-1]+":");
				//System.out.println("If one wants to witness the stunning snow pinnacles of Kanchenjunga, the wonderful tea cultivations, the sweet-smelling orchids, the greenery of the pines, and the adorable Himalayan toy train making its way through the dazzling mountains, head to the city of Darjeeling. This hill station is a gem known for its old-world charm combined with modernity. For a well-needed break from the blistering and moist summers of India, this city is one of the best tourist places in West Bengal. It offers a potent blend of stunning mountain views, waterfalls, sightseeing tours, Buddhist monasteries, museums, shopping, and scrumptious Tibetan food. Undoubtedly, with its lush green environs and captivating hills, this place is one of the best places to visit in West Bengal in June.");
				break;
				case 3:
				System.out.println(All_Thiland_trip[loc_choice-1]+":");
				//System.out.println("This UNESCO World Heritage Site is the biggest mangrove eco-arrangement in the world. Home to one of India’s most notorious untamed life species, the Royal Bengal Tiger, it is also the world’s biggest estuarine woods befuddled by many streams and tributaries, converged by a system of tidal conduits and a maze of little mangrove islands. This interconnectedness makes The Sundarbans one of the most appealing and charming spots on earth. At present this extraordinary land is home to 250 tigers and an assortment of birds, reptiles, and various invertebrates including crocodiles. This natural heaven is situated about 110 km from Kolkata.");
				break;
				case 4:
				System.out.println(All_Thiland_trip[loc_choice-1]+":");
				//System.out.println("The seaside village of Mandarmani in East Medinipur locale is situated at the northern end of the Bay of Bengal. It is one of the biggest and quickly developing resort villages of West Bengal and is located about 180 km from Kolkata. It is contended to be the longest drive-in seashore in India. One can relax, swim, and appreciate each moment of their stay at this majestic seashore. The minute one gets worn out, they can chill off with green coconut water. There are very few visitors around and that is the best part of this seashore. One can spend their time sunbathing and watching the birds and waves.");
				break;
				case 5:
				System.out.println(All_Thiland_trip[loc_choice-1]+":");
				//System.out.println("Bankura is situated in Eastern Chota Nagpur Plateau and is adorned by mother nature with brown slopes, babbling brooks and antiquated temples. The town has numerous temples such as the Madan Mohan temple, Shyam Roy temple, and Sarada Devi temple. Bankura is a great picnic spot as it offers opportunities for trekking and exploring too. Also make sure to visit the Biharinath hill, Susunia hill, and Koko hill during your travel to this beautiful temple city of West Bengal. This is one of the best places to visit in West Bengal for 1 day.");
				break;
				case 6:
				System.out.println(All_Thiland_trip[loc_choice-1]+":");
				//System.out.println("This melting pot of cultures from the Indians, British, Nepalese, and Tibetans is situated 3 hours away from Darjeeling. Its flowering gardens, Buddhist monasteries, historic churches, and sacred temples make it a renowned tourist destination. Offering panoramic views of the Himalayan range, this hill station is at an altitude of 4100 ft. Make sure to participate in the various activities available here such as the great hill walks, bird watching, and shopping at the Kalimpong Market Square.");
				break;
				case 7:
				System.out.println(All_Thiland_trip[loc_choice-1]+":");
				//System.out.println("This melting pot of cultures from the Indians, British, Nepalese, and Tibetans is situated 3 hours away from Darjeeling. Its flowering gardens, Buddhist monasteries, historic churches, and sacred temples make it a renowned tourist destination. Offering panoramic views of the Himalayan range, this hill station is at an altitude of 4100 ft. Make sure to participate in the various activities available here such as the great hill walks, bird watching, and shopping at the Kalimpong Market Square.");
				break;
				default:
				System.out.println("The value enterd is not valid");
			}
		}
      else if (loc.equals("africa"))
		{  
			switch(loc_choice)
			{
				case 1:
				System.out.println(All_South_africa_trip[loc_choice-1]+":");
				//System.out.println("Ahmedabad, the largest city in Gujarat, is a vibrant blend of modernity and tradition. It's famous for its textile industry, delicious street food, and a rich history associated with Mahatma Gandhi. Key attractions include the Sabarmati Ashram, Jama Masjid, Adalaj Stepwell, and the Calico Museum of Textiles.");
				break;
				case 2:
				System.out.println(All_South_africa_trip[loc_choice-1]+":");
				//System.out.println("This is the only place in the world where you can spot the Asiatic lion in the wild. Gir Forest National Park is a haven for wildlife enthusiasts and nature lovers. Along with the lions, you can also see leopards, antelopes, and various bird species.");
				break;
				case 3:
				System.out.println(All_South_africa_trip[loc_choice-1]+":");
				//System.out.println("Located on the Arabian Sea coast, the Somnath Temple is one of the 12 Jyotirlinga shrines dedicated to Lord Shiva. The temple's architecture is stunning, and the religious significance draws pilgrims from all over India.");
				break;
				case 4:
				System.out.println(All_South_africa_trip[loc_choice-1]+":");
				//System.out.println("The Rann of Kutch is a vast salt marsh that transforms into a mesmerizing white desert during the dry season. The annual Rann Utsav is a cultural extravaganza featuring folk dances, music, and craft exhibitions. It's a unique experience to witness the white desert's surreal beauty under the moonlight.");
				break;
				case 5:
				System.out.println(All_South_africa_trip[loc_choice-1]+":");
				//System.out.println("Dwarka is one of the holiest cities for Hindus and is believed to be Lord Krishna's ancient kingdom. The Dwarkadhish Temple is the main attraction, and you can also visit places like Nageshwar Jyotirlinga Temple, Bet Dwarka, and the Rukmini Devi Temple.");
				break;
				case 6:
				System.out.println(All_South_africa_trip[loc_choice-1]+":");
				//System.out.println("Situated in the Western Ghats, Saputara is a picturesque hill station and a perfect retreat for nature lovers. You can enjoy boating in Saputara Lake, trekking in the lush forests, and visit the tribal villages to experience the local culture.");
				break;
				case 7:
				System.out.println(All_South_africa_trip[loc_choice-1]+":");
				//System.out.println("Vadodara is known for its historical and architectural heritage. The Laxmi Vilas Palace, the grand residence of the Gaekwad dynasty, is a must-visit. Other attractions include the Sayaji Garden, Champaner-Pavagadh Archaeological Park (a UNESCO World Heritage Site), and the Maharaja Fateh Singh Museum.");
				break;
				default:
				System.out.println("The value enterd is not valid");
			}
		}

	}

}
class CoupleTripDatePlanner 
{
	public static void main(String[] args) 
	{   //-----------------------for weather class-----------------------
        Random R1 = new Random();
		//------------------------------For login-------------------------------
		Login L1 = new Login();
		//--------------------------Object creation For dates-----------------------------------
		Couple_dates C_d = new Couple_dates();
		Picnic_dates P_d = new Picnic_dates();
		Walk_dates W_d = new Walk_dates();
		Elegant_dates E_d = new Elegant_dates();
		Movie_dates M_d = new Movie_dates();
		//Couple_trips C_t = new Couple_trips();
		//Wheather W1 = new Wheather();
		//------------------------Object creation for couple Trips------------------------------------
		Domestic_trips D_t = new Domestic_trips();
		International_trips I_t = new International_trips();

		//----------Staring point----------------------------------------------------
		System.out.println("WELCOME to COUPLE DATE TRIP PLANNER");
		System.out.println("DO you wnat to \n1.Login \n2.Signup");
		Scanner sc = new Scanner(System.in);
	    int Input = sc.nextInt();
		switch(Input)
		{
			case 1:
				System.out.println("Login");
			    System.out.println("Enter the UserName:");
				String ur = sc.next();
				System.out.println("Enter the Password:");
				String pass = sc.next();
				boolean res = L1.Validate(ur,pass);
				if (res == true)
				{
					System.out.println("Now Choose the ocassion you are planning\n1.Dates\n2.Trips");
					int Input_occ = sc.nextInt();
					switch(Input_occ)
					{
						case 1: 
							System.out.println("Now choose the kind of date you are planning");
						    String[] Date_Type = C_d.All_dates();
							int res_occ = sc.nextInt();
							if(res_occ == 1 || res_occ == 2 || res_occ == 3 || res_occ == 4)
						    {
								switch(res_occ)
								{
									case 1:
										System.out.println("So for a picnic Date which location would you like to choose");
									    String loc = sc.next();
										P_d.sub_loc(loc,Date_Type[res_occ-1]);
										System.out.println("\nPlease enter your budget so that we can filter the list further");
										double budget = sc.nextDouble();
										P_d.Date_budget(budget,Date_Type[res_occ-1],loc);
										System.out.println("Please enter your Choice:");
										int loc_choice = sc.nextInt();
										int x = R1.nextInt(2)+1;
										P_d.check_weather(loc_choice,x,loc,Date_Type[res_occ-1]);
										P_d.picnic_loc(loc_choice,loc);
										break;

										
									case 2:
										System.out.println("So for a Walk Date which location would you like to choose");
									    loc = sc.next();
										W_d.sub_loc(loc,Date_Type[res_occ-1]);
										System.out.println("\nPlease enter your budget so that we can filter the list further");
										budget = sc.nextDouble();
										W_d.Date_budget(budget,Date_Type[res_occ-1],loc);
										System.out.println("Please enter your Choice:");
										loc_choice = sc.nextInt();
										x = R1.nextInt(2)+1;
										W_d.check_weather(loc_choice,x,loc,Date_Type[res_occ-1]);
										W_d.walk_loc(loc_choice,loc);
                                        break;

									case 3:
										System.out.println("So for a Elegant Date which location would you like to choose");
									    loc = sc.next();
										E_d.sub_loc(loc,Date_Type[res_occ-1]);
										System.out.println("\nPlease enter your budget so that we can filter the list further");
										budget = sc.nextDouble();
										E_d.Date_budget(budget,Date_Type[res_occ-1],loc);
										System.out.println("Please enter your Choice:");
										loc_choice = sc.nextInt();
										x = R1.nextInt(2)+1;
										E_d.check_weather(loc_choice,x,loc,Date_Type[res_occ-1]);
										E_d.elegant_loc(loc_choice, loc);
										break;
									case 4:
										System.out.println("So for a Movie Date which location would you like to choose");
									    loc = sc.next();
										M_d.sub_loc(loc,Date_Type[res_occ-1]);
										System.out.println("\nPlease enter your budget so that we can filter the list further");
										budget = sc.nextDouble();
										M_d.Date_budget(budget,Date_Type[res_occ-1],loc);
										System.out.println("Please enter your Choice:");
										loc_choice = sc.nextInt();
										x = R1.nextInt(2)+1;
										M_d.check_weather(loc_choice,x,loc,Date_Type[res_occ-1]);
										M_d.movie_loc(loc_choice, loc);
										break;
								}
								
						    }
							else 
							{
								System.out.println("Invalid Input");
							}
                            break;
					    case 2:
						     System.out.println("So you Choose Trip");
							 System.out.println("So What kind of Trip are you planning\n1.Domestic\n2.International");
							 String[] Trip_type = {"Domestic","International"};
							 int trip_choice = sc.nextInt();
							 switch(trip_choice)
							 { 
								case 1:
										System.out.println("So for Domestic trip which location would you like to choose");
										String loc = sc.next();
										D_t.sub_loc(loc,Trip_type[trip_choice-1]);
										System.out.println("\nPlease enter your budget so that we can filter the list further");
										double budget = sc.nextDouble();
										D_t.Date_budget(budget,Trip_type[trip_choice-1],loc);
										System.out.println("Please enter your Choice:");
										int loc_choice = sc.nextInt();
										int x = R1.nextInt(2)+1;
										D_t.check_weather(loc_choice,x,loc,Trip_type[trip_choice-1]);
										D_t.Domestic_loc(loc_choice, loc);
										break;
															   
								case 2:
								        System.out.println("So for International trip which location would you like to choose");
									    loc = sc.next();
										I_t.sub_loc(loc,Trip_type[trip_choice-1]);
										System.out.println("\nPlease enter your budget so that we can filter the list further");
									    budget = sc.nextDouble();
										I_t.Date_budget(budget,Trip_type[trip_choice-1],loc);
										System.out.println("Please enter your Choice:");
									    loc_choice = sc.nextInt();
										x = R1.nextInt(2)+1;
										I_t.check_weather(loc_choice,x,loc,Trip_type[trip_choice-1]);
										I_t.International_loc(loc_choice, loc);
										break;								       
							 }

							 break;
						  
					}
			   	}
				else
			    {
					System.out.println("Try again");
			    }

                
			    break;
			case 2:
				System.out.println("Signup");
			    break;
			
		}
		
	}
}
