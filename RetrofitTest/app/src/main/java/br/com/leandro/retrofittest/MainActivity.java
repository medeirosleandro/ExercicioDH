package br.com.leandro.retrofittest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import br.com.leandro.retrofittest.models.PrimeiroNivelJson;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    private String TAG = "SILVIO MÀ OE!!!";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(VitinhoService.BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();


        VitinhoService service = retrofit.create(VitinhoService.class);
        Call<PrimeiroNivelJson> requestPrimeiroNivel = service.listVictorApi();

        requestPrimeiroNivel.enqueue(new Callback<PrimeiroNivelJson>() {
            @Override
            public void onResponse(Call<PrimeiroNivelJson> call, Response<PrimeiroNivelJson> response) {


                    Log.i("TAG", "AGORA FOI!!!" + response.code());


            }

            @Override
            public void onFailure(Call<PrimeiroNivelJson> call, Throwable t) {

                Log.e(TAG, "ERRO NA CHAMADA "+ t.getMessage() );

            }
        });
    }
}
