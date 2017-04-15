/**
 * Created by Phillip on 4/9/2017.
 */
import java.io.*;
import java.util.*;

public class DataParse {
    Insert insert = new Insert();
    Random rand = new Random();
    public void readData(String file)
    {
        String line = "";
        String query = "";
        String splitBy = ",";
        int gameId = 0;
        String homeTeam ="";
        String awayTeam = "";
        String gameDate = "";
        String possession = "";
        String stadium = "";
        String referee = "";
        String shotsA = "";
        String shotsH = "";
        String shotsOTA = "";
        String shotsOTH = "";
        String passesA = "";
        String passesH = "";
        String gameResult = "";
        String attendance = "";

        String goalsH;
        String goalsA;
        String cornersH;
        String cornersA;
        String foulsA;
        String foulsH;
        String yellowH;
        String yellowA;
        String redH;
        String redA;


        try (BufferedReader br = new BufferedReader(new FileReader(file))) {

            while ((line = br.readLine()) != null) {

                // use comma as separator
                String[] game = line.split(splitBy);

//                System.out.println(game.length);
                //Finding all the values
                gameId++;
                homeTeam = game[1];
                awayTeam = game[2];
                gameDate = getDate(game[0]);
                possession = getPossesion();
                stadium = insert.stadiums.get(Insert.teams.get(homeTeam));
                referee = game[9];
                shotsA = game[11];
                shotsH = game[10];
                shotsOTA = game[13];
                shotsOTH = game[12];
                passesA = getNumPasses();
                passesH = getNumPasses();
                gameResult = getGameResult(game[5]);
                attendance = getAttendance();
                goalsA = game[4];
                goalsH = game[3];
                cornersA = game[17];
                cornersH = game[16];
                foulsA = game[15];
                foulsH = game[14];
                yellowA = game[19];
                yellowH = game[18];
                redA = game[21];
                redH = game[20];

                //This will be the final query that gets written to file
                query = "insert into games values("+gameId+",'"+homeTeam+"','"+awayTeam+"',"+gameDate+","+possession+","+stadium+",'"+referee+"',"+shotsH+","+shotsA+","+shotsOTH+","+shotsOTA+","+passesH+","+passesA+",'"+gameResult+"',"+attendance+");\n";

                insert.bw.write(query);
                Game game1 = new Game(gameId,homeTeam,awayTeam,goalsH,goalsA, cornersH, cornersA, foulsH, foulsA, yellowH, yellowA, redH, redA);
                
                insert.insertEvents(game1);
                

            }
            
            insert.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private String getPossesion()
    {
        String poss;
        String min;
        String sec;

        min = Integer.toString(rand.nextInt(70));
        sec = Integer.toString(rand.nextInt(60));

        poss = min+"."+sec;

        return poss;
    }

    private String getDate(String date)
    {
        String newDate;
        String[] data = date.split("/");
        if(data[0].length() == 1) data[0] = "0"+data[0];
        if(data[1].length() == 1) data[1] = "0"+data[1];
        newDate = "20"+data[2]+":"+data[1]+":"+data[0];


        return newDate;
    }

    private String getNumPasses()
    {
        Integer passes = rand.nextInt((700-300) +1) + 300;

        return passes.toString();

    }

    private String getGameResult(String game)
    {
        String result ="";
        switch (game)
        {
            case "A":
                result = "away";
                break;
            case "D":
                result = "draw";
                break;
            case "H":
                result = "home";
                break;
            default:
                break;
        }

        return result;
    }

    private String getAttendance()
    {
        Integer attendance = rand.nextInt((75000-25000) +1) + 25000;

        return attendance.toString();
    }

    public static void main(String args[])
    {
        String test = "13/08/16";
        String tester [] = test.split("/");
        for(String s : tester){
           System.out.println(s);
        }


        DataParse testing = new DataParse();
//        testing.readData("C://Users//Phillip//IdeaProjects//Parse//src//GameData1617.csv");
        testing.readData("./GameData1617.csv");
    }

}
