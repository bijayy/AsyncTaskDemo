package com.onlinenepalese.asynctaskdemo

import android.os.AsyncTask
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContentView(R.layout.activity_main)
	}

	fun AsyncTaskCall(view: View) {

	}

	fun AnonymousAsuncTask(view: View) {
		val asyncTask = object: AsyncTask<Unit, Int, Unit>() {
			override fun doInBackground(vararg params: Unit?) {
				Log.d("Still Running", "Still Running")
				var counter = 0
				while (counter < 10)
				{
					Thread.sleep(1000)
					publishProgress(counter)
					counter++
				}
			}

			override fun onProgressUpdate(vararg values: Int?) {
				super.onProgressUpdate(*values)
				textView.text = values[0].toString()
			}
		}

		asyncTask.execute()
	}
}
