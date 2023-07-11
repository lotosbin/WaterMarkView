package me.aurelion.x.ui.view.watermark.demo.activity

import android.os.Bundle
import android.view.View
import me.aurelion.x.ui.view.watermark.WaterMarkManager
import me.aurelion.x.ui.view.watermark.demo.R
import me.aurelion.x.ui.view.watermark.demo.base.BaseActivity

/**
 * @author Leon (wshk729@163.com)
 * @date 2018/8/27
 *
 *
 */
class MainActivity : BaseActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewById<View>(R.id.btn1).setOnClickListener(this)
        findViewById<View>(R.id.btn2).setOnClickListener(this)
        findViewById<View>(R.id.btn3).setOnClickListener(this)
        findViewById<View>(R.id.btn4).setOnClickListener(this)
        findViewById<View>(R.id.btn5).setOnClickListener(this)
    }

    override fun onClick(view: View) {
        when (view.id) {
            R.id.btn1 -> WaterMarkManager.setText("哈哈哈", "哈哈哈哈", "哈哈哈哈哈")
            R.id.btn2 -> WaterMarkManager.setText("嘿嘿嘿", "嘿嘿嘿嘿", "嘿嘿嘿嘿嘿")
            R.id.btn3 -> WaterMarkManager.setText("")
            R.id.btn4 -> SyncActivity.start(this)
            R.id.btn5 -> NoSyncActivity.start(this)
            else -> {}
        }
    }
}
