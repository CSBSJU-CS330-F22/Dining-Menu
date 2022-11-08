package JDBC;
import java.sql.*;
import java.util.ArrayList;

public class JDBCSelect 
{
	public Connection openDBConnection()
    {
    	try
    	{
<<<<<<< HEAD
    		Connection myConn = DriverManager.getConnection("jdbc:sqlite:/home/jbrownlee001/Dining Menu Database/databaseV5.db");
=======
    		Connection myConn = DriverManager.getConnection("jdbc:sqlite:/home/jnewhouse003/Dining Menu Database/databaseV5.db");
>>>>>>> 2c7b12e0a6c9cf4af3264d319b03dfbf72654518
    		return myConn;
    	}
    	catch (Exception e)
    	{
    		e.printStackTrace();
    	}
    	
    	return null;
    }
    
    public ArrayList<String> getUser(String email)
    {
    	try 
        {
            //Connection
        	Connection myConn = openDBConnection();
            
        	//Statement
        	Statement myStmt = myConn.createStatement();
        	
        	//Result Set
        	ResultSet myRes = myStmt.executeQuery("SELECT * FROM User WHERE Email = '"+email+"'");
        	
        	ArrayList<String> al = new ArrayList<String>();
        	al.add(myRes.getString(1));
        	al.add(myRes.getString(2));
        	al.add(myRes.getString(3));
        	al.add(myRes.getString(4));
        	return al;
        	        	
        } 
        catch (SQLException e) 
        {
        	System.out.println(e);
        }
    	
    	return null;
    }
    
    public ArrayList<String> getMenu(String date, String mealType)
    {
    	try 
        {
            //Connection
        	Connection myConn = openDBConnection();
            
        	//Statement
        	Statement myStmt = myConn.createStatement();
        	
        	//Result Set
        	ResultSet myRes = myStmt.executeQuery("SELECT FoodItemNameM FROM Menu WHERE Date = '"+date+"' and MealType = '"+mealType+"'");
        	
        	ArrayList<String> al = new ArrayList<String>();
        	
        	while(myRes.next())
        	{
        		al.add(myRes.getString(1));
        	}
        	
        	return al;
        	        	
        } 
        catch (SQLException e) 
        {
        	System.out.println(e);
        }
    	
    	return null;
    }
    
    public ArrayList<String> getFoodItem(String name)
    {
    	try 
        {
            //Connection
        	Connection myConn = openDBConnection();
            
        	//Statement
        	Statement myStmt = myConn.createStatement();
        	
        	//Result Set
        	ResultSet myRes = myStmt.executeQuery("SELECT * FROM FoodItem WHERE Name = '"+name+"'");
        	
        	ArrayList<String> al = new ArrayList<String>();
        	al.add(myRes.getString(1));
        	al.add(myRes.getString(2));
        	al.add(myRes.getString(3));
        	al.add(myRes.getString(4));
        	al.add(myRes.getString(5));
        	al.add(myRes.getString(6));
        	al.add(myRes.getString(7));
        	return al;
        	        	
        } 
        catch (SQLException e) 
        {
        	System.out.println(e);
        }
    	
    	return null;
    }
    
    public ArrayList<ArrayList<String>> getFoodReviewsByFoodItem(String foodItemName)
    {
    	try 
        {
            //Connection
        	Connection myConn = openDBConnection();
            
        	//Statement
        	Statement myStmt = myConn.createStatement();
        	
        	//Result Set
        	ResultSet myRes = myStmt.executeQuery("SELECT * FROM FoodReview WHERE FoodItemName = '"+foodItemName+"'");
        	
        	ArrayList<ArrayList<String>> al = new ArrayList<ArrayList<String>>();
        	
        	while(myRes.next())
        	{
        		ArrayList<String> l = new ArrayList<String>();
        		l.add(myRes.getString(1));
        		l.add(myRes.getString(2));
        		l.add(myRes.getString(3));
        		l.add(myRes.getString(4));
        		l.add(myRes.getString(5));
        		l.add(myRes.getString(6));
        		al.add(l);
        	}
        	
        	return al;
        	        	
        } 
        catch (SQLException e) 
        {
        	System.out.println(e);
        }
    	
    	return null;
    }
    
    public ArrayList<ArrayList<String>> getFoodReviewsByUser(String userEmail)
    {
    	try 
        {
            //Connection
        	Connection myConn = openDBConnection();
            
        	//Statement
        	Statement myStmt = myConn.createStatement();
        	
        	//Result Set
        	ResultSet myRes = myStmt.executeQuery("SELECT * FROM FoodReview WHERE UserEmail = '"+userEmail+"'");
        	
        	ArrayList<ArrayList<String>> al = new ArrayList<ArrayList<String>>();
        	
        	while(myRes.next())
        	{
        		ArrayList<String> l = new ArrayList<String>();
        		l.add(myRes.getString(1));
        		l.add(myRes.getString(2));
        		l.add(myRes.getString(3));
        		l.add(myRes.getString(4));
        		l.add(myRes.getString(5));
        		l.add(myRes.getString(6));
        		al.add(l);
        	}
        	
        	return al;
        	        	
        } 
        catch (SQLException e) 
        {
        	System.out.println(e);
        }
    	
    	return null;
    }
    
