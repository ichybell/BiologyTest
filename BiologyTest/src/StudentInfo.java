import java.sql.*;
import java.util.Scanner;

public class StudentInfo {
    public static void AddInfo(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your admission number");
        String adm = scanner.nextLine();
        System.out.println("Enter your full name");
        String name= scanner.nextLine();
        System.out.println("Enter your age");
        String age = scanner.nextLine();
        System.out.println("Enter your email");
        String email = scanner.nextLine();
        try {
            Connection conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/db_information", "root","");

            String insert = "INSERT INTO tb_users(adm,name,age,email)"+
                    "VALUES(?,?,?,?)";
            PreparedStatement preparedStatement = conn.prepareStatement(insert);
            preparedStatement.setString(1, adm);
            preparedStatement.setString(2, name);
            preparedStatement.setString(3,age);
            preparedStatement.setString(4, email);

            preparedStatement.executeUpdate();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
