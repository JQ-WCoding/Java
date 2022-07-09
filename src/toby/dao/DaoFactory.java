package toby.dao;

public class DaoFactory {

    // Dao가 사용자, 계정 등 다양하게 쓰이게 되면서 직접적으로 생성하기 보단 ConnectionMaker를 만들어주는 팩토리 메소드를 통해 주입받는 형식으로
    // 최대한 공통적인 부분을 감싸는 것이 가능하다.
    public UserDao userDAO() {
        return new UserDao( connectionMaker() );
    }

    public AccountDao accountDao() {
        return new AccountDao( connectionMaker() );
    }

    private ConnectionMaker connectionMaker() {
        return new DConnectionMaker();
    }
}
