package com.example.rxjavatutorial

class OperatorBuffer {

    /*
        val observable = Observable.just(1, 2, 3, 4, 5, 6, 7, 8,9)

        observable.subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .buffer(3)
            .subscribe(object : Observer<List<Int>> {
                override fun onSubscribe(d: Disposable) {
                    Log.e("tag", "on Subscribe called")
                }

                override fun onNext(t: List<Int>) {
                    Log.e("tag", "on next called")
//                    for (item in t)
                        Log.e("tag", "number : $t")
                }

                override fun onError(e: Throwable) {
                    Log.e("tag", "on error")
                }

                override fun onComplete() {
                    Log.e("tag","All items emitted successfully")
                }
            })
     */
}