import com.czh.EquationHandler;
import org.junit.Test;

public class EquationHandlerTest {

    @Test
    public void generateEquationAndAnswerTest(){
        EquationHandler.generateEquationAndAnswer(1000, 10);
    }

    @Test
    public void checkAnswerTest(){
        EquationHandler.checkAnswer("", EquationHandler.ANSWER_PATH);
    }

    @Test
    public void checkAnswerTest2(){
        EquationHandler.checkAnswer(EquationHandler.EXERCISES_PATH, EquationHandler.ANSWER_PATH);
    }

    @Test
    public void mainTest(){
        String[] input = new String[4];
        input[0] = "-n";
        input[1] = "50";
        input[2] = "-r";
        input[3] = "20";
//        input[0] = "-e";
//        input[1] = "/Exercises.txt";
//        input[2] = "-a";
//        input[3] = "/Answer.txt";
        EquationHandler.main(input);
    }
}