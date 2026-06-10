import java.util.Scanner;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class StudentGradeTest {

    @Test
    public void testThatAllSubjectScoresForEachStudentAreCollectedAndReturned() {

        String input = "45\n67\n53\n50\n67\n50\n99\n78\n34\n77\n63\n60";
        Scanner testInput = new Scanner(input);
        int [][] expected = {{45, 67, 53, 50}, {67, 50, 99, 78}, {34, 77, 63, 60}};

        assertArrayEquals(expected, StudentGrade.collectAllSubjectScoresForEachStudent(testInput, 3, 4));        

    }


    @Test
    public void testThatTheTotalScoreOfEachStudentIsCalculatedAndSReturned() {
    
        int [][] studentsSubjectsAndScores = {{45, 67, 53, 50}, {67, 50, 99, 78}, {34, 77, 63, 60}};
        int [] expected = {215, 294, 234};

        assertArrayEquals(expected, StudentGrade.calculateTheTotalScoreOfEveryStudent(studentsSubjectsAndScores));

    }


    @Test
    public void testThatTheAverageScoreOfEachStudentIsCalculatedAndReturned() {
    
        int [][] studentsSubjectsAndScores = {{45, 67, 53, 50}, {67, 50, 99, 78}, {34, 77, 63, 60}};
        double [] expected = {53.75, 73.50, 58.50};

        assertArrayEquals(expected, StudentGrade.calculateTheAverageScoreOfEveryStudent(studentsSubjectsAndScores), 0.01);

    }


    @Test
    public void testThatThePositionOfEachStudentIsCalculatedAndReturned() {
    
        int [] studentsTotalScores = {215, 294, 234};
        int [] expected = {3, 1, 2};

        assertArrayEquals(expected, StudentGrade.calculateThePositionOfEveryStudent(studentsTotalScores));

    }

    @Test
    public void testThatTheNumberOfPassesInEachSubjectIsCalculatedAndReturned() {
    
        int [][] studentsSubjectsAndScores = {{45, 67, 53, 50}, {67, 50, 99, 78}, {34, 77, 43, 60}};
        int [] expected = {1, 3, 2, 3};

        assertArrayEquals(expected, StudentGrade.calculateTheNumberOfPassesForEverySubject(studentsSubjectsAndScores));

    }


    @Test
    public void testThatTheNumberOfFailsInEachSubjectIsCalculatedAndReturned() {
    
        int [][] studentsSubjectsAndScores = {{45, 67, 53, 50}, {67, 50, 99, 78}, {34, 77, 43, 60}};
        int [] expected = {2, 0, 1, 0};

        assertArrayEquals(expected, StudentGrade.calculateTheNumberOfFailsForEverySubject(studentsSubjectsAndScores));

    }


    @Test
    public void testThatTheHighestScoreForEachSubjectIsObtainedAndReturned() {
    
        int [][] studentsSubjectsAndScores = {{45, 67, 53, 50}, {67, 50, 99, 78}, {34, 77, 43, 60}};
        int [] expected = {67, 77, 99, 78};

        assertArrayEquals(expected, StudentGrade.getTheHighestScoreForEverySubject(studentsSubjectsAndScores));

    }


    @Test
    public void testThatTheLowestScoreForEachSubjectIsObtainedAndReturned() {
    
        int [][] studentsSubjectsAndScores = {{45, 67, 53, 50}, {67, 50, 99, 78}, {34, 77, 43, 60}};
        int [] expected = {34, 50, 43, 50};

        assertArrayEquals(expected, StudentGrade.getTheLowestScoreForEverySubject(studentsSubjectsAndScores));

    }

    @Test
    public void testThatTheTotalScoreForEachSubjectIsCalculatedAndReturned() {
    
        int [][] studentsSubjectsAndScores = {{45, 67, 53, 50}, {67, 50, 99, 78}, {34, 77, 43, 60}};
        int [] expected = {146, 194, 195, 188};

        assertArrayEquals(expected, StudentGrade.calculateTheTotalScoreOfEverySubject(studentsSubjectsAndScores));

    }

    @Test
    public void testThatTheAverageScoreForEachSubjectIsCalculatedAndReturned() {
    
        int [][] studentsSubjectsAndScores = {{45, 67, 53, 50}, {67, 50, 99, 78}, {34, 77, 43, 60}};
        double [] expected = {48.66, 64.66, 65, 62.66};

        assertArrayEquals(expected, StudentGrade.calculateTheAverageScoreOfEverySubject(studentsSubjectsAndScores), 0.01);

    }

}

