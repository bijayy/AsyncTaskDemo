package com.onlinenepalese.asynctaskdemo

import android.os.AsyncTask
import com.onlinenepalese.asynctaskdemo.R.id.textView
import kotlinx.android.synthetic.main.activity_main.*

/**
 * Created by Bijay on 3/24/2018.
 */
class FirstAsyncTask: AsyncTask<Unit, Int, Unit>() {

	override fun doInBackground(vararg params: Unit?) {
		val coutner = 0
		while (coutner < 10)
		{
			Thread.sleep(1000)
			publishProgress(coutner)
		}
	}

	override fun onProgressUpdate(vararg values: Int?) {
		super.onProgressUpdate(*values)
	}
}