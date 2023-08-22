class Hotstar{
 static String kannadaMovies[] ={"Jackie","James","Milana","Mungaru Male","Galipata","Arasu","Anna Bond","Drama", "Dia",
 "Raajakumara","Pogaru","roberrt","BulBul","kabza","KGF","Ayogya","Kantara","Vedha","Auto Raja","Sagar","Googly","Old Monk","Kurukshetra","U Turn","Vikrant Rona"};
 
 static String englisSeries[] = {"Game of Thrones","Breaking Bad","Stranger Things","Friends", "The Simpsons", "The Office", "Sherlock","Black Mirror","The Crown","Westworld",
 "Mindhunter","The Mandalorian","The Witcher","Chernobyl","Fargo","The Big Bang Theory","House of Cards","The Walking Dead","Peaky Blinders","Better Call Saul"};
 
 static String hindiSeries[]=  {"Sacred Games","Mirzapur","Crime Patrol","Yeh Rishta Kya Kehlata Hai","Taarak Mehta Ka Ooltah Chashmah","Bigg Boss","Kumkum Bhagya","Beyhadh","Breathe","Panchayat","Delhi Crime",
 "Indian Matchmaking","Made in Heaven","Asur","The Family Man"};
 
 static  String teluguMovies[] = {"Baahubali: The Beginning","Baahubali: The Conclusion", "Arjun Reddy","Rangasthalam","Ala Vaikunthapurramuloo",
 "Jersey","Eega","Mirchi","Geetha Govindam","Sye","Pokiri","Maharshi","Nuvvostanante Nenoddantana","Magadheera","Arya","Attarintiki Daredi", "Khaleja",
 "Nannaku Prematho","Manam", "Janatha Garage","Athadu","Baadshah","Ghajini","Eega","Srimanthudu"};
 
 static  String malayalamMovies[] ={"Drishyam","Premam","Charlie","Bangalore Days","Lucifer","Ayyappanum Koshiyum","Mumbai Police","Kumbalangi Nights","Pulimurugan","Uyare","Virus",
 "Maheshinte Prathikaaram","Joseph","Njan Prakashan","C U Soon","Kilukkam","Manichitrathazhu","Nammal","Oppam","Aadu","Amar Akbar Anthony","Puthukkottayile Puthumanavalan","Thondimuthalum Driksakshiyum","Aadu 2","Spadikam"};


public static void main(String ho[])
{
	System.out.println("Main Started");
	
	
	System.out.println("kannadaMovies.length");
	
	for(int index=0; index < kannadaMovies.length; index++)
	{
	
	System.out.println(kannadaMovies[index]);
	
	}
	//ENGLISH MOVIES
	
        System.out.println("englisSeries.length");	
		for( int eng =0; eng < englisSeries.length; eng++)
		{
		
	    System.out.println(englisSeries[eng]);	
		}


//hindi series


     System .out.println(" hindiSeries.length");
	 for( int hindi =0; hindi < hindiSeries.length; hindi++)
	 {
     System .out.println(hindiSeries[hindi]);	 
	 }
	 
	
	
	//TELUGU MOVIES
	 System.out.println("teluguMovies.length");
	 for(int telugu =0; telugu<teluguMovies.length; telugu++)
	 {
	 System.out.println(teluguMovies[telugu]);
	 }
	 
	 
	 
	 // MALAYALAM MOVIES 
	 System.out.println("malayalamMovies.length");
	 for ( int mal=0; mal< malayalamMovies.length; mal++)
	 {
		 
	 System.out.println( malayalamMovies[mal]);
	 

	
	 }
	 System.out.println("Main Ended");
}
}
	