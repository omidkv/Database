import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

/**
 * Created by family on 4/9/17.
 */
public class Insert
{


  HashMap<teams, ArrayList<player>> totals = new HashMap<>();
  HashMap <teams, String> stadiums = new HashMap<>();

  static HashMap<String, teams> teamsHash = new HashMap<>();
  Random rand = new Random();

  String eventFile = "./gameEvents.sql";

  BufferedWriter bw;
  FileWriter fw;

  String arsenalFile = "./arsenal.csv";
  String bournFile = "./bourn.csv";
  String burnleyFile = "./burnley.csv";
  String chelseaFile = "./chelsea.csv";
  String cpFile = "./cp.csv";
  String evertonFile = "./everton.csv";
  String hullFile = "./hull.csv";
  String leicesterFile = "./leicester.csv";
  String liverpoolFile = "./liverpool.csv";
  String manCFile = "./manC.csv";
  String manUFile = "./manU.csv";
  String middFile = "./midd.csv";
  String southFile = "./south.csv";
  String stokeFile = "./stoke.csv";
  String sunderFile = "./sunder.csv";
  String swanFile = "./swan.csv";
  String totFile = "./tot.csv";
  String watfordFile = "./watford.csv";
  String westBromFile = "./westbrom.csv";
  String westHamFile = "./westHam.csv";


  ArrayList<player> manU = new ArrayList<>();
  ArrayList<player> midd = new ArrayList<>();
  ArrayList<player> south = new ArrayList<>();
  ArrayList<player> stoke = new ArrayList<>();
  ArrayList<player> sunder = new ArrayList<>();
  ArrayList<player> swan = new ArrayList<>();
  ArrayList<player> tot = new ArrayList<>();
  ArrayList<player> watford = new ArrayList<>();
  ArrayList<player> westBrom = new ArrayList<>();
  ArrayList<player> westHam = new ArrayList<>();
  ArrayList<player> arsenal = new ArrayList<>();
  ArrayList<player> bourn = new ArrayList<>();
  ArrayList<player> burnley = new ArrayList<>();
  ArrayList<player> chelsea = new ArrayList<>();
  ArrayList<player> cp = new ArrayList<>();
  ArrayList<player> everton = new ArrayList<>();
  ArrayList<player> hull = new ArrayList<>();
  ArrayList<player> leicester = new ArrayList<>();
  ArrayList<player> liverpool = new ArrayList<>();
  ArrayList<player> manC = new ArrayList<>();


  public enum teams
  {
    Arsenal("Arsenal"), AFC("Bournemouth"), Burnley("Burnley"), Chelsea("Chelsea"),
    Crystal("Crystal Palace"), Everton("Everton"), Hull("Hull"), Leister("Leicester"),
    Liverpool("Liverpool"), ManCity("Man City"), ManU("Man United"),
    Middles("Middlesbrough"), SouthHampton("Southampton"), Stoke("Stoke"), Sunderland("Sunderland"),
    Swansea("Swansea"), Tottenham("Tottenham"), Watford("Watford"), WestBrom("West Brom"),
    WestHam("West Ham");
    private String teamName;

    private teams(String team)
    {
      teamName = team;
    }

    @Override
    public String toString()
    {
      return teamName;
    }
    public static teams get(String team){ return teamsHash.get(team);}
  }
  void setStadiums()
  {

    stadiums.put(teams.Arsenal,"'Emirates Stadium'");
    stadiums.put(teams.AFC, "'Dean Court'");
    stadiums.put(teams.Burnley, "'Turf Moor'");
    stadiums.put(teams.Chelsea, "'Stamford Bridge'");
    stadiums.put(teams.Crystal, "'Selhurst Park'");
    stadiums.put(teams.Everton, "'Goodison Park'");
    stadiums.put(teams.Hull, "'KCOM Stadium'");
    stadiums.put(teams.Leister, "'King Power Stadium'");
    stadiums.put(teams.Liverpool, "'Anfield'");
    stadiums.put(teams.ManCity, "'City of Manchester Stadium'");

    stadiums.put(teams.ManU, "'Old Trafford'");
    stadiums.put(teams.Middles, "'Riverside Stadium'");
    stadiums.put(teams.SouthHampton, "'St Marys Stadium'");
    stadiums.put(teams.Stoke, "'bet365 Stadium'");
    stadiums.put(teams.Sunderland, "Stadium of Light'");
    stadiums.put(teams.Swansea, "'Liberty Stadium'");
    stadiums.put(teams.Tottenham, "White Hart Lane'");
    stadiums.put(teams.Watford, "'Vicarage Road'");
    stadiums.put(teams.WestBrom, "'The Hawthorns'");
    stadiums.put(teams.WestHam, "'London Stadium'");





  }
  void inser()
  {
    totals.put(teams.Arsenal, arsenal);
    totals.put(teams.AFC, bourn);
    totals.put(teams.Burnley, burnley);
    totals.put(teams.Chelsea, chelsea);
    totals.put(teams.Crystal, cp);
    totals.put(teams.Everton, everton);
    totals.put(teams.Hull, hull);
    totals.put(teams.Leister, leicester);
    totals.put(teams.Liverpool, liverpool);
    totals.put(teams.ManCity, manC);

    totals.put(teams.ManU, manU);
    totals.put(teams.Middles, midd);
    totals.put(teams.SouthHampton, south);
    totals.put(teams.Stoke, stoke);
    totals.put(teams.Sunderland, sunder);
    totals.put(teams.Swansea, swan);
    totals.put(teams.Tottenham, tot);
    totals.put(teams.Watford, watford);
    totals.put(teams.WestBrom, westBrom);
    totals.put(teams.WestHam, westHam);


  }

