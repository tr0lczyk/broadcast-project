package android.olczyk.com.broadcastproject;

import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.EActivity;

@EActivity(R.layout.activity_main)
public class MainActivity extends AppCompatActivity {

    ExampleBroadCastReceiver exampleBroadCastReceiver = new ExampleBroadCastReceiver();

    @Override
    protected void onDestroy() {
        super.onDestroy();
        unregisterReceiver(exampleBroadCastReceiver);
    }

    @AfterViews
    public void aVoid(){
        IntentFilter filter = new IntentFilter("android.olczyk.com.broadcastproject.EXAMPLE_ACTION");
        registerReceiver(exampleBroadCastReceiver,filter);
    }
}
