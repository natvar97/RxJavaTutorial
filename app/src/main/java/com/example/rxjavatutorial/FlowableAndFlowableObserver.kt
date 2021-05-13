package com.example.rxjavatutorial

class FlowableAndFlowableObserver {
    /*
            private var disposable: Disposable? = null

            override fun onCreate(savedInstanceState: Bundle?) {
                super.onCreate(savedInstanceState)
                setContentView(R.layout.activity_main)

                    getFlowable()
                        .subscribeOn(Schedulers.io())
                        .observeOn(AndroidSchedulers.mainThread())
                        .reduce(0 ,
                            { number, sum ->
                                number + sum
                            }
                        )
                        .subscribe(getFlowableObserver())


            }

            private fun getFlowableObserver() : SingleObserver<Int> {
                return object : SingleObserver<Int> {
                    override fun onSubscribe(d: Disposable) {
                        disposable = d
                    }

                    override fun onSuccess(t: Int) {
                        Log.e("tag" , "$t")
                    }

                    override fun onError(e: Throwable) {
                        Log.e("tag", "${e.message}")
                    }

                }
            }

            private fun getFlowable() : Flowable<Int> {
                return Flowable.range(1,100)
            }

            override fun onDestroy() {
                super.onDestroy()
                disposable!!.dispose()
            }
     */
}