package luis_santiago.com.librarypractica;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import luis.com.mylibrary.MyView;

public class MainActivity extends AppCompatActivity {

    MyView view;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
