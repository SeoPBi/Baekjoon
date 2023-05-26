import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.util.StringTokenizer;
import java.io.*;

public class b19637 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        String rankName[] = new String[a];
        int rankScore[] = new int[a];
        for (int i = 0; i < a; i++) {
            st = new StringTokenizer(br.readLine());
            rankName[i] = st.nextToken();
            rankScore[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < b; i++) {
            int score = Integer.parseInt(br.readLine());
            if(score <= rankScore[0]) {
                bw.write(rankName[0]  + "\n");
            } else if (score <= rankScore[1]) {
                bw.write(rankName[1]  + "\n");
            } else if (score <= rankScore[2]) {
                bw.write(rankName[2]  + "\n");
            }
        }
        bw.flush();
    }
}
