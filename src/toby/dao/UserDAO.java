package toby.dao;

import java.sql.Connection;
import java.sql.SQLException;

public class UserDAO {
    private final ConnectionMaker connectionMaker;

    public UserDAO(ConnectionMaker connectionMaker) {
        this.connectionMaker = connectionMaker;
    }

    public void add(User user) throws ClassNotFoundException, SQLException{
        Connection connection = connectionMaker.makeConnection();
    }

    public User get(String id) throws ClassNotFoundException, SQLException {
        Connection connection = connectionMaker.makeConnection();

        return new User();
    }
}
