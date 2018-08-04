package br.com.leandro.retrofitexercicio2;

import br.com.leandro.retrofitexercicio2.Model.ModelPojo;
import retrofit2.Call;
import retrofit2.http.GET;

public interface ExercicioService {


    public static final String BASE_URL = "https://api.myjson.com/bins/";

    @GET("4sblo")
    Call<ModelPojo> resultCatalog();


}
