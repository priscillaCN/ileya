import java.util.Scanner;
import java.util.Arrays;

public class StudentGradeMain {

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);
        
        System.out.println("\nHow many students do you have?");
        int numberOfStudents = userInput.nextInt();

        System.out.println("How many subjects do they offer?");
        int numberOfSubjects = userInput.nextInt();

        System.out.println("\nSaving >>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        System.out.println("Saved successfully");

        int subjectScore = 0;
        int sumOfAllScoresPerStudent = 0;
        
        int [][] studentsSubjectsAndScores = new int [numberOfStudents][numberOfSubjects];
        double [] studentsAverage = new double [numberOfStudents];

        int [] studentsTotal = new int [numberOfStudents];
        int [] studentsPosition = new int [numberOfStudents];

        for(int studentIndex = 0; studentIndex < studentsSubjectsAndScores.length; studentIndex++) {
            System.out.println("\nEntering score for student " + (studentIndex + 1));

            for(int scoreIndex = 0; scoreIndex < studentsSubjectsAndScores[studentIndex].length; scoreIndex++) {

                System.out.println("Enter score for subject " + (scoreIndex + 1));
                subjectScore =  userInput.nextInt();
                
                while (subjectScore < 0 || subjectScore > 100) {

                    System.out.println("\ninvalid score");

                    System.out.println("Enter score for subject " + (scoreIndex + 1));
                    subjectScore =  userInput.nextInt();

                }


                System.out.println("\nSaving >>>>>>>>>>>>>>>>>>>>>>>>>>>>");

                studentsSubjectsAndScores[studentIndex][scoreIndex] = subjectScore;
                sumOfAllScoresPerStudent += subjectScore;

                System.out.println("Saved successfully\n");

            }

            studentsTotal[studentIndex] = sumOfAllScoresPerStudent;
            studentsAverage[studentIndex] = (double)sumOfAllScoresPerStudent / numberOfSubjects;

            sumOfAllScoresPerStudent = 0;

        }

        int [] studentsTotalClone = studentsTotal.clone();
        Arrays.sort(studentsTotalClone);

        for(int studentsTotalIndex = 0; studentsTotalIndex < studentsTotal.length; studentsTotalIndex++) {

            for(int studentsTotalCloneIndex = studentsTotalClone.length - 1; studentsTotalCloneIndex >= 0; studentsTotalCloneIndex--) {

                 if(studentsTotal[studentsTotalIndex] == studentsTotalClone[studentsTotalCloneIndex] )
                    studentsPosition[studentsTotalIndex] = studentsTotalClone.length -studentsTotalCloneIndex;

            }

        }
        
        
        System.out.println("\n================================================================");

        System.out.printf("%-15s", "STUDENT");

        for(int scoreIndex = 0; scoreIndex < numberOfSubjects; scoreIndex++) {

            System.out.printf("%-15s" , "SUB" + (scoreIndex + 1));

        }

        System.out.printf("%-15s", "TOT");
        System.out.printf("%-15s", "AVG");
        System.out.printf("%-15s %n", "POS");


        System.out.println("\n================================================================");


        for(int studentIndex = 0; studentIndex < studentsSubjectsAndScores.length; studentIndex++) {
            System.out.print("student " + (studentIndex + 1) + " \t");

            for(int scoreIndex = 0; scoreIndex < studentsSubjectsAndScores[studentIndex].length; scoreIndex++) {
                System.out.printf("%-15d", studentsSubjectsAndScores[studentIndex][scoreIndex]);
            }

            System.out.printf("%-15d", studentsTotal[studentIndex]);
            System.out.printf("%-15.2f", studentsAverage[studentIndex]);
            System.out.printf("%-15d %n", studentsPosition[studentIndex]);

        }

        System.out.println("\n================================================================");
        System.out.println("\n================================================================");

        int passCounter = 0;
        int failCounter = 0;

        int highestScore = 0;
        int lowestScore = 0;

        int [] numberOfPassesForEachSubject = new int [numberOfSubjects];
        int [] numberOfFailsForEachSubject = new int [numberOfSubjects];

        int [] highestScoreForeachSubject = new int [numberOfSubjects];
        int [] lowestScoreForeachSubject = new int [numberOfSubjects];

        for(int scoreIndex = 0; scoreIndex < studentsSubjectsAndScores[0].length; scoreIndex++) {

            highestScore = studentsSubjectsAndScores[0][scoreIndex];

            for(int studentIndex = 0; studentIndex < studentsSubjectsAndScores.length; studentIndex++) {

                if(studentsSubjectsAndScores[studentIndex][scoreIndex] < 50) failCounter++;
                else passCounter++;



                if(highestScore < studentsSubjectsAndScores[studentIndex][scoreIndex])
                    highestScore = studentsSubjectsAndScores[studentIndex][scoreIndex];
                else lowestScore = studentsSubjectsAndScores[studentIndex][scoreIndex];                 

            }

            numberOfPassesForEachSubject[scoreIndex] = passCounter;
            numberOfFailsForEachSubject[scoreIndex] = failCounter;

            highestScoreForeachSubject[scoreIndex] = highestScore;
            lowestScoreForeachSubject[scoreIndex] = lowestScore;

            passCounter = 0;
            failCounter = 0;

        }


        int totalScoreForEachSubject = 0;
        double averageScoreForEachSubject = 0;

        int highestScoringStudentForEachSubject = 0;
        int lowestScoringStudentForEachSubject = 0;

        System.out.println("\nSUBJECT SUMMARY\n");


        for(int scoreIndex = 0; scoreIndex < studentsSubjectsAndScores[0].length; scoreIndex++) {

            System.out.println("Subject " + (scoreIndex + 1));

            for(int studentIndex = 0; studentIndex < studentsSubjectsAndScores.length; studentIndex++) {

            if(highestScoreForeachSubject[scoreIndex] == studentsSubjectsAndScores[studentIndex][scoreIndex])
                highestScoringStudentForEachSubject = studentIndex + 1;

            if(lowestScoreForeachSubject[scoreIndex] == studentsSubjectsAndScores[studentIndex][scoreIndex])
                lowestScoringStudentForEachSubject = studentIndex + 1;

               totalScoreForEachSubject += studentsSubjectsAndScores[studentIndex][scoreIndex];

            }

            averageScoreForEachSubject = (double)totalScoreForEachSubject / numberOfStudents;

            System.out.println("Highest scoring student is: Student " + highestScoringStudentForEachSubject + " scoring " + highestScoreForeachSubject[scoreIndex]);
            System.out.println("Lowest scoring student is: Student " + lowestScoringStudentForEachSubject + " scoring " + lowestScoreForeachSubject[scoreIndex]);

            System.out.println("Total score is: " + totalScoreForEachSubject);
            System.out.printf("Average score is: %.2f %n", averageScoreForEachSubject);

            System.out.println("Number of passes: " + numberOfPassesForEachSubject[scoreIndex]);
            System.out.println("Number of fails: " + numberOfFailsForEachSubject[scoreIndex]);

            System.out.println();
                      
            totalScoreForEachSubject = 0;      

        }

        int [] numberOfFailsForEachSubjectClone = numberOfFailsForEachSubject.clone();
        int [] numberOfPassesForEachSubjectClone = numberOfPassesForEachSubject.clone();
        
        Arrays.sort(numberOfFailsForEachSubjectClone);
        Arrays.sort(numberOfPassesForEachSubjectClone);

        int hardestSubject = 0;
        int easiestSubject = 0;

        int numberOfFailsForHardestSubject = 0;
        int numberOfPassesForEasiestSubject = 0;



        for(int cloneIndex = numberOfFailsForEachSubjectClone.length - 1; cloneIndex < numberOfFailsForEachSubjectClone.length; cloneIndex++) {

            for(int index = 0; index < numberOfFailsForEachSubject.length; index++) {

                if(numberOfFailsForEachSubjectClone[cloneIndex] == numberOfFailsForEachSubject[index]) {
                    hardestSubject = index + 1;
                    numberOfFailsForHardestSubject = numberOfFailsForEachSubjectClone[cloneIndex];
                }

            }

        }

        for(int cloneIndex = numberOfPassesForEachSubjectClone.length - 1; cloneIndex < numberOfPassesForEachSubjectClone.length; cloneIndex++) {

            for(int index = 0; index < numberOfPassesForEachSubject.length; index++) {

                if(numberOfPassesForEachSubjectClone[cloneIndex] == numberOfPassesForEachSubject[index]) {
                    easiestSubject = index + 1;
                    numberOfPassesForEasiestSubject = numberOfPassesForEachSubjectClone[cloneIndex];
                }

            }

        }


        int [] highestScoreForeachSubjectClone = highestScoreForeachSubject.clone();
        int [] lowestScoreForeachSubjectClone = lowestScoreForeachSubject.clone();

        Arrays.sort(highestScoreForeachSubjectClone);
        Arrays.sort(lowestScoreForeachSubjectClone);

        int studentWithOverallHighestScore = 0;
        int studentWithOverallLowestScore = 0;
    
        int subjectWithOverallHighestScore = 0;
        int subjectWithOverallLowestScore = 0;

        int overallHighestScore = 0;
        int overallLowestScore = 0;


        for(int cloneIndex = highestScoreForeachSubjectClone.length - 1; cloneIndex < highestScoreForeachSubjectClone.length; cloneIndex++) {

            for(int index = 0; index < highestScoreForeachSubject.length; index++) {

                if(highestScoreForeachSubjectClone[cloneIndex] == highestScoreForeachSubject[index]) {
                    subjectWithOverallHighestScore = index + 1;
                    overallHighestScore = highestScoreForeachSubject[index];
                }

            }

        }


        for(int cloneIndex = 0; cloneIndex <= 0 ; cloneIndex++) {

            for(int index = 0; index < lowestScoreForeachSubject.length; index++) {

                if(lowestScoreForeachSubjectClone[cloneIndex] == lowestScoreForeachSubject[index]) {
                    subjectWithOverallLowestScore = index + 1;
                    overallLowestScore = lowestScoreForeachSubject[index];
                }

            }

        }


        for(int scoreIndex = 0; scoreIndex < studentsSubjectsAndScores[0].length; scoreIndex++) {

            for(int studentIndex = 0; studentIndex < studentsSubjectsAndScores.length; studentIndex++) {

                if(overallHighestScore == studentsSubjectsAndScores[studentIndex][scoreIndex])
                    studentWithOverallHighestScore = studentIndex + 1;

                if(overallLowestScore == studentsSubjectsAndScores[studentIndex][scoreIndex])
                    studentWithOverallLowestScore = studentIndex + 1;

            }

        }


        System.out.println("The hardest subject is subject " + hardestSubject + " with " + numberOfFailsForHardestSubject + " failures");
        System.out.println("The easiest subject is subject " + easiestSubject + " with " + numberOfPassesForEasiestSubject + " passes");

        System.out.println("The overall highest score is scored by student " + studentWithOverallHighestScore + " in subject " + subjectWithOverallHighestScore + " scoring " + overallHighestScore);
        System.out.println("The overall lowest score is scored by student " + studentWithOverallLowestScore + " in subject " + subjectWithOverallLowestScore + " scoring " + overallLowestScore);

        System.out.println("======================================================\n\n");


        int bestGraduatingStudent = 0;
        int worstGraduatingStudent = 0;

        int bestGraduatingScore = 0;
        int worstGraduatingScore = 0;

        int classTotalScore = 0;
        double classAverageScore = 0;


        for(int studentsTotalCloneIndex = studentsTotalClone.length - 1; studentsTotalCloneIndex >= 0; studentsTotalCloneIndex--) {

            for(int studentsTotalIndex = 0; studentsTotalIndex < studentsTotal.length; studentsTotalIndex++) {


                if(studentsTotalClone[studentsTotalClone.length - 1] == studentsTotal[studentsTotalIndex]){
                    bestGraduatingStudent = studentsTotalIndex + 1;
                    bestGraduatingScore = studentsTotal[studentsTotalIndex];
                }


                if(studentsTotalClone[0] == studentsTotal[studentsTotalIndex]) {
                    worstGraduatingStudent = studentsTotalIndex + 1;
                    worstGraduatingScore = studentsTotal[studentsTotalIndex];
                } 
                  
            }

            classTotalScore += studentsTotalClone[studentsTotalCloneIndex];

        }
      
        classAverageScore = (double)classTotalScore / numberOfStudents;

        System.out.println("CLASS SUMMARY");

        System.out.println("======================================================");

        System.out.println("Best graduating student is student " + bestGraduatingStudent + " scoring " + bestGraduatingScore);
        System.out.println("======================================================\n\n");

        System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        System.out.println("Worst graduating student is student " + worstGraduatingStudent + " scoring " + worstGraduatingScore);
        System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\n\n");

        System.out.println("================================================");
        System.out.println("Class total score is: " + classTotalScore);
        System.out.printf("Class average score is: %.2f %n", classAverageScore);
        System.out.println("================================================");

  
    }


}
