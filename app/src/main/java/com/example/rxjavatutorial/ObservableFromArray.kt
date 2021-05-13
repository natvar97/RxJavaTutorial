package com.example.rxjavatutorial

class ObservableFromArray {

    /*
        val numbers = arrayOf(
            1, 2, 3, 4, 5, 6, 7, 8, 9, 10
        )

        Observable.fromArray(numbers)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe(object : DisposableObserver<Array<Int>>() {
                override fun onNext(t: Array<Int>) {
                    Log.e("tag", "onNext is called")
                    for (value in t) {
                        Log.e("tag", "$value")
                    }
                }

                override fun onError(e: Throwable) {
                    Log.e("tag", "${e.message}")
                }

                override fun onComplete() {
                    Log.e("tag", "onComplete called")
                }

            })
     */

}