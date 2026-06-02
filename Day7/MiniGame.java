/*
ADVANCED 2 – Mini Game Character System

Create a class GameCharacter:

Attributes:
name
health (PRIVATE)
attackPower (PRIVATE)
Requirements:
Constructor using this
Proper encapsulation
Methods:
attack(GameCharacter enemy)
heal()
showStats()
Rules:
attack reduces enemy health
heal increases own health
health should never be accessed directly
Twist:

Each attack should show:
*/
import java.util.Scanner;
class Player{
	private String name;
	private int health;
	
	Player(String name,int health)
	{
		this.name=name;
		this.health=health;
	}
	public String getName()
	{
		return name;
	}
	
	public int getHealth()
	{
		return health;
	}
	
	public void reducedHealth(int damage)
	{
		health -= damage;
	}
	public void increaseHealth(int value)
	{
		health += value;
	}
}
public class mini_game {

	boolean defending = true;
	void attack(Player enemy)
	{
		System.out.println("Attack done on enemy! Health reduced by 20!");
		enemy.reducedHealth(20);
		System.out.println("Enemy "+enemy.getName()+"'s health reduced to "+enemy.getHealth());
		
				
	}
	
	void defend(Player player)
	{
		if(defending)
		{
			System.out.println("Attack defended! Health reduced by only 10!");
			player.reducedHealth(10);
			System.out.println("Player "+player.getName()+"'s health reduced to "+player.getHealth());
			defending = false;
		}
		else
		{
			System.out.println("Attack could not be defended from enemy! Health reduced by 20!");
			player.reducedHealth(20);
			System.out.println("Player "+player.getName()+"'s health reduced to "+player.getHealth());
			defending = true;
		}
	
	}
	
	void heal(Player player)
	{
		System.out.println("Player has been healed!");
		if(player.getHealth()<=990)
		{
			player.increaseHealth(10);
			System.out.println("Player "+player.getName()+"'s health increased to "+player.getHealth());
		}
		else
		{
			System.out.println("Health is more than 990!");
		}
		
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int choice;
		
		mini_game game = new mini_game();
		Player player = new Player("Hero",1000);
		Player enemy = new Player("Dragon",1000);
		do
		{
			System.out.println("Enter the task to perform:\n1.Attack\n2.Defend\n3.Heal\n4.Exit");
			choice = sc.nextInt();
			switch(choice)
			{
			case 1:
				game.attack(enemy);
				
				break;
			case 2:
				game.defend(player);
				break;
			case 3:
				game.heal(player);
				break;
			case 4:
				System.out.println("Exiting! Thank you for playing!");
				
				return;
			default:
				System.out.println("Wrong option selected! Try again!");
			}
			
			if(player.getHealth()<=0||enemy.getHealth()<=0)
			{
				break;
			}
				
			
		}while(true);
		

		if(player.getHealth()<=0)
		{
			System.out.println("Player health has been expended! Game over!");
		}
		else
		{
			System.out.println("Enemy health has been expended! Game winner!");
		}
		sc.close();
	}

}
