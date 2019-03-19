package com.rtstudio.frases;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private TextView messager;
    private Button button;

    private String[] frases = {
            "Sua luta não termina quando sentir cansaço, mas sim quando atingir o sucesso tão merecido.",
            "Você não só tem o direito de ser feliz como também tem a obrigação de lutar para alcançar a felicidade.",
            "Não perca a motivação só porque as coisas não estão correndo como o previsto. Adversidade gera sabedoria e é isso que levará você ao sucesso.",
            "As pessoas dizem frequentemente que a motivação não dura. Bem, nem o banho - e é por isso que ele é recomendado diariamente.\n" +
                    "- Zig Ziglar",
            "A motivação não acontece por acaso, como tudo na vida você tem de batalhar para a alcançar.",
            "Toda ação humana, quer se torne positiva ou negativa, precisa depender de motivação.\n" +
                    "- Dalai Lama",
            "Assim como os pássaros, precisamos aprender a superar os desafios que nos são apresentados, para alçarmos voos mais altos.\n" +
                    "- Dirk Wolter",
            "Sonhos existem para serem realizados, por isso não olhe para trás nem escute palavras de desânimo!",
            "A vida tanto lhe pode dar o melhor como o pior, mas é você quem escolhe aquilo que vai permanecer ou ficar para trás.",
            "O poder está dentro de você, na sua mente, pois se acreditar que consegue não haverá obstáculo capaz de impedir o seu sucesso.",
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        messager = findViewById(R.id.MessagerId);
        button = findViewById(R.id.ButtomId);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Random random = new Random();
                messager.setText(frases[random.nextInt(frases.length)]);
            }
        });
    }
}
