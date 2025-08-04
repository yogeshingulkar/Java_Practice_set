//code solve by Shrikant Sir
//The Indian Census Bureau projects population based on the following assumptions:
// * One birth every 7 seconds
// * One death every 13 seconds
// * One new immigrant every 45 seconds
// Q.Write a program to display the population for each o next five years. Assume the current population is
// 312,032,486 and one year has 365 days.

class Population1{

	public static void main(Stsring[] args) {
		
		long currentPopulation = 312032486 ;
		
		long seconds = (365*24*60*60)*5;
		long birth = seconds/7 ;
		long death = seconds/13 ;
		long immigrants = seconds/45 ;
		long newPop = currentPopulation+birth-death+immigrants ;

		System.out.println("Current Population : " + currentPopulation);
		System.out.println("New Population : " + newPop);


	}
}