package com.hCueLite.Kiosk.rest;

import com.hCueLite.Kiosk.Utils.ApplicationConstants;
import com.hCueLite.Kiosk.Utils.Constants;
import com.squareup.okhttp.OkHttpClient;

import java.util.concurrent.TimeUnit;

import retrofit.RequestInterceptor;
import retrofit.RestAdapter;
import retrofit.client.OkClient;

/**
 * Created by cvluser on 27-07-2015.
 */
public class RestClient {
    private static WebAPI webAPI;
    //private static final String BASE_URL = "http://staging.covalense.net:86";
    private static final String BASE_URL = Constants.BASE_URL;

    static {
        setupRestClient();
    }

    //
    private RestClient() {
    }

    /**
     * Method to create and return web api
     *
     * @return
     */
    public static WebAPI getAPI() {
        return webAPI;
    }

    /*
    creating the rest adapter with required configuration
     */
    private static void setupRestClient() {
        //OkHttpClient configuration
        // OkHttpClient okHttpClient= App.getInstance().getMyHttpClient();
        OkHttpClient okHttpClient = new OkHttpClient();
        okHttpClient.setConnectTimeout(ApplicationConstants.CONNECTION_TIME_OUT, TimeUnit.MILLISECONDS);
        okHttpClient.setWriteTimeout(ApplicationConstants.WRITE_TIME_OUT, TimeUnit.MILLISECONDS);
        okHttpClient.setReadTimeout(ApplicationConstants.READ_TIME_OUT, TimeUnit.MILLISECONDS);

        RestAdapter.Builder builder = new RestAdapter.Builder();
        builder.setEndpoint(BASE_URL);
        builder.setLogLevel(RestAdapter.LogLevel.FULL);
        builder.setClient(new OkClient(okHttpClient));
       /* builder.setRequestInterceptor(new RequestInterceptor() {
            @Override
            public void intercept(RequestFacade request) {
                String bearerToken = ShPrefManager.with(App.getInstance()).getBearerToken();
                request.addHeader("Authorization", "Bearer "+ bearerToken);
            }
        });*/

        RestAdapter restAdapter = builder.build();
        webAPI = restAdapter.create(WebAPI.class);
    }
}
