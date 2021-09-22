package CommandLineArguments;

public class CmdArg {
    public static void main(String[] args) {
        System.out.println("Your first argument is: " + args[0]);
        System.out.println("Your second argument is: " + args[1]);
    }
}

// Run: java CmdArg Good morning

// Output:
// Your first argument is: Good
// Your second argument is: morning
