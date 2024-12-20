package JdbcConnection;
public class Keys {
    public static final String ID="ID";
    public static final String NAME="NAME";
    public static final String CONTACT="CONTACT";
    public static final String NATIONALITY="NATIONALITY";
    public static final String AGE="AGE";
    public static final String DRIVER="com.mysql.cj.jdbc.Driver";
    public static final String URL="jdbc:mysql://localhost:3306/grocery";
    public static final String USERNAME="root";
    public static final String PASSWORD="9819375722Aditya";
    public static final String INSERT_QUERY="insert into customer values(?,?,?,?,?)";
    public static final String UPDATE_QUERY="update customer set CustomerName=?,CustomerAge=?,CustomerContact=?,CustomerNationality=? where CustomerId=?";
    public static final String DELETE_QUERY="delete from customer where CustomerId=?";
    public static final String SELECT_ALL_QUERY="select * from customer";
    public static final String SELECT_CUSTOMER_QUERY="select * from customer where CustomerId=?";
}
