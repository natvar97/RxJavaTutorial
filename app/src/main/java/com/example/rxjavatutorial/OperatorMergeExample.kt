package com.example.rxjavatutorial

class OperatorMergeExample {
    /*
            override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Observable.merge(getMaleObservable(), getFemaleObservable())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe(object : Observer<User> {
                override fun onSubscribe(d: Disposable) {
                    Log.e("tag", "subscribe called")
                }

                override fun onNext(t: User) {
                    Log.e("tag", "${t.name} , ${t.gender}")
                }

                override fun onError(e: Throwable) {
                    Log.e("tag", "${e.message}")
                }

                override fun onComplete() {
                    Log.e("tag", "All items emitted successfully")
                }

            })


    }

    private fun getFemaleObservable(): Observable<User> {
        val females = arrayOf("Lucy", "Scarlett", "April")

        val users = ArrayList<User>()

        for (female in females) {
            val user = User(female, "female")
            users.add(user)
        }

        return Observable.create(ObservableOnSubscribe<User> { emitter ->
            for (user in users) {
                if (!emitter.isDisposed) {
                    Thread.sleep(1000)
                    emitter.onNext(user)
                }
            }
            if (!emitter.isDisposed)
                emitter.onComplete()
        }).subscribeOn(Schedulers.io())
    }

    private fun getMaleObservable(): Observable<User> {
        val males = arrayOf("Mark", "John", "Trump", "Obama")

        val users = ArrayList<User>()

        for (male in males) {
            val user = User(male, "male")
            users.add(user)
        }

        return Observable.create(ObservableOnSubscribe<User> { emitter ->
            for (user in users) {
                if (!emitter.isDisposed) {
                    Thread.sleep(500)
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