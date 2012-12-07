package data;

import customer.User;
import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class UserIO
{
    public static void addRecord(User user, String filename) throws IOException
    {
        File file = new File(filename);
        PrintWriter out = new PrintWriter(
                new FileWriter(file, true));
        out.println(user.getRoomNum()+ "|"
                + user.getFirstName() + "|"
                + user.getLastName() + "|" 
                + user.getWtime());        
         out.close();
    }
    
    public static User getUser(String roomNum, String filename) throws IOException
    {
        File file = new File(filename);
        BufferedReader in = new BufferedReader(
                new FileReader(file));
        User user = new User();
        String line = in.readLine();
        while (line != null)
        {
            StringTokenizer t = new StringTokenizer(line, "|");
            String room = t.nextToken();
            if (room.equalsIgnoreCase(roomNum))
            {
                String firstName = t.nextToken();
                String lastName = t.nextToken();
                String wtime = t.nextToken();
                user.setRoomNum(roomNum);
                user.setFirstName(firstName);
                user.setLastName(lastName);
                user.setWtime(wtime);
            }
            line = in.readLine();
        }
        in.close();
        return user;
    }

    public static ArrayList<User> readRecords(String file) throws IOException
    {
        ArrayList<User> users = new ArrayList<User>();
        BufferedReader in = new BufferedReader(
                new FileReader(file));
        String line = in.readLine();
        while (line != null)
        {
            StringTokenizer t = new StringTokenizer(line, "|");
            String roomNum = t.nextToken();
            String firstName = t.nextToken();
            String lastName = t.nextToken();
            String wtime = t.nextToken();
            User user = new User(firstName, lastName, roomNum, wtime);
            users.add(user);
            line = in.readLine();
        }
        in.close();
        return users;
    }
}
