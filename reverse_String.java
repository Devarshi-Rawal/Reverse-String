import java.util.*;
public class reverse_String
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
		System.out.println(sb);
	}
}