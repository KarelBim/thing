import uk.Zvire;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class zahrada {
    public static void vypsat(ArrayList<int[]> l){
        for(int[] s : l){
            for(int i : s){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
    public int getCisla(HashMap<Integer,ArrayList<int[]>> vrcholy){
        int nejmensi = Integer.MIN_VALUE;
        for(int k : vrcholy.keySet()){
            for(int[] i : vrcholy.get(k)){

            }
        }
    }
    public static void main(String[] args) throws IOException {
        HashMap<Integer,ArrayList<int[]>> vrcholy = new HashMap<>();
        Reader sc = new Reader();
        int pocet= sc.nextInt();

        for(int i = 0; i < pocet-1; i++){
            int vrchol1 = sc.nextInt();
            int vrchol2 = sc.nextInt();
            int hrana = sc.nextInt();
            if(vrchol1 > vrchol2){
                int pomoc = vrchol2;
                vrchol2 = vrchol1;
                vrchol1 = pomoc;
            }
            if(!vrcholy.containsKey(vrchol1)){
                vrcholy.put(vrchol1,new ArrayList<>());
                vrcholy.get(vrchol1).add(new int[]{vrchol2,hrana});
            }
            else{
                vrcholy.get(vrchol1).add(new int[]{vrchol2,hrana});
            }
        }
        for(int key : vrcholy.keySet()){
            System.out.println(key);
            vypsat(vrcholy.get(key));
            System.out.println();
        }
    }
    static class Reader {
        private final int BUFFER_SIZE = 1 << 16;
        private DataInputStream din;
        private byte[] buffer;
        private int bufferPointer, bytesRead;

        public Reader() {
            din = new DataInputStream(System.in);
            buffer = new byte[BUFFER_SIZE];
            bufferPointer = bytesRead = 0;
        }

        // Reads the next integer from input
        public int nextInt() throws IOException {
            int ret = 0;
            byte c = read();
            while (c <= ' ') {
                c = read();
            }
            boolean neg = (c == '-');
            if (neg) c = read();
            do {
                ret = ret * 10 + c - '0';
            } while ((c = read()) >= '0' && c <= '9');
            return neg ? -ret : ret;
        }

        // Reads the next byte from the buffer
        private byte read() throws IOException {
            if (bufferPointer == bytesRead) fillBuffer();
            return buffer[bufferPointer++];
        }

        // Fills the buffer with new data
        private void fillBuffer() throws IOException {
            bytesRead = din.read(buffer, bufferPointer = 0, BUFFER_SIZE);
            if (bytesRead == -1) buffer[0] = -1;
        }
    }
}