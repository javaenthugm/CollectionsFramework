package videos.CollectionsFramework;

public class App12_Challenges {

	public static void main(String args[]) {
		String[][] array = { 
				{ "United States", "45785090","19.8","14.3"},
				{ "Russia", "11048064","4.8","7.7" }, 
				{ "Germany", "9845244","4.3","11.9" },
				{ "Saudi Arabia", "9060433","3.9","	31.4" },
				{ "United Arab Emirates", "7826981","3.4","83.7"},
				{ "United Kingdom", "7824131","3.4","12.4" }, 
				{ "France", "7439086","3.2","11.6" },
				{ "Canada", "7284069","3.1","20.7" }, 
				{ "Australia", "6468640","2.8","27.7" },
				{ "Spain", "6466605","2.8","13.8" } 
		};
		
		/*
	    1)Display the table data (not the headings) on the console, 
	    	using tabs and/or System.out.printf() to align columns.
	    2)What is the total number of immigrants for these countries? 119048343
	    3)What total percentage of the world's immigrants do these countries have?
	    4)Which countries have the highest and lowest percentage of immigrants?
	    5)Based on these figures, estimate the total population of all ten countries.
		*/
		Double total = 0.0;
		Double perWorldTotal=0.0;
		Double estmatedPop=0.0;
		String lc = array[0][0];
		String hc = array[0][0];
		int lcp = Integer.parseInt(array[0][1]);
		for (int row = 0; row < array.length; row++) {
			for (int col = 0; col < array[row].length; col++) {
				System.out.print(array[row][col]);				
				System.out.print("\t");
				if(col==1){
					total+=Double.parseDouble(array[row][1]);
					if(Integer.parseInt(array[row][1])<lcp){
						lc = array[row][0];
						lcp = Integer.parseInt(array[row][1]);
					}else{
						hc = array[row][0];
					}
				}
				if(col==2)
					perWorldTotal+=Double.parseDouble(array[row][2]);
				if(col==3)
					estmatedPop+=Double.parseDouble(array[row][3]);				
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("Total immigrants:" +total);
		System.out.println("Total percentage of world's immigrants:"+perWorldTotal);
		System.out.println("Country with least immigration: "+lc);
		System.out.println("Country with greatest immigration: "+hc);
		System.out.println("Total estimated population of all countries:"+estmatedPop);
		
		System.out.println();
		
		

	}

}
