
import java.util.Scanner;

public class profiling {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int max = 100;
        int i = 0;

        String[] names = new String[max];
        String[] email = new String[max];
        String[] password = new String[max];
        String[] contact = new String[max];
        String[] age = new String[max];

        boolean profile = true;
        pro:
        while (profile) {
            System.out.println("-----------------------------------------------------------------------------------------");
            System.out.println("ENTER A PROFILE?");
            System.out.println("1. Yes");
            System.out.println("2. No");
            int q = sc.nextInt();
            switch (q) {
                case 1:
                    break;

                case 2:
                    System.out.println("THANK YOU");
                    System.out.println("\n\n\n");
                    System.out.println("DO YOU WANT TO ADD MORE PROFILES");
                    System.out.println("1. Yes");
                    System.out.println("2. No");
                    String yn = sc.next();
                    switch (yn) {
                        case "1":
                            continue pro;

                        case "2":
                            System.exit(0);
                    }

            }

            boolean hex = true;
            int u = 1;
            hex:
            while (hex) {

                System.out.println("Enter profile number " + u);
                System.out.print("Enter Name: ");
                sc.nextLine();
                names[i] = sc.nextLine();
                System.out.print("Enter Email:");
                email[i] = sc.nextLine();
                System.out.print("Enter Password:");
                password[i] = sc.nextLine();
                System.out.print("Enter Age:");
                age[i] = sc.nextLine();
                System.out.print("Enter contact number:");
                contact[i] = sc.nextLine();

                i++;

                System.out.println("\n\n");
                System.out.println("DO YOU WANT TO ADD MORE?");
                System.out.println("1. ADD PROFILE");
                System.out.println("2. NO.");
                String add = sc.next();
                switch (add) {
                    case "1":
                        u++;

                        continue hex;
                    case "2":
                        System.out.println("---------------------------------------------------------------------------------");

                        break;

                }
                break;

            }
            System.out.println("\n\n");
            boolean gg = true;
            QUERY:
            while (gg) {
                System.out.println("------------------------------------------------------------------------------------------");
                System.out.println("MENU");
                System.out.println("1. SEARCH PROFILES");
                System.out.println("2. EDIT PROFILES");
                System.out.println("3. ADD PROFILES");
                System.out.println("4. SHOW ALL PROFILES");
                System.out.println("5. EXIT");
                int w = sc.nextInt();
                switch (w) {
                    case 1:
                        System.out.println("ENTER THE NAME YOU WANT TO SEARCH");
                        sc.nextLine();
                        String www = sc.nextLine();
                        for (int qwe = 0; qwe < names.length; qwe++) {

                            if (www.equals(names[qwe])) {

                                while (www.equals(names[qwe])) {
                                    System.out.println("---------------------------------------------------------");
                                    System.out.println("Name: " + names[qwe]);
                                    System.out.println("Email: " + email[qwe]);
                                    System.out.println("Age: " + age[qwe]);
                                    System.out.println("Contact Number: " + contact[qwe]);
                                    System.out.println("---------------------------------------------------------");
                                    qwe++;
                                }
                                continue QUERY;

                            }

                        }
                        System.out.println("PROFILE NOT FOUND!!");
                        continue QUERY;

                    case 2:
                        int ggg = 0;
                        for (int z = 1; z <= i; z++) {
                            System.out.println("Select " + ggg + " to edit profile " + z + ". " + names[ggg]);
                            ggg++;
                        }
                        int yy = sc.nextInt();

                        System.out.println("Name: " + names[yy]);
                        System.out.println("Email: " + email[yy]);
                        System.out.println("Password: " + password[yy]);
                        System.out.println("Age: " + age[yy]);
                        System.out.println("Contact: " + contact[yy]);
                        System.out.println("---------------------------------------------------------------------------------");
                        System.out.println("\n");
                        System.out.println("ENTER DATA");
                        System.out.print("Enter Name: ");
                        sc.nextLine();
                        names[yy] = sc.nextLine();
                        System.out.print("Enter Email: ");
                        email[yy] = sc.nextLine();
                        System.out.print("Enter Password: ");
                        password[yy] = sc.nextLine();
                        System.out.print("Enter Age: ");
                        age[yy] = sc.nextLine();
                        System.out.print("Enter contact number: ");

                        contact[yy] = sc.nextLine();
                        System.out.println("PROFILE UPDATEDS");
                        continue QUERY;

                    case 3:
                        true1:
                        while (true) {

                            u++;

                            System.out.println("Enter profile # " + u);
                            System.out.print("Enter Name: ");
                            sc.nextLine();
                            names[i] = sc.nextLine();
                            System.out.print("Enter Email: ");
                            email[i] = sc.nextLine();
                            System.out.print("Enter Password: ");
                            password[i] = sc.nextLine();
                            System.out.print("Enter Age: ");
                            age[i] = sc.nextLine();
                            System.out.print("Enter contact number: ");
                            sc.nextLine();
                            contact[i] = sc.nextLine();
                            i++;
                            System.out.println("\n\n");
                            System.out.println("Do you wish to add more?");
                            System.out.println("1. Add profile.");
                            System.out.println("2. No.");
                            String add = sc.next();
                            switch (add) {
                                case "1":
                                    u++;

                                    continue true1;
                                case "2":
                                    continue QUERY;

                            }
                        }
                    case 5:
                        System.out.println("THANK YOU");
                        System.out.println("\n\n\n");
                        System.out.println("DO YOU WANT TO USE THE PROGRAM?");
                        System.out.println("1. Yes");
                        System.out.println("2. No");
                        String yyn = sc.next();
                        switch (yyn) {
                            case "1":
                                continue pro;

                            case "2":
                                System.exit(0);

                        }
                    case 4:
                        for (int qqq = 0; qqq < u; qqq++) {
                            System.out.println("-------------------------------------------------------------------");
                            System.out.println("Name: " + names[qqq]);
                            System.out.println("Email: " + email[qqq]);
                            System.out.println("Password: " + password[qqq]);
                            System.out.println("Age: " + age[qqq]);
                            System.out.println("Contact number: " + contact[qqq]);
                            System.out.println("-------------------------------------------------------------------");

                        }
                        continue QUERY;

                }

            }

        }

    }

}
