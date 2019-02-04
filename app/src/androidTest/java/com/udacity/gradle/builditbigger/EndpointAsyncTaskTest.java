package com.udacity.gradle.builditbigger;

import org.junit.Test;

import java.util.concurrent.ExecutionException;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

public class EndpointAsyncTaskTest implements EndpointAsyncTask.SendMessage
{
    @Test
    public void testGetJokeTask() throws ExecutionException, InterruptedException {
        EndpointAsyncTask testJoke = new EndpointAsyncTask(this);
        testJoke.execute();
        String joke = testJoke.get();
        assertNull(joke);
    }

    @Override
    public void sendmessage(String res) {
        //Toast.makeText(this, res, Toast.LENGTH_LONG).show();
    }
}

