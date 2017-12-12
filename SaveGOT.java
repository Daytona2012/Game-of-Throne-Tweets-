package GameOfThrownTweets;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SaveGOT {
 public static void save(GOTTweets[] gottweet) {
	 try(
			 FileOutputStream fos = new FileOutputStream("gottweet.ser");
			 ObjectOutputStream oos = new ObjectOutputStream(fos);
			 ) {
		 oos.writeObject(gottweet);
	 } catch (IOException ioe) {
		 System.out.println("Problems saving Ravens");
		 ioe.printStackTrace();
	 } 
 }
 
 public static GOTTweets[] load() {
	 GOTTweets[] gottweet = new GOTTweets[0];
			 try (
				 FileInputStream fis = new FileInputStream("gottweet.ser");
				 ObjectInputStream ois = new ObjectInputStream(fis);
			) {
			 gottweet = (GOTTweets[]) ois.readObject();
			 } catch (IOException ioe){
				 System.out.println("Error reading file.");
				 ioe.printStackTrace();
			 } catch (ClassNotFoundException cnfe) {
				 System.out.println("Error cannot load GOT Tweets.");
				 cnfe.printStackTrace();
			 }
			 return gottweet;
 }
}
