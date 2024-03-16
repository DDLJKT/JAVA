import java.awt.*;
import java.io.*;

public class DisplayTable extends Frame {
    public DisplayTable() {
        try {
            FileReader fileReader = new FileReader("Table.txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            // Read the header line
            String headerLine = bufferedReader.readLine();
            String[] headers = headerLine.split(",");

            // Create GridLayout with rows+1 and columns
            setLayout(new GridLayout(0, headers.length));

            // Add headers
            for (String header : headers) {
                add(new Label(header));
            }

            // Read and add rows
            String rowLine;
            while ((rowLine = bufferedReader.readLine()) != null) {
                String[] row = rowLine.split(",");
                for (String cell : row) {
                    add(new Label(cell));
                }
            }

            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        setTitle("Table Display");
        setSize(400, 300);
        setVisible(true);
    }

    public static void main(String[] args) {
        new DisplayTable();
    }
}
