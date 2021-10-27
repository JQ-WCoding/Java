package chapter15.input_output;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Date;
import java.util.Locale;

public class FileEx5 {
    public static void main( String[] args ) {
        if (args.length != 1 || args[0].length() != 1 || !"tTlLnN".contains( args[0] )) {
            System.out.println( "USAGE : java FileEx5 SORT_OPTION" );
            System.out.println( "    SORT_OPTION : " );
            System.out.println( "    t   Time ascending sort. " );
            System.out.println( "    T   Time descending sort. " );
            System.out.println( "    l   Length ascending sort. " );
            System.out.println( "    L   Length descending sort. " );
            System.out.println( "    n   Name ascending sort. " );
            System.out.println( "    N   Name descending sort. " );
            System.exit( 0 );

        }

        // arguments 로 받은 인자값 가장 첫번째 문자
        final char option = args[0].charAt( 0 );

        // 현재 폴더
        String currDir = System.getProperty( "user.dir" );
        File dir = new File( currDir );
        // 파일 배열에 현재 디렉토리의 파일들 list 로 저장
        File[] files = dir.listFiles();

        // Comparator 선언과 함께 정의
        Comparator comparator = new Comparator() {
            @Override
            public int compare( Object o1, Object o2 ) {
                // 최근 변경일 날짜
                long time1 = ( (File) o1 ).lastModified();
                long time2 = ( (File) o2 ).lastModified();

                // 파일 길이 -> 크기
                long length1 = ( (File) o1 ).length();
                long length2 = ( (File) o2 ).length();

                // 파일명 가져오면서 소문자로 변경한 값으로 초기화
                String name1 = ( (File) o1 ).getName().toLowerCase();
                String name2 = ( (File) o2 ).getName().toLowerCase();

                int result = 0;

                switch (option) {
                    case 't':
                        if (time1 - time2 > 0) result = 1;
                        else if (time1 - time2 < 0) result = -1;
                        break;
                    case 'T':
                        if (time1 - time2 > 0) result = -1;
                        else if (time1 - time2 < 0) result = 1;
                        break;
                    case 'l':
                        if (length1 - length2 > 0) result = 1;
                        else if (length1 - length2 < 0) result = -1;
                        break;
                    case 'L':
                        if (length1 - length2 > 0) result = -1;
                        else if (length1 - length2 < 0) result = 1;
                        break;
                    case 'n':
                        result = name1.compareTo( name2 );
                        break;
                    case 'N':
                        result = name2.compareTo( name1 );
                        break;
                }
                return result;
            }

            public boolean equals( Object o ) {
                return false;
            }
        };

        Arrays.sort( files, comparator );

        File file;
        String name;
        SimpleDateFormat sdf = new SimpleDateFormat( "yyyy-MM-dd HH:mm" );
        String attribute, size = "";

        for (File value : files) {
            file = value;
            name = file.getName();

            if (value.isDirectory()) {
                // 폴더이면 -> DIR 값을 초기화
                attribute = "DIR";
            } else {
                // size 가 문자열이기 때문에 file.length int 형에 ""를 추가하여 문자열로 반환
                size = file.length() + "";
                // 읽을 수 있는 파일이면 R
                attribute = file.canRead() ? "R" : " ";
                // 작성이 가능한 파일이면 W
                attribute += file.canWrite() ? "W" : " ";
                // 숨겨진 파일이면 H 가 속성값으로 초기화
                attribute += file.isHidden() ? "H" : " ";
            }
            // lastModified() 가장 최근 변경된 날짜, 속성값, 크기, 파일명이 출력된다
            System.out.printf( "%s %3s %6s %s\n", sdf.format( new Date( file.lastModified() ) ), attribute, size, name );
        }
    }
}
