

import org.junit.jupiter.api.Test;
import static org.junit.Assert.assertEquals;



public class Testclass {

    @Test

    public  void TestnumberRow(){
        //Arrange

        countchar Row = new  countchar( );

        //Act
        int actual = Row.getRow();

        //Assert
        int expected = 0;

        assertEquals( expected, actual);
    }
    @Test
     public  void Testnumbersign(){
        //Arrange

        countchar numbersign = new  countchar( );

        //Act
        int actual = numbersign .getNumberSign();

        //Assert
        int expected = 0;

        assertEquals( expected, actual);
    }

    @Test
    public  void TestStop(){
        //Arrange

        countchar stop = new  countchar( );

        //Act

        int actual = stop.getStop();

        //Assert
        int expected = 0;

        assertEquals( expected, actual);
    }

}
