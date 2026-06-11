import java.util.Scanner;
import java.util.Arrays;

public class StudentGrade {

    public static int [][] collectAllSubjectScoresForEachStudent () {

        Scanner userInput = new Scanner(System.in);

        System.out.println("\nHow many students do you have?");
        int numberOfStudents = userInput.nextInt();

        System.out.println("How many subjects do they offer?");
        int numberOfSubjects = userInput.nextInt();

        System.out.println("\nSaving >>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        System.out.println("Saved successfully");

        int [][] studentsSubjectsAndScores = new int [numberOfStudents][numberOfSubjects];

        for(int studentIndex = 0; studentIndex < studentsSubjectsAndScores.length; studentIndex++) {
            System.out.println("\nEntering score for student " + (studentIndex + 1));

            for(int scoreIndex = 0; scoreIndex < studentsSubjectsAndScores[studentIndex].length; scoreIndex++) {

                System.out.println("Enter score for subject " + (scoreIndex + 1));
                int subjectScore =  userInput.nextInt();

                String scoreVailidityChecker = "yes";
                
                while(scoreVailidityChecker.equals ("yes")) {

                    boolean isSubjectScoreValid = isScoreValid (subjectScore, scoreIndex);   
                    subjectScore =  userInput.nextInt();

                    if(isSubjectScoreValid = true) scoreVailidityChecker = "no";
                }

                System.out.println("\nSaving >>>>>>>>>>>>>>>>>>>>>>>>>>>>");

                studentsSubjectsAndScores[studentIndex][scoreIndex] = subjectScore;

                System.out.println("Saved successfully\n");

            }

        }

        return studentsSubjectsAndScores;

    }


    public static boolean isScoreValid (int subjectScore, int scoreIndex) {

        while (subjectScore < 0 || subjectScore > 100) {

            System.out.println("\ninvalid score");

            System.out.println("Enter score for subject " + (scoreIndex + 1));

            return false;

        }

        return true;


    }


    public static int [] calculateTheTotalScoreOfEveryStudent (int [][] studentsSubjectsAndScores) {

        int [] studentsTotalScores = new int [studentsSubjectsAndScores.length];

        for(int studentIndex = 0; studentIndex < studentsSubjectsAndScores.length; studentIndex++) {

            int sumOfAllScoresPerStudent = 0;

            for(int scoreIndex = 0; scoreIndex < studentsSubjectsAndScores[studentIndex].length; scoreIndex++) {

                int subjectScore = studentsSubjectsAndScores[studentIndex][scoreIndex];
                sumOfAllScoresPerStudent += subjectScore;
            }

            studentsTotalScores[studentIndex] = sumOfAllScoresPerStudent;

        }

        return studentsTotalScores;

    }


    public static double [] calculateTheAverageScoreOfEveryStudent (int [][] studentsSubjectsAndScores) {

        int [] totalScores = calculateTheTotalScoreOfEveryStudent (studentsSubjectsAndScores);
        
        double [] studentsAverageScores = new double [totalScores.length];

        for(int totalScoresIndex = 0;  totalScoresIndex < totalScores.length; totalScoresIndex++) {

            studentsAverageScores[totalScoresIndex] = (double)totalScores[totalScoresIndex] / studentsSubjectsAndScores[0].length;

        }

        return studentsAverageScores;
    }


    public static int [] calculateThePositionOfEveryStudent (int [] studentsTotalScores) {

        int [] studentsPositions = new int [studentsTotalScores.length];
    

        int [] studentsTotalScoresClone = createACloneOfArrays (studentsTotalScores);
        Arrays.sort(studentsTotalScoresClone);

        for(int studentsTotalIndex = 0; studentsTotalIndex < studentsTotalScores.length; studentsTotalIndex++) {

            for(int studentsTotalCloneIndex = studentsTotalScoresClone.length - 1; studentsTotalCloneIndex >= 0; studentsTotalCloneIndex--) {

                 if(studentsTotalScores[studentsTotalIndex] == studentsTotalScoresClone[studentsTotalCloneIndex] )
                    studentsPositions[studentsTotalIndex] = studentsTotalScoresClone.length -studentsTotalCloneIndex;

            }

        }

        return studentsPositions;
    }


    public static int [] calculateTheNumberOfPassesForEverySubject (int [][] studentsSubjectsAndScores) {

        int [] numberOfPassesForEachSubject = new int [studentsSubjectsAndScores[0].length];

        for(int scoreIndex = 0; scoreIndex < studentsSubjectsAndScores[0].length; scoreIndex++) {
            
            int passCounter = 0;

            for(int studentIndex = 0; studentIndex < studentsSubjectsAndScores.length; studentIndex++) {

                if(studentsSubjectsAndScores[studentIndex][scoreIndex] >= 50) passCounter++;

            }

            numberOfPassesForEachSubject[scoreIndex] = passCounter;

        }

        return numberOfPassesForEachSubject;

    }


    public static int [] calculateTheNumberOfFailsForEverySubject (int [][] studentsSubjectsAndScores) {

        int [] numberOfFailsForEachSubject = new int [studentsSubjectsAndScores[0].length];

        for(int scoreIndex = 0; scoreIndex < studentsSubjectsAndScores[0].length; scoreIndex++) {
            
            int failCounter = 0;

            for(int studentIndex = 0; studentIndex < studentsSubjectsAndScores.length; studentIndex++) {

                if(studentsSubjectsAndScores[studentIndex][scoreIndex] < 50) failCounter++;

            }

            numberOfFailsForEachSubject[scoreIndex] = failCounter;

        }

        return numberOfFailsForEachSubject;

    }


    public static int [] getTheHighestScoreForEverySubject (int [][] studentsSubjectsAndScores) {
    
        int [] highestScoresForSubjects = new int [studentsSubjectsAndScores[0].length];

        for(int scoreIndex = 0; scoreIndex < studentsSubjectsAndScores[0].length; scoreIndex++) {

            int highestScore = studentsSubjectsAndScores[0][scoreIndex];

            for(int studentIndex = 0; studentIndex < studentsSubjectsAndScores.length; studentIndex++) {

                if(highestScore < studentsSubjectsAndScores[studentIndex][scoreIndex])
                    highestScore = studentsSubjectsAndScores[studentIndex][scoreIndex];
     
            }

            highestScoresForSubjects[scoreIndex] = highestScore;

        }

        return highestScoresForSubjects;

    }


    public static int [] getTheLowestScoreForEverySubject (int [][] studentsSubjectsAndScores) {
    
        int [] lowestScoresForSubjects = new int [studentsSubjectsAndScores[0].length];

        for(int scoreIndex = 0; scoreIndex < studentsSubjectsAndScores[0].length; scoreIndex++) {

            int lowestScore = studentsSubjectsAndScores[0][scoreIndex];

            for(int studentIndex = 0; studentIndex < studentsSubjectsAndScores.length; studentIndex++) {

                if(lowestScore > studentsSubjectsAndScores[studentIndex][scoreIndex])
                    lowestScore = studentsSubjectsAndScores[studentIndex][scoreIndex];
     
            }

            lowestScoresForSubjects[scoreIndex] = lowestScore;

        }

        return lowestScoresForSubjects;

    }


    public static int [] calculateTheTotalScoreOfEverySubject (int [][] studentsSubjectsAndScores) {

        int [] totalScoresForSubjects = new int [studentsSubjectsAndScores[0].length];

        for(int scoreIndex = 0; scoreIndex < studentsSubjectsAndScores[0].length; scoreIndex++) {

            int totalScore = 0;

            for(int studentIndex = 0; studentIndex < studentsSubjectsAndScores.length; studentIndex++) {

               totalScore += studentsSubjectsAndScores[studentIndex][scoreIndex];

            }

            totalScoresForSubjects[scoreIndex] = totalScore;

        }

        return totalScoresForSubjects;

    }


    public static double [] calculateTheAverageScoreOfEverySubject (int [][] studentsSubjectsAndScores) {

        int [] totalSubjectScores = calculateTheTotalScoreOfEverySubject (studentsSubjectsAndScores);
        
        double [] averageScoresForSubjects = new double [totalSubjectScores.length];

        for(int subjectTotalIndex = 0;  subjectTotalIndex < totalSubjectScores.length; subjectTotalIndex++) {

            averageScoresForSubjects[subjectTotalIndex] = (double)totalSubjectScores[subjectTotalIndex] / studentsSubjectsAndScores.length;
        
        }

        return averageScoresForSubjects;
    }


    public static int [] createACloneOfArrays (int [] totalSubjectScores) {

        int [] clone = new int [totalSubjectScores.length];

        for(int index = 0; index < totalSubjectScores.length; index++) {

            clone[index] = totalSubjectScores[index];

        }

        return clone;

    }

    


}
