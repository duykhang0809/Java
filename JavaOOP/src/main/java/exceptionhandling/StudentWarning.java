package exceptionhandling;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentWarning {
    public static void main(String[] args) {
        String inputFilePath = "doc\\data.csv";
        String outputFilePath = "doc\\academicWarning.csv";
        List<StudentInformation> studentInformationList = readDataInputFile(inputFilePath);
        writeDataOutputFile(studentInformationList, outputFilePath);
    }

    static List<StudentInformation> readDataInputFile(String inputFilePath) {
        File file = new File(inputFilePath);
        try {
            Scanner inputStream = new Scanner(file);
            List<StudentInformation> studentInformationList = new ArrayList<>();

            while (inputStream.hasNext()) {
                String data = inputStream.next();
                String[] values = data.split(",");
                String name = values[0];
                int hour = Integer.parseInt(values[1]);
                double point = Double.parseDouble(values[2]);
                double studentGPA = computeGPA(hour, point);

                if ((studentGPA < 1.5 && hour < 30) || (studentGPA < 1.75 && hour < 60) || (studentGPA < 2.0)) {
                    studentInformationList.add(new StudentInformation(name, hour, studentGPA));
                }
            }
            return studentInformationList;
        } catch (FileNotFoundException e) {
            System.out.println("Input file does not exist ! Please try again");
        } catch (NumberFormatException e1) {
            System.out.println("Can't parse an int or double from the input file format");
        }
        return null;
    }

    static double computeGPA(int hour, double point) {
        if (hour == 0) throw new ArithmeticException("Cant divided by 0");
        return point / hour;
    }

    static void writeDataOutputFile(List<StudentInformation> studentInformationList, String outputFilePath) {

        try {
            FileWriter fileWriter = new FileWriter(outputFilePath);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            PrintWriter printWriter = new PrintWriter(bufferedWriter);

            for (StudentInformation student : studentInformationList) {
                printWriter.println(student.getName() + " " + student.getHour() + " " + student.getStudentGPA());
            }
            System.out.println("Save record successfully");
            printWriter.flush();
            printWriter.close();
        } catch (IOException e) {
            System.out.println("Something else go wrong with the input or output stream !");
        }
    }
}
