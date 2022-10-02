package com.example.android.hilt.data

/**
 * Logger 接口，用于统一管理 Log
 */
interface LoggerDataSource {
    fun addLog(msg: String)
    fun getAllLogs(callback: (List<Log>) -> Unit)
    fun removeLogs()
}