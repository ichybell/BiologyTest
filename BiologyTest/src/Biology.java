import java.sql.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Biology extends StudentInfo {
   static int j;
    public static void main(String... args){
        StudentInfo studentInfo= new StudentInfo();
        studentInfo.AddInfo();
        try {
            Connection conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/db_information", "root","");
            Statement sql_statement =conn.createStatement();


            ResultSet results = sql_statement.executeQuery( "select *from tb_users");

            while (results.next()){
                ArrayList<String> data = new ArrayList<String >();
                data.add(results.getString("adm"));
                data.add(results.getString("name"));
                data.add(results.getString("age"));
                data.add(results.getString("email"));
                System.out.println(
                        "\nAdmission Number:" +data.get(0)+
                                "\nName " +data.get(1)
                                +"\nAge: " +data.get(2)
                                +"\nEmail: " +data.get(3)
                                + "\n\n");
            }
        }catch (Exception e){
            e.printStackTrace();
        }

        System.out.println("\nPlease confirm these are your details before proceeding\n\n");
        Scanner scanner = new Scanner(System.in);
        Welcome welcome=()-> System.out.println("Welcome to The Peter test to determine your IQ level in terms of grades." +
                "\n\n You will be asked various questions partaining to sciences." +
                " Register carefully and you will receive your grade afterwards"); ;

        System.out.println("Please take your time to answer the following questions carefully with either A,B,C or D.\nYou " +
                "will be presented with you grade after the test. Test will begin in 3....2....1..... \n\n");

        Countdown countdown = new Countdown();
        countdown.test_timer();


    }
}
