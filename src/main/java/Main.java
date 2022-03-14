import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ilu użytkownikow chcesz dodać?");
            int numberOfNewAccount = scanner.nextInt();
                    Account tableOfNewAccounts[]= new Account[numberOfNewAccount];
                    for (int i= 0;i <tableOfNewAccounts.length;i++){
                        tableOfNewAccounts[i]= new Account();
                        tableOfNewAccounts[i].oupenAccount();
                    }
    }
}

//        Account user2 = new Account();
//        user2.oupenAccount();
//        user2.showAccount();
//    }
//}
//Account user1 = new Account(101, "Jan","Kowalski", 10000);
//        System.out.println(user1.getAccountNo());
//        user2.setAccountNo(102);
//        System.out.println(user2.getAccountNo());
//    }
//}
