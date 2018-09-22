/*
	This file uses the GUI_Demo to show studnets how to create an GUI that can be used in a application.
*/
import java.awt.event.*;

public class StoryTeller{
	GUI_Demo SDGUI = new GUI_Demo();			// creating the SDGUI as the GUI_Demo class
	int CurrentStoryPoint = 0;								// this controles what question you are on
	String UserName = new String();					// keeping track of the users name
	String DrinkChoice = new String();			// keeping track of the users drink choice
	String FromLocation = new String();
	String PetPreference = new String();
	String FavoriteSport = new String();
	String FreeTime = new String();
	String FavoriteFood = new String();
	String FinalChoice = new String();
	
	
	public static void main(String args[]) {
		new StoryTeller();
	}
	
	// constructor for this class, buids the gui, adds a listener and kicks off the story teller.
	public StoryTeller() {
		SDGUI.ConstructGUI();
		
		// problem here because references object directly
		SDGUI.user_input.addKeyListener(new KeyAdapter() {
			public void keyPressed(KeyEvent e) {
				int key = e.getKeyCode();
				if (key == KeyEvent.VK_ENTER)  {
					StoryLogic() ;
				}
			}
		});
		StoryLogic() ;
	}
	
	public void StoryLogic() {
  // put your code here...
		
	if (CurrentStoryPoint == 0){
		SDGUI.PrependToTextArea("Hello, user. My name is Tomisin. What is your name?");
		CurrentStoryPoint = 1;
	}
	
	else if (CurrentStoryPoint == 1) {
		UserName = SDGUI.getUserText();
		SDGUI.PrependToTextArea("It is very nice to meet you, " + UserName + ". My name is Tomisin! I have a very important question... Do you prefer Coke or Pepsi?");
		SDGUI.setUserText("");
		CurrentStoryPoint = 2;
	}
	
	else if (CurrentStoryPoint == 2) {
		DrinkChoice = SDGUI.getUserText();
		SDGUI.PrependToTextArea("That is a very interesting choice. Unfortunately I do not like " + DrinkChoice + ". I have to disagree with you!! I forgot to ask... where are you from?");
		SDGUI.setUserText("");
		CurrentStoryPoint = 3;
	}
	
	else if (CurrentStoryPoint == 3) {
		
		FromLocation = SDGUI.getUserText();
		SDGUI.PrependToTextArea("Wow, I love " + FromLocation + "! I would love to visit that location again. Do you prefer dogs or cats?");
		SDGUI.setUserText("");
		CurrentStoryPoint = 4;
	}
	
	else if (CurrentStoryPoint == 4) {
		
		PetPreference = SDGUI.getUserText();
		SDGUI.PrependToTextArea("That is very cool. " + PetPreference + " are so cool and are such cute animals. Do you have any " + PetPreference + "?");
		SDGUI.setUserText("");
		CurrentStoryPoint = 5;
	}
	
	else if (CurrentStoryPoint == 5) {
		
		PetPreference = SDGUI.getUserText();
		SDGUI.PrependToTextArea("Okay! Thank you for telling me. Anyways, what is your favorite sport?");
		SDGUI.setUserText("");
		CurrentStoryPoint = 6;
	}
	
	else if (CurrentStoryPoint == 6) {
		
		FavoriteSport = SDGUI.getUserText();
		SDGUI.PrependToTextArea("No way! I love " + FavoriteSport + "!!! That's awesome! What other things do you like to do in your spare time?");
		SDGUI.setUserText("");
		CurrentStoryPoint = 7;
	}
	
	else if (CurrentStoryPoint == 7) {
		
		FreeTime = SDGUI.getUserText();
		SDGUI.PrependToTextArea("That is interesting! I am glad that I am getting to know more about you through this conversation! What is your favorite food?");
		SDGUI.setUserText("");
		CurrentStoryPoint = 8;
	}
	
	else if (CurrentStoryPoint == 8) {
		
		FavoriteFood = SDGUI.getUserText();
		SDGUI.PrependToTextArea("Oooh, " + FavoriteFood + " sounds really good right now. You're making me hungry. Okay, I have one more question. Did you enjoy this conversation?");
		SDGUI.setUserText("");
		CurrentStoryPoint = 9;
	}
	else if (CurrentStoryPoint == 9) {
		
		FinalChoice = SDGUI.getUserText();
		SDGUI.PrependToTextArea("Thank you so much for your feedback. You can press 'q' to quit.");
		SDGUI.setUserText("");
		CurrentStoryPoint = 10;
	}
	
	else if (CurrentStoryPoint == 10 && SDGUI.getUserText().equals("q")) {
		System.exit(1);
	}
	else if (CurrentStoryPoint == 10 && !(SDGUI.getUserText().equals("q"))) {
		SDGUI.PrependToTextArea("Type 'q' to quit! Otherwise this pop up box will not go away!");
		SDGUI.setUserText("");
	}
	
	}
	
	
}
