package br.com.leandro.retrofittest;

import br.com.leandro.retrofittest.models.PrimeiroNivelJson;
import retrofit2.Call;
import retrofit2.http.GET;

public interface VitinhoService {

    public  static final String BASE_URL = "http://www.mocky.io/v2/";

    @GET("5185415ba171ea3a00704eed")

    Call<PrimeiroNivelJson> listVictorApi();

}
