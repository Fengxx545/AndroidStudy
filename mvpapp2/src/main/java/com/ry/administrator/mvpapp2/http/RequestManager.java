package com.ry.administrator.mvpapp2.http;

import android.content.Context;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.Volley;
import com.ry.administrator.mvpapp2.MyApp;

import java.util.HashMap;
import java.util.Map;

public class RequestManager<T> {

    private RequestQueue queue;
    private static volatile RequestManager instance;
    private Context mContext;

    public void init(Context context) {
        mContext = context;
    }

    public static RequestManager getInstance() {
        if (instance == null) {
            synchronized (RequestManager.class) {
                if (instance == null) {
                    instance = new RequestManager();

                }
            }
        }
        return instance;
    }

    public RequestQueue getRequestQueue() {
        if (queue == null) {
            queue = Volley.newRequestQueue(mContext);
        }
        return queue;
    }

    public void sendGet(String url, Class<T> clazz, final NetListener<T> listener) {


        MyRequest<T> request = new MyRequest<T>(Request.Method.GET, url, clazz, new Response.Listener<T>() {
            @Override
            public void onResponse(T response) {
                listener.onSuccess(response);
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                listener.onError(error.getMessage());
            }
        });
        addToRequestQueue(request);
    }

    public <T> void sendPost(String url, Class<T> clazz, final HashMap<String, String> map, final NetListener<T> listener) {

        MyRequest<T> request = new MyRequest<T>(Request.Method.POST, url, clazz, new Response.Listener<T>() {
            @Override
            public void onResponse(T response) {
                listener.onSuccess(response);
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                listener.onError(error.getMessage());
            }
        }) {
            @Override
            protected Map<String, String> getParams() throws AuthFailureError {
                return map;
            }
        };

        addToRequestQueue(request);
    }

    public <T> void addToRequestQueue(Request<T> req) {
        getRequestQueue().add(req);
    }

}
