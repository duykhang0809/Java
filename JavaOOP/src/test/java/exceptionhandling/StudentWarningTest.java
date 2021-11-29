package exceptionhandling;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class StudentWarningTest {

    //Positive case
    @Test
   public void given_hourAndPoint_when_theyAreValid_then_returnGPA(){
        double actual = StudentWarning.computeGPA(21, 28.35);
        double expected = 1.35;
        Assert.assertEquals(expected, actual, 0.001);
    }

    //Negative case
    @Test(expected = ArithmeticException.class)
    public void given_hourAndPoint_when_hourisInvalid_then_returnArithmeticException(){
        StudentWarning.computeGPA(0, 28.35);
    }

    @Test
    public void given_inputFilePath_when_itDoesNotExist_then_returnNull(){
        String inputFilePath = "docc\\data.csv";
        List<StudentInformation> studentInformationListActual = StudentWarning.readDataInputFile(inputFilePath);
        Assert.assertEquals(null, studentInformationListActual );
    }

}