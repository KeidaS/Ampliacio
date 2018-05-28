package recu2017;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.Iterator;

public class LinesIterator implements Iterator<String> {
    private BufferedReader bufferedReader;
    private String next;


    public LinesIterator(BufferedReader bufferedReader) {
        this.bufferedReader = bufferedReader;
        try {
            next = bufferedReader.readLine();
        } catch (IOException e) {
            next = null;
        }
    }

    @Override
    public boolean hasNext() {
        if (next == null) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public String next() {
        try {
            String aux = next;
            next = bufferedReader.readLine();
            return aux;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}
