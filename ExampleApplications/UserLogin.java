import java.util.Scanner;

public class UserLogin
{
    public static void main(String[] args)
    {
        String user = "patika", password = "1234";

        Scanner input = new Scanner(System.in);

        System.out.println("Kullanıcı adınızı giriniz: ");
        String loginName = input.nextLine();

        System.out.println("Şifrenizi giriniz: ");
        String pw = input.nextLine();

        if(loginName.equals(user) && pw.equals(password))
        {
            System.out.println("Giriş başarılı");
        }
        else
        {
            System.out.println("Şifrenizi sıfırlamak ister misiniz? 1)Evet, 0)Hayır)");

            if (input.hasNextInt())
            {
                int select = input.nextInt();

                if (select == 1)
                {
                    input.nextLine();

                    System.out.println("Yeni şifrenizi giriniz: ");
                    String newPw = input.nextLine();

                    if (newPw.equals(password))
                    {
                        System.out.println("Şifreniz eski şifreniz ile aynı olamaz");
                    } else
                    {
                        password = newPw;
                        System.out.println("Şifreniz oluşturuldu");

                    }
                } else
                {
                    System.out.println("Lütfen 0 veya 1 girin.");

                }

            }

        }

    }
}
