package com.example.rxjavatutorial

class OperatorBufferExample2 {
    /*

    private lateinit var txtTapResult : TextView
    private lateinit var txtTapResultMax : TextView
    private lateinit var btnTapArea : Button

    private val disposable: Disposable? = null
    private val unBinder : Binder? = null
    private var maxTaps = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        txtTapResult = findViewById(R.id.tap_result)
        txtTapResultMax = findViewById(R.id.tap_result_max_count)
        btnTapArea = findViewById(R.id.layout_tap_area)

        RxView.clicks(btnTapArea)
            .map {
                1
            }
            .buffer(3 ,TimeUnit.SECONDS)
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe(object : Observer<List<Int>>{
                override fun onSubscribe(d: Disposable) {
                    Log.e("tag" , "on Subscribe : $d")
                }

                @SuppressLint("SetTextI18n")
                override fun onNext(list: List<Int>) {
                    Log.e("tag" , "onNext : ${list.size} taps received")
                    if (list.size > 0) {
                        maxTaps = if(list.size > maxTaps)  list.size else maxTaps
                        txtTapResult.text = "Received ${list.size} taps in 3 seconds"
                        txtTapResultMax.text = "Maximum of $maxTaps taps in 3 seconds"
                    }
                }

                override fun onError(e: Throwable) {
                    Log.e("tag" , "On Error is called : ${e.message}")
                }

                override fun onComplete() {
                    Log.e("tag" , "All items emitted successfully")
                }

            })
    }

    override fun onDestroy() {
        super.onDestroy()
        disposable!!.dispose()
    }

     */
}