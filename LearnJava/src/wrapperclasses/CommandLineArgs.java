package wrapperclasses;

public class CommandLineArgs {

	public static void main(String[] args) {
		int length = args.length;
		if (length == 0) {
			System.out.println("No arguments provided");
		} else {
			System.out.println("List of arguments");
			for (int i = 0; i < length; i++) {
				System.out.println(args[i]);
			}
		}
	}

}
