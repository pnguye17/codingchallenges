package challengequestions;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TagContenExtractor {

    public static void main(String[] args) {
        String sample = "<h1><h1>Sanjay has no watch</h1></h1><par>So wait for a while</par>";
        String HTML_PATTERN = "<(?:\"[^\"]*\"['\"]*|'[^']*'['\"]*|[^'\">])+>";
        Pattern tagPattern = Pattern.compile(HTML_PATTERN);
        Matcher match = tagPattern.matcher(sample);

        if (match.find()){
            String ans = match.group(1);
            System.out.println(ans);
        }
      

        // Scanner in = new Scanner(System.in);
		// int testCases = Integer.parseInt(in.nextLine());
		// while(testCases>0){
		// 	String line = in.nextLine();
        //     String HTML_PATTERN = "<(\"[^\"]*\"|'[^']*'|[^'\">])*>";
        //     Pattern tagPattern = Pattern.compile(HTML_PATTERN);
        //     Matcher match = tagPattern.matcher(line);
        //     while (match.find()) {
        //         System.out.println(match.group(2));
        //     }
		// 	System.out.println("Invalid");
		// 	testCases--;
		// }
        // in.close();
	}

}
