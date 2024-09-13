import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

public class UIConsoleInput {
    //fields
    PrintWriter stdout = null;
    BufferedReader stdin = null;
    AddUseCaseControl addControl = null;

    UIConsoleInput(){
      stdout = new PrintWriter(new BufferedWriter
      (new OutputStreamWriter(System.out)), true);

      stdin = new BufferedReader(new InputStreamReader(System.in));
    }

    public void input() throws IOException{
        RequestData requestData = new RequestData();
        stdout.print("Input number 1:");
        stdout.flush();
        requestData.number1 = stdin.readLine();
        stdout.print("Input number 2:");
        stdout.flush();
        requestData.number2 = stdin.readLine();

        addControl.execute(requestData);

    }

}
