package customer;

import java.io.Serializable;

public class User implements Serializable
{
    private String firstName;
    private String lastName;
    private String roomNum;
    private String wtime;
    
    public User()
    {
        firstName = "";
        lastName = "";
        roomNum = "";
        wtime = "";
    }
    
    public User(String first, String last, String room, String t)
    {
        firstName = first;
        lastName = last;
        roomNum = room;
        wtime = t;
    }
    
    public void setFirstName(String f)
    {
        firstName = f;
    }
    public String getFirstName()
    { 
        return firstName; 
    }
    
    public void setLastName(String l)
    {
        lastName = l;
    }

    public String getLastName()
    { 
        return lastName; 
    }
    
    public void setRoomNum(String r)
    {
        roomNum = r;
    }

    public String getRoomNum()
    { 
        return roomNum; 
    }
    
    public void setWtime(String t)
    {
        wtime = t;
    }
    
    public String getWtime()
    {
        return wtime;
    }
}