package hisoka.poipo.com.animation;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Context ctx;
    Animation a;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ctx = this;
        final TextView satu = (TextView) findViewById(R.id.tv1);
        Button button1 = (Button) findViewById(R.id.bt1);
        Button button2  = (Button) findViewById(R.id.bt2);

        a = AnimationUtils.loadAnimation(this, R.anim.alpha);
        a.reset();


        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                satu.startAnimation(a);
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a = AnimationUtils.loadAnimation(ctx, R.anim.rotate);
                a.reset();
                satu.startAnimation(a);
            }
        });
    }
}
