package com.example.rxjavatutorial

class CompletableAndCompletableObserver {
    /*
            private var disposable: Disposable? = null

            override fun onCreate(savedInstanceState: Bundle?) {
                super.onCreate(savedInstanceState)
                setContentView(R.layout.activity_main)

                getCompletable()
                    .subscribeOn(Schedulers.io())
                    .observeOn(AndroidSchedulers.mainThread())
                    .subscribe(getCompletableObserver())

            }

            private fun getCompletable() : Completable {
                return Completable.create { emitter ->
                    if (!emitter.isDisposed) {
                        emitter.onComplete()
                    }
                }
            }


            private fun getCompletableObserver() : CompletableObserver {
                return object : CompletableObserver {
                    override fun onSubscribe(d: Disposable) {
                        disposable = d
                    }

                    override fun onComplete() {
                        Log.e("tag" ,"All items emitted successfully")
                    }

                    override fun onError(e: Throwable) {

                    }

                }
            }
     */
}