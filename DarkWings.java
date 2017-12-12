package GameOfThrownTweets;

import java.util.Arrays;
import java.util.Date;

import GameOfThrownTweets.SaveGOT;



public class DarkWings {

	public static void main(String[] args) {
		GOTTweets gottweets = new GOTTweets(
				"aegonthedragontargaryan",
				"Yield now and you may remain as Lord of the Iron Islands."
				+ "Yield now, and your sons will live to rule after you."
				+ "I have eight thosand men outside your walls.",
				new Date(-2119759698000L)
				);
		GOTTweets secondGottweets = new GOTTweets(
				"HarrenTheBlackHoare",
				"What is outside my walls is of no concern to me. Those "
				+ "walls are strong and thick.",
				new Date(-2119759753000L)
				);
		GOTTweets thirdGottweets = new GOTTweets(
				"aegonthedragontargaryan",
				"But not so high as to keep out dragons. Dragons Fly.",
				new Date(-2119759748000L)
				);
		GOTTweets fourthGottweets = new GOTTweets(
				"HarrenTheBlackHoare",
				"I build in stone. Stone does not burn.",
				new Date(-2119759743000L)
				);
		GOTTweets fifthGottweets = new GOTTweets(
				"aegonthedragontargaryan",
				"When the sun sets, your line shall end.",
				new Date(-2119759738000L)
				);
		GOTTweets sixthGottweets = new GOTTweets(
				"euronthecrowseyegreyjoy",
				"Godless? Why, Aeron, I am the godliest man ever to raise sail! "
				+ "You serve one god, Damphair, but I have served ten thousand. "
				+ "From IB to Asshai, when men see my sail, they pray.",
				new Date(-52595611199000L)
				);
		GOTTweets seventhGottweets = new GOTTweets(
				"euronthecrowseyegreyjoy",
				"I am the storm, my lord. The first storm, and the last storm",
				new Date(-52592068799000L)
				);
		GOTTweets eighthGottweets = new GOTTweets(
				"euronthecrowseyegreyjoy",
				"Perhaps we can fly. All of us. How will we ever know unless we leap "
				+ "from some tall tower? No man ever truly knows what he can do unless he "
				+ "dares to leap.",
				new Date(-52583169599000L)
				);
		
		//Using for statement to get words 
		/*System.out.println("the words are: ");
        for (String word: gottweets.getWords()) {
        	System.out.println(word);
        }*/
        
        //Sort array of tweets by comparing
        GOTTweets[] gottweet = {gottweets, secondGottweets, thirdGottweets, fourthGottweets, fifthGottweets};
		/*Arrays.sort(gottweet);
		for (GOTTweets exampleGOTTweet : gottweet) {
			System.out.println(exampleGOTTweet); 
		}*/
		
		//Load Save
		/*SaveGOT.save(gottweet);
		GOTTweets[] gottweet = SaveGOT.load();*/
		
		System.out.println("Welcome to the World of Game Of Thrones...Tweets.");
        System.out.println(gottweet[0]);
        System.out.println(gottweet[1]);
        System.out.println(gottweet[2]);
        System.out.println(gottweet[3]);
        System.out.println(gottweet[4]);
        System.out.println();
        System.out.println(sixthGottweets);
        System.out.println();
        System.out.println(seventhGottweets);
        System.out.println();
        System.out.println(eighthGottweets);
	}

}
