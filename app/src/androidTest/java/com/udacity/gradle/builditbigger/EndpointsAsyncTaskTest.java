package com.udacity.gradle.builditbigger;

import org.junit.Test;

import java.util.concurrent.TimeUnit;

import static junit.framework.Assert.assertNotNull;
import static junit.framework.Assert.assertTrue;

/**
 * Created by Peter Stone on 31/01/2017.
 */
public class EndpointsAsyncTaskTest {

    private OnTaskCompleted onTaskCompleted = new OnTaskCompleted() {
        @Override
        public void onTaskCompleted(String result) {

        }
    };
    private EndpointsAsyncTask as = new EndpointsAsyncTask(onTaskCompleted);

    @Test
    public void AsyncTaskTesting() throws Exception{
        as.execute();
        String jokeResult = as.get(30, TimeUnit.SECONDS);
        assertNotNull(jokeResult);
        assertTrue("No Joke", jokeResult.length()>0);
    }

//    @Test
//    public void doInBackground() throws Exception {
//
//    }
//
//    @Test
//    public void onPostExecute() throws Exception {
//
//    }

}