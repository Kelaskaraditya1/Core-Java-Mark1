package JdbcConnection;
import java.util.ArrayList;
public class DataBaseTransactions {
    public static void main(String[] args) {

        // inserting value in database.
//        Customer customer = new Customer("Aditya",22,"8591059220","Indian");
//        DataAcessObject.insertCustomer(customer);

//        // updateing customer in database.
//        Customer updateCustomer = new Customer("Saurabh",22,"9819375722","Madhya Pradesh");
//        DataAcessObject.updateCustomer(updateCustomer,29);
//
        // delete from customer database.
//        DataAcessObject.deleteCustomer(29);
//
//        // getting all customers.
        ArrayList<Customer> arrayList = new ArrayList<Customer>();
        arrayList=DataAcessObject.getCustomerDetails();
        for(Customer custome1:arrayList)
            System.out.println(custome1.toString());
//
////        for getting single Customer
//        Customer customer = DataAcessObject.getCustomer(29);
//        DataAcessObject.printDetails(customer);

    }
}
