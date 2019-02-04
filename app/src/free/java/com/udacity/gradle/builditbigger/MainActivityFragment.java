package com.udacity.gradle.builditbigger;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.displayjokes.DisplayMessageActivity;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment implements EndpointAsyncTask.SendMessage{
    private EndpointAsyncTask.SendMessage sendMessage;
    private static final String addId = BuildConfig.ADDSENCE_ID;
    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, final ViewGroup container,
                             Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_main, container, false);
        sendMessage = this;
        Button button = root.findViewById(R.id.btn_joke);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new EndpointAsyncTask(sendMessage).execute();
            }
        });

        AdView mAdView = (AdView) root.findViewById(R.id.adView);
        // Create an ad request. Check logcat output for the hashed device ID to
        // get test ads on a physical device. e.g.
        // "Use AdRequest.Builder.addTestDevice("ABCDEF012345") to get test ads on this device."
        AdRequest adRequest = new AdRequest.Builder()
                .addTestDevice(AdRequest.DEVICE_ID_EMULATOR)
                .build();
        mAdView.loadAd(adRequest);
        return root;
    }

    @Override
    public void sendmessage(String res) {
        Intent intent = new Intent(this.getContext(), DisplayMessageActivity.class);
        intent.putExtra("jokeMessage", res);
        startActivity(intent);
        //Toast.makeText(this, res, Toast.LENGTH_LONG).show();
    }
}
