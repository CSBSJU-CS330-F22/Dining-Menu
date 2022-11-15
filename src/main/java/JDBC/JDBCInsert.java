package JDBC;
import java.sql.*;
import java.util.ArrayList;

public class JDBCInsert 
{
private Connection myConnection = null;
	
	public Connection openDBConnection()
    {
    	try
    	{
    		if(myConnection == null)
    		{
    			myConnection = DriverManager.getConnection("jdbc:sqlite:/home/jbrownlee001/Dining Menu Database/databaseV9.db");

    		}
    		else
    		{
    			myConnection.close();
    			myConnection = DriverManager.getConnection("jdbc:sqlite:/home/jbrownlee001/Dining Menu Database/databaseV9.db");


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
    
    public Integer login(String email, String password)
    {
    	try 
        {
            //Connection
        	Connection myConn = openDBConnection();
            
        	//Statement
        	Statement myStmt = myConn.createStatement();
        	
        	//Result Set
        	ResultSet myRes = myStmt.executeQuery("SELECT * FROM User WHERE Email = '"+email+"' and Password = '"+password+"'");
        	
        	if(myRes.getString(1) != null && myRes.getString(2) != null)
        	{
        		myRes.close();
        		return 1;
        	}
        	else
        	{
        		myRes.close();
        		return -1;
        	}
        	   	        	
        } 
        catch (SQLException e) 
        {
        	System.out.println(e);
        }
    	
    	return 0;
    }
    
    public String createAccount(String email, String password, String firstName, String lastName)
    {
    	try 
        {
           if(userAlreadyExists(email) != 1)
           {
	        	//Connection
	           	Connection myConn = openDBConnection();
	               
	           	//Prepared Statement
	           	PreparedStatement myPreStmt = myConn.prepareStatement("INSERT INTO User(Email, Password, FirstName, LastName) VALUES(?,?,?,?)");
	           	
	           	myPreStmt.setString(1, email);
	           	myPreStmt.setString(2, password);
	           	myPreStmt.setString(3, firstName);
	           	myPreStmt.setString(4, lastName);
	           	
	           	myPreStmt.executeUpdate();
	           	
	           	myPreStmt.close();
	           	myConn.close();
	           	
	           	if(userAlreadyExists(email) == 1)
	           	{
	           		return "Account was successfully created.";
	           	}
	           	else
	           	{
	           		return "Account was not successfully created.";
	           	}
           }
           else
           {
        	  return "An account with that username already exists.";
           }
    		
        } 
        catch (SQLException e) 
        {
        	System.out.println(e);
        }
    	
    	return null;
    	
    }
    
    public Integer userAlreadyExists(String email)
    {
    	try 
        {
            //Connection
        	Connection myConn = openDBConnection();
            
        	//Statement
        	Statement myStmt = myConn.createStatement();
        	
        	//Result Set
        	ResultSet myRes = myStmt.executeQuery("SELECT * FROM User WHERE Email = '"+email+"'");
        	
        	if(myRes.getString(1) != null)
        	{
        		myRes.close();
        		return 1;
        	}
        	else
        	{
        		myRes.close();
        		return -1;
        	}
        	   	        	
        } 
        catch (SQLException e) 
        {
        	System.out.println(e);
        }
    	
    	return 0;
    }
    
    public Integer reviewAlreadyExists(String email, String foodItem)
    {
    	try 
        {
            //Connection
        	Connection myConn = openDBConnection();
            
        	//Statement
        	Statement myStmt = myConn.createStatement();
        	
        	//Result Set
        	ResultSet myRes = myStmt.executeQuery("SELECT * FROM FoodReview WHERE UserEmail = '"+email+"' and FoodItemName = '"+foodItem+"'");
        	
        	if(myRes.getString(1) != null)
        	{
        		myRes.close();
        		return 1;
        	}
        	else
        	{
        		myRes.close();
        		return -1;
        	}
        	   	        	
        } 
        catch (SQLException e) 
        {
        	System.out.println(e);
        }
    	
    	return 0;
    }
    
    public Integer favoriteAlreadyExists(String email, String foodItem)
    {
    	try 
        {
            //Connection
        	Connection myConn = openDBConnection();
            
        	//Statement
        	Statement myStmt = myConn.createStatement();
        	
        	//Result Set
        	ResultSet myRes = myStmt.executeQuery("SELECT * FROM FavoriteFoodItem WHERE UserEmail = '"+email+"' and FootItemName = '"+foodItem+"'");
        	
        	if(myRes.getString(1) != null)
        	{
        		myRes.close();
        		return 1;
        	}
        	else
        	{
        		myRes.close();
        		return -1;
        	}
        	   	        	
        } 
        catch (SQLException e) 
        {
        	System.out.println(e);
        }
    	
    	return 0;
    }
    
    public String createReview(String email, String foodItem, int rating, String title, String desc, boolean anon)
    {
    	try 
        {
           if(reviewAlreadyExists(email, foodItem) != 1)
           {
	        	//Connection
	           	Connection myConn = openDBConnection();
	               
	           	//Prepared Statement
	           	PreparedStatement myPreStmt = myConn.prepareStatement("INSERT INTO FoodReview(FoodItemName, UserEmail, Rating, Title, ReviewDescription, Anonymous) VALUES(?,?,?,?,?,?)");
	           	
	           	myPreStmt.setString(1, foodItem);
	           	myPreStmt.setString(2, email);
	           	myPreStmt.setInt(3, rating);
	           	myPreStmt.setString(4, title);
	           	myPreStmt.setString(5, desc);
	           	myPreStmt.setBoolean(6, anon);
	           	
	           	myPreStmt.executeUpdate();
	           	
	           	myPreStmt.close();
	           	myConn.close();
	           	
	           	if(reviewAlreadyExists(email, foodItem) == 1)
	           	{
	           		return "Review was successfully created.";
	           	}
	           	else
	           	{
	           		return "Review was not successfully created.";
	           	}
           }
           else
           {
        	   return "A review with that username & food item already exists.";
           }
    		
        } 
        catch (SQLException e) 
        {
        	System.out.println(e);
        }
    	
    	return null;
    	
    }
    
    public String createFavorite(String email, String foodItem, boolean noti)
    {
    	try 
        {
           if(favoriteAlreadyExists(email, foodItem) != 1)
           {
	        	//Connection
	           	Connection myConn = openDBConnection();
	               
	           	//Prepared Statement
	           	PreparedStatement myPreStmt = myConn.prepareStatement("INSERT INTO FavoriteFoodItem(FootItemName, UserEmail, Notification) VALUES(?,?,?)");
	           	
	           	myPreStmt.setString(1, foodItem);
	           	myPreStmt.setString(2, email);
	           	myPreStmt.setBoolean(3, noti);
	           	
	           	myPreStmt.executeUpdate();
	           	
	           	myPreStmt.close();
	           	myConn.close();
	           	
	           	if(favoriteAlreadyExists(email, foodItem) == 1)
	           	{
	           		return "Favorite was successfully created.";
	           	}
	           	else
	           	{
	           		return "Favorite was not successfully created.";
	           	}
           }
           else
           {
        	   return "A favorite with that username & food item already exists.";
           }
    		
        } 
        catch (SQLException e) 
        {
        	System.out.println(e);
        }
    	
    	return null;
    	
    }
	
	public static void main(String[] args) 
    {
        JDBCInsert t1 = new JDBCInsert();
        
        System.out.println("TEST LOGIN...");
        
        System.out.println();
        
        System.out.println(t1.login("bhoeschen002@csbsju.edu", "Password"));
        
        System.out.println();
        
        System.out.println(t1.login("bhoeschen002@csbsju.edu", "Passwor"));
        
        System.out.println();
        
        System.out.println("TEST CREATE ACCOUNT...");
        
        System.out.println();
        
        System.out.println(t1.userAlreadyExists("kwilliams001@csbsju.edu"));
        
        System.out.println();
        
        System.out.println(t1.createAccount("kwilliams001@csbsju.edu", "Password", "Kevin", "Williams"));
        
        System.out.println();
        
        System.out.println(t1.userAlreadyExists("kwilliams001@csbsju.edu"));
        
        System.out.println();
        
        System.out.println("TESTING CREATE REVIEW...");
        
        System.out.println();
        
        System.out.println(t1.reviewAlreadyExists("bhoeschen002@csbsju.edu", "Crispy Cubed Potatoes"));
        
        System.out.println();
        
        System.out.println(t1.createReview("bhoeschen002@csbsju.edu", "Crispy Cubed Potatoes", 5, "Sample Title", "really good potatoes", false));
        
        System.out.println();
        
        System.out.println(t1.reviewAlreadyExists("bhoeschen002@csbsju.edu", "Crispy Cubed Potatoes"));
        
        System.out.println();
        
        System.out.println("TESTING CREATE FAVORITE...");
        
        System.out.println();
        
        System.out.println(t1.favoriteAlreadyExists("bhoeschen002@csbsju.edu", "Chicken Strips"));
        
        System.out.println();
        
        System.out.println(t1.createFavorite("bhoeschen002@csbsju.edu", "Chicken Strips", false));
        
        System.out.println();
        
        System.out.println(t1.favoriteAlreadyExists("bhoeschen002@csbsju.edu", "Chicken Strips"));
    }
}
