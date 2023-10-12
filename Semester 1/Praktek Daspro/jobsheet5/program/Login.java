import java.util.Scanner;

public class Login {

    public static void main(String[] args) {
        String defUser = "admin", defPass = "admin";
        String user, pass;
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan username: ");
        user = input.nextLine();
        System.out.print("Masukkan password: ");
        pass = input.nextLine();

        if (user.equals(defUser) && pass.equals(defPass)){
            System.out.println("Login berhasil");
        }else{
        
            System.out.println("Username atau password salah");
        }


        input.close();
    }
    
}
