import java.util.Scanner;

public class WeekPlanner
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        String[][] schedule = new String[7][2];

        schedule[0][0] = "Sunday";
        schedule[0][1] = "do homework";

        schedule[1][0] = "Monday";
        schedule[1][1] = "go to courses; watch a film";

        schedule[2][0] = "Tuesday";
        schedule[2][1] = "go to the gym";

        schedule[3][0] = "Wednesday";
        schedule[3][1] = "attend a meeting";

        schedule[4][0] = "Thursday";
        schedule[4][1] = "read a book";

        schedule[5][0] = "Friday";
        schedule[5][1] = "go out with friends";

        schedule[6][0] = "Saturday";
        schedule[6][1] = "relax and enjoy";

        while (true)
        {
            System.out.println("Please, input the day of the week (or type 'exit' to quit): ");
            String input = scanner.nextLine().trim().toLowerCase();

            if (input.equals("exit"))
            {
                System.out.println("Exiting the planner. Have a great day!");
                break;
            }

            boolean validDay = false;

            if (input.startsWith("change ") || input.startsWith("reschedule "))
            {
                String dayToChange = input.substring(input.indexOf(" ") + 1).trim();
                for (int i = 0; i < schedule.length; i++)
                {
                    if (schedule[i][0].equalsIgnoreCase(dayToChange))
                    {
                        System.out.println("Please, input new tasks for " + schedule[i][0] + ": ");
                        schedule[i][1] = scanner.nextLine();
                        System.out.println("Tasks updated successfully!");
                        validDay = true;
                        break;
                    }
                }
                if (!validDay)
                {
                    System.out.println("Sorry, I don't understand you, please try again.");
                }
                continue; // Move to next iteration
            }

            for(int i = 0; i < schedule.length; i++)
            {
                if (schedule[i][0].equalsIgnoreCase(input))
                {
                    System.out.println("Your tasks for " + schedule[i][0] + ": " + schedule[i][1]);
                    validDay = true;
                    break;
                }
            }

            if (!validDay)
            {
                System.out.println("Sorry, I don't understand you, please try again.");
            }
        }

        scanner.close();
    }
}
