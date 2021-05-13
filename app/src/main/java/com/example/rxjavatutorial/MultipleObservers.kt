package com.example.rxjavatutorial

class MultipleObservers {


/*
    val animalObservable = getObservable()

    val animalObserver : DisposableObserver<String> = getAnimalObserver()

    val getAnimalAllCapsObserver : DisposableObserver<String> = getAnimalAllCapsObserver()
    //filter the animal list with 'b' letter
    compositeDisposable.add(
        animalObservable
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .filter { query ->
                return@filter query.lowercase(Locale.getDefault()).startsWith("b")
            }
            .subscribeWith(animalObserver)
    )

    compositeDisposable.add(
        animalObservable
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .filter { query ->
                return@filter query.uppercase(Locale.getDefault()).startsWith("C")
            }
            .map {
                return@map it.uppercase(Locale.getDefault())
            }
            .subscribeWith(getAnimalAllCapsObserver)
    )

    /*
    animalObservable.subscribeOn(Schedulers.io())
        .observeOn(AndroidSchedulers.mainThread())
        .filter(Predicate<String> { query ->
            return@Predicate query.lowercase(Locale.getDefault()).startsWith("b")
        })
        .subscribe(getAnimalObserver())
    */
}


//    private fun getObservable() : Observable<String> {
//        return Observable.just("Ant", "Bee", "Cat", "Dog", "Fox")
//    }

private fun getObservable(): Observable<String> {
    return Observable.fromArray(
        "Ant", "Ape",
        "Bat", "Bee", "Bear", "Butterfly",
        "Cat", "Crab", "Cod",
        "Dog", "Dove",
        "Fox", "Frog"
    )
}


private fun getAnimalObserver(): DisposableObserver<String> {
    return object : DisposableObserver<String>() {

        override fun onNext(t: String) {
            Log.e("tag", "name : $t")
        }

        override fun onError(e: Throwable) {
            Log.e("tag", "Error : ${e.message}")
        }

        override fun onComplete() {
            Log.e("tag", "onComplete \n all items are emitted")
        }
    }
}

private fun getAnimalAllCapsObserver() : DisposableObserver<String> {
    return object : DisposableObserver<String>() {
        override fun onNext(t: String) {
            Log.e("tag" , "name : $t")
        }

        override fun onError(e: Throwable) {
            Log.e("tag" , "error : ${e.message}")
        }

        override fun onComplete() {
            Log.e("tag" , "complete")
        }

    }
}
 */

}