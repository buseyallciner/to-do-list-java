public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> tasks = new ArrayList<>();

        System.out.println("-- To-Do --");

        while (true) {
            System.out.println("\n1) Add");
            System.out.println("2) List");
            System.out.println("3) Remove");
            System.out.println("0) Exit");
            System.out.print("Choose: ");

            if (!sc.hasNextInt()) {
                System.out.println("Please enter a number.");
                sc.nextLine();
                continue;
            }
            int choice = sc.nextInt();
            sc.nextLine(); 

            switch (choice) {
                case 1:
                    System.out.print("Task: ");
                    String t = sc.nextLine();
                    if (t.trim().isEmpty()) {
                        System.out.println("Nothing to add.");
                    } else {
                        tasks.add(t.trim());
                        System.out.println("Added.");
                    }
                    break;

                case 2:
                    if (tasks.isEmpty()) {
                        System.out.println("(empty)");
                    } else {
                        for (int i = 0; i < tasks.size(); i++) {
                            System.out.println((i + 1) + ") " + tasks.get(i));
                        }
                    }
                    break;

                case 3:
                    if (tasks.isEmpty()) {
                        System.out.println("Nothing to remove.");
                        break;
                    }
                    System.out.print("Number to remove: ");
                    if (!sc.hasNextInt()) {
                        System.out.println("Not a number.");
                        sc.nextLine();
                        break;
                    }
                    int idx = sc.nextInt();
                    sc.nextLine();
                    if (idx < 1 || idx > tasks.size()) {
                        System.out.println("Out of range.");
                    } else {
                        tasks.remove(idx - 1);
                        System.out.println("Removed.");
                    }
                    break;

                case 0:
                    System.out.println("Bye.");
                    return;

                default:
                    System.out.println("No such option.");
            }
        }
    }
}

