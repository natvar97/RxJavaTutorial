package com.example.rxjavatutorial

class ObservableFromRange {

    /*
        Observable.range(1, 20)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe(object : DisposableObserver<Int>() {
                override fun onNext(value: Int) {
                    Log.e("tag", "on Next called")
                    Log.e("tag", "$value")
                }

                override fun onError(e: Throwable) {
                    Log.e("tag", "onError Called : ${e.message}")
                }

                override fun onComplete() {
                    Log.e("tag", "all items emitted completely")
                }

            })
     */

}