package toby.dao;

import java.sql.Connection;

public interface ConnectionMaker {
    Connection makeConnection();
}