  ArrayList<String> array = new ArrayList<>();


  BufferedReader br = null;
  String line = "\n";
  String cvsSplitBy = ",";

  public void read()
  {

    try
    {

      br = new BufferedReader(new FileReader(manUFile));
      while ((line = br.readLine()) != null)
      {

        // use comma as separator

        String[] player = line.split(cvsSplitBy);
        if (player.length >= 3)
        {
          player person = new player(player[0], player[1], player[2], player[3]);
          manU.add(person);
        }
      }
      br = new BufferedReader(new FileReader(middFile));
      while ((line = br.readLine()) != null)
      {

        // use comma as separator

        String[] player = line.split(cvsSplitBy);
        if (player.length >= 3)
        {
          player person = new player(player[0], player[1], player[2], player[3]);
          midd.add(person);
        }
      }
      br = new BufferedReader(new FileReader(arsenalFile));
      while ((line = br.readLine()) != null)
      {

        // use comma as separator

        String[] player = line.split(cvsSplitBy);
        if (player.length >= 3)
        {
          player person = new player(player[0], player[1], player[2], player[3]);
          arsenal.add(person);
        }
      }
      br = new BufferedReader(new FileReader(bournFile));
      while ((line = br.readLine()) != null)
      {

        // use comma as separator

        String[] player = line.split(cvsSplitBy);
        if (player.length >= 3)
        {
          player person = new player(player[0], player[1], player[2], player[3]);
          bourn.add(person);
        }
      }
      br = new BufferedReader(new FileReader(burnleyFile));
      while ((line = br.readLine()) != null)
      {

        // use comma as separator

        String[] player = line.split(cvsSplitBy);
        if (player.length >= 3)
        {
          player person = new player(player[0], player[1], player[2], player[3]);
          burnley.add(person);
        }
      }
      br = new BufferedReader(new FileReader(chelseaFile));
      while ((line = br.readLine()) != null)
      {

        // use comma as separator

        String[] player = line.split(cvsSplitBy);
        if (player.length >= 3)
        {
          player person = new player(player[0], player[1], player[2], player[3]);
          chelsea.add(person);
        }
      }
      br = new BufferedReader(new FileReader(cpFile));
      while ((line = br.readLine()) != null)
      {

        // use comma as separator

        String[] player = line.split(cvsSplitBy);
        if (player.length >= 3)
        {
          player person = new player(player[0], player[1], player[2], player[3]);
          cp.add(person);
        }
      }
      br = new BufferedReader(new FileReader(evertonFile));
      while ((line = br.readLine()) != null)
      {

        // use comma as separator

        String[] player = line.split(cvsSplitBy);
        if (player.length >= 3)
        {
          player person = new player(player[0], player[1], player[2], player[3]);
          everton.add(person);
        }
      }
      br = new BufferedReader(new FileReader(hullFile));
      while ((line = br.readLine()) != null)
      {

        // use comma as separator

        String[] player = line.split(cvsSplitBy);
        if (player.length >= 3)
        {
          player person = new player(player[0], player[1], player[2], player[3]);
          hull.add(person);
        }
      }
      br = new BufferedReader(new FileReader(leicesterFile));
      while ((line = br.readLine()) != null)
      {

        // use comma as separator

        String[] player = line.split(cvsSplitBy);
        if (player.length >= 3)
        {
          player person = new player(player[0], player[1], player[2], player[3]);
          leicester.add(person);
        }
      }
      br = new BufferedReader(new FileReader(liverpoolFile));
      while ((line = br.readLine()) != null)
      {

        // use comma as separator

        String[] player = line.split(cvsSplitBy);
        if (player.length >= 3)
        {
          player person = new player(player[0], player[1], player[2], player[3]);
          liverpool.add(person);
        }
      }
      br = new BufferedReader(new FileReader(manCFile));
      while ((line = br.readLine()) != null)
      {

        // use comma as separator

        String[] player = line.split(cvsSplitBy);
        if (player.length >= 3)
        {
          player person = new player(player[0], player[1], player[2], player[3]);
          manC.add(person);
        }
      }
      br = new BufferedReader(new FileReader(southFile));
      while ((line = br.readLine()) != null)
      {

        // use comma as separator

        String[] player = line.split(cvsSplitBy);
        if (player.length >= 3)
        {
          player person = new player(player[0], player[1], player[2], player[3]);
          south.add(person);
        }
      }
      br = new BufferedReader(new FileReader(stokeFile));
      while ((line = br.readLine()) != null)
      {

        // use comma as separator

        String[] player = line.split(cvsSplitBy);
        if (player.length >= 3)
        {
          player person = new player(player[0], player[1], player[2], player[3]);
          stoke.add(person);
        }
      }
      br = new BufferedReader(new FileReader(sunderFile));
      while ((line = br.readLine()) != null)
      {

        // use comma as separator

        String[] player = line.split(cvsSplitBy);
        if (player.length >= 3)
        {
          player person = new player(player[0], player[1], player[2], player[3]);
          sunder.add(person);
        }
      }
      br = new BufferedReader(new FileReader(swanFile));
      while ((line = br.readLine()) != null)
      {

        // use comma as separator

        String[] player = line.split(cvsSplitBy);
        if (player.length >= 3)
        {
          player person = new player(player[0], player[1], player[2], player[3]);
          swan.add(person);
        }
      }
      br = new BufferedReader(new FileReader(totFile));
      while ((line = br.readLine()) != null)
      {

        // use comma as separator

        String[] player = line.split(cvsSplitBy);
        if (player.length >= 3)
        {
          player person = new player(player[0], player[1], player[2], player[3]);
          tot.add(person);
        }
      }
      br = new BufferedReader(new FileReader(watfordFile));
      while ((line = br.readLine()) != null)
      {

        // use comma as separator

        String[] player = line.split(cvsSplitBy);
        if (player.length >= 3)
        {
          player person = new player(player[0], player[1], player[2], player[3]);
          watford.add(person);
        }
      }
      br = new BufferedReader(new FileReader(westBromFile));
      while ((line = br.readLine()) != null)
      {

        // use comma as separator

        String[] player = line.split(cvsSplitBy);
        if (player.length >= 3)
        {
          player person = new player(player[0], player[1], player[2], player[3]);
          westBrom.add(person);
        }
      }
      br = new BufferedReader(new FileReader(westHamFile));
      while ((line = br.readLine()) != null)
      {

        // use comma as separator

        String[] player = line.split(cvsSplitBy);
        if (player.length >= 3)
        {
          player person = new player(player[0], player[1], player[2], player[3]);
          westHam.add(person);
        }
      }
    } catch (FileNotFoundException e)
    {
      e.printStackTrace();
    } catch (IOException e)
    {
      e.printStackTrace();
    } finally
    {
      if (br != null)
      {
        try
        {
          br.close();
        } catch (IOException e)
        {
          e.printStackTrace();
        }

      }

    }
  }

void insertEvents(Game game)
{

  ArrayList<player> homeTeamPlayers = totals.get(teams.get(game.homeTeam));
  ArrayList<player> awayTeamPlayers = totals.get(teams.get(game.awayTeam));

  Integer goalsH = Integer.valueOf(game.goalH);
  Integer goalsA = Integer.valueOf(game.goalA);
  Integer foulsH = Integer.valueOf(game.foulsH);
  Integer foulsA = Integer.valueOf(game.foulsA);
  Integer yellowH = Integer.valueOf(game.yellowH);
  Integer yellowA = Integer.valueOf(game.yellowA);
  Integer redH = Integer.valueOf(game.redH);
  Integer redA = Integer.valueOf(game.redA);
  Integer cornersH = Integer.valueOf(game.cornersH);
  Integer cornersA = Integer.valueOf(game.cornersA);
  for(int i = 0; i < goalsH; i++)
  {
    player player = homeTeamPlayers.get(rand.nextInt(homeTeamPlayers.size()));
    writer(game.homeTeam,String.valueOf(rand.nextInt(90)),String.valueOf(game.gameId),player,"'goal'");
  }
  for(int i = 0; i < goalsA; i++)
  {
    player player = awayTeamPlayers.get(rand.nextInt(awayTeamPlayers.size()));
    writer(game.awayTeam,String.valueOf(rand.nextInt(90)),String.valueOf(game.gameId),player,"'goal'");
  }

  for(int i = 0; i < foulsH; i++)
  {
    player player = homeTeamPlayers.get(rand.nextInt(homeTeamPlayers.size()));
    writer(game.homeTeam,String.valueOf(rand.nextInt(90)),String.valueOf(game.gameId),player,"'foul'");
  }
  for(int i = 0; i < foulsA; i++)
  {
    player player = awayTeamPlayers.get(rand.nextInt(awayTeamPlayers.size()));
    writer(game.awayTeam,String.valueOf(rand.nextInt(90)),String.valueOf(game.gameId),player,"'foul'");
  }
  for(int i = 0; i < yellowH; i++)
  {
    player player = homeTeamPlayers.get(rand.nextInt(homeTeamPlayers.size()));
    writer(game.homeTeam,String.valueOf(rand.nextInt(90)),String.valueOf(game.gameId),player,"'yellow card'");
  }
  for(int i = 0; i < yellowA; i++)
  {
    player player = awayTeamPlayers.get(rand.nextInt(awayTeamPlayers.size()));
    writer(game.awayTeam,String.valueOf(rand.nextInt(90)),String.valueOf(game.gameId),player,"'yellow card'");
  }


  for(int i = 0; i < redH; i++)
  {
    player player = homeTeamPlayers.get(rand.nextInt(homeTeamPlayers.size()));
    writer(game.homeTeam,String.valueOf(rand.nextInt(90)),String.valueOf(game.gameId),player,"'red card'");
  }
  for(int i = 0; i < redA; i++)
  {
    player player = awayTeamPlayers.get(rand.nextInt(awayTeamPlayers.size()));
    writer(game.awayTeam,String.valueOf(rand.nextInt(90)),String.valueOf(game.gameId),player,"'red card'");
  }

  for(int i = 0; i < cornersH; i++)
  {
    player player = homeTeamPlayers.get(rand.nextInt(homeTeamPlayers.size()));
    writer(game.homeTeam,String.valueOf(rand.nextInt(90)),String.valueOf(game.gameId),player,"'corner'");
  }
  for(int i = 0; i < cornersA; i++)
  {
    player player = awayTeamPlayers.get(rand.nextInt(awayTeamPlayers.size()));
    writer(game.awayTeam,String.valueOf(rand.nextInt(90)),String.valueOf(game.gameId),player,"'corner'");
  }
  for(int i = 0; i<3; i++)
  {
    String awayTime = String.valueOf(rand.nextInt(90));
    String homeTime = String.valueOf(rand.nextInt(90));


    player player2A = awayTeamPlayers.get(rand.nextInt(awayTeamPlayers.size()));
    player player2H = homeTeamPlayers.get(rand.nextInt(homeTeamPlayers.size()));
    player player1A = awayTeamPlayers.get(rand.nextInt(awayTeamPlayers.size()));
    player player1H = homeTeamPlayers.get(rand.nextInt(homeTeamPlayers.size()));

    writer(game.awayTeam,awayTime,String.valueOf(game.gameId),player2A,"'sub out'");
    writer(game.awayTeam,awayTime,String.valueOf(game.gameId),player1A,"'sub in'");
    writer(game.awayTeam,homeTime,String.valueOf(game.gameId),player2H,"'sub out'");
    writer(game.awayTeam,homeTime,String.valueOf(game.gameId),player1H,"'sub in'");



  }
}

void writer(String team, String time, String gameId,player player,String event)
{
  String first = "insert into events values(";
  String sep = ",";
  String end = ");\n";
  team = "'"+team+"'";
  String added = first+gameId+sep+time+sep+player.name+sep+player.num+sep+team+sep+event+end;
  try
  {
    bw.write(added);
  } catch (IOException e)
  {
    e.printStackTrace();
  }
}
  public static void main(String[] args)
  {
    Insert in = new Insert();
    in.read();
    in.inser();
    in.setStadiums();


    try
    {

      String content = "This is the content to write into file\n";

      in.fw = new FileWriter(in.eventFile);
      in.bw = new BufferedWriter(in.fw);

      System.out.println("Done");

    } catch (IOException e)
    {

      e.printStackTrace();

    }
    Game game = new Game(1,"Arsenal","Liverpool","2","4",
            "14","13","12","10","1","2","0","0");

    in.insertEvents(game);
    in.close();

  }
  public void close()
  {
    try
    {
      bw.close();
      fw.close();
    } catch (IOException e)
    {
      e.printStackTrace();
    }
  }
public Insert()
  {
    for(teams team : Insert.teams.values())
    {
      teamsHash.put(team.teamName,team);
    }
    read();
    inser();
    setStadiums();
    try
    {

      String content = "This is the content to write into file\n";

      fw = new FileWriter(eventFile);
      bw = new BufferedWriter(fw);

      System.out.println("Done");

    } catch (IOException e)
    {

      e.printStackTrace();

    }
  }
}


