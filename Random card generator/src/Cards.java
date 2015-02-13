import java.util.Scanner;
public class Cards
	
{
	
						public static void main(String[] args)
					{
						String [] cardSuits = {"Hearts", "Clubs", "Diamonds", "Spades"};
						String [] cardRanks = {"King" , "Queen" , "Jack" , "Ten" , "Nine" , "Eight", "Seven" , "Six" , "Five" , "Four" , "Three" , "Two" , "Ace"};
					

				int suitsNum = (int) (Math.random() * 4);
				int ranksNum = (int) (Math.random() * 13);
						System.out.println("Your card is the " + cardRanks [ranksNum]  + " of "  + cardSuits [suitsNum] );
						
	
							{
								int [] evenNumbers = {2 , 4 , 6 , 8 , 10 , 12 , 14 , 16 , 18 ,20};
						
								for(int i=0; i < evenNumbers.length; i++)
							{
								System.out.println(	evenNumbers [i] * evenNumbers [i]);
							}
	
								Scanner userInput = new Scanner(System.in);
								String [] monthsOfTheYear = {"January" , "Febuary" ,"March" , "April" , "May" , "June" , "July" , "August" , "September" , "October" , "November" , "December"};	
								System.out.println("User, Please imput the number of a month");
								int month = userInput.nextInt();
								System.out.println(monthsOfTheYear [month - 1]);
							}
					}
}


	