package adminstats.instavans.com.playwithjenkins;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView disp;
    String varFromJenkins;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        disp = (TextView) findViewById(R.id.display);

        if(System.getProperty("ENV")!=null){
            varFromJenkins = System.getProperty("ENV");
        } else {
            varFromJenkins = System.getProperty("SPARTA");
        }
        disp.setText("This is" + varFromJenkins);
    }
}
