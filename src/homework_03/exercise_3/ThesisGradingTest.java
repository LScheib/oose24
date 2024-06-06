package homework_03.exercise_3;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

//TC 1: grade1: 1.0, grade2: 2.0, grade3: 0.0, return: 1.5, exception: -
//TC 2: grade1: 2.0, grade2: 4.0, grade3: 3.0, return: 2.5, exception: -
//TC 3: grade1: 2.0, grade2: 0.0, grade3: 0.0, return: -, exception: NoSuchGradeException(grade2)
//TC 4: grade1: 1.3, grade2: 3.7, grade3: 0.0, return: -, exception: ThirdExaminerNeededException
//TC 5: grade1: 1.0, grade2: 2.0, grade3: 1.0, return: 1.5, exception: -

class ThesisGradingTest {

    private ThesisGrading thesisGrading;

    @BeforeEach
    void setUp() {
        this.thesisGrading = new ThesisGrading();
    }

    @AfterEach
    void tearDown() {
        this.thesisGrading = null;
    }

    @Test
    void calculateFinalGrade_validGrades_noThirdExaminer() {
        //Arrange
        double grade1 = 1.0;
        double grade2 = 2.0;
        double grade3 = 0.0;
        double expected = 1.5;

        try{
            //Act
            double actual = thesisGrading.calculateFinalGrade(grade1, grade2, grade3);
            //Assert
            assertEquals(expected, actual);
        }
        catch(Exception e){
            Assertions.fail();
        }
    }

    @Test
    void calculateFinalGrade_validGrades() {
        //Arrange
        double grade1 = 2.0;
        double grade2 = 4.0;
        double grade3 = 3.0;
        double expected = 2.5;

        try{
            //Act
            double actual = thesisGrading.calculateFinalGrade(grade1, grade2, grade3);
            //Assert
            assertEquals(expected, actual);
        }
        catch(Exception e){
            Assertions.fail();
        }
    }

    @Test
    void calculateFinalGrade_invalidSecondGrade() {
        //Arrange
        double grade1 = 2.0;
        double grade2 = 0.0;
        double grade3 = 0.0;

        //Act & Assert
        NoSuchGradeException ex = assertThrows(NoSuchGradeException.class, () -> {
            //Act
            thesisGrading.calculcateFinalGrade(grade1, grade2, grade3);
        });
    }

    @Test
    void calculcateFinalGrade_invalidThirdGrade() {
        //Arrange
        double grade1 = 1.3;
        double grade2 = 3.7;
        double grade3 = 0.0;

        //Act & Assert
        ThirdExaminerNeededException ex = assertThrows(ThirdExaminerNeededException.class, () -> {
            //Act
            thesisGrading.calculcateFinalGrade(grade1, grade2, grade3);
        });
    }

    @Test
    void calculcateFinalGrade_unnecessaryThirdGrade() {
        //Arrange
        double grade1 = 1.0;
        double grade2 = 2.0;
        double grade3 = 1.0;
        double expected = 1.5;

        //Act
        try{
            double actual = thesisGrading.calculateFinalGrade(grade1, grade2, grade3);
            //Assert
            assertEquals(expected, actual);
        }
        catch(Exception e){
            Assertions.fail();
        }
    }
}