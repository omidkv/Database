import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

/**
 * Created by family on 4/15/17.
 */
public class Competitions
{
  String eventFile = "./Comps.sql";
  BufferedWriter bw;
  FileWriter fw;
  Random rand = new Random();
  Insert insert = new Insert();
  Insert.teams [] teams = Insert.teams.values();
  void insert()
  {
    for(int i = 0; i < 117; i++)
    {
      int team1 = rand.nextInt(Insert.teams.values().length);
      int team2 = rand.nextInt(Insert.teams.values().length);
      int team3 = rand.nextInt(Insert.teams.values().length);
      int team4 = rand.nextInt(Insert.teams.values().length);

      String first = "insert into competitions values(";
      String sep = ",";
      String sep1 = ",'";
      String sep2 = "',";
      String end = ");\n";
      String added1 = first+"'Premier League'" + sep + (1900+i) + sep1 + teams[team1] + sep2 + "'league'"+end ;
      String added2 =first+"'FA Cup'" + sep + (1900+i) + sep1 + teams[team2] + sep2 + "'cup'" +end;
      String added3 =first+"'EFL Cup'" + sep + (1900+i) + sep1 + teams[team3] + sep2 + "'cup'" +end;
      String added4 =first+"'Champions League'" + sep + (1900+i) + sep1 + teams[team4] + sep2 + "'cup'" +end;
      try
      {
        bw.write(added1);
        bw.write(added2);
        bw.write(added3);
        bw.write(added4);
      } catch (IOException e)
      {
        e.printStackTrace();
      }
    }
  }
  public Competitions()
  {
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
  public static void main(String[] args)
  {
    Competitions comp = new Competitions();
    comp.insert();
    comp.close();
  }
}
