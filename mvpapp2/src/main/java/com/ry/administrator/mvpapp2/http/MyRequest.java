package com.ry.administrator.mvpapp2.http;

import com.android.volley.AuthFailureError;
import com.android.volley.NetworkResponse;
import com.android.volley.ParseError;
import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.HttpHeaderParser;
import com.android.volley.toolbox.Volley;
import com.google.gson.Gson;
import com.ry.administrator.mvpapp2.MyApp;

import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Map;

public class MyRequest<T> extends Request<T> {
    private Gson mGson;
    private Class<T> mClass;
    private Response.Listener<T> mListener;


    /**
     * @param method        Request.Method.GET Request.Method.POST
     * @param url           请求url
     * @param clazz         返回实体类
     * @param listener      请求监听
     * @param errorListener
     */
    public MyRequest(int method, String url, Class<T> clazz,
                     Response.Listener<T> listener, Response.ErrorListener errorListener) {
        super(method, url, errorListener);
        mGson = new Gson();
        mClass = clazz;
        mListener = listener;
    }


    @Override
    protected Response<T> parseNetworkResponse(NetworkResponse response) {

        try {
            String json = new String(response.data, HttpHeaderParser.parseCharset(response.headers));

            return Response.success(mGson.fromJson(json, mClass), HttpHeaderParser.parseCacheHeaders(response));

        } catch (UnsupportedEncodingException e) {
            return Response.error(new ParseError(e));
        }

    }

    @Override
    protected void deliverResponse(T response) {

        mListener.onResponse(response);

    }


}
