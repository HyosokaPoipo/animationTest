package hisoka.poipo.com.animation;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final TextView satu = (TextView) findViewById(R.id.tv1);
        Button button1 = (Button) findViewById(R.id.bt1);
        final Animation a = AnimationUtils.loadAnimation(this, R.anim.alpha);
        a.reset();


        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                satu.startAnimation(a);
            }
        });

    }
}
