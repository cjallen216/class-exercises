package com.techelevator.application;

import java.util.ArrayList;
import java.util.List;

import com.techelevator.models.Chore;
import com.techelevator.ui.UserInput;
import com.techelevator.ui.UserOutput;

public class Application
{
	// helper private variables - dependency classes for the UI
    UserInput input = new UserInput(); // any time I need to prompt for user input
    UserOutput output = new UserOutput(); // any time need to display something to user
    
    //private variables
    List<Chore> chores;
    
    public Application()
    {
        // create instance variables here
        chores = new ArrayList<Chore>();
    }

    public void run()
    {
        output.displayWelcomeScreen();

        while(true)
        {
            int choice = input.getMainMenuChoice();

            if(choice == 1)
            {
                addChore();
            }
            else if(choice == 2)
            {
                showChores();
            }
            else if(choice == 3)
            {
                break;
            }
            else
            {
                output.displayMessage("Please select from the list of options.");
            }

        }

        output.displayGoodbye();

    }

    private void addChore()
    {
    	// get chore name
    	String choreName = input.getChoreName();
    	
    	// get the persons name
    	String personName = input.getPersonName();
    	
    	//create the chore
    	Chore chore = new Chore(choreName, personName);
    	
    	// add the chore to the List
    	chores.add(chore);
    }

    private void showChores()
    {
    	for (Chore chore : chores)
		{
			output.displayMessage(chore.toString());
		}
    	
    }
    
}