    public Double getAverageRatingbyFoodItem(String foodItemName)
    {
    	try 
        {
            //Connection
        	Connection myConn = openDBConnection();
            
        	//Statement
        	Statement myStmt = myConn.createStatement();
        	
        	//Result Set
        	ResultSet myRes = myStmt.executeQuery("SELECT AVG(Rating) FROM FoodReview WHERE FoodItemName = '"+foodItemName+"' GROUP BY FoodItemName");
        	
        	Double avg = myRes.getDouble(1);
        	return avg;
        	        	
        } 
        catch (SQLException e) 
        {
        	System.out.println(e);
        }
    	
    	return null;
    }
    
    public ArrayList<ArrayList<String>> getFavoriteFoodItemsByUser(String userEmail)
    {
    	try 
        {
            //Connection
        	Connection myConn = openDBConnection();
            
        	//Statement
        	Statement myStmt = myConn.createStatement();
        	
        	//Result Set
        	ResultSet myRes = myStmt.executeQuery("SELECT * FROM FavoriteFoodItem WHERE UserEmail = '"+userEmail+"'");
        	
        	ArrayList<ArrayList<String>> al = new ArrayList<ArrayList<String>>();
        	
        	while(myRes.next())
        	{
        		ArrayList<String> l = new ArrayList<String>();
        		l.add(myRes.getString(1));
        		l.add(myRes.getString(2));
        		l.add(myRes.getString(3));
        		al.add(l);
        	}
        	
        	return al;
        	        	
        } 
        catch (SQLException e) 
        {
        	System.out.println(e);
        }
    	
    	return null;
    }
    
    public static void main(String[] args) 
    {
        JDBCSelect t1 = new JDBCSelect();
        
        System.out.println(t1.getUser("bhoeschen002@csbsju.edu").get(0));
        System.out.println(t1.getUser("bhoeschen002@csbsju.edu").get(1));
        System.out.println(t1.getUser("bhoeschen002@csbsju.edu").get(2));
        System.out.println(t1.getUser("bhoeschen002@csbsju.edu").get(3));
        
        System.out.println();
        
        System.out.println(t1.getMenu("10/03/2022", "Breakfast").get(0));
        System.out.println(t1.getMenu("10/03/2022", "Breakfast").get(1));
        System.out.println(t1.getMenu("10/03/2022", "Breakfast").get(2));
        System.out.println(t1.getMenu("10/03/2022", "Breakfast").get(3));
        System.out.println(t1.getMenu("10/03/2022", "Breakfast").get(4));
        
        System.out.println();
        
        System.out.println(t1.getFoodItem("Chicken Strips").get(0));
        System.out.println(t1.getFoodItem("Chicken Strips").get(1));
        System.out.println(t1.getFoodItem("Chicken Strips").get(2));
        System.out.println(t1.getFoodItem("Chicken Strips").get(3));
        System.out.println(t1.getFoodItem("Chicken Strips").get(4));
        System.out.println(t1.getFoodItem("Chicken Strips").get(5));
        System.out.println(t1.getFoodItem("Chicken Strips").get(6));
        
        System.out.println();
        
        ArrayList<ArrayList<String>> list1 = t1.getFoodReviewsByFoodItem("Chicken Strips");
        for(ArrayList<String> l : list1)
        {
        	System.out.println(l.get(0));
        	System.out.println(l.get(1));
        	System.out.println(l.get(2));
        	System.out.println(l.get(3));
        	System.out.println(l.get(4));
        	System.out.println(l.get(5));
        }
        
        System.out.println();
        
        ArrayList<ArrayList<String>> list2 = t1.getFoodReviewsByUser("bhoeschen002@csbsju.edu");
        for(ArrayList<String> l : list2)
        {
        	System.out.println(l.get(0));
        	System.out.println(l.get(1));
        	System.out.println(l.get(2));
        	System.out.println(l.get(3));
        	System.out.println(l.get(4));
        	System.out.println(l.get(5));
        }
        
        System.out.println();
        
        ArrayList<ArrayList<String>> list3 = t1.getFavoriteFoodItemsByUser("bhoeschen002@csbsju.edu");
        for(ArrayList<String> l : list3)
        {
        	System.out.println(l.get(0));
        	System.out.println(l.get(1));
        	System.out.println(l.get(2));
        }
        
        System.out.println();
        
        System.out.println(t1.getAverageRatingbyFoodItem("Chicken Strips"));
    }
}
