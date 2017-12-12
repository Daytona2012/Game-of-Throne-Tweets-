package GameOfThrownTweets;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class GOTTweets implements Comparable<GOTTweets>, Serializable {

	//private boolean mBreakIt = true;
	private String mAuthor;
	private String mDescription;
	private Date mCreationDate;
	
	public GOTTweets(String author, String description, Date creationDate) {
		mAuthor = author;
		mDescription = description;
		mCreationDate = creationDate;
	}
	
	@Override
	public String toString() {
		return String.format("GOTTweets: \"%s\" @%s on %s", 
	                         mDescription,  mAuthor, mCreationDate);
	}
	
	@Override
	public int compareTo(GOTTweets otherGottweets) {
		if (equals(otherGottweets)) {
			return 0;
		} 
		int dateCmp = mCreationDate.compareTo(otherGottweets.mCreationDate);
		if (dateCmp == 0) {
			return mDescription.compareTo(otherGottweets.mDescription);
		}
		return dateCmp;
	}
	
	public String getAuthor() {
		return mAuthor;
	}
	
	public String getDescription() {
		return mDescription;
	}
	
	public Date getCreationDate() {
		return mCreationDate;
	}
	
	public List<String> getWords() {
		String[] words =  mDescription.toLowerCase().split(mDescription, 0);
		return Arrays.asList(words);
	}
	
	public List<String> getHashTags(){
		
		return getWordsPrefixedWith("#");
	}
	
    public List<String> getMentions(){
		
		return getWordsPrefixedWith("@");
	}
    
    private List<String> getWordsPrefixedWith(String prefix){
		
		//Interface                 Implemetation 
		List<String> results = new ArrayList<String>();
		for (String word : getWords()) {
			if (word.startsWith(prefix)) {
				results.add(word);
			}
		}
		return results;
	}


}
