import java.util.ArrayList;

class Player{

	String name;
	int age;
	String role;
	String nationality;
	int experience;
	double salary;

	Player(String name, int age, String role, 
			String nationality, int experience, double salary)
	{
		this.name = name;
		this.age = age;
		this.role = role;
		this.nationality = nationality;
		this.experience = experience;
		this.salary = salary;
	}

	public void displayPlayer()
	{
		System.out.println("\n--Player Informaition--");
		System.out.println("Player Name: "+name);
		System.out.println("Age: "+ age);
		System.out.println("Role: "+role);
		System.out.println("Nationality: "+nationality);
		System.out.println("Experience: "+experience);
		System.out.println("Salary: "+salary+"core");
	}
}

class Coach{

	String coachName;
	int experience;

	Coach(String coachName, int experience)
	{
		this.coachName = coachName;
		this.experience = experience;
	}

	public void displayCoach(){
		System.out.println("\n--Coach Details--");
		System.out.println("Coach Name: "+coachName);
		System.out.println("Experience: "+ experience);
	}
}

class Team
{
	String teamName;
	String homeGround;
	int rank;
	Coach coach;
	ArrayList<Player> players = new ArrayList<Player>();

	Team(String teamName, String homeGround, int rank)
	{
		this.teamName = teamName;
		this.homeGround = homeGround;
		this.rank = rank;
	}

	public void displayTeam()
	{
		System.out.println("--Team Details--");
		System.out.println("Team Name: "+teamName);
		System.out.println("Home Ground: "+homeGround);
		System.out.println("Rank: "+rank);
	}

	public void addPlayer(Player player)
	{
		players.add(player);
	}
	
	public void showPlayers()
	{
		for (Player p : players) 
		{
			p.displayPlayer();
		}
	}
	public void getCoach(Coach coach){
		this.coach = coach;
	}

	public Coach setCoach(){
		return coach;
	}
}
class CricketDriver{

	public static void main(String [] args){

		Team team = new Team("Mumbai Indians", "Wankhede Stadium", 1);
		team.displayTeam();

		Player player1 = new Player("Rohit Sharma", 37, "Batsman", "Indian", 18, 16.30);
		Player player2 = new Player("Hardik Pandya", 32, "All-Rounder", "Indian", 10, 15.2);
		Player player3 = new Player("Jasprit Bumrah", 31, "Bowler", "Indian", 10, 10.7);
		team.addPlayer(player1);
		team.addPlayer(player2);
		team.addPlayer(player3);

		team.showPlayers();
		
		Coach coach = new Coach(" Mahela Jayawardene", 20);
		team.getCoach(coach);
		team.setCoach().displayCoach();
	}
}