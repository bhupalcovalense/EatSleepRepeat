package com.hCueLite.Kiosk.rest;

import org.jivesoftware.smack.util.StringUtils;

import retrofit.Callback;
import retrofit.RetrofitError;

/**
 * Created by cvluser on 28-07-2015.
 */
public abstract class RestCallback<T> implements Callback<T> {

    public abstract void failure(RestError restError);

    @Override
    public void failure(RetrofitError error) {
        try{
            RestError restError = (RestError) error.getBodyAs(RestError.class);
            if (restError != null &&
                    !(StringUtils.isNullOrEmpty(restError.getError()) &&
                      StringUtils.isNullOrEmpty(restError.getErrorMessage())
                     )
            )
                failure(restError);
            else {
                failure(new RestError(error.getMessage()));
            }
        }
        catch(Exception e)
        {
            String ErrorMessage = e.getMessage();
            if(error != null)
            {
                ErrorMessage = !"".equalsIgnoreCase(error.getMessage()) ? error.getMessage() : e.getMessage();
            }
            failure(new RestError(ErrorMessage));
        }
    }
}
