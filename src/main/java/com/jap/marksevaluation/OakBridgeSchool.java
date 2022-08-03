package com.jap.marksevaluation;
public class OakBridgeSchool {
    public int[] calculateTotalMarks(int [] math, int[] science, int[] english)
    {
        int[] totalMarks = new int[10];
        if(math.length == 0 || science.length == 0 || english.length == 0){
            return null;
        }
        else {
        for (int i = 0; i < math.length; i++) {
            totalMarks[i] = math[i] + science[i] + english[i];
            //System.out.print(totalMarks[i] + " ");
        }
        System.out.println(); }
        return totalMarks;

    }
    // Write the logic to calculate the average marks using recursion
   public double calculateAverageScienceMarks (int[] science, int len) {
       double  sum = 0;
        int length = science.length;
       if(len > 0) {
           len = len - 1;
           //sum += science[len];
           sum = science[len] + calculateAverageScienceMarks(science, len);
       }
       else{

           return 0;
       }
       if(len == science.length-1) {

           return  sum/science.length;
           }
       else{
               return  sum;
       }
   }


    // Write the logic to calculate the average marks using recursion
    public double calculateAverageEnglishMarks (int[] english,int len)
    {
        double  sum = 0;
        int length = english.length;
        if(len > 0) {
            len = len - 1;
            //sum += science[len];
            sum = english[len] + calculateAverageScienceMarks(english, len);
        }
        else{

            return 0;
        }
        if(len == english.length-1) {

            return  sum/english.length;
        }
        else{
            return  sum;
        }
    }
    // Write the logic to calculate the average marks using recursion
    public double calculateAverageMathMarks (int[] math,int len) {
        double  sum = 0;
        int length = math.length;
        if(len > 0) {
            len = len - 1;
            //sum += science[len];
            sum = math[len] + calculateAverageScienceMarks(math, len);
        }
        else{

            return 0;
        }
        if(len == math.length-1) {

            return  sum/math.length;
        }
        else{
            return  sum;
        }
    }
    //Write the logic to find the top score in the class using recursion
    public int findTopScore(int [] totalMarks,int len) {
        int topScorer = totalMarks[0];
        if (len == 1) {
            return totalMarks[0];
        } else {
            return (findTopScore(totalMarks, len - 1) + totalMarks[len - 1]);
        }
    }

    public static void main(String[] args) {

        // Initialize the OakBridgeSchool class object
        OakBridgeSchool oakBridgeSchool = new OakBridgeSchool();
        int[] math = new int[]{88, 89, 100, 70, 60, 80, 35, 3, 25, 56};
        int[] science = new int[]{80, 83, 99, 67, 56, 84, 38, 9, 32, 65};
        int[] english= new int[]{90, 98, 100, 65, 54, 82, 40, 13, 45, 67};
        int noOfSubjects = 3;
        String[] studentNames = new String[]{"Michelle", "Kate", "Ann", "Tina", "Tom", "Sam", "Ria", "Pam", "Leena", "Leo"};
        int[] rollNos = new int[]{102, 109, 101, 103, 104, 108, 110, 105, 106, 107};



        // Call the appropriate methods and display the output
        int[] totalMarks = oakBridgeSchool.calculateTotalMarks(math,science,english);
        for (int i = 0; i < totalMarks.length; i++) {
            System.out.print(totalMarks[i] + " ");
            System.out.println();
        }

        int topScorer = oakBridgeSchool.findTopScore(totalMarks, totalMarks.length);
        System.out.println("topScorer = " + topScorer);

        double totalAverageScience = oakBridgeSchool.calculateAverageScienceMarks(science, science.length);
        System.out.println("totalAverageScience = " + oakBridgeSchool.calculateAverageScienceMarks(science, science.length));

        double totalAverageMath = oakBridgeSchool.calculateAverageScienceMarks(math, science.length);
        System.out.println("totalAverageMath = " +oakBridgeSchool.calculateAverageScienceMarks(math, science.length));

        double totalAverageEnglish = oakBridgeSchool.calculateAverageScienceMarks(english, english.length);
        System.out.println("totalAverageEnglish = " + oakBridgeSchool.calculateAverageScienceMarks(english, english.length));
        
    }
}
