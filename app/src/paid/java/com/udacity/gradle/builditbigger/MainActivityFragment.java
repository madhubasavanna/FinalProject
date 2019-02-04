package com.udacity.gradle.builditbigger;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.content.Intent;

import com.example.displayjokes.DisplayMessageActivity;

public class MainActivityFragment extends Fragment implements EndpointAsyncTask.SendMessage{
    private EndpointAsyncTask.SendMessage sendMessage;

    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
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
