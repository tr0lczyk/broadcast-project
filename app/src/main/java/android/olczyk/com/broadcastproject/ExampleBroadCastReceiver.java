package android.olczyk.com.broadcastproject;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.widget.Toast;

public class ExampleBroadCastReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        if ("android.olczyk.com.broadcastproject.EXAMPLE_ACTION".equals(intent.getAction())){
            String receivedText =
                    intent.getStringExtra("android.olczyk.com.broadcastproject.EXTRA_TEXT");
            Toast.makeText(context, receivedText, Toast.LENGTH_SHORT).show();
        }
    }
}
