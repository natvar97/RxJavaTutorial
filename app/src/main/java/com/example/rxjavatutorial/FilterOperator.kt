package com.example.rxjavatutorial

class FilterOperator {

    /*
        override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val observable = getObservable()

        observable.subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .filter { user ->
                return@filter user.gender == "female"
            }
            .subscribe(getObserver())

    }

    private fun getObserver(): DisposableObserver<User> {
        return object : DisposableObserver<User>() {
            override fun onNext(t: User) {
                Log.e("tag", "On next called")
                Log.e("gender", t.name)
            }

            override fun onError(e: Throwable) {
                Log.e("tag", "On error called : ${e.message}")
            }

            override fun onComplete() {
                Log.e("tag", "All items are emitted successfully")
            }

        }
    }

    private fun getObservable(): Observable<User> {
        val males = arrayOf("Natu", "Vishal", "Parth")
        val females = arrayOf("Uru", "Hardy", "Dolly")

        var userList: ArrayList<User> = ArrayList()

        for (male in males) {
            val user = User(male, "male")
            userList.add(user)
        }

        for (female in females) {
            val user = User(female, "female")
            userList.add(user)
        }

//        return Observable.create { emitter ->
//            for (user in userList) {
//                if (!emitter.isDisposed) {
//                    emitter.onNext(user)
//                }
//            }
//            if (!emitter.isDisposed){
//                emitter.onComplete()
//            }
//
//        }

        return Observable.create(ObservableOnSubscribe<User> { emitter ->
            for (user in userList) {
                if (!emitter.isDisposed) {
                    emitter.onNext(user)
                }
            }
            if (!emitter.isDisposed) {
                emitter.onComplete()
            }
        }).subscribeOn(Schedulers.io())

    }

     */

}