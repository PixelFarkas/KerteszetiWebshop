package com.example.shop;

import android.os.AsyncTask;
import android.widget.TextView;

import java.lang.ref.WeakReference;

public class GuessAsyncTask extends AsyncTask<Void, Void, String> {

    private final WeakReference<TextView> mTextView;

    GuessAsyncTask(TextView tv) {
        mTextView = new WeakReference<>(tv);
    }

    @Override
    protected String doInBackground(Void... voids) {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return "Bejelentekezés vendégként";
    }

    protected void onPostExecute(String result) {
        mTextView.get().setText(result);
    }
}
