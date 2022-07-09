package toby.dao;

import java.sql.SQLException;

class UserDAOTest {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        // 커낵션 메이커를 통해 DConnectionMaker 구현체를 만들고 이를 통해 userDAO 생성자의 파라미터로 conncectionMaker를 던져 최대한 의존성을 분리한다
        ConnectionMaker connectionMaker = new DConnectionMaker();

        UserDAO userDAO = new UserDAO( connectionMaker );

        System.out.println( "userDAO = " + userDAO );
    }
}