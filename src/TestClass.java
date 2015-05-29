import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * Created by abhinnag on 5/20/2015.
 */
public class TestClass {
    public static void main(String[] args) throws IOException {
        // Data Collection code

        //collecting number of testcases

        BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(bfr.readLine());

        while(T>0 && T<=10)
        {
            {
                String[] boy_girl_count = bfr.readLine().split(" ");

                //int M = Integer.parseInt(boy_girl_count[0]); // Boy Count

                //int N = Integer.parseInt(boy_girl_count[1]); // Girl Count

                String[] boy_height = bfr.readLine().split(" ");

                String[] girl_height = bfr.readLine().split(" ");

                Arrays.sort(boy_height);
                Arrays.sort(girl_height);
                Boolean flag = true;
                int i = 0;
                while(i < boy_height.length)
                {
                    for(int j = 0;j<girl_height.length;j++)
                    {
                        if(Integer.parseInt(girl_height[j]) < Integer.parseInt(boy_height[i]))
                        {
                            continue;
                        }
                        else
                        {
                            flag = false;
                            break;
                        }
                    }
                }
                if(flag)
                {
                    System.out.println("YES");
                }
            }
            T--;
        }
    }
}

