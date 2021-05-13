package com.example.rxjavatutorial

class OperatorReduce {
    /*
            Observable.range(1, 10)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .reduce { number, sum ->
                number + sum
            }
            .subscribe(object : MaybeObserver<Int> {
                override fun onSubscribe(d: Disposable) {
                    Log.e("tag", "subscribe called for observable")
                }

                override fun onSuccess(t: Int) {
                    Log.e("tag", "Sum of Numbers : $t")
                }

                override fun onError(e: Throwable) {
                    Log.e("tag", "${e.message}")
                }

                override fun onComplete() {
                    Log.e("tag", "All items are emitted Successfully")
                }
            })

     */
}