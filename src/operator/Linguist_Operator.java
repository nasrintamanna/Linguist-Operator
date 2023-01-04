/*Program Name:- The Linguist Operator
Instructions:- You will need to develop the linguist operator programmed system which is intended to
teach users basic phrases in the Arabic language from different sections of language speaking. These
sections includes:-1.Greeting phrases 2. Small talk phrases 3. Farewell phrases. The user will learn how a
phrase in each section mentioned above is translated and pronounced in the Arabic language.
The user will also be given the opportunity to play the pronounced phrase again. Below are some of
the Greetings, small talk, and farewell phrases you will need to use in the program.
English Greeting Phrase:- Hello, how are you doing?
English Small Talk Phrase:- Beautiful day, isn’t it?
Farewell Phrase:- See you later! */

package operator;
import java.util.*; // to take input from the user.
import javax.sound.sampled.*; //We are able to insert audio.
import java.io.File; //we are able to create an object of the File class to open our audio.
import java.io.IOException; //handles any exception that'll happen with the creation of a file in case the file path is not recognized or it's not in the right format.	

public class Linguist_Operator {

	public static void main(String[] args) throws UnsupportedAudioFileException, IOException, LineUnavailableException {
		Scanner object = new Scanner(System.in);//use to take integer inputs.
		Scanner object1 = new Scanner(System.in);//use to take String inputs.
		System.out.println("Welcome to Linguist Operator!!!Where you'll learn Arabic language.");
		System.out.printf("%20s %n","----------Hi I'm your Linguist Operator---------");
		System.out.printf("%30s %n","A. Arabic");
		System.out.printf("%30s %n","B. Korean");
		System.out.printf("What language would you like to learn?(A, B)");
		String user_response = object.nextLine();
		
		//For Arabic Language
		if(user_response.equals("A")) {
			System.out.printf("Welcome to Arabic Linguist Operator! What would you like to learn first?\n1.Greeting Phrases \n2.Small Talk Phrases \n3.Farewell Phrases");
			int choose = object.nextInt();
			switch(choose) {
			case(1):
				System.out.printf("%20s %n","----------written Phrases in Arabic---------");
				System.out.printf("English Greeting Phrase:- Hello, how are you doing?");
				System.out.printf("Arabic Greeting Phrase:-marhaban kayf halika?");
				System.out.printf("%20s %n","----------Pronounciation Phrases in Arabic---------");
				File file = new File("ArabGreet.wav");
				AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
				Clip clip = AudioSystem.getClip();
				clip.open(audioStream);
				System.out.println("Enter p to play the audio");
				String response = object1.nextLine();
				response = response.toUpperCase();
				if(response.equals("P")) {
					clip.start();
					System.out.println("Enter R to replay");
					response = object1.nextLine();
					response = response.toUpperCase();
					if(response.equals("R")) {
						clip.setMicrosecondPosition(0);
						clip.start();
						 
						System.out.println("Enter E to exit");
						response = object1.nextLine();
						response = response.toUpperCase();
						System.out.println("Thank you for listening");
						}
					}
				break;
				
			case(2):
				System.out.printf("%20s %n","----------written Phrases in Arabic---------");
				System.out.printf("English Small Talk Phrase:- Beautiful day, isn't it?");
				System.out.printf("Arabic Small talk Phrase:-yawm jamil , 'alays kadhalika?");
				System.out.printf("%20s %n","----------Pronounciation Phrases in Arabic---------");
				File file2 = new File("ArabSmallTalk.wav");
				AudioInputStream audioStream2 = AudioSystem.getAudioInputStream(file2);
				Clip clip2 = AudioSystem.getClip();
				clip2.open(audioStream2);
				System.out.println("Enter p to play the audio");
				String response2 = object1.nextLine();
				response = response2.toUpperCase();
				if(response.equals("P")) {
					clip2.start();
					System.out.println("Enter R to replay");
					response = object1.nextLine();
					response = response.toUpperCase();
					if(response.equals("R")) {
						clip2.setMicrosecondPosition(0);
						clip2.start();
						 
						System.out.println("Enter E to exit");
						response = object1.nextLine();
						response = response.toUpperCase();
						System.out.println("Thank you for listening");
						}
					}
				break;
				
			case(3):
				System.out.printf("%20s %n","----------written Phrases in Arabic---------");
				System.out.printf("English Farewell Phrase:- See you later!");
				System.out.printf("Arabic Farewell Phrase:-arak lahqan!");
				System.out.printf("%20s %n","----------Pronounciation Phrases in Arabic---------");
				File file3 = new File("ArabFarewell.wav");
				AudioInputStream audioStream3 = AudioSystem.getAudioInputStream(file3);
				Clip clip3 = AudioSystem.getClip();
				clip3.open(audioStream3);
				System.out.println("Enter p to play the audio");
				String response3 = object1.nextLine();
				response = response3.toUpperCase();
				if(response.equals("P")) {
					clip3.start();
					System.out.println("Enter R to replay");
					response = object1.nextLine();
					response = response.toUpperCase();
					if(response.equals("R")) {
						clip3.setMicrosecondPosition(0);
						clip3.start();
						 
						System.out.println("Enter E to exit");
						response = object1.nextLine();
						response = response.toUpperCase();
						System.out.println("Thank you for listening");
						}
					}
				break;
										
		    }
		}
		
		//For Korean language
			else {
				System.out.printf("Welcome to Korean Linguist Operator! What would you like to learn first?\n1.Greeting Phrases \n2.Small Talk Phrases \n3.Farewell Phrases");
				int choose2 = object.nextInt();
				switch(choose2) {
				case(1):
					System.out.printf("%20s %n","----------written Phrases Korean---------");
					System.out.printf("English Greeting Phrase:- Hello, how are you doing?");
					System.out.printf("Korean Greeting Phrase:-annyeonghaseyo. eotteohge jinaeseyo?");
					System.out.printf("%20s %n","----------Pronounciation Phrases in Arabic---------");
					File file = new File("KoreanGreet.wav");
					AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
					Clip clip = AudioSystem.getClip();
					clip.open(audioStream);
					System.out.println("Enter p to play the audio");
					String response = object1.nextLine();
					response = response.toUpperCase();
					if(response.equals("P")) {
						clip.start();
						System.out.println("Enter R to replay");
						response = object1.nextLine();
						response = response.toUpperCase();
						if(response.equals("R")) {
							clip.setMicrosecondPosition(0);
							clip.start();
							 
							System.out.println("Enter E to exit");
							response = object1.nextLine();
							response = response.toUpperCase();
							System.out.println("Thank you for listening");
							}
						}
					break;
					
				case(2):
					System.out.printf("%20s %n","----------written Phrases in Korean---------");
					System.out.printf("English Small Talk Phrase:- Beautiful day, isn't it?");
					System.out.printf("Korean Small talk Phrase:-aleumdaun nal-ijyo?");
					System.out.printf("%20s %n","----------Pronounciation Phrases in Korean---------");
					File file2 = new File("KoreanTalk.wav");
					AudioInputStream audioStream2 = AudioSystem.getAudioInputStream(file2);
					Clip clip2 = AudioSystem.getClip();
					clip2.open(audioStream2);
					System.out.println("Enter p to play the audio");
					String response2 = object1.nextLine();
					response = response2.toUpperCase();
					if(response.equals("P")) {
						clip2.start();
						System.out.println("Enter R to replay");
						response = object1.nextLine();
						response = response.toUpperCase();
						if(response.equals("R")) {
							clip2.setMicrosecondPosition(0);
							clip2.start();
							 
							System.out.println("Enter E to exit");
							response = object1.nextLine();
							response = response.toUpperCase();
							System.out.println("Thank you for listening");
							}
						}
					break;
					
				case(3):
					System.out.printf("%20s %n","----------written Phrases in Korean---------");
					System.out.printf("English Farewell Phrase:- See you later!");
					System.out.printf("Korean Farewell Phrase:-najung-e bwayo!");
					System.out.printf("%20s %n","----------Pronounciation Phrases in Korean---------");
					File file3 = new File("KoreanFarewell.wav");
					AudioInputStream audioStream3 = AudioSystem.getAudioInputStream(file3);
					Clip clip3 = AudioSystem.getClip();
					clip3.open(audioStream3);
					System.out.println("Enter p to play the audio");
					String response3 = object1.nextLine();
					response = response3.toUpperCase();
					if(response.equals("P")) {
						clip3.start();
						System.out.println("Enter R to replay");
						response = object1.nextLine();
						response = response.toUpperCase();
						if(response.equals("R")) {
							clip3.setMicrosecondPosition(0);
							clip3.start();
							 
							System.out.println("Enter E to exit");
							response = object1.nextLine();
							response = response.toUpperCase();
							System.out.println("Thank you for listening");
							}
						}
					break;
											
				}
	
	}
		Scanner user_feedback = new Scanner(System.in) ;
		System.out.printf("%60s %n","Did you enjoy learning?");
		String user_opinion = user_feedback.nextLine();
		user_opinion = user_opinion.toUpperCase() ;
		if(user_opinion.equals("YES")) {

		System.out.printf("%50s %n","We are glad to hear that!");

		}
		else {

		System.out.printf("%50s %n","We are sorry to hear that!");
		}

		user_feedback.close();
		}
	}
	

