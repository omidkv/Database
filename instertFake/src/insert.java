import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by family on 4/9/17.
 */
public class insert
{

  HashMap<teams, ArrayList<player>> totals = new HashMap<>();
  HashMap <teams, String> stadiums = new HashMap<>();

  String eventFile = "./gameEvents";

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

void insertEvents()
{
  for(int i = 0; i < game.homeTeamScore; i++)
  {
    bw
  }
}
void writer()
{
  String
}
  public insert()
  {
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


