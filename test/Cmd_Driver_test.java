import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

import static org.junit.Assert.assertEquals;

public class Cmd_Driver_test {

    public Cmd_Driver cd;
    public String [] args;
    public File_Buffer FILE = new File_Buffer();
    public File_Buffer wrong_FILE = new File_Buffer();

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();

    //테스트 하기 전에 path등을 설정
    @Before
    public void setUp() throws Exception {
        args = new String[1];
        args[0] = "D:\\test.txt";
        cd = new Cmd_Driver();
        FILE = new File_Buffer();
        wrong_FILE = new File_Buffer();

        Init_Exit Start_End    = new Init_Exit(args,FILE);
    }

    @Test
    public void Cmd_T_test() throws IOException {
        cd.Cmd_T(FILE);
        assertEquals(1, FILE.GetCLN());
    }
    @Test
    public void Cmd_E_test() throws IOException {
        cd.Cmd_E(FILE);
        assertEquals(8, FILE.GetCLN());
    }
    @Test
    public void Cmd_N_test() throws IOException {
        cd.Cmd_N(FILE, 1);
        assertEquals(2, FILE.GetCLN());
    }
    @Test
    public void Cmd_B_test() throws IOException {
        cd.Cmd_B(FILE, 1);
        assertEquals(1, FILE.GetCLN());
    }
    @Test
    public void Cmd_W_test() throws IOException {
        cd.Cmd_W(FILE);
    }
    @Test
    public void Cmd_C_test() throws IOException {
        cd.Cmd_C(FILE);
    }
    @Test
    public void Cmd_L_test() throws IOException {
        cd.Cmd_L(FILE,10);
    }
    @Test
    public void Cmd_S_test() throws IOException {
        cd.Cmd_H("H");
    }
    @Test
    public void Cmd_D_test() throws IOException {
        cd.Cmd_D(FILE,1);
    }
    @Test
    public void Cmd_F_test() throws IOException {
        cd.Cmd_F(FILE,2,"Second");
    }
    @Test
    public void Cmd_R_test() throws IOException {
        cd.Cmd_R(FILE,2,"Second","Second2");
    }
    @Test
    public void Cmd_Y_test() throws IOException {
        cd.Cmd_Y(FILE,2);
    }
    @Test
    public void Cmd_Z_test() throws IOException {
        cd.Cmd_Z(FILE,2);
    }
    @Test
    public void Cmd_P_test() throws IOException {
        cd.Cmd_P(FILE);
    }
    @Test
    public void Cmd_I_test() throws IOException {
        cd.Cmd_I(FILE);
    }
    @Test
    public void Cmd_K_test() throws IOException {
        cd.Cmd_K("key");
    }
    @Test
    public void Cmd_O_test() throws IOException {
        cd.Cmd_O(FILE, 1);
    }
    @Test
    public void Cmd_M_test() throws IOException {
        cd.Cmd_M(0,0);
        cd.Cmd_M(3,4);
        cd.Cmd_M(4,3);
    }
    @Test
    public void Cmd_H_test() throws IOException {
        cd.Cmd_H("H");
    }
}