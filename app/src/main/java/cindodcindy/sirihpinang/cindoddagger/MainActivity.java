package cindodcindy.sirihpinang.cindoddagger;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity  implements  Buah{

    public Button button_getBuah;

    public TextView textView_getBuah;

    @Inject
    Anggur anggur;

    @Inject
    Apel apel;

    @Inject
    Jeruk jeruk;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button_getBuah=findViewById(R.id.btn_buah);
        textView_getBuah=findViewById(R.id.tv_buah);



        button_getBuah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inject(MainActivity.this);

            }
        });
    }

    @Override
    public void inject(MainActivity context) {
        String getBuah= apel.getApel() + anggur.getAnggur() + jeruk.getJeruk() ;
        textView_getBuah.setText(getBuah);
    }
}
