package Chapter6.ch6.constructor;

public class DocumentTest {
    public static void main(String[] args) {
        /*
         4개의 과정 중 생성자에 인자값을 넣어 인스턴스화 한 경우는 한번
         따라서, 이외의 경우는 파일 명이 no name1,2,3 으로 각각 생성되어 출력되는지 확인
         */
        Document document1 = new Document();
        Document document2 = new Document("JAVA");
        Document document3 = new Document();
        Document document4 = new Document();
    }
}
