
package ifs_ints_and_loops;
import javax.swing.JOptionPane;

public class Horoscope {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String Stars = JOptionPane.showInputDialog(null,"What's you're star sign?");
if (Stars.equalsIgnoreCase("Capicorn")){
	JOptionPane.showMessageDialog(null,"As The Sun enters your house today you want some luxury, but you want to keep money, you can have both.\n" + 
			"\n" + 
			"The Sun enters Capricorn today, bringing you a dilemma regarding money and material possessions. You want nice things in your life, you might even want to enjoy a little luxury, but at the same time you want to have money. Its hard to strike a balance where you have both, but this is possible for you if you can separate your emotions from practicality.");
}
else if (Stars.equalsIgnoreCase("Aquarius")){
	JOptionPane.showMessageDialog(null,"When you have to adjust to a change in your love life today, be positive about spending time alone.\n" + 
			"\n" + 
			"You need to adapt to a changing situation in your love life today that could see you spending a little more time on your own. This could be because your partner has to go away for work or maybe has a social event planned with friends, but whatever it is, dont be negative about it. Liking your own company is important and healthy, so make this adjustment.");
}
else if (Stars.equalsIgnoreCase("Pisces")){
	JOptionPane.showMessageDialog(null, "As Neptune ends its time in trine with Venus today you need to schedule in rest and down time.\n" + 
			"\n" + 
			"Neptune in Pisces ends its time in trine with Venus today, giving you the opportunity to recognise the importance of getting enough rest. Pushing yourself hard and working until you crash isnt healthy and it will only make you less productive in the long run. Rest will give you motivation and better creative energy, so schedule in that down time.");
}
else if (Stars.equalsIgnoreCase("Aries")){
	JOptionPane.showMessageDialog(null, "Stop procrastinating and face up to your finances today, you can take control of your money.\n" + 
			"\n" + 
			"You will be pulled today between knowing you need to attend to financial matters in your life and wanting to put this off and find anything else to do instead. Stop procrastinating and get on with it. You have to deal with this at some point and you might as well get it over with. Take back your power in your money life and take control of your finances.");
}
else if (Stars.equalsIgnoreCase("Taurus")){
	JOptionPane.showMessageDialog(null,"Others want to be with you as your natural charm shines through and you want to have fun.\n" + 
			"\n" + 
			"You have a lot of natural charm shining through in your personality today and this could make you feel playful and full of fun as others are attracted to you and want to spend time with you. Its a great time to be creative and you can use this energy to do things you dont normally get the chance to do. Just make sure everyone understands the game.");
}
else if (Stars.equalsIgnoreCase("Gemini")){
	JOptionPane.showMessageDialog(null, "As The Moon leaves your house today you need to deal with financial tensions head on.\n" + 
			"\n" + 
			"The Moon leaves Gemini today and as it does it gifts you the energy you need to deal with building tensions in your financial life. You need to face these money issues straight on and deal with them without any hesitation. Dont try to put this off, it wont get any better if you leave it, get this sorted right away and you can move forward lighter.");
}
else if (Stars.equalsIgnoreCase("Cancer")){
	JOptionPane.showMessageDialog(null,"You have increased confidence today to deal with money issues and you can lay ghosts to rest.\n" + 
			"\n" + 
			"Today you have the chance to see the past, the present, and the future all at once and this will help you to heal some wounds and tensions about money. You may have a second chance to lay some old ghosts to rest and youll have increased confidence in this area for looking ahead and feeling secure in your knowledge and your experience.");
}
else if (Stars.equalsIgnoreCase("Leo")){
	JOptionPane.showMessageDialog(null, "The time for thinking about this and talking is done, now its time to start doing it today\n" + 
			"\n" + 
			"Youve done a lot of thinking about something, youve mapped out your plans and youre sure this is the right thing to do, so the time for talking about it is over, now its time to step forward and start doing it. Your friends are going to be there today to support you and help you in any way they can, so start your journey on this new adventure."); 
			
}
else if (Stars.equalsIgnoreCase("Virgo")){
	JOptionPane.showMessageDialog(null,"Make sure your determination doesnt turn into obsessive thinking, find the right balance.\n" + 
			"\n" + 
			"You have high determination today, which is great, but be careful you dont take this too far. When determination starts to border on obsession its time to reel it in a little. Dont fixate on the one thing you are motivated about at the expense of all other things, you need to find the right balance. Obsessive thinking is wasting your energy.");
}
else if (Stars.equalsIgnoreCase("Libra")){
	JOptionPane.showMessageDialog(null, "While you want to support others you might be too fragile yourself to give advice to them.\n" + 
			"\n" + 
			"You will be pulled in two different directions regarding your emotions today. On the one hand you want to be emotionally there for others and you will be supportive, but on the other hand all you want to do is hide away and recharge your own batteries. This means you might not be in the best position to give advice to others right now.");
}
else if (Stars.equalsIgnoreCase("Scorpio")){
JOptionPane.showMessageDialog(null,"As Venus ends its time in trine with Neptune today you have great energy for solving problems.\n" + 
		"\n" + 
		"Venus in Scorpio ends its time in trine with Neptune today, giving you strong problem solving energy. Youll also have great energy for dealing with sticky issues coming at you from the outside. This all puts you in the ideal position to approach those long standing problems that you havent been able to fix. Now youll find this puzzle much easier to solve.");	
}
else if (Stars.equalsIgnoreCase("Sagittarius")){
	JOptionPane.showMessageDialog(null, "As Mercury and Jupiter end their time in conjunction in your house today, youre too emotional for decisions.\n" + 
			"\n" + 
			"Mercury and Jupiter end their time in conjunction in Sagittarius today, making you over emotional. Your heart is charging forward and your head doesnt have a chance of getting a say right now. This makes it a bad time for making any decisions or judgment calls as your feelings are going to be over-ruling all rationality and logic. Wait it out.");
}

else {
JOptionPane.showMessageDialog(null, "THATS NOT A STAR SIGN!");
}

}
}