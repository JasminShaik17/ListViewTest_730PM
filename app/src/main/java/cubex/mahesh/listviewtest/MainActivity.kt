package cubex.mahesh.listviewtest

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import java.io.File

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var lview:ListView = findViewById(R.id.lview)
        var path = "/storage/emulated/0/"
        var f = File(path)
        if(!f.exists()){
            path = "/storage/sdcard0/"
            f = File(path)
        }
       var list =  f.list()
        var myadapter = ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_single_choice,list)
        lview.adapter = myadapter
    }
}
