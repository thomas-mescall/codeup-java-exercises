package zombieGame;

import java.util.Scanner;

public class Intro {
    Scanner myScanner = new Scanner(System.in);
    int userInput = myScanner.nextInt();
    public int doctorIntro(){
        System.out.println("While performing open heart surgery your patient's arm begins to move and his eyes open. The patient quickly grabs your assistant's hand and bites a chunk out of it. You quickly jump back in disbelief and grab a...");
        return userInput;
    }
    public int soldierIntro(){
        System.out.println("During a nigh-time training exercise in the swamps of Louisianna you lose your footing and fall into a pond that you did not see. As your team-mates help pull you back into your line formation you hear a rapid splashing approaching you. Upon quickly turning around you reach for your...");
        return userInput;
    }
    public int farmerIntro(){
        System.out.println("The sun is just starting to come out and you are well on your way to being done with loading hay for your live-stock in the stables. While walking towards the exit you hear a blood curdling scream come from one of the stables. Upon inspection you find a sheep that is half dead with something violently jerking within its body. You slowly back away and start sprinting towards the door. As you get halfway you hear footsteps closing in on you. Thankfully you have your...");
        return userInput;
    }
    public int policeOfficerIntro(){
        System.out.println("Its been a long day of dealing with the crazy cat lady again and you really just want to get home to your pet fish 'Bubbles'. While making one last stop at your local pet store you notice that nobody else is around to check you out. You ring the bell at the front and immediately hear aggresive footsteps coming from the backroom. Your instincts kick in and you reach for your...");
    }
    public int teenagerIntro(){
        System.out.println("Life sucks and so does being a teenager. You've been grounded all week for talking back to your mom and you finally have a chance to sneak out of your house while your parents are asleep. As you carefully climb out of your window and onto the floor below your friends car crashes into the tree in your front yard. Your parents run outside to see what is going on and are immediately overwhelmed by the occupants of the vehicle. You look on in horror as your parents are consumed by the very friends they were trying to keep you from. As you take a step back you fail to see the twig that snaps beneath your foot. One of the zombie's snaps its head in your direction and begins to scream as it runs. You stumble back and thrust forth your...");
    }
    public int mechanicIntro(){
        System.out.println("After changing oil all day you decide to to take a smoke break behind your place of buisness. You hear screams and chaos ensue inside but choose to ignore it because it's been a long day and you're tired of dealing with abnoxious customers. Upon returning you see blood spatter all over the front desk and feet violently kicking from another room. You wonder what the boys are up to now and grab your...");
    }
    public int elderlyPersonIntro(){
        System.out.println("It's jello time at the old folks home and you couldn't be any more ready to somehow escape the monotonous prison that your ungrateful son has put you in. You continue to change the channel from Jeopardy to the local news and begin to upset your fellow tenants. As they begin to complain about how you can't even see what's on a quick paced shuffle moves past you and you feel something warm spray across your face. You understand what is happening and immediately hop into action grabbing your...");
    }
}
