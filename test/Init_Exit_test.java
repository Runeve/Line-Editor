import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.io.IOException;

import static org.junit.Assert.*;

public class Init_Exit_test {

    String[] args;
    String[] wrong_args;
    File_Buffer FILE = new File_Buffer();
    File_Buffer wrong_FILE = new File_Buffer();

    @Rule
    public ExpectedException expectedExcetption = ExpectedException.none();

    //테스트 하기 전에 path등을 설정
    @Before
    public void setUp() throws Exception {

        args = new String[1];
        wrong_args = new String[0];
        args[0] = "D:\test.txt";;
        FILE = new File_Buffer();
        wrong_FILE = new File_Buffer();
    }

    @Test
    public void Init_Exit_test() throws IOException
    {
        Init_Exit IE_test = new Init_Exit(args,FILE);
        Init_Exit wrong_IE_test1 = new Init_Exit(wrong_args,FILE);
    }

    @Test
    public void Start_Failed_test() throws IOException
    {
        Init_Exit IE_test = new Init_Exit(args,FILE);
        assertEquals(false,IE_test.Start_Failed());
    }

    @Test
    public void Do_Update_test() throws IOException
    {
        Init_Exit IE_test = new Init_Exit(args,FILE);
        assertEquals(false,IE_test.Start_Failed());
    }
}