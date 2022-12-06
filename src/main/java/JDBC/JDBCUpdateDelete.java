package JDBC;
import java.sql.*;
import java.util.ArrayList;

public class JDBCUpdateDelete 
{
private Connection myConnection = null;
	
	public Connection openDBConnection()
    {
    	try
    	{
    		if(myConnection == null)
    		{


    			myConnection = DriverManager.getConnection("jdbc:sqlite:/home/eyouso001/Dining Menu Database/databaseV9.db");
    		}
    		else
    		{
    			myConnection.close();
    			myConnection = DriverManager.getConnection("jdbc:sqlite:/home/eyouso001/Dining Menu Database/databaseV9.db");

    		}
    		return myConnection;
    		
    		//Connection myConn = DriverManager.getConnection("jdbc:sqlite:C:/Users/benho/Desktop/SQLiteStudio/SQLiteStudio/testDatabase.db");
    		//return myConn;
    	}
    	catch (Exception e)
    	{
    		e.printStackTrace();
    	}
    	
    	return null;
    }
	
	public void editProfile(String em, String pw, String fn, String ln)
    {
    	try 
        {
            //Connection
        	Connection myConn = openDBConnection();
            
        	//Statement
        	Statement myStmt = myConn.createStatement();
        	
        	myStmt.executeQuery("UPDATE User SET Password = '"+pw+"', FirstName = '"+fn+"', LastName = '"+ln+"' WHERE Email = '"+em+"'");
        	
        	myStmt.close();
        	myConn.close();
        	        	
        } 
        catch (SQLException e) 
        {
        	System.out.println(e);
        }
    }
    
    public void editReview(String em, String fi, int rat, String ti, String desc)
    {
    	try 
        {
            //Connection
        	Connection myConn = openDBConnection();
            
        	//Statement
        	Statement myStmt = myConn.createStatement();
        	
        	myStmt.executeQuery("UPDATE FoodReview SET Title = '"+ti+"', ReviewDescription = '"+desc+"', Rating = '"+rat+"' WHERE UserEmail = '"+em+"' and FoodItemName = '"+fi+"'");
        	
        	myStmt.close();
        	myConn.close();
        	        	
        } 
        catch (SQLException e) 
        {
        	System.out.println(e);
        }
    }
    
    public void removeFavorite(String em, String fi)
    {
    	try 
        {
            //Connection
        	Connection myConn = openDBConnection();
            
        	//Statement
        	Statement myStmt = myConn.createStatement();
        	
        	myStmt.executeUpdate("DELETE FROM FavoriteFoodItem WHERE UserEmail = '"+em+"' and FootItemName = '"+fi+"'");
        	
        	myStmt.close();
        	myConn.close();
        	        	
        } 
        catch (SQLException e) 
        {
        	System.out.println(e);
        }
    }
    
    public static void main(String[] args) 
    {
        JDBCSelect js = new JDBCSelect();
        JDBCInsert ji = new JDBCInsert();
    	JDBCUpdateDelete jud = new JDBCUpdateDelete();
        
        
        System.out.println("TESTING EDIT PROFILE...");
        
        System.out.println();
        jud.editProfile("bhoeschen002@csbsju.edu", "Password", "Ben", "Hoeschen");
        
        System.out.println(js.getUser("bhoeschen002@csbsju.edu").get(0));
        System.out.println(js.getUser("bhoeschen002@csbsju.edu").get(1));
        System.out.println(js.getUser("bhoeschen002@csbsju.edu").get(2));
        System.out.println(js.getUser("bhoeschen002@csbsju.edu").get(3));
        
        System.out.println();
        jud.editProfile("bhoeschen002@csbsju.edu", "Password1", "Benjamin", "H");
        
        System.out.println(js.getUser("bhoeschen002@csbsju.edu").get(0));
        System.out.println(js.getUser("bhoeschen002@csbsju.edu").get(1));
        System.out.println(js.getUser("bhoeschen002@csbsju.edu").get(2));
        System.out.println(js.getUser("bhoeschen002@csbsju.edu").get(3));
        
        System.out.println();
        jud.editProfile("bhoeschen002@csbsju.edu", "Password", "Ben", "Hoeschen");
        
        System.out.println(js.getUser("bhoeschen002@csbsju.edu").get(0));
        System.out.println(js.getUser("bhoeschen002@csbsju.edu").get(1));
        System.out.println(js.getUser("bhoeschen002@csbsju.edu").get(2));
        System.out.println(js.getUser("bhoeschen002@csbsju.edu").get(3));
        
        System.out.println();
        
        System.out.println("TESTING EDIT REVIEW...");
        
        System.out.println();
        jud.editReview("bhoeschen002@csbsju.edu", "Chicken Strips", 5, "Great", "They are great.");
        
        ArrayList<ArrayList<String>> list20 = js.getFoodReviewsByUser("bhoeschen002@csbsju.edu");
        for(ArrayList<String> l : list20)
        {
        	System.out.println(l.get(0));
        	System.out.println(l.get(1));
        	System.out.println(l.get(2));
        	System.out.println(l.get(3));
        	System.out.println(l.get(4));
        	System.out.println(l.get(5));
        	System.out.println();
        }
        
        System.out.println();
        jud.editReview("bhoeschen002@csbsju.edu", "Chicken Strips", 4, "Good", "They are good.");
        
        ArrayList<ArrayList<String>> list21 = js.getFoodReviewsByUser("bhoeschen002@csbsju.edu");
        for(ArrayList<String> l : list21)
        {
        	System.out.println(l.get(0));
        	System.out.println(l.get(1));
        	System.out.println(l.get(2));
        	System.out.println(l.get(3));
        	System.out.println(l.get(4));
        	System.out.println(l.get(5));
        	System.out.println();
        }
        
        System.out.println();
        jud.editReview("bhoeschen002@csbsju.edu", "Chicken Strips", 5, "Great", "They are great.");
        
        ArrayList<ArrayList<String>> list22 = js.getFoodReviewsByUser("bhoeschen002@csbsju.edu");
        for(ArrayList<String> l : list22)
        {
        	System.out.println(l.get(0));
        	System.out.println(l.get(1));
        	System.out.println(l.get(2));
        	System.out.println(l.get(3));
        	System.out.println(l.get(4));
        	System.out.println(l.get(5));
        	System.out.println();
        }
        
        System.out.println();
        
        System.out.println("TESTING REMOVE FAVORITE...");
        
        System.out.println();
        
        System.out.println(ji.favoriteAlreadyExists("bhoeschen002@csbsju.edu", "Corn"));
        
        System.out.println();
        
        System.out.println(ji.createFavorite("bhoeschen002@csbsju.edu", "Corn", false));
        
        System.out.println();
        
        System.out.println(ji.favoriteAlreadyExists("bhoeschen002@csbsju.edu", "Corn"));
        
        System.out.println();
        
        System.out.println("Removed?");
        jud.removeFavorite("bhoeschen002@csbsju.edu", "Corn");
        
        System.out.println();
        
        System.out.println(ji.favoriteAlreadyExists("bhoeschen002@csbsju.edu", "Corn"));
        
    }
	
}
