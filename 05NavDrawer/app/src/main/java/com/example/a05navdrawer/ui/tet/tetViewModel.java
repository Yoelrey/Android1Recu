package com.example.a05navdrawer.ui.tet;

import android.webkit.WebView;
import android.webkit.WebViewClient;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class tetViewModel extends ViewModel {
    // TODO: Implement the ViewModel

    private final MutableLiveData<String> mText;


    public tetViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("ESTO ES UN Tet Fragment");
    }

    public void loadUrlInWebView(WebView webView, String url) {
        webView.setWebViewClient(new WebViewClient());
        webView.loadUrl(url);
    }


    public LiveData<String> getText() {
        return mText;
    }


}