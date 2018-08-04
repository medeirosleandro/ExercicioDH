package br.com.leandro.retrofitexercicio2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import br.com.leandro.retrofitexercicio2.Model.Id;
import br.com.leandro.retrofitexercicio2.Model.ModelPojo;
import br.com.leandro.retrofitexercicio2.Model.Result;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "Exibindo";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(ExercicioService.BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();


        ExercicioService service = retrofit.create(ExercicioService.class);

        Call<ModelPojo> requestResult = service.resultCatalog();

        requestResult.enqueue(new Callback<ModelPojo>() {
            @Override
            public void onResponse(Call<ModelPojo> call, Response<ModelPojo> response) {

                if(!response.isSuccessful()){

                    Log.i("TAG","ERRO " + response.code());

                }

                else{

                    //REQUISIÇÃO RETORNOU COM SUCESSO


                    ModelPojo ListaDeResultados = response.body();

                    for(Result r : ListaDeResultados.results){

                        Log.i(TAG, String.format("%s : %s  : %s:",r.getTitle(),r.getYear(),r.getIds()));


                        //Separar um resultado do outro

                        Log.i(TAG,"------------------");


                    }

                }

            }

            @Override
            public void onFailure(Call<ModelPojo> call, Throwable t) {

                Log.e(TAG,"ERRO" + t.getMessage());

            }
        });



    }
}
