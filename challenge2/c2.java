import java.util.*;
import java.io.*;

class c2
{
	public static boolean validate(String in)
	{
		char[] input = in.toCharArray();
		boolean output = true;
		Stack<Character> open = new Stack<Character>();
		if(input.length%2 == 0)
		{
			for(int i = 0; i < input.length; i++)
			{
				if(input[i] == '(' || input[i] == '[' || input[i] == '{')
				{
					open.push(input[i]);
				}
				else if(input[i] == ')' || input[i] == ']' || input[i] == '}')
				{
					if(open.isEmpty())
					{
						output = false;
					}
					else
					{
						switch(input[i])
						{
							case ')':
								if(open.pop() != '(')
								{
									output = false;
								}
								break;
							case ']':
								if(open.pop() != '[')
								{
									output = false;
								}
								break;
							case '}':
								if(open.pop() != '{')
								{
									output = false;
								}
								break;
						}
					}
				}
				else
				{
					output = false;
					System.out.println("ERROR: Invalid string input!!");
				}
			}
		}
		else
		{
			System.out.println("test2");
			output = false;
		}
		return output;
	}

	public static void main(String args[])
	{
		String input;
		boolean output;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter string: ");
		input = sc.nextLine();
		output = validate(input);
		System.out.println("Validation of input string '"+input+"': "+output);
	}
}
