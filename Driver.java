
import java.io.File;
import java.util.Scanner;


public class Driver 
{
	public static void main(String[] args) throws Exception
	{
		Scanner input = new Scanner(new File(System.getProperty("user.dir") + "/src/caveJSON"));
		String theJSON = "";
		while(input.hasNextLine())
		{
			theJSON = theJSON + input.nextLine();
		}
		System.out.println(theJSON);
		System.out.println(theJSON);
		Driver.parseJSON(theJSON);
		/*
		Room caveEntrance = new Room("The Cave Entrance");
		Room room2 = new Room("Room #2");
		caveEntrance.addExit("north", room2);
		room2.addExit("south", caveEntrance);
		
		Player thePlayer = new Player("The Follower");
		caveEntrance.addThePlayer(thePlayer);
		*/
	}
	static void parseJSON(String s)
		{
			for(int i = 0; i < s.length(); i++)
			{
				if(s.charAt(i) == '{')
				{
					System.out.println("JSON Object Begin");
				}
					else if(s.charAt(i) == '}')
					{
						System.out.println("JSON Object End");
					}
						else if(s.charAt(i) == '[')
						{
							System.out.println("JSON Array Begin");
						}
							else if(s.charAt(i) == ']')
								System.out.println("JSON Array End");
			
		}
	}
}