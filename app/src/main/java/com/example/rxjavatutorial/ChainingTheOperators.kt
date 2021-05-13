package com.example.rxjavatutorial

class ChainingTheOperators {

    /*
        Observable.range(1, 20)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .filter { value ->
                return@filter value % 2 == 0
            }
            .map { value ->
                return@map "$value is an even number"
            }
            .subscribe(object : Observer<String> {
                override fun onSubscribe(d: Disposable) {
                    Log.e("tag", "on Subscribe called")
                }

                override fun onNext(t: String) {
                    Log.e("tag", t)
                }

                override fun onError(e: Throwable) {
                    Log.e("tag", "on Error called")
                }

                override fun onComplete() {
                    Log.e("tag", "All strings are emitted successfully")
                }
            })
     */

}