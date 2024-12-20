package JdbcConnection;

import com.mysql.cj.x.protobuf.MysqlxPrepare;

import java.beans.PropertyEditorSupport;
import java.security.Key;
import java.sql.*;
import java.util.ArrayList;

public class DataAcessObject {
    public static void printDetails(Customer customer){
        System.out.println("The Name of the Customer is:"+customer.getName());
        System.out.println("The Age of the Customer is:"+customer.getAge());
        System.out.println("The Contact of the Customer is:"+customer.getContact());
        System.out.println("The Nationality of the Customer is:"+customer.getNationality());
    }
    public static void insertCustomer(Customer customer){
        try{
            Class.forName(Keys.DRIVER);
            Connection connection = DriverManager.getConnection(Keys.URL,Keys.USERNAME,Keys.PASSWORD);
            PreparedStatement statement = connection.prepareStatement(Keys.INSERT_QUERY);
            statement.setInt(1,customer.getId());
            statement.setString(2,customer.getName());
            statement.setInt(3,customer.getAge());
            statement.setString(4,customer.getContact());
            statement.setString(5,customer.getNationality());
            statement.executeUpdate();
            statement.close();
            connection.close();
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            System.out.println("Customer added Successfully");
        }
    }
    public static void updateCustomer(Customer customer,int sid){
        try{
            Class.forName(Keys.DRIVER);
            Connection connection = DriverManager.getConnection(Keys.URL,Keys.USERNAME,Keys.PASSWORD);
            PreparedStatement statement = connection.prepareStatement(Keys.UPDATE_QUERY);
            statement.setString(1,customer.getName());
            statement.setInt(2,customer.getAge());
            statement.setString(3,customer.getContact());
            statement.setString(4,customer.getNationality());
            statement.setInt(5,sid);
            statement.executeUpdate();
            statement.close();
            connection.close();
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            System.out.println("Contact Updated Successfully");
        }
    }

    public static void deleteCustomer(int sid){
        try {
            Class.forName(Keys.DRIVER);
            Connection connection = DriverManager.getConnection(Keys.URL,Keys.USERNAME,Keys.PASSWORD);
            PreparedStatement statement = connection.prepareStatement(Keys.DELETE_QUERY);
            statement.setInt(1,sid);
            statement.executeUpdate();
            statement.close();
            connection.close();
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            System.out.println("Contact deleted Successfully");
        }
    }
    public static Customer getCustomer(int sid){
        Customer customer=null;
        try{
            Class.forName(Keys.DRIVER);
            Connection connection = DriverManager.getConnection(Keys.URL,Keys.USERNAME,Keys.PASSWORD);
            PreparedStatement statement = connection.prepareStatement(Keys.SELECT_CUSTOMER_QUERY);
            statement.setInt(1,sid);
            ResultSet set = statement.executeQuery();
            set.next();
            customer = new Customer(set.getString("CustomerName"),set.getInt("CustomerAge"),set.getString("CustomerContact"),set.getString("CustomerNationality"));
            statement.close();
            connection.close();
        }catch (Exception e){
            e.printStackTrace();
        }
        return customer;
    }
    public static ArrayList<Customer> getCustomers(){
        ArrayList<Customer> customerArrayList = new ArrayList<>();
        try{
            Class.forName(Keys.DRIVER);
            Connection connection = DriverManager.getConnection(Keys.URL,Keys.USERNAME,Keys.PASSWORD);
            PreparedStatement statement = connection.prepareStatement(Keys.SELECT_ALL_QUERY);
            ResultSet set = statement.executeQuery();
            while(set.next()){
                Customer customer = new Customer();
                customer.setId(set.getInt("CustomerId"));
                customer.setName(set.getString("CustomerName"));
                customer.setAge(set.getInt("CustomerAge"));
                customer.setContact(set.getString("CustomerContact"));
                customer.setNationality(set.getString("CustomerNationality"));
                customerArrayList.add(customer);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return customerArrayList;
    }
    public static ArrayList<Customer> getCustomerDetails(){
        ArrayList<Customer> customerArrayList = new ArrayList<>();
        try{
            Class.forName(Keys.DRIVER);
            Connection connection = DriverManager.getConnection(Keys.URL,Keys.USERNAME,Keys.PASSWORD);
            Statement statement = connection.createStatement();
            ResultSet set = statement.executeQuery(Keys.SELECT_ALL_QUERY);
            set.next();
            while(set.next()){
                Customer customer = new Customer();
                customer.setId(set.getInt("CustomerId"));
                customer.setName(set.getString("CustomerName"));
                customer.setAge(set.getInt("CustomerAge"));
                customer.setContact(set.getString("CustomerContact"));
                customer.setNationality(set.getString("CustomerNationality"));
                customerArrayList.add(customer);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return customerArrayList;
    }
}
