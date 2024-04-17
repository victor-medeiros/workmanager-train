package com.victor.workmanagertrain

import android.content.Context
import android.util.Log
import androidx.work.CoroutineWorker
import androidx.work.WorkerParameters
import kotlinx.coroutines.delay

const val TAG = "SendSimpleMessageWorker"
class SendSimpleMessageWorker(
    private val context: Context,
    private val workerParams: WorkerParameters
): CoroutineWorker(context, workerParams) {

    override suspend fun doWork(): Result {
        delay(3000)
        Log.d(TAG, "Message sent")
        return Result.success()
    }
}