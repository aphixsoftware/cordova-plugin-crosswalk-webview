
package org.crosswalk.engine;

import android.content.Context;
import android.webkit.ValueCallback;
import android.view.View;

import org.apache.cordova.CordovaBridge;
import org.apache.cordova.CordovaInterface;
import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CordovaPreferences;
import org.apache.cordova.CordovaResourceApi;
import org.apache.cordova.CordovaWebView;
import org.apache.cordova.CordovaWebViewEngine;
import org.apache.cordova.ICordovaCookieManager;
import org.apache.cordova.NativeToJsMessageQueue;
import org.apache.cordova.PluginEntry;
import org.apache.cordova.PluginManager;
import org.apache.cordova.engine.SystemWebViewEngine;

public class EngineWrapper implements CordovaWebViewEngine {

    CordovaWebViewEngine engine;

    public EngineWrapper(Context context, CordovaPreferences preferences) {
        engine = new SystemWebViewEngine(context, preferences);
    }

    @Override
    public void init(CordovaWebView parentWebView, CordovaInterface cordova, CordovaWebViewEngine.Client client,
                         CordovaResourceApi resourceApi, PluginManager pluginManager,
                         NativeToJsMessageQueue nativeToJsMessageQueue) {
        engine.init(parentWebView, cordova, client, resourceApi, pluginManager, nativeToJsMessageQueue);
    }

    public void evaluateJavascript(String js, ValueCallback<String> callback) {
        engine.evaluateJavascript(js, callback);
    }

    @Override
    public void destroy() {
        engine.destroy();
    }

    @Override
    public void setPaused(boolean value) {
        engine.setPaused(value);
    }

    @Override
    public boolean goBack() {
        return engine.goBack();
    }

    @Override
    public boolean canGoBack() {
        return engine.canGoBack();
    }

    @Override
    public void clearHistory() {
        engine.clearHistory();
    }

    @Override
    public void clearCache() {
        engine.clearCache();
    }

    @Override
    public String getUrl() {
        return engine.getUrl();
    }

    @Override
    public ICordovaCookieManager getCookieManager() {
        return engine.getCookieManager();
    }

    @Override
    public void loadUrl(String url, boolean clearNavigationStack) {
        engine.loadUrl(url, clearNavigationStack);
    }

    @Override
    public void stopLoading() {
        engine.stopLoading();
    }

    @Override
    public CordovaWebView getCordovaWebView() {
        return engine.getCordovaWebView();
    }

    @Override
    public View getView() {
        return engine.getView();
    }
}
